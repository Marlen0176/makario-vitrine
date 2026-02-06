# MakArio Platform (Public Vitrine)

**MakArio** — модульная интеллектуальная платформа, ориентированная на **пользователя**.

Платформа проектируется для поддержки повседневных задач пользователя в областях **здоровья, обучения и питания**.

Модули MakArio развиваются независимо и взаимодействуют **исключительно через события**.  
Правила доступа, режимы использования и границы обмена данными определяются модулем **Manager**.

Этот репозиторий — **публичная витрина платформы**.  
Здесь описаны архитектурные принципы, публичные контракты и роли.  
Инженерные детали и внутренняя реализация намеренно не публикуются.

---

## Start here (60 seconds)

**One Pager** — назначение платформы, фокус и ограничения  
→ [docs/one_pager.md](docs/one_pager.md)

**Platform map** — модули и границы публичного / приватного  
→ [docs/PLATFORM_MAP.md](docs/PLATFORM_MAP.md)

**AI Judge** — пилотный коммерческий модуль (evidence pipeline)  
→ [modules/ai-judge/OVERVIEW.md](modules/ai-judge/OVERVIEW.md)

---

## Platform principles

Технологии MakArio проектируются в спокойном, поддерживающем стиле:

- поддержка и уважение к пользователю;
- ясность, последовательность и опора на прогресс;
- нейтральный, внимательный тон взаимодействия;
- безопасность как система правил и ограничений.

Подробнее:  
→ [docs/VALUES.md](docs/VALUES.md)

---

## Module readiness

Модули MakArio могут находиться на разных стадиях зрелости.
Критерии и текущий статус:  
→ [docs/READINESS.md](docs/READINESS.md)

---

## Governance & trust

**Manager module** отвечает за:

- согласие и цели использования;
- политики доступа и экспорта;
- правила обмена данными;
- юридические и налоговые шаблоны.

→ [docs/GOVERNANCE_MANAGER.md](docs/GOVERNANCE_MANAGER.md)

**Privacy boundary** — публичные концепции и приватная реализация  
→ [docs/PRIVACY_BOUNDARY.md](docs/PRIVACY_BOUNDARY.md)

**Events contract** — какие данные участвуют во взаимодействии  
→ [docs/EVENTS_CONTRACT.md](docs/EVENTS_CONTRACT.md)

**Voice canon** — единый Voice Layer и фильтрация через Manager  
→ [docs/VOICE_CANON.md](docs/VOICE_CANON.md)

---

## Compliance

Лицензирование и партнёрство  
→ [licensing/LICENSING_OVERVIEW.md](licensing/LICENSING_OVERVIEW.md)

Уведомление о соответствии требованиям  
→ [docs/COMPLIANCE_NOTE.md](docs/COMPLIANCE_NOTE.md)

---

## Constitution & ethics

→ [docs/CONSTITUTION.md](docs/CONSTITUTION.md)  
→ [docs/ETHICS.md](docs/ETHICS.md)

---

## Public modules

- **AI Judge**  
  → [modules/ai-judge/OVERVIEW.md](modules/ai-judge/OVERVIEW.md)

- **Manager**  
  → [modules/manager/OVERVIEW.md](modules/manager/OVERVIEW.md)

- **Medical**  
  → [modules/medical/OVERVIEW.md](modules/medical/OVERVIEW.md)

- **SmartFood** (early stage)  
  → [modules/smartfood/OVERVIEW.md](modules/smartfood/OVERVIEW.md)

> **AI Trainer** используется как эталон поведенческой логики и взаимодействия,  
> его инженерная реализация остаётся приватной на текущем этапе.

---

## Technical integrity notice

MakArio основана на запатентованной биомеханической системе визуализации,  
использующей **нестандартные контрольные точки**.

Детали реализации намеренно не раскрываются в публичной витрине.
