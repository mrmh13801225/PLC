# FunctionCraft Compiler

This repository contains the implementation of the **FunctionCraft** programming language compiler, developed as part of the University of Tehran’s compiler course. FunctionCraft is a simple type inference language, and this project covers four phases of the compiler development process.

---

## Phases

### Phase 1: Lexical and Syntax Analysis

In this phase, we implemented the lexical analyzer and syntax analyzer for FunctionCraft using Antlr. The goal was to parse the input source code and construct an Abstract Syntax Tree (AST). The AST represents the program's structure, which we then traversed and printed.

### Phase 2: Name Analysis

The second phase involved implementing the name analyzer. Here, we focused on resolving identifiers, scoping rules, and ensuring that variable and function names were correctly bound.

### Phase 3: Type Checking

Type checking is a critical part of any compiler. In this phase, we implemented type inference for FunctionCraft. We ensured that expressions, function calls, and assignments had compatible types. Any type errors were reported to the user.

### Phase 4: Code Generation

Finally, we implemented the code generator using Jasmin. This phase translates the FunctionCraft AST into Jasmin assembly code. 

---

- [**Mohammadreza Mohammadhasemi**](https://github.com/mrmh13801225)
- [**Pardis Zandkarimi**](https://github.com/ikawa367)

