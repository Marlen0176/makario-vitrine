# SmartFood — Module Overview (Public skeleton)

**Role (public):** nutrition guidance module (public surface only).  
SmartFood provides *topic-level* food guidance under governance rules.

## Inputs (public)
- `PolicyEnvelope` (modes + redaction rules, from Manager)
- `UserConsentRef` (scope of consent; reference only)
- `NutritionContextRef` (reference id, not raw personal data)
- `ShareRequest` (request to export/share — must be Manager-gated)

## Outputs (public)
- `FoodGuidance` (topic-only, non-medical, non-diagnostic)
- `GuidanceRef` (identifier/reference, not raw logs)
- `AuditTrace` (policy + timestamp + module id)

## Constraints (public)
- no medical prescriptions
- no private implementation details
- export/share only via Manager policy gate

## Voice style (public)
Short, calm, practical. No long dialogue. Topic-only.
