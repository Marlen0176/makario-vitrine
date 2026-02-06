# Manager — Engineering View (Public)

Public-facing summary of inputs/outputs. Implementation is private.

## Inputs (public)
- `PolicyIntent` (operation: export/share/logging/storage)
- `ConsentState` (user consent, role, mode)
- `EventEnvelope` (event + metadata + module id)

## Outputs (public)
- `PolicyEnvelope` (allowed / redacted / denied)
- `RedactionPlan` (fields/sections to remove)
- `AuditTrace` (policy decision record, immutable references)

## Constraints
- Manager must not call module internals (events only)
- public/private boundary is strict
