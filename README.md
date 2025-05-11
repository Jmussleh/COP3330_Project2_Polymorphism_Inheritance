# Fruit Inheritance & Polymorphism Project

This Java project demonstrates the principles of **inheritance**, **polymorphism**, and **interfaces** using a fruit-themed class hierarchy.

## Overview

The program simulates different types of fruit, with a shared interface and base class. Each fruit type (e.g., citrus, berry) overrides behavior like calorie calculation and ripeness changes. An application class (`FruitApp`) creates instances of these fruits and performs actions on them.

## Features

- Implements a **`Fruit` interface** with two abstract methods: `calculateCalories()` and `changeRipeness()`
- Defines a **`BaseFruit` parent class** with:
  - Shared fields: `name`, `weightInGrams`, and `isRipe`
  - Shared behavior and overrides
- Includes **four child classes**:
  - `CitrusFruit` – adds `acidityLevel`
  - `BerryFruit` – adds `hasSeeds`
- Demonstrates **method overriding** and **polymorphism**
- Stores all objects in a `BaseFruit[]` array and iterates using polymorphic calls

## File Structure

- Fruit.java            - Interface defining shared methods
- BaseFruit.java        - Abstract parent class
- CitrusFruit.java      - Child class representing citrus fruits
- BerryFruit.java       - Child class representing berries
- FruitApp.java         - Application class with main method
