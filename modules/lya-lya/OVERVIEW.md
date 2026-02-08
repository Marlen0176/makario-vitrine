# Lya-Lya — Module Overview (Public skeleton)

**Role (public):** social coordination layer (public surface only).  
Lya-Lya is an interaction space that can reference content from other modules under strict governance.

## Inputs (public)
- `PolicyEnvelope` (modes + redaction rules, from Manager)
- `UserConsentRef` (scope of consent; reference only)
- `ShareDecision` (allowed / redacted / denied — from Manager)
- `ContentRef` (references only; no raw private data)

## Outputs (public)
- `SharedPostRef` (reference id)
- `GroupEventRef` (reference id for coordination)
- `AuditTrace` (policy + timestamp + module id)

## Constraints (public)
- no “engagement at all costs”
- content is references + redacted surfaces only
- exports/shares must be Manager-approved
- public docs never disclose private implementation details

## Voice style (public)
Rare voice. Neutral, short, governance-aware.
