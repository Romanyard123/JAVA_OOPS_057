# Java OOP Practice Repository

Welcome to my Java Object-Oriented Programming practice repository.

This repository contains my work from **Week 01 through Week 03--04**,
including small Java demonstrations, object-oriented programming
exercises, mathematical classes, and visualization work.

## Repository Structure

``` text
Java OOP Repository
│
├── Week01_Huzaifa_057
│   ├── Calculator Demo
│   └── Car Demo
│
├── Week02_Huzaifa_057
│   ├── Student Demo
│   └── Triangle Demo
│
└── Week03-04_Huzaifa_057
    ├── 1&2. Triangle with Point
    ├── 3. Stack and Heap Visualization
    ├── 4. Complex and Rational
    └── 5. Chapter 8 Practice Classes
```

------------------------------------------------------------------------

# Week 01 -- Basic Java Classes

## Calculator Demo

The Calculator Demo contains basic Java programming practice.

It focuses on creating a class and implementing simple operations and
methods.

### Main Concepts

-   Java classes and objects
-   Methods
-   Basic arithmetic
-   Object creation
-   Method calls

## Car Demo

The Car Demo introduces object-oriented programming through a simple
`Car` class.

### Main Concepts

-   Creating classes
-   Attributes
-   Methods
-   Constructors
-   Creating and using objects

------------------------------------------------------------------------

# Week 02 -- Object-Oriented Programming Practice

## Student Demo

The Student Demo practices creating a class to represent a student and
working with its attributes and methods.

### Main Concepts

-   Classes and objects
-   Attributes
-   Constructors
-   Setters and getters
-   Object data

## Triangle Demo

The Triangle Demo practices creating a class to represent a triangle and
performing calculations using its properties.

### Main Concepts

-   Encapsulation
-   Constructors
-   Methods
-   Mathematical calculations
-   Object-oriented design

------------------------------------------------------------------------

# Week 03--04 -- Advanced OOP and Mathematical Classes

This section contains the main Java OOP practice completed during the
later weeks.

## 1 & 2. Triangle with Point

This project contains a `Point` class and a `Triangle2` class.

### Point

The `Point` class represents a point in a two-dimensional coordinate
system.

It includes:

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setters and getters
-   Object counting
-   Point addition
-   Point subtraction
-   `toString()`

### Triangle2

The `Triangle2` class uses three `Point` objects to represent a
triangle.

It includes:

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setter and getters
-   Distance calculation
-   Perimeter calculation
-   Area calculation using Heron's formula
-   Object counting
-   `toString()`

This project demonstrates **composition**, because the triangle is built
using `Point` objects.

------------------------------------------------------------------------

# 3. Stack and Heap Visualization

This section demonstrates how Java objects and method calls are
represented in memory.

The `addPoint()` method from the `Point` class was visualized using a
stack and heap visualization tool.

### Concepts Practiced

-   Stack memory
-   Heap memory
-   Objects
-   References
-   Method calls
-   Object creation
-   Passing objects to methods
-   Returning objects from methods

The visualization helps show what happens when a method such as
`addPoint()` creates and returns a new `Point` object.

------------------------------------------------------------------------

# 4. Complex and Rational

This section contains two mathematical classes: `Complex` and
`Rational`.

## Complex Class

The `Complex` class represents a complex number using:

``` text
a + bi
```

### Features

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setters and getters
-   Addition
-   Subtraction
-   Multiplication
-   Conjugate
-   Object counting
-   Display method
-   `toString()`

### Main Concepts

-   Encapsulation
-   Constructors
-   Copy constructors
-   Mathematical operations
-   Returning objects from methods
-   Static object counting

## Rational Class

The `Rational` class represents a rational number as a numerator and
denominator.

For example:

``` text
2/4
```

can be reduced to:

``` text
1/2
```

### Features

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setters and getters
-   Reduction to lowest terms
-   Addition
-   Subtraction
-   Multiplication
-   Division
-   Floating-point display
-   Decimal display with specified precision
-   Object counting
-   `toString()`

### Main Concepts

-   Fraction arithmetic
-   Reduction using GCD logic
-   Constructors
-   Encapsulation
-   Object-oriented mathematical operations

------------------------------------------------------------------------

# 5. Chapter 8 Practice Classes

This section contains additional mathematical and geometric classes
developed from textbook/class exercises.

## Line2

The `Line2` class represents a line segment using four coordinate
values:

``` text
(x1, y1)
(x2, y2)
```

### Features

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setters and getters
-   Length calculation
-   Slope calculation
-   Intersection calculation
-   Object counting
-   `toString()`

The intersection method determines whether two lines intersect and can
return the intersection point.

### Mathematical Concepts

Length:

``` text
sqrt((x2-x1)^2 + (y2-y1)^2)
```

Slope:

``` text
(y2-y1)/(x2-x1)
```

------------------------------------------------------------------------

## Vector

The `Vector` class represents a two-dimensional vector using a starting
point and an ending point.

### Features

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setters and getters
-   Vector addition
-   Vector subtraction
-   Dot product
-   Cross product
-   Magnitude
-   Object counting
-   `toString()`

### Mathematical Concepts

#### Magnitude

``` text
|v| = sqrt(x² + y²)
```

#### Dot Product

``` text
u · v = ux × vx + uy × vy
```

#### 2D Cross Product

``` text
u × v = ux × vy - uy × vx
```

------------------------------------------------------------------------

# OOP Concepts Practiced Throughout the Repository

The repository gradually builds understanding of several important Java
OOP concepts.

## 1. Classes and Objects

Classes provide the structure for objects, while objects are instances
of those classes.

Examples include:

``` java
Point A = new Point(2, 3);
```

and:

``` java
Rational r = new Rational(2, 4);
```

## 2. Encapsulation

Class attributes are kept private and accessed through methods.

Example:

``` java
private int numerator;
```

with getter/setter methods used to access or modify the value.

## 3. Constructors

Different constructors are used to create objects in different ways.

The projects practice:

-   Default constructors
-   Parameterized constructors
-   Copy constructors

## 4. Copy Constructors

A copy constructor creates a new object using another object of the same
class.

Example:

``` java
public Rational(Rational R)
```

## 5. Static Members

Several classes contain an object counter:

``` java
private static int count;
```

This allows the class to keep track of how many objects have been
created.

## 6. Object Composition

Some classes contain objects of other classes.

For example:

``` text
Triangle2
 ├── Point A
 ├── Point B
 └── Point C
```

and:

``` text
Vector
 ├── Point start
 └── Point end
```

## 7. Returning Objects

Several methods return newly created objects.

For example:

``` java
return new Point(...);
```

or:

``` java
return new Rational(...);
```

This provides practice with object creation inside methods.

## 8. Method Overloading Through Constructors

The classes use multiple constructors with different parameter lists to
provide different ways of creating objects.

## 9. Mathematical Programming

The repository applies Java OOP to mathematical concepts such as:

-   Coordinates
-   Distance
-   Triangles
-   Heron's formula
-   Complex numbers
-   Rational numbers
-   Lines
-   Slopes
-   Line intersections
-   Vectors
-   Dot products
-   Cross products
-   Vector magnitude

------------------------------------------------------------------------

# UML Diagrams

UML diagrams were created for the major classes to visualize their
structure.

The diagrams show:

-   Class names
-   Private attributes
-   Static attributes
-   Constructors
-   Public methods
-   Parameters
-   Return types
-   Relationships between classes

------------------------------------------------------------------------

# Tools Used

-   **Java**
-   **Java Compiler (`javac`)**
-   **Python Tutor / stack and heap visualization**
-   **UML diagrams**
-   **GitHub**

------------------------------------------------------------------------

# How to Compile and Run

Open a terminal inside the folder containing the Java files.

Compile:

``` bash
javac *.java
```

Then run the class containing the `main()` method:

``` bash
java Main
```

Some folders contain separate `Main.java` files because each
exercise/project is designed to be tested independently.

------------------------------------------------------------------------

# Repository Progression

The repository follows a gradual learning path:

``` text
Basic Java
    ↓
Classes and Objects
    ↓
Constructors
    ↓
Encapsulation
    ↓
Setters and Getters
    ↓
Copy Constructors
    ↓
Static Object Counting
    ↓
Object Composition
    ↓
Mathematical Classes
    ↓
Stack and Heap Visualization
    ↓
Geometric and Vector Operations
    ↓
More Advanced OOP Practice
```

------------------------------------------------------------------------

# Purpose of This Repository

The purpose of this repository is to document my progress while learning
Java Object-Oriented Programming.

The projects start with simple classes and gradually move toward classes
that combine:

-   Object-oriented programming
-   Mathematical formulas
-   Object composition
-   Memory visualization
-   Reusable methods
-   Class design

Each week's folder represents a stage of the learning process and
contains practical exercises completed during that stage.

------------------------------------------------------------------------

## Author

**Huzaifa**

Java OOP Practice Repository

**Weeks covered:** Week 01 -- Week 03/04
