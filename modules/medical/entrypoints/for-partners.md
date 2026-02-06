# Medical — Partner View (Public)

## Purpose
Medical provides a safety context layer:
- prevention and constraints
- education and risk awareness
- safe interactions for users

## Integration model (public)
- events only (no direct calls)
- Manager provides `PolicyEnvelope` for export/share/redaction
- Medical publishes constraints context as events (public-safe references)
