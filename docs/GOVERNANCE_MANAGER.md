# Manager Governance (Public)

**Manager** is the governance core of MakArio.
It does not "own" other modules at runtime, but it **enforces rules** across them.

## Why Manager exists
MakArio is designed for licensing. Licensing requires:
- predictable boundaries
- consent and policy enforcement
- export/share controls
- compliance posture (ethics, privacy, safety)
- legal/tax-ready templates for partners and operators

## Manager responsibilities (public)

### 1) Consent & policy enforcement
Manager applies graded decisions to operations:
- **ALLOW**
- **ALLOW (REDACTED)** — allow, but remove/limit sensitive parts
- **DENY** — block the operation

Typical governed operations:
- export / sharing
- storage of sensitive data
- logging & telemetry
- partner integrations
- device access (camera/sensors)

### 2) Public/Private boundary firewall
Manager ensures public-facing documents and outputs never leak private internals:
- proprietary control point logic
- implementation details (SDK choices, ML stack)
- internal identifiers and raw traces

### 3) Export & share hub (licensing ready)
All outgoing flows pass through Manager:
- share packs (partner-safe)
- export jobs (user-owned)
- evidence delivery (AI Judge) with reliability controls
- audit trails (non-sensitive)

### 4) Legal & tax templates (operator support)
Manager maintains **templates** for jurisdictions and partner operations.
This is not “legal advice”. It is a system of structured guidance and checklists.

Examples of template families:
- operator compliance checklist (events, evidence retention, privacy)
- tax/fee reporting templates for licensed operators (tournament organizers, gyms)
- disclaimers and user notices for each module
- partner data processing agreement skeletons (high-level)

### 5) Device hub boundaries
Manager decides when devices can be used:
- camera permissions by mode and consent
- wearable sensor usage
- offline/online constraints
- redaction for on-device vs cloud

## Governance principles (public)
- Human-centered: tools serve improvement of quality of life.
- Minimal collection: collect only what is needed.
- Clear ownership: user owns their data exports.
- Safety first: prevention and constraints, not diagnosis.
- Redaction by default for public outputs.

