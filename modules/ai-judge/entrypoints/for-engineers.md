# AI Judge — Engineering View (Public)

This is a public-facing summary of inputs/outputs. Implementation is private.

## Inputs (public)
- `FrameStreamRef` or `ClipRequest` (time window)
- `BoutContext` (bout id, round, corner mapping)
- `PolicyEnvelope` (consent + modes + redaction rules)

## Outputs (public)
- `EvidencePackReady`
  - `clip_refs[]` (3s windows)
  - `metadata` (timestamps, ids, labels)
  - `hash/ids` (tamper-evident identifiers)
- `DeliveryStatus`
- `AuditTrace`

## Constraints
- no direct module-to-module calls (events only)
- Manager is the gate for export/share
- Public/Private boundary is enforced in docs

