# MakArio Platform (Public Vitrine)

**MakArio** — модульная интеллектуальная платформа, ориентированная на **пользователя**.  
Мы строим технологии на принципах уважительного взаимодействия, поддержки и долгосрочного развития.

MakArio — это не один продукт.  
Это платформа, где **суверенные модули** развиваются независимо и взаимодействуют **только через события**.  
Границы доверия, режимы и правила обмена обеспечиваются модулем **Manager**.

> Этот репозиторий — **публичная витрина**: здесь описаны принципы, контракты и публичные роли.  
> Приватные инженерные детали и внутренний код намеренно не публикуются.

---

## Start here (60 seconds)

1) **One Pager** — что это такое, с чего начинаем, и чего мы сознательно не строим  
   → `docs/one_pager.md`

2) **Platform Map** — модули и граница public / private  
   → `docs/PLATFORM_MAP.md`

3) **AI Judge** — первый коммерческий модуль (evidence-pipeline)  
   → `modules/ai-judge/OVERVIEW.md`

### For investors (fast entry)

- **AI Judge — Investor entrypoint**  
  → `modules/ai-judge/entrypoints/for-investors.md`

---

## Суть MakArio

> Технология должна **поддерживать пользователя** и помогать двигаться вперёд — спокойно, по-человечески,
> с уважением и опорой на прогресс.

Общий стиль платформы:
- поддержка и уважение;
- мотивация через ясность и прогресс;
- тон “старшего товарища”: спокойно, внимательно, иногда с лёгким юмором;
- безопасность и доверие — как правило архитектуры, а не как обещание.

Подробнее: `docs/VALUES.md`

---

## Шкала готовности модулей (капсула)

В MakArio модули имеют **разный уровень готовности** — это нормально: они растут независимо.  
Мы показываем готовность публично простой “капсулой”, чтобы сразу было понятно, что уже можно пилотировать, а что в развитии.

Пример (визуальная идея, текстовая версия):  
`[ Concept ░░░░░░░░░░ Pilot ▓▓▓▓▓░░░ Production ██████░ ]`

Легенда и критерии: `docs/READINESS.md`  
Текущая таблица готовности: `docs/READINESS.md`

---

## Governance & trust (почему партнёры могут доверять внедрениям)

- **Manager governance** — согласие, политики, export/share-правила, юридические/налоговые шаблоны, device-границы  
  → `docs/GOVERNANCE_MANAGER.md`

- **Privacy boundary** — public concepts vs private implementation  
  → `docs/PRIVACY_BOUNDARY.md`

- **Events contract** — что входит / что может выходить  
  → `docs/EVENTS_CONTRACT.md`

- **Voice canon** — единый Voice Layer + фильтр политики Manager + приватность  
  → `docs/VOICE_CANON.md`

---

## Readiness & compliance

- **Deployment / partnering overview**  
  → `licensing/LICENSING_OVERVIEW.md`

- **Compliance note**  
  → `docs/COMPLIANCE_NOTE.md`

- **Constitution & ethics**  
  → `docs/CONSTITUTION.md`, `docs/ETHICS.md`

---

## Modules (public surface)

- **AI Judge** → `modules/ai-judge/OVERVIEW.md`  
- **Manager** → `modules/manager/OVERVIEW.md`  
- **Medical** → `modules/medical/OVERVIEW.md`

> Примечание: **AI Trainer** существует как эталонный модуль поведения и “живого” общения,  
> но его инженерные детали и внутренние библиотеки остаются приватными на текущем этапе.

---

## Technical integrity notice (public-safe)

> Public claim: proprietary biomechanical vision based on **non-standard control points**.  
> Private implementation details are intentionally not published in this vitrine.

**Start Here (single entrypoint)** → `docs/START_HERE.md`

---

## iOS-friendly links (open in Safari)
> If GitHub tries to open the app, use these links (they work in Safari).

- Repo home: `https://github.com/Marlen0176/makario-vitrine?tab=readme-ov-file`
- Start Here: `https://github.com/Marlen0176/makario-vitrine/blob/main/docs/START_HERE.md?plain=1`
- AI Judge (Investor): `https://github.com/Marlen0176/makario-vitrine/blob/main/modules/ai-judge/entrypoints/for-investors.md?plain=1`
