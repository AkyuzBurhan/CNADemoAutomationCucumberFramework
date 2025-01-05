# UI Test for Agent Filtering Function on CNA Website

This project demonstrates a **UI test for the Agent Filtering function** on the [CNA website](https://www.cna.com/). The test simulates user interactions and verifies the functionality of the Agent Filtering feature to ensure that it behaves as expected. 

## Key Features

- Uses **Cucumber** for behavior-driven development (BDD).
- Implements test automation using **Java**.
- Verifies the proper functioning of the Agent Filtering feature.
- Follows best practices for maintainable and scalable test automation.

## Project Goals

1. Validate the Agent Filtering feature's behavior and user experience.
2. Automate scenarios using well-defined Gherkin syntax in feature files.
3. Provide an example of integrating BDD frameworks with modern test automation tools.

This repository includes:

- **Feature files**: Scenarios written in Gherkin syntax for BDD.
- **Step definitions**: Java code that automates the scenarios.
- **Test runner configuration**: To execute the tests effectively.

## Usage

Follow these steps to run the UI tests for the Agent Filtering function:

### Prerequisites
1. **Java Development Kit (JDK)**: Ensure JDK 11 or later is installed.
2. **Maven**: Install Maven for dependency management and project builds.
3. **Cucumber Plugin**: (Optional) Install a Cucumber plugin in your IDE for better feature file editing.
4. **Browser Driver**: Download and set the path for the browser driver (e.g., ChromeDriver for Google Chrome).

### Steps to Run the Tests
1. **Clone the Repository**  git clone <repository-url>
2. **Install Dependencies**  mvn clean install
3. **Define Test Configuration**  Update the src/test/resources/config.properties file with your browser and environment configurations.
4. **Run the Tests**  mvn test
5. **View Test Reports**  target/reports directory.
6. **Screenshots**  test-outputs/Screenshots directory.


