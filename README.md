# Design Patterns - Low-level System Design

This repo is a **structured, hands-on collection of design pattern notes/examples** for low-level system design.  
Each folder contains focused material (notes, code, exercises, or mini-demos) for a topic or pattern.

## What you’ll learn
- Quick OOP recap + **SOLID principles**
- Core **Design Patterns** grouped by category:
  - **Behavioral**
  - **Creational**
  - **Structural**
- A small **project** to apply patterns in a realistic context

---

## Repository Structure
### 1) Foundations
- `1 - Introduction`
- `2 - Object Oriented Programming Recap`
- `3 - SOLID Principles`

### 2) Behavioral Design Patterns
- `4 - Part-I Behavioural Design Patterns`
- `5 - Memento Pattern`
- `6 - Observer Pattern`
- `7 - Strategy Pattern`
- `8 - Command Pattern`
- `9 - Template Method Pattern`
- `10 - Iterator Pattern`
- `11 - State Pattern`
- `12 - Mediator Pattern`

### 3) Creational Design Patterns
- `13 - Part-II Creational Design Patterns`
- `14 - Singleton Pattern`
- `15 - Builder Design Pattern`
- `16 - Factory Design Pattern`
- `17 - Abstract Factory Pattern`
- `18 - Prototype Pattern`

### 4) Structural Design Patterns
- `19 - Part-III Structural Design Patterns`
- `20 - Adapter Pattern`
- `21 - Decorator Pattern`
- `22 - Proxy Pattern`
- `23 - Composite Pattern`
- `24 - Facade Pattern`
- `25 - FlyWeight Pattern`

### 5) Capstone / Practice
- `26 - Project - Ride Sharing App`

---

## How to use this repo (recommended)
1. Start with **OOP recap → SOLID** (folders 2–3).
2. Learn patterns in this order:
   - **Strategy → Observer → Command → State**
   - then the rest (Template Method, Iterator, Mediator, etc.)
3. After each pattern:
   - Write a tiny example
   - Note: *Problem → Intent → When to use → Trade-offs*
4. Finish with the **Ride Sharing App project** and identify where patterns fit.

---

## Quick Pattern Guide (when to use what)
- **Strategy**: swap algorithms/behaviors at runtime (e.g., pricing, routing)
- **Observer**: event-driven updates (e.g., driver location updates)
- **Command**: encapsulate actions (e.g., cancel ride, refund)
- **State**: clean state transitions (e.g., requested → accepted → ongoing → completed)
- **Template Method**: shared workflow with customizable steps
- **Iterator**: standard way to traverse collections
- **Mediator**: centralize complex interactions (reduce object-to-object chatter)

- **Singleton**: single instance (use carefully; can hurt testability)
- **Builder**: construct complex objects step-by-step
- **Factory / Abstract Factory**: create objects without exposing concrete classes
- **Prototype**: clone preconfigured objects efficiently

- **Adapter**: make incompatible interfaces work together
- **Decorator**: add features without subclass explosion
- **Proxy**: control access / lazy load / caching
- **Composite**: tree structures (treat groups like single items)
- **Facade**: simplify a complex subsystem behind a clean API
- **Flyweight**: reduce memory by sharing repeated data

---

## Suggested checklist per pattern
- ✅ Problem it solves  
- ✅ UML / class roles  
- ✅ Minimal example  
- ✅ Pros/cons + alternatives  
- ✅ Real-world use case

---

## Goal
By the end, you should be able to **recognize a design problem** and confidently choose a pattern that improves:
- maintainability
- extensibility
- testability
- clarity of responsibilities
