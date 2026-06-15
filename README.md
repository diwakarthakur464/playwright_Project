# Playwright BDD Java Framework (Config Driven)

## Overview
A simple Java BDD automation framework using Playwright and Cucumber to validate the Sauce Demo login flow.

## Features
- Playwright browser automation
- Cucumber BDD with Gherkin feature files
- Config-driven URL setup
- Hooks for browser setup and teardown

## Prerequisites
- Java JDK 8 or newer
- Maven installed and available on PATH

## Run Tests
1. Open a terminal in this project folder.
2. Run:
   ```powershell
   mvn clean test
   ```

## Notes
- The framework launches the browser in visible mode (non-headless).

## Project Structure
- `src/test/java` — step definitions, hooks, page objects, and runner
- `src/test/resources/features` — Cucumber feature files
- `src/test/resources/config` — test configuration properties

## Author
Diwakar Singh Thakur
