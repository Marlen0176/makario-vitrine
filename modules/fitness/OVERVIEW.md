# Fitness — Module Overview (Public skeleton)

**Role (public):** movement & recovery guidance module (public surface only).  
Fitness provides safe training routines guidance within declared constraints.

## Inputs (public)
- `PolicyEnvelope` (modes + redaction rules, from Manager)
- `UserConsentRef` (scope of consent; reference only)
- `ConstraintsSnapshotRef` (from Medical; reference only)
- `SafetyEvent` (e.g., “high load” marker; public-safe)

## Outputs (public)
- `TrainingGuidance` (topic-only routines, safety-first framing)
- `GuidanceRef` (identifier/reference)
- `AuditTrace` (policy + timestamp + module id)

## Constraints (public)
- not a diagnostic or medical system
- governance and export/share only via Manager
- public docs never disclose private implementation details

## Voice style (public)
Short, supportive, safety-first. No pressure. Minimal phrasing.
