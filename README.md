# 🧮 GitHub Workshop: Calculator Project (Python + Java)

Welcome to the **GitHub Workshop Calculator Project!**  
This repository is designed to help you learn and practice **Git version control**, **branching**, **collaboration**, and **merging workflows** — all while contributing simple code in **Python** or **Java**.


## 📁 Project Structure

```

github-workshop/
├── README.md
├── python/
│   ├── calculator.py
│   └── operations.py
└── java/
    ├── Calculator.java
    └── Operations.java

```
Each folder contains a simple calculator app that performs basic arithmetic operations.  
Participants can modify, extend, and experiment with Git workflows while improving the app.

---

## ⚙️ Setup Instructions

### 🐍 Python Version

1. Navigate to the Python directory:
```bash
   cd python
````

2. Run the calculator:

```bash
python calculator.py
```
### ☕ Java Version

1. Navigate to the Java directory:

```bash
cd java
```

2. Compile and run the program:

```bash
javac utils/Operations.java Calculator.java
java Calculator
```

## 🧩 Your Workshop Tasks

Each participant should:

1. **Create a new branch** based on `dev`.

   ```bash
   git checkout dev
   git pull
   git checkout -b feature-yourname
   ```

2. **Make a meaningful code change**:

   * Add a new function (`modulus`, `power`, `average`, etc.)
   * Fix a bug (e.g., divide-by-zero handling)
   * Improve output formatting or add comments

3. **Commit and push your changes**:

   ```bash
   git add .
   git commit -m "Added power function in operations.py"
   git push origin feature-yourname
   ```

4. **Open a Pull Request** on GitHub targeting `dev`.

5. **Review and merge** your pull request once approved.

---

## 🧠 Example Challenge Ideas

Here are some ideas to extend the calculator:

* Add a **power function**: `a^b`
* Add a **modulus function**: `a % b`
* Add an **average function**: `(a + b) / 2`
* Handle **invalid input** or **string formatting**
* Add **user input support** instead of hardcoded values

---

## 🪄 Best Practices to Follow

* Always **create branches** for new features or bug fixes.
* Use (conventional commits)[https://www.conventionalcommits.org/en/v1.0.0] for commit messages.

---

## 🧑‍💻 Contributing Guidelines

1. Fork this repository.
2. Create a feature branch:

   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:

   ```bash
   git commit -m "Add feature-name"
   ```
4. Push to your branch and open a pull request.
5. Wait for review before merging.

---

## 🧾 License

This project is licensed under the [MIT License](LICENSE).

