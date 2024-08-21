<!-- README.md -->

<h1 align="center">TestNG Framework</h1>
<p align="center">
  A comprehensive TestNG-based framework that facilitates unit testing, integration testing, and cross-browser testing using Java. This project is built to support automation testing with the robust features of TestNG and is structured to support modular, maintainable, and scalable test suites.
</p>

---

<h2>🚀 Features</h2>

<ul>
  <li><strong>TestNG Integration:</strong> Utilizes TestNG for parallel execution, grouping, prioritization, and data-driven testing.</li>
  <li><strong>Cross-Browser Testing:</strong> Supports cross-browser execution with XML configuration files.</li>
  <li><strong>Modular Test Structure:</strong> Organized test classes and methods for easy maintenance and scalability.</li>
  <li><strong>Annotations:</strong> Comprehensive use of TestNG annotations for preconditions, postconditions, and data providers.</li>
</ul>

---

<h2>📂 Project Structure & Class Descriptions</h2>

<pre>
TestNg_FrameWork
│
├── src
│   ├── july_1
│   │   ├── BeforeAfterMethod.java
│   │   │   - Demonstrates usage of @BeforeMethod and @AfterMethod annotations for setup and teardown processes.
│   │   ├── DependentMethod.java
│   │   │   - Showcases how methods can depend on other methods using @Test(dependsOnMethods).
│   │   └── PriorityIgnoreInvocation.java
│   │       - Illustrates test prioritization using @Test(priority) and how to skip tests with invocation count 0.
│   │
│   ├── july_2
│   │   ├── AssertGetTitleMethod.java
│   │   │   - Contains assertions to validate web page titles using TestNG assertions.
│   │   └── ThirdTestNGClass.java
│   │       - A generic TestNG class that runs simple test cases and integrates multiple annotations.
│   │
│   ├── july_3
│   │   ├── DataProviderAnnotation.java
│   │   │   - Uses @DataProvider to supply test data to test methods for parameterized tests.
│   │   └── ParametersCrossBrowsing.java
│   │       - Contains test cases for cross-browser testing using @Parameters and TestNG XML configurations.
│   │
│   ├── june_NG29
│   │   └── PrimusHomePage.java
│   │       - Contains test cases focused on the homepage of Primus Bank for automation scenarios.
│   │
│   ├── primusLogin
│   │   ├── PrimusBankSubClass.java
│   │   │   - Extends functionality related to specific banking operations, following a subclass model for modular testing.
│   │   └── PrimusBaseClass.java
│   │       - Acts as a base class providing common setup and utility methods for the Primus Bank login tests.
│
├── TestNG
│   - Holds configuration files and additional TestNG related data for test execution and reporting.
│
├── test-output
│   - The folder where TestNG generates HTML reports and logs after test execution.
│
├── CrossBrowsing.xml
│   - XML configuration file for running cross-browser tests with different parameters such as browser types and environments.
│
├── Manish.xml
│   - A personalized TestNG XML file for executing a specific suite of test cases.
│
├── Mine.xml
│   - A custom TestNG XML file for running individual or experimental test cases.
│
└── pom.xml
    - The Maven configuration file that handles project dependencies, plugins, and build lifecycle management.
</pre>

---

<h2>📦 Dependencies</h2>

Ensure the following are installed:

<ul>
  <li><strong>Java</strong> (version 17 or above)</li>
  <li><strong>Maven</strong> (latest version)</li>
  <li><strong>TestNG</strong> (latest version)</li>
  <li><strong>Selenium WebDriver</strong> (for browser automation)</li>
</ul>

<h3>📚 Libraries Used</h3>
<ul>
  <li><strong>Selenium WebDriver</strong> (for browser automation)</li>
  <li><strong>TestNG</strong> (for test management)</li>
  <li><strong>Maven</strong> (for project management)</li>
</ul>

---

<h2>🛠️ How to Run the Tests</h2>

<ol>
  <li><strong>Clone the repository:</strong>
    <pre>
    git clone https://github.com/yourusername/TestNg_FrameWork.git
    cd TestNg_FrameWork
    </pre>
  </li>
  <li><strong>Install the dependencies:</strong>
    <pre>
    mvn clean install
    </pre>
  </li>
  <li><strong>Run the tests:</strong>
    <pre>
    mvn test -DsuiteXmlFile=CrossBrowsing.xml
    </pre>
  </li>
</ol>

---

<h2>📝 TestNG XML Files</h2>

<p>
The project uses multiple XML configuration files to customize test execution. These files can be modified to include specific test classes, methods, and parameters.
</p>

<ul>
  <li><strong>CrossBrowsing.xml</strong> - Designed for running tests across multiple browsers and configurations.</li>
  <li><strong>Manish.xml</strong> - A custom suite file for running specific test cases.</li>
  <li><strong>Mine.xml</strong> - Used for personal or experimental test execution.</li>
</ul>

---

<h2>📊 Test Results</h2>

<p>
Upon test execution, the results will be available in the <code>test-output</code> folder, which includes detailed HTML reports generated by TestNG.
</p>

---

<h2>🌐 Contribution Guidelines</h2>

<p>
Contributions are welcome! Whether it's reporting a bug, suggesting an enhancement, or submitting a pull request, your contributions help improve the framework.
</p>

<ol>
  <li>Fork the repo</li>
  <li>Create a feature branch (<code>git checkout -b feature/your-feature</code>)</li>
  <li>Commit your changes (<code>git commit -m 'Add feature'</code>)</li>
  <li>Push to the branch (<code>git push origin feature/your-feature</code>)</li>
  <li>Create a Pull Request</li>
</ol>

---

<h2>🎨 Technologies Used</h2>

<ul>
  <li><strong>Java 17</strong></li>
  <li><strong>Maven</strong></li>
  <li><strong>TestNG</strong></li>
  <li><strong>Selenium WebDriver</strong></li>
</ul>

---

<h2>🌟 Show Your Support</h2>

<p>
If you found this framework useful, please consider giving it a ⭐ on GitHub!
</p>
