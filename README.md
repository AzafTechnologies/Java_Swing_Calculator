# 🧮 Azaf's Java Swing Calculator

A sleek, high-performance desktop calculator application built from scratch using the **Java Swing** framework! ☕ 

This project showcases clean Event-Driven Programming (EDP), custom absolute layout positioning, and dynamic UI rendering to deliver a beautiful, dark-themed user experience.

---

## 🎨 UI Architecture & Design Details

The application skips default native operating system windows styles in favor of a bespoke, modern aesthetic:

* **🖼️ Display Screen:** Powered by a customized `JLabel` with an eye-catching Amber background (`#F39C2C`) and right-aligned text formatting for standard calculator readouts.
* **🎛️ Color-Coded Keypad Matrix:** 
  * **Number Keys (0-9) & Decimals:** Styled in a deep cocoa tone (`#4E2F21`) with crisp white fonts.
  * **Advanced Math Operators ($x^2, x^3, \%$):** Set in an asphalt grey (`#5A554C`) to separate utility functions from basic typing.
  * **Core Arithmetic Operators ($+, -, \times, /$):** Styled in soft orange (`#FEA059`) for quick navigation.
  * **The Evaluation Key ($=$):** Highlighted in a distinct Warning Yellow (`#FEC107`) to draw the eye to the final action item.

---

## 🚀 Key Functional Features

* **➕ Mathematical Core:** Full state tracking for basic arithmetic operations (Addition, Subtraction, Multiplication, Division).
* **⚡ Instant Exponent Processing:** Direct computation logic for Squares ($x^2$) and Cubes ($x^3$) that alters state on a single click without requiring an equals keypress.
* **🧩 Modulo Arithmetic (`%`):** Standard remainder extraction mode, seamless alongside basic operators.
* **🧼 Memory Flushing:** A dedicated text-clearing function to instantly reset the primary calculation buffer.

---

## ⚙️ Technical Code Breakdown

The program operates using a centralized structural design:
1. **Single-Class Architecture:** Built completely inside `CALCULATOR.java` for clean portability and zero external dependency friction.
2. **Interface Implementation:** Implements `ActionListener` globally, routing all button interactions cleanly into a unified `actionPerformed(ActionEvent e)` logic matrix.
3. **Floating-Point Precision:** Uses Java's native `Float.parseFloat()` engines to read UI string buffers and convert inputs into math-ready calculation blocks dynamically.

---

