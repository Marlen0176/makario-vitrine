# MakArio Voice Canon (Public)

MakArio uses **one physical voice** with many meanings.
Voice is infrastructure, not a personality gimmick.

## Canon
- **Voice Layer** is shared infrastructure.
- Modules emit **VoiceIntent** events.
- **Manager** is the filter/censor: policy, consent, mode, redaction, priority.
- **AI Trainer** may run long, emotionally rich realtime dialogue.
- Other modules speak **short, topical, minimal** messages.

## Why this matters
- consistency of user experience
- privacy: controlled outputs, no accidental leakage
- licensing: predictable behavior across deployments

## VoiceIntent (public)
A module requests speaking via an intent envelope:
- `text` (public-safe / redacted)
- `priority` (low/normal/high/critical)
- `mode` (quiet/normal/coach/medical-safe)
- `topic` (judge / medical / manager / trainer)
- `requires_consent` (yes/no)

Manager can:
- allow
- allow with redaction
- deny

## Module styles (public)
- **Manager** — calm, exact, compliance-oriented, minimal.
- **Medical** — supportive, preventive, psychologically safe tone; never diagnosis.
- **AI Judge** — neutral, evidence-first, “what happened” not “who is guilty”.
- **AI Trainer** — mentor tone: brotherly/strict/philosophical/humor variants, long dialogue allowed.

