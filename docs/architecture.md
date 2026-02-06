# Architecture (Public-safe)

MakArio is a modular event-driven platform.

## Communication
Modules publish and subscribe to events via AppBus/EventBus.
Events are notifications, not commands.

## Evidence principle (AI Judge)
Evidence is packaged as:
- short clip (~3 seconds)
- structured metadata
- hash/identifier
This enables reproducible review and appeals.

## Administrative core (Manager)
Manager enforces boundaries:
- consent & policy gate
- export/share control
- device hub governance
- legal/tax template layer
