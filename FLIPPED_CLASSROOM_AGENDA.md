# Flip-Classroom Agenda: Design Patterns in Action

**Course:** Software Engineering
**Topic:** Applying Creational, Structural, and Behavioral Design Patterns
**Format:** Collaborative Group Discussion & Implementation (90 Minutes)

---

## 📅 Session Overview
In this session, we will move from theoretical understanding to practical application. Each group is assigned a specific "Challenge" package or refactoring task from our codebase. Your goal is to identify the pattern's intent, implement the missing logic, and be ready to explain your design decisions to the class.

---

## 👥 Group Assignments & Tasks

### 🛠 Group 1: The Strategy Pattern (Behavioral)
**Objective:** Decouple sharing logic and apply the Open-Closed Principle.
- **Location:** `src/headfirst/designpatterns/strategy/challenge/`
- **Context:** We have different Camera Apps that need to share photos via different methods.
- **Task:**
    1.  **Implement a New Strategy:** Create a `Slack` or `Discord` strategy class that implements the `ShareStrategy` interface.
    2.  **Set Defaults:** Update `BasicCameraApp` and `CameraPlusApp` to set a *default* sharing strategy in their constructors.
    3.  **Refactor for Flexibility:** Look at the `switch` statement in `PhotoWithPhone.java`. How can you refactor this to make it easier to add a 4th or 5th sharing method without constantly changing the `main` method?
    4.  **Discussion:** How does this pattern help us follow the "Open-Closed Principle" (Open for extension, Closed for modification)?

### 🏭 Group 2: The Factory Method Pattern (Creational)
**Objective:** Refactor a "Simple Factory" into the "Factory Method" Pattern.
- **Location:** `src/headfirst/designpatterns/factory/challenge/`
- **Context:** Currently, `ZoneFactory` is a separate class used by `PacificCalendar`. We want to refactor this into a more robust, inheritance-based Factory Method design.
- **Task:**
    1.  **The Bug Hunt:** Look at `ZoneFactory.java`. Can you find and fix the string comparison bug? (Hint: `==` vs `.equals()`).
    2.  **The Pattern Pivot:** Refactor the design so that `Calendar.java` itself has an abstract `createZone()` method, allowing each regional calendar to manage its own zone creation without needing an external factory or string IDs.
    3.  **Regional Expansion:** Implement a new `ZoneJakarta` (GMT+7) and a corresponding `JakartaCalendar` subclass that implements the `createZone()` method to use it.
    4.  **Discussion:** How does moving the "creation logic" into subclasses (Factory Method) provide more flexibility than using a separate "Simple Factory" class?

### 🔌 Group 3: The Adapter Pattern (Structural)
**Objective:** Map the interface of a new component to an existing system.
- **Location:** `src/headfirst/designpatterns/adapter/ducks/challenge/`
- **Context:** We have a Duck-based simulation, but we want to introduce `Drones` into it.
- **Task:**
    1.  **Identify the Mapping:** Look at `Drone.java` and `Duck.java`. Notice that `beep()` and `quack()` serve similar purposes.
    2.  **Implement the Reverse:** While `DroneAdapter` exists, your task is to implement a **"Turkey-to-Drone" Adapter** (or similar "Mixed" adapter) to see how you can make a `Turkey` behave like a `Drone`.
    3.  **Validation:** Create a `DroneTestDrive` that proves your adapter works as expected.
    4.  **Discussion:** What happens when one interface has methods that simply don't exist in the other? (e.g., `spin_rotors()` vs `fly()`).

### ☕ Group 4: The Decorator Pattern (Structural)
**Objective:** Apply dynamic behavior (Discounts and Taxes) using a Decoration Chain.
- **Location:** `src/headfirst/designpatterns/decorator/starbuzz/`
- **Context:** The Starbuzz app handles condiments well, but now we need to handle "Special Promotions" and "Service Taxes" that can be applied to any beverage.
- **Task:**
    1.  **The Happy Hour Discount:** Create a `DiscountDecorator` (extending `CondimentDecorator`) that reduces the final cost of any wrapped beverage by 10%.
    2.  **The Tax Man:** Create a `TaxDecorator` that adds a fixed service tax of $0.05 to the final cost.
    3.  **The Order Matters:** In `StarbuzzCoffee.java`, create two identical "Dark Roast with Mocha" orders. For the first, apply the `DiscountDecorator` *before* the `TaxDecorator`. For the second, apply them in reverse.
    4.  **Discussion:** Does the order of decorators change the final price? How does the Decorator pattern handle complex "nested" calculations like this without changing the base `Beverage` code?

### 🍵 Group 5: The Template Method Pattern (Behavioral)
**Objective:** Define a common "Skeleton" for an algorithm in a new domain.
- **Location:** (New Package) `src/headfirst/designpatterns/templatemethod/exporter/`
- **Context:** We need a system to export raw data into multiple formats (e.g., CSV, HTML). All exports follow a standard set of steps, but the formatting is different.
- **Task:**
    1.  **Define the Template:** Create an abstract `DataExporter` class with a `final` method `exportData()`.
    2.  **Define the Algorithm:** The method must follow this sequence: `readFromDatabase()`, `formatData()`, `saveToFile()`, and `logExport()`.
    3.  **Implement Abstract Steps:** Identify which steps are universal (e.g., `logExport()`) and which must be implemented by subclasses (e.g., `formatData()`).
    4.  **Create Variants:** Implement a `CSVExporter` (formats data with commas) and an `HTMLExporter` (formats data with HTML tags like `<table>`).
    5.  **Add a Hook:** Implement a `boolean shouldCompress()` hook that defaults to `false`. Use it in the `saveToFile()` step to simulate file compression if true.
    6.  **Discussion:** How does this pattern ensure that every exporter follows the same logging/security steps (`logExport()`) without relying on the subclasses to remember to do it?

---

## ⏱ Agenda
1.  **Introduction (10m):** Recap of the patterns and goal setting.
2.  **Group Work (45m):** Dive into the code, discuss the design, and implement the solution.
3.  **Class Presentations (30m):** Each group has **6 minutes** to present:
    - **What:** Briefly explain the pattern's intent.
    - **How:** Show the key code changes you made.
    - **Why:** Share your answer to the "Discussion" prompt.
4.  **Wrap-up & Key Takeaways (5m):** Final thoughts from the lecturer on "Pattern Pitfalls."

---
