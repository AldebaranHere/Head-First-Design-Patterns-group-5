# Head First Design Patterns (2020 2nd Edition) - Code Examples

> Modified for the Advanced Programming course at the Faculty of Computer Science Universitas Indonesia.

This repository contains the modified code examples from the Head First Design Patterns (2020 2nd edition).
We modified the code so it can be loaded on modern IDE like Visual Studio Code & IntelliJ.

For CSCM602223 (Advanced Programming) students, please see the [Class Exercise](#class-exercise) section for the rundown and expected deliverables.

## Class Exercise

Each group is assigned a specific "Challenge" package or refactoring task based on the code examples in this repository.
Your goal is to identify the intention underlying the design pattern, implement the missing logic, and able to communicate your design decisions and solution to the class.

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
   - Look at `switch` statement in the class. How can you refactor this to make it easier to add more sharing method in the future without constantly changing the `main` method?
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
   - Make `Calendar` class to have an abstract `createZone()` method,
     thus allowing each regional calendar to manage its own timezone creation without needing an external factory or string IDs.
3. [ ] Create a new timezone
   - Implement a new `ZoneJakarta` (GMT+7) and a corresponding `JakartaCalendar` subclass that implements the `createZone()` method to use it.
4. [ ] Discuss and present your work in front of the class
   - How does moving the creation logic into subclasses, i.e. Factory Method, provide more flexibility compared to using a separate simple factory class?

## The Old, Original README

I have recently updated all the code for Head First Design Patterns for the 2nd edition of the book, released in December, 2020.
Download the code and compile and run from the command line, or load the code into project in Eclipse using Java 8 or higher.
Other links for the book are available on the book page at <a href="http://wickedlysmart.com/head-first-design-patterns/">wickedlysmart.com</a>.

## Generative AI Use Disclosure

The outlines of the group work specifications are created through a series of discussions with Gemini 3 models using [Gemini CLI](https://geminicli.com).
