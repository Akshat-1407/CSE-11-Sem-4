# Java is a object oriented, high level, programming language.

## Compiling Java Program
```bash
    javac fileName.java
```
> Javac is the java compiler which is used to compile the java source code into byte code.
> If compilation is sucessful it makes a fileName.class file.
> This fileName.class file contains the bytecode which is not machine specific and can be run of any machine having JVM.

## Executing Java Program
```bash
    java fileName
```
-------------------------------------------------------------------------------------------------------------------------

## JDK (Java Development Kit)
The JDK is a complete software development package that includes everything needed to
develop, compile, and run Java applications. It contains the JRE (Java Runtime Environment)
and development tools like the Java compiler (javac), debugger, and other utilities. Without the
JDK, we cannot develop and compile Java programs.

## JRE (Java Runtime Environment)
The JRE is required to run Java applications. It includes the JVM (Java Virtual Machine) along
with core Java libraries and runtime resources. While the JRE allows you to execute Java
programs, it does not include the compiler or development tools, so you cannot develop Java
applications with just the JRE.

## JVM (Java Virtual Machine)
The JVM is a key component that makes Java platform-independent. It converts Java bytecode
(.class files) into machine code so that the program can run on any operating system. JRE
contains a JVM, ensuring that Java programs can run on different devices without modification.

> JDK > JRE > JVM

------------------------------------------------------------------------------------------------------------------------

## Object 
An Object in oops represent a specific instance of a class, combining both data (attributes/properties) and behaviour (methods/functions).

## Class
A class is a blueprint/template that defines common attributes and behavour shared by all the objects of that same type.
* A class represents the set of similar objects.
* Objects created from the class follow the structure defined in it.

## super.dataMember
Used to access a superclass method or variable that is hidden by a subclass member

## this.obj
'this' keyword is used in a method to refer to the current object i.e. this is a referencе to the object on which the method was invoked

## super() or super(args)
It is used to call the constructor of the super class from within the subclass. 
It is always present at the first line of the costructor by default.

## this() or this(args)
It is used to call the different constructor of the same class.

## static Keyword: It can be applied to variables(data member), methods, block -: PageNo - 51 to 57

## final Keyword: It can be applied to variables, classes and methods -: PageNo - 84, 85, 86

------------------------------------------------------------------------------------------------------------------------

# Access Specifiers

Access specifiers in Java control the visibility of data members (attributes) and methods (behavior) within a class. 
They help implement **Encapsulation** by restricting or allowing access to certain parts of a class.

### Types of Access Specifiers

* **private**: Accessible only within the same class (Used for sensitive data).
* **public**: Accessible from anywhere (Used for important methods and attributes).
* **protected**: Accessible within the same package and by subclasses within as well as outside the package.
* **default**: Accessible within the same package (If no access specifier is mentioned, it is considered default).

-------------------------------------------------------------------------------------------------------------------------

## Pillars of OOPs

# Abstraction
Abstraction is a process of hiding implementation details and exposing only the functionality to the user. 
In abstraction, we deal with ideas and not events. 
This means the user will only know “what it does” rather than “how it does”.

There are two ways to achieve abstraction in Java:
* Abstract class (0 to 100%) **Page No - 78, 79**
* Interface (100%) **Page No - 88 to 101**


# Encapsulation
* “Encapsulation is the process of wrapping attributes (data members/instance variables) and behavior (methods) together into a single unit.
* Encapsulation ensures data security by restricting direct access to critical data.
* It provides controlled access to attributes through methods.

> Encapsulation bundles data (attributes) and behavior (methods) together in a unit (class).
> Abstraction determines which parts of the unit should be accessible and which should remain hidden.


# Polymorphism
* “Poly” means many, and “Morphs” means forms. 
* Polymorphism gives the ability to an object/ method to take on many forms

Polymorphism is of two types - 

* Compile time polymorphism - Method Overloading **Page No - 43**
* Runtime Polymorphism - Method Overriding **Page No - 70**


# Inheritance in Java
Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs 

### 1. Single Inheritance
A class inherits from **only one** superclass. This is the most basic form of inheritance where a single subclass extends a single parent class.
* **Pattern:** `Class B extends Class A`


### 2. Multilevel Inheritance
A class inherits from a superclass, and that superclass itself inherits from another superclass. This creates a "grandparent-parent-child" relationship chain.
* **Pattern:** `Class C extends Class B`, and `Class B extends Class A`


### 3. Hierarchical Inheritance
Multiple subclasses inherit from a **single** superclass. One parent class serves as the base for many different specialized child classes.
* **Pattern:** `Class B extends Class A` and `Class C extends Class A`


### 4. Multiple Inheritance
A class inherits from **multiple** superclasses. 
> **Note:** **Java does not support multiple inheritance** with classes to avoid complexity and the "Diamond Problem." However, it can be achieved through **Interfaces**.


### 5. Hybrid Inheritance
A combination of two or more types of inheritance (for example, combining Multilevel and Hierarchical inheritance).
> **Note:** **Java does not support hybrid inheritance** if it involves multiple inheritance of classes. It is only possible in Java by using a mix of **Classes and Interfaces**.

-----------------------------------------------------------------------------------------------------------------