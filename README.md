# Finite-Automata-Simulator
# Automata Simulator

This project is an implementation of an automata simulator that enables users to select between two distinct deterministic finite automata (DFA) configurations (L1 and L2) and evaluate whether a given binary string is accepted by the chosen automaton.

## Features

- Supports two predefined deterministic finite automata (L1 and L2).
- Allows user input of binary strings (consisting of `0` and `1`).
- Determines acceptance of the input string based on the selected automaton.

## Automaton Configurations

### Automaton L1
- **States**: `PP`, `PI`, `IP`, `II`
- **Initial State**: `PP`
- **Final State**: `PI`
- **Alphabet**: `0`, `1`
- **Transition Table**:
    | Current State | Input `0` | Input `1` |
    |---------------|-----------|-----------|
    | `PP`          | `IP`      | `PI`      |
    | `PI`          | `II`      | `PP`      |
    | `IP`          | `PP`      | `II`      |
    | `II`          | `PI`      | `IP`      |

### Automaton L2
- **States**: `S0`, `S1`, `S2`, `S3`
- **Initial State**: `S0`
- **Final States**: `S0`, `S1`, `S2`
- **Alphabet**: `0`, `1`
- **Transition Table**:
    | Current State | Input `0` | Input `1` |
    |---------------|-----------|-----------|
    | `S0`          | `S1`      | `S0`      |
    | `S1`          | `S2`      | `S0`      |
    | `S2`          | `S2`      | `S3`      |
    | `S3`          | `S3`      | `S3`      |

## How to Run the Project

1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
  ```
  cd <project-directory> 
  ```
3. Compile the Java files:
  ```
  javac Main.java Automate.java
  ```
4. Run the program:
  ```
  java Main
  ```
5. Follow the prompts to select an automaton and enter a binary string.

## Requirements

- Java Development Kit (JDK) version 8 or later

## Contributing

If you'd like to contribute to this project, please fork the repository and submit a pull request with your changes.


