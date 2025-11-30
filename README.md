# Selenium Automation

![Java](https://img.shields.io/badge/Java-21-blue)
![Selenium](https://img.shields.io/badge/Selenium-4.9.0-green)
![Selenide](https://img.shields.io/badge/Selenide-6.12.3-orange)
![Ocular](https://img.shields.io/badge/Ocular-1.0.5-lightgrey)
![JUnit](https://img.shields.io/badge/JUnit-5.9.1-purple)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Status: Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

This repository contains exercises, homework, and example projects from the **Selenium modules of the Kodilla Automated Tester Java course**, covering both **Login Selenium** and **Selenium Automation**.  
The goal is to demonstrate browser automation, POM architecture, UI testing, and visual regression testing.

---

## Module 1: Login Selenium

### Overview
This module focuses on **Automated UI Testing with Selenium** using the Page Object Model (POM) for the login workflow.

#### Key Learnings
- Selenium WebDriver automation for opening pages, interacting with input fields, buttons, and messages.
- POM architecture: reusable abstract classes, dedicated page classes, and application launchers.
- Writing UI tests using JUnit 5.

#### Project Structure
```
login-selenium/
│ build.gradle
│ gradlew
│ gradlew.bat
│ LICENSE
│ structure.txt
│ README.md
├── src/main/java/com/kodilla/selenium/pom/
│ ├── AbstractPom.java
│ ├── KodillaLoginPom.java
│ └── KodillaPomApplication.java
└── src/test/java/com/kodilla/selenium/pom/
└── KodillaLoginPomTest.java
```
#### Dependencies
```gradle
plugins { id 'java' }

group = 'com.kodilla'
version = '1.0-SNAPSHOT'

repositories { mavenCentral() }

dependencies {
    testImplementation platform('org.junit:junit-bom:5.9.1')
    implementation 'org.seleniumhq.selenium:selenium-java:4.4.0'
    implementation 'org.seleniumhq.selenium:selenium-support:4.4.0'
    testImplementation 'org.junit.jupiter:junit-jupiter'
}

test { useJUnitPlatform() }
```
#### Requirements

- Java 17 or 21
- Gradle (wrapper included)
- IntelliJ IDEA
- Selenium WebDriver
- Browser driver (ChromeDriver / GeckoDriver)

#### Running Tests

**Linux / macOS**
```bash
./gradlew clean test
```
**Windows**
```bash
gradlew clean test
```
---

### Test Suite Overview
`KodillaLoginPomTest`:

- Opening login page 
- Interacting with input fields 
- Entering login/password 
- Clicking login button 
- Asserting messages and errors for invalid credentials

## Module 2: Selenium Automation (Selenide + Ocular)

### Overview
This module expands on **browser automation**, adding **Selenide** for concise UI testing and **Ocular** for visual regression.

#### Key Learnings
- Advanced Selenium WebDriver tasks: interacting with complex forms, Allegro/eBay automation.
- Visual testing with Ocular, comparing snapshots with runtime screenshots.
- Selenide: automatic waits, simplified selectors, fluent API for UI tests.
- Maintaining clean POM architecture for scalable test automation.

#### Project Structure
```
selenium/
│ build.gradle
│ gradlew
│ gradlew.bat
│ LICENSE
├── src/main/java/com/kodilla/selenium/
│ ├── allegro/ AllegroTestingApp.java, AllegroTestingAppII.java
│ ├── ebay/ EBayTestingApp.java
│ ├── form/ FormTestApp.java
│ ├── login/ LoginTestingApp.java
│ ├── search/ StoreSearchExample.java
│ │ └── homework/ KodillaStorePom.java, StoreApplication.java
│ └── visual/ OcularExample.java, WorldTimePage.java
└── src/test/java/com/kodilla/selenium/search/homework/
└── KodillaStorePomTest.java
```
#### Dependencies
```gradle
plugins { id 'java' }

group = 'com.kodilla'
version = '1.0-SNAPSHOT'

repositories { mavenCentral() }

dependencies {
    testImplementation platform('org.junit:junit-bom:5.9.1')
    implementation 'org.seleniumhq.selenium:selenium-java:4.9.0'
    testImplementation 'org.junit.jupiter:junit-jupiter'
    implementation 'com.google.guava:guava:31.1-jre'
    implementation(group: 'com.github.lewka', name: 'ocular', version: '1.0.5') {
        exclude group: "net.sf", module: "jargs"
    }
    testImplementation 'com.codeborne:selenide:6.12.3'
}

test { useJUnitPlatform() }
```
#### Requirements

- Java 21
- Gradle (wrapper included)
- IntelliJ IDEA
- Browser drivers (GeckoDriver included)

---

#### Running Tests

**Linux / macOS**
```bash
./gradlew clean test
```
**Windows**
```bash
gradlew clean test
```

#### Test Suite Overview
- **Selenium Tests**
    - Element locating
    - Handling complex search flows
    - Interacting with forms and logins
    - Multi-step browser navigation

- **Selenide Tests (Homework)**
    - KodillaStorePomTest includes:
        - POM architecture
        - Search functionality validation
        - Verifying product visibility
        - Stable selectors

- **Visual Regression Tests (Ocular)**
    - OcularExample:
        - Loads page
        - Takes screenshot
        - Compares with reference
        - Saves mismatch results

---

## Technologies Used
- **Java 21**
- **Gradle**
- **Selenium WebDriver**
- **Selenide**
- **Ocular**
- **JUnit 5**
- **Page Object Model (POM)**

---

## Authors
Created by:  
Joanna Kamińska  
GitHub: [joanna-kaminska-qa](https://github.com/joanna-kaminska-qa)

---

## Version History
- **0.2** – README added, improved structure
- **0.1** – Initial upload
- 

---

## License
This project is licensed under the MIT License.  
See the LICENSE file for details.

---

## Acknowledgments
- Kodilla Automated Tester Java course
- Selenium WebDriver documentation
- Selenide official documentation
- Ocular visual testing framework
- Mozilla GeckoDriver project
- W3C WebDriver Standard
- Chrome DevTools
- Stack Overflow community
- IntelliJ IDEA  
