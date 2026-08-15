# Java OOP -- Week 03 Lab Practice and Assignment

This repository contains my Java Object-Oriented Programming (OOP)
practice and assignment work for Week 03.

## Project Structure

-   **1&2. Triangle with Point**
    -   `Point.java`
    -   `Triangle2.java`
    -   `Main.java`
-   **3. Stack and Heap Visualization**
    -   Visualization of the `addPoint()` method using Python Tutor.
-   **4. Complex and Rational**
    -   `Complex.java`
    -   `Rational.java`
    -   `Main.java`
-   **5. Chapter 8 Practice Classes**
    -   `Line2.java`
    -   `Vector.java`
    -   Related execution/testing files.

## Learning Objectives

This project practices:

-   Java classes and objects
-   Encapsulation
-   Private attributes
-   Constructors
-   Default and parameterized constructors
-   Copy constructors
-   Setters and getters
-   Static variables and object counting
-   `toString()` methods
-   Object composition
-   Mathematical operations
-   Stack and heap visualization
-   UML class diagrams

## Point Class

The `Point` class represents a two-dimensional point.

### Features

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setters and getters
-   Point object counting
-   Point addition
-   Point subtraction
-   `toString()`

Example:

``` java
Point A = new Point(2, 3);
Point B = new Point(4, 5);
Point C = A.addPoint(B);
```

## Triangle2 Class

`Triangle2` demonstrates composition by using three `Point` objects.

### Features

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setter and getters
-   Distance calculation
-   Perimeter
-   Area using Heron's formula
-   Object counting
-   `toString()`

Heron's formula:

``` text
s = (a + b + c) / 2
Area = sqrt(s(s-a)(s-b)(s-c))
```

## Stack and Heap Visualization

The project includes a visualization of `addPoint()` to understand:

-   Stack frames
-   Heap objects
-   Object references
-   Method calls
-   Creation of a new object inside a method

## Complex Class

The `Complex` class represents a complex number:

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
-   Display and `toString()`

For multiplication:

``` text
(a + bi)(c + di) = (ac - bd) + (ad + bc)i
```

## Rational Class

The `Rational` class represents a fraction using a numerator and
denominator.

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
-   Decimal display with chosen precision
-   Object counting
-   `toString()`

Examples of rational arithmetic:

``` text
a/b + c/d = (ad + bc)/bd
a/b - c/d = (ad - bc)/bd
a/b * c/d = ac/bd
a/b / c/d = ad/bc
```

## Line2 Class

`Line2` represents a line segment using four coordinates:

``` text
(x1, y1)
(x2, y2)
```

### Features

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setter and getters
-   Length
-   Slope
-   Intersection calculation
-   Object counting
-   `toString()`

Length:

``` text
sqrt((x2-x1)^2 + (y2-y1)^2)
```

Slope:

``` text
(y2-y1)/(x2-x1)
```

The intersection method returns a `Point` when two lines intersect and
returns `null` when the lines are parallel.

## Vector Class

The `Vector` class represents a two-dimensional vector using a starting
point and an ending point.

### Features

-   Default constructor
-   Parameterized constructor
-   Copy constructor
-   Setter and getters
-   Vector addition
-   Vector subtraction
-   Dot product
-   Cross product
-   Magnitude
-   Object counting
-   `toString()`

### Dot Product

For vectors `(x1, y1)` and `(x2, y2)`:

``` text
x1*x2 + y1*y2
```

If the dot product is zero, the vectors are perpendicular.

### Cross Product

For two-dimensional vectors:

``` text
x1*y2 - y1*x2
```

### Magnitude

``` text
sqrt(x^2 + y^2)
```

## OOP Concepts

### Encapsulation

Attributes are private and are accessed through methods.

### Constructors

Objects can be created using different constructors:

``` java
new Point();
new Point(2, 3);
new Point(existingPoint);
```

### Copy Constructors

A copy constructor creates a new object from an existing object.

### Static Members

Static counters track the number of objects created.

### Composition

`Triangle2` and `Vector` use `Point` objects as their attributes.

## UML

UML class diagrams are included in the project to show:

-   Class names
-   Attributes
-   Static attributes
-   Constructors
-   Methods
-   Return types
-   Class relationships

## Compile and Run

Compile the Java files:

``` bash
javac *.java
```

Run the class containing `main()`:

``` bash
java Main
```

## Tools Used

-   Java
-   Java OOP
-   `javac`
-   Python Tutor
-   UML
-   GitHub

## Course Information

**Course:** Java Object-Oriented Programming\
**Week:** 03\
**Student:** Huzaifa\
**Repository:** `Week03-04_Huzaifa_057`

This repository documents my practice with Java classes, objects,
constructors, class relationships, mathematical operations, and memory
visualization.
