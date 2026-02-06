# ADR-0001: Event Bus
- Шина событий: `MutableSharedFlow<AppEvent>` → `SharedFlow<AppEvent>`.
- Буфер: `extraBufferCapacity=64`, `onBufferOverflow=DROP_OLDEST` (для высокочастотных событий).
- Критические события (Error/Stop) — выделенный канал (добавим на M2).
- Подписки модулей регистрируют себя логом при старте.
- Голос не инициирует сам — говорит только по событиям (с M3).
