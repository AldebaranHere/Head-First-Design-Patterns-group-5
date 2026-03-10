# Head First Design Patterns (2020 2nd Edition) - Code Examples

> Modified for the CSCM602223 (Advanced Programming) course at the Faculty of Computer Science Universitas Indonesia.

This repository contains the modified code examples from the Head First Design Patterns (2020 2nd edition).
We modified the original code so it can be loaded on modern IDE like Visual Studio Code & IntelliJ.

For the Advanced Programming students, please see the [Class Exercise](#class-exercise) section for the rundown and expected deliverables.

## Class Exercise

Each group is assigned a specific "Challenge" package or refactoring task based on the code examples in this repository.
Your goal is to identify the intention underlying the design pattern, implement the missing logic, and be able to communicate your design decisions and solution to the class.

The general steps to work on the exercise are as follows:

1. Create a fork of this repository into the namespace/organisation of your group project.
2. Each group member clones the forked repository into their own local development machine.
3. Check out the `demo/csui-advprog` branch locally to get the latest code & exercise instruction.
4. Work and discuss on the assigned problem to your group.
5. Save the changes to the codebase as new commit(s) and push them to your forked repository on GitHub.
   There should be only one person creating and pushing the commit(s) to avoid merge conflicts.
6. Create a presentation slidedeck that presents:
   1. The pattern's intent
   2. The code changes you made
   3. Your answer to the question in the last discussion task
7. Submit the link to the forked repository and the slidedeck into the submission slot on the LMS (SCELE).

The following subsections explain the assigned work for each group.

### Group 1: Strategy Pattern

Your objective is to decouple sharing logic in the [package about mobile phone](./src/headfirst/designpatterns/strategy/challenge) and apply the Open-Closed Principle.
The code example in the mobile phone package has different camera apps that need to share photos via different methods.

Your tasks:

1. [ ] Implement a new strategy
   - Create a new strategy such as `Discord` or `Telegram` strategy class that implements `ShareStrategy` interface.
2. [ ] Set a default sharing strategy to `BasicCameraApp` and `CameraPlusApp`
   - Update these classes to set default sharing strategy in their constructors.
3. [ ] Refactor `PhotoWithPhone` class
   - Look at `switch` statement in the class. How can you refactor this to make it easier to add more sharing methods in the future without constantly changing the `main` method?
4. [ ] Discuss and present your work in front of the class
   - How does this pattern help us follow the Open-Closed Principle?

### Group 2: Factory Method Pattern

Your objective is to refactor a simple factory implementation in the [package about creating calendar](./src/headfirst/designpatterns/factory/challenge) to follow the Factory Method pattern.
There is a class named `ZoneFactory` that is used by `PacificCalendar` to create the correct timezone representation based on certain ID.
The creation logic can be refactored to a more robust, inheritance-based Factory Method.

Your tasks:

1. [ ] Fix the bug in `ZoneFactory` class about string comparison
   - Hint: `==` vs. `.equals()`
2. [ ] Refactor the design in the package
   - Modify `Calendar` class to have an abstract `createZone()` method,
     thus allowing each regional calendar to manage its own timezone creation without needing an external factory or string IDs.
3. [ ] Create a new timezone
   - Implement a new `ZoneJakarta` (GMT+7) and a corresponding `JakartaCalendar` subclass that implements the `createZone()` method to use it.
4. [ ] Discuss and present your work in front of the class
   - How does moving the creation logic into subclasses, i.e. Factory Method, provide more flexibility compared to using a separate simple factory class?

### Group 3: Adapter Pattern

Your objective is to add a new adapter for adapting `Drone` to `Turkey` in [the corresponding package about Adapter pattern](./src/headfirst/designpatterns/adapter/ducks/challenge).
You can follow similar implementation found in the example where `DroneAdapter` adapts `Drone` to behave as `Duck`.

Your tasks:

1. [ ] Look at `Drone` and `Duck` classes, and see their similarities and differences.
   - You should see that one method is similarly found in both classes, and one method is different.
2. [ ] Create a new Adapter class that adapts `Drone` to `Turkey`.
   - You can name it `DroneToTurkeyAdapter` or other names that show it is an adapter of `Drone` that will behave like a `Turkey`.
3. [ ] Create a new driver class named `DroneTestDrive` to simulate and verify the new adapter.
   - Create a `main` method in the new driver class that instantiates an instance of `Drone`, `Turkey`, and its adapter.
     Then, try to show how the adapter behaves.
4. [ ] Discuss and present your work in front of the class
   - What happens when one interface has methods that simply don't exist in the other?
     Should we forcefully adapt them as well? Or ignore them by providing no-op implementation in the adapter?

### Group 4: Decorator Pattern

Your objective is to implement new behavior for computing discount and taxes using decorators in the [Starbuzz With Sizes package](./src/headfirst/designpatterns/decorator/starbuzzWithSizes).
There is an existing decorator for implementing layers of condiments to a beverage,
and you will add new decorators to allow dynamic computation of the beverage's final cost.
For instance, a beverage may have a discount and/or service tax applied to them during checkout.

Your tasks:

1. [ ] Create a new decorator called `DiscountDecorator` that extends `CondimentDecorator`
   - The new decorator reduces the final cost of any wrapped beverage by 10%.
2. [ ] Create a new decorator called `ServiceTaxDecorator` that extends `CondimentDecorator`
   - The new decorator adds $0.67 to the final cost.
3. [ ] In the corresponding driver class (`StarbuzzCoffee`), create two identical beverage orders, e.g., "Dark Roast with Mocha".
   - For the first order, apply the `DiscountDecorator` before the `TaxDecorator`.
   - For the second order, apply them in reverse.
4. [ ] Discuss and present your work in front of the class
   - Does the order of decorators change the final price?
   - How does the Decorator pattern handle complex "nested" calculations like this without modifying the base `Beverage` code?

### Group 5: Template Method Pattern

Your objective is to create a new example of Template Method pattern in [the corresponding package](./src/headfirst/designpatterns/templatemethod).
The new example is about a software component to export raw data into multiple formats such as CSV and HTML.
All exports follow a standard set of steps, but the formatting is different according to the target format.

Your tasks:

1. [ ] Create a new package named `exporter` inside the `templatemethod` package
2. [ ] Define the abstract template class named `DataExporter` in the `exporter` package
3. [ ] In the new class, create a method named `exportData()` with `final` modifier
   - In the `exportData()`, make sure the method follows this sequence of method calls: `readFromDatabase()`, `formatData()`, `saveToFile()`.
4. [ ] Identify which steps are common and which must be implemented by subclasses
   - The common step(s) must be implemented in `DataExporter`.
   - The varying step(s) should be marked as abstract method and will be implemented by subclasses of `DataExporter`.
5. [ ] Create variants by implementing new subclasses named `CSVExporter` and `HTMLExporter` that extend `DataExporter`
   - Implement the abstract methods inherited from the parent class.
6. [ ] Create a simple driver class with a single `main` method to simulate both exporters.
7. [ ] Discuss and present your work in front of the class
   - How does this pattern ensure that every exporter follows the same common steps without relying on the subclasses to remember to do it?

## The Original README

I have recently updated all the code for Head First Design Patterns for the 2nd edition of the book, released in December, 2020.

Download the code and compile and run from the command line, or load the code into project in Eclipse using Java 8 or higher.

Other links for the book are available on the book page at <a href="http://wickedlysmart.com/head-first-design-patterns/">wickedlysmart.com</a>.

## Generative AI Use Disclosure

The outlines of the group work specifications are created through a series of discussions with Gemini 3 models using [Gemini CLI](https://geminicli.com).
The final specifications in this document is organically written by human author.
