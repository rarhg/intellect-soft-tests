# 🧪 Автотесты для сайта intellect-soft.ru

Проект с автотестами для тестирования сайта IT-компании **Интеллект Софт**.

---

## 🚀 Технологии

- Java 17
- Gradle
- JUnit 5
- Selenide
- Allure
- Jenkins
- Selenoid
- Telegram Bot API

---

## 📋 Тесты

| Тест | Что проверяет |
|------|---------------|
| openPlatformProProjectTest | Открытие страницы «Платформа Про» |
| openGtnExamProjectTest | Открытие страницы «Гостехнадзор Экзамен» |
| openKorobkaOnlineProjectTest | Открытие страницы «Коробка.Онлайн» |

---

## 🏃 Запуск тестов

```bash
./gradlew clean test
```

С параметрами:

```bash
./gradlew clean test -Dbrowser=chrome -DbrowserVersion=128.0 -DscreenResolution=1920x1080 -DselenoidUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub
```

---

## 🔧 Jenkins

Параметры сборки:

- browser (chrome / firefox)
- browserVersion
- screenResolution
- selenoidUrl

---

## 📨 Уведомления в Telegram

После каждого прогона приходит сообщение:

```text
✅ IntellectSoft Tests
📊 Статистика:
🟢 Пройдено: 3
🔴 Упало: 0
📋 Всего: 3
⏱ Время: 29 сек
🔗 Отчёт
```

---

## 📁 Структура проекта

```text
intellect-soft-tests/
├── src/test/java/
│   ├── base/BaseTest.java
│   ├── helpers/Attach.java
│   ├── pages/MainPage.java
│   ├── pages/ProjectPage.java
│   └── tests/IntellectSoftTest.java
├── build.gradle
├── .gitignore
└── README.md
```

---

## 👨‍💻 Автор

[Рафаэль Мирзаев](https://github.com/r-rargh)
```

