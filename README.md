
# EMI Calculator

A simple Java console application that calculates the **Equated Monthly Installment (EMI)** for a loan based on user input for loan amount, interest rate, and tenure.

## 📋 Features

- Accepts:
  - **Loan amount** in USD
  - **Annual interest rate** (as a percentage)
  - **Loan tenure** in years
- Converts annual interest to a monthly rate
- Calculates EMI using the standard EMI formula:
  \[
  \text{EMI} = \frac{P \cdot r \cdot (1 + r)^n}{(1 + r)^n - 1}
  \]
  where:
  - \( P \) = principal loan amount  
  - \( r \) = monthly interest rate  
  - \( n \) = number of monthly installments  

## 🚀 Getting Started

### Requirements

- Java installed (JDK 8 or higher)

### How to Compile

```bash
javac EMICalc.java
```

### How to Run

```bash
java EMICalc
```

## 🖥️ Example

```
Enter loan amount in USD
50000
Enter annual interest rate (in %
7.5
Enter loan tenure in yrs
10
Your monthly EMI is: 593.4091542612788
```

> 💡 You can round the EMI value for a cleaner display, e.g., `Math.round(emi * 100.0) / 100.0`.

## 🧠 Improvements You Can Add

- Round EMI to two decimal places for readability
- Add input validation (e.g., check for negative or zero values)
- Format currency output for better user experience
- Generate a full amortization schedule

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
