# Medical — Engineering View (Public)

Public-facing summary of inputs/outputs. Implementation is private.

## Inputs (public)
- `UserConsentRef` (consent + scope)
- `UserConstraints` (declared limits, contraindication flags)
- `SafetyEvent` (from modules; e.g., “high load”, “stress marker”)
- `PolicyEnvelope` (modes + redaction rules)

## Outputs (public)
- `ConstraintsSnapshotRef` (reference id, not raw private data)
- `SafetyGuidance` (topic-only, prevention framing)
- `AuditTrace` (what guidance emitted under what policy)

## Constraints
- no diagnosis claims
- public/private boundary is strict
- export/share only via Manager policy gate
