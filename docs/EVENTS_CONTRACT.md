# MakArio Events Contract (Public)

MakArio modules are sovereign. **No module calls another module directly.**
Integration happens through **events**.

This document defines the public-facing contract: *what goes in / what comes out*.
Implementation details, algorithms, and internal SDKs are private.

## Event rules
1. **Event-only integration** — modules publish/subscribe via a shared bus concept.
2. **Stable envelopes** — event envelopes stay compatible across versions.
3. **No secrets in public payloads** — never expose private implementation details.
4. **Consent first** — any export/share/storage action passes governance checks (Manager).
5. **Auditability** — events are traceable via ids and timestamps (without sensitive data).

## Standard event envelope (public)
All events follow this conceptual structure:

- `event_id` — unique id
- `event_type` — domain type (see categories below)
- `ts` — timestamp
- `scope` — public/private boundary marker (public-safe vs internal)
- `actor` — which module emitted it
- `subject` — anonymized identifier (user/session/match)
- `payload` — domain data (public-safe)
- `policy` — governance hints (consent state / redaction required)

## Core event categories (public)

### A) Evidence & judging
**Used by AI Judge** to form decision evidence without leaking private internals.
- `EvidenceEvent.Created` — evidence clip is prepared (id only)
- `EvidenceEvent.AttachedMetadata` — metadata attached (public-safe)
- `EvidenceEvent.Queued` / `Delivered` / `Failed` — reliable delivery lifecycle

**Public outputs**
- clip identifiers, time ranges, structured metadata (no algorithms).

### B) Safety & health context
**Used by Medical** to express prevention constraints (no diagnosis).
- `SafetyContext.Updated` — constraints updated (e.g., "avoid impact training")
- `SafetyNotice.Educational` — educational warning (non-medical)

**Public outputs**
- constraints, recommendations, education notes (no medical diagnosis).

### C) Voice & user-facing narration
**Used by all modules** via Voice Layer.
- `VoiceIntent.Request` — module requests speaking a message
- `VoiceIntent.Cancel` — cancel low-priority voice items
- `VoiceIntent.PolicyApplied` — Manager redaction/filter result

**Public outputs**
- short voice text (redacted), intent priority, mode.

### D) Share / export / partner integrations
**Used by Manager** to control all outgoing information.
- `ShareRequest.Created` — module wants to share
- `ShareDecision.AllowedRedacted` / `Denied` — governance decision
- `ExportJob.Created` — export prepared (public-safe boundary applied)

**Public outputs**
- share/export decisions + redaction reason.

## Compatibility policy
- New fields are additive.
- Event types are versioned when semantics change.
- Consumers must tolerate unknown fields.

