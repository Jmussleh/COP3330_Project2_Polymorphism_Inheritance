# Fruit Inheritance & Polymorphism Project: 
## Jena Mussleh, COP3330C - 26824

This Java project demonstrates the principles of **inheritance**, **polymorphism**, and **interfaces** using a fruit-themed class hierarchy.

## Overview

The program simulates different types of fruit, with a shared interface and base class. Each fruit type (e.g., citrus, berry) overrides behavior like price and ripeness changes. An application class (`ProduceApp`) creates instances of these fruits and performs actions on them.

## Features

- Implements a **`Fruit` interface** with two abstract methods: `calculateCalories()` and `changeRipeness()`
- Defines a **`Fruit` parent class** with:
  - Shared fields: `name`, `weight`, and `pricePerPound`
  - Shared behavior and overrides: `price`, and `ripen`
- Includes **two child classes**:
  - `CitrusFruit` – adds `acidityLevel`
  - `BerryFruit` – adds `hasSeeds`
- Demonstrates **method overriding** and **polymorphism**
- Stores all objects in a `Fruit[]` array and iterates using polymorphic calls

## File Structure

- Fruit.java            - Interface defining shared methods
- Produce.java        - Abstract parent class
- CitrusFruit.java      - Child class representing citrus fruits
- BerryFruit.java       - Child class representing berries
- ProduceApp.java         - Application class with main method
