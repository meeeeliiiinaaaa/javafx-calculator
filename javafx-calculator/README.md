# CalPro

A desktop calculator built with **Java** and **JavaFX** as part of an Object-Oriented Programming coursework project. CalPro goes beyond a basic calculator by offering four modes in one app — Standard, Scientific, Programmer, and Memory — plus calculation history and switchable color themes.

## Features

- **Standard mode** — basic arithmetic (add, subtract, multiply, divide) with a running expression display
- **Scientific mode** — trigonometric functions (sin, cos, tan and their inverses/hyperbolic forms), powers, roots, logarithms, factorial, and more, with degree/radian switching
- **Programmer mode** — convert numbers between binary, octal, decimal, and hexadecimal
- **Memory mode** — store and recall a running log of calculated results
- **History** — view a log of past calculations in a separate window
- **Custom UI** — a borderless, custom-styled window with several selectable color themes

## Tech Stack

- Java 19
- JavaFX 19 (Controls, FXML)
- BootstrapFX for styling
- Maven for build/dependency management
- JUnit 5 (configured for testing)

## Project Structure

```
calpro/
├── pom.xml                                # Maven build configuration
├── src/
│   └── main/
│       ├── java/
│       │   ├── module-info.java
│       │   └── com/example/calpro/
│       │       ├── HelloApplication.java  # JavaFX entry point
│       │       ├── HelloController.java   # UI controller / event handling
│       │       └── Calculate.java         # Core calculation logic (unary & binary ops)
│       └── resources/
│           └── com/example/calpro/
│               ├── hello-view.fxml        # Main calculator layout
│               ├── history.fxml           # History window layout
│               └── CalDesign.css          # Stylesheet
```

The project follows a basic **MVC-style separation**: `Calculate` holds the pure calculation logic, `HelloController` wires that logic up to the JavaFX UI defined in the FXML files, and `HelloApplication` bootstraps the JavaFX application.

## Getting Started

### Prerequisites

- JDK 19 (or compatible)
- Maven (or use the included Maven Wrapper — `mvnw` / `mvnw.cmd`)

### Run the app

```bash
# macOS/Linux
./mvnw clean javafx:run

# Windows
mvnw.cmd clean javafx:run
```

This uses the `javafx-maven-plugin` configured in `pom.xml`, so you don't need to install JavaFX separately — Maven will pull it in.

## Notes

This project was built as coursework for an OOP module. It's a great example of applying classes and encapsulation (`Calculate` for logic, `HelloController` for UI) in a small but feature-rich desktop application, though some UI code (theme-switching, styling) is intentionally straightforward rather than fully abstracted, as is typical for early coursework projects.

## License

No license specified — add one (e.g. MIT) if you'd like others to be able to reuse this code.
