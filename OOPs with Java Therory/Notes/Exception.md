# Exception
Exception is an exceptional or abnormal condition that arises in the code during the runtime.
It is a runtime error.
It disrupts the normal flow of execution of a program.

# Exception Handling
Exception Handling in Java is a mechanism which helps us to handle and recover form the exceptional condition and resume the normal flow of exection.

# Need Of Exception Handling:
* It is needed to prevent the program form crashing unexpectedly.
* It is allows the program to recover gracefully from errors and continue executing where possible.
* It makes to code cleaner and easier to maintain.

----------------------------------------------------------------------------------------------------------------------------

# Try Block:
* The try block in Java is used to enclose code that might throw an exception.
* It defines a block of statements to be monitored for exceptions during execution.
* If an exception occurs inside the try block, the normal flow of the program is interrupted, and control is transferred to the appropriate catch block.

# Catch Block:
* The catch block is used to handle the exception that occurs in the try block.
* It defines how the program should respond if the specified exception is thrown.
* A catch block must be written immediately after a try block, and you can have multiple catch blocks for different exception types

# Finally Block:
* The finally block is used to write code that must be executed after the try block finishes, whether an exception is thrown or not.
* It is always executed, even if:
    * An exception is not thrown,
    * An exception is thrown and caught,
    * An exception is thrown and not caught,
    * There is a return statement inside the try or catch.
* The finally block is generally used to perform cleanup operations, such as: Releasing resources like Closing files, Closing database connections etc.

# Throw keyword:
* The throw keyword in Java is used to explicitly throw an exception from the Java program.
* When we use throw, we must throw an object of a class that is a subclass of Throwable (such as ArithmeticException, NullPointerException, or a user-defined exception class).
* After the throw statement is executed, the normal flow of the program stops, and the control is transferred to the nearest catch block that can handle the thrown exception.
* If no matching catch is found, then the default exception handler handles the exception in its own way.

# Throws keyword:
* Sometimes, a method may generate an exception but does not handle it. 
* In such cases, the method must inform its caller that an exception might occur.
* This is done using the ‘throws’ keyword in the method declaration.
* All exceptions, except those of type Error or RuntimeException, or any of their subclasses, that a method can throw must be declared in the throws clause.

-------------------------------------------------------------------------------------------------------------------------------

## Checked and Unchecked Exceptions

# Checked Exceptions
A checked exception is a type of exception that must be either handled using a try-catch block or declared in the method's throws clause; otherwise, the compiler will show an error.

# Unchecked Exceptions
An unchecked exception is a type of exception that the compiler does not require to be handled or declared in the method's throws clause, and the program can compile even if it is not explicitly caught or thrown.

-----------------------------------------------------------------------------------------------------------------------------------

## Thread Life Cycle
In its life time, a thread can be in one of the following states:

**NEW**: A thread that has been created but has not yet started or begun execution.

**RUNNABLE**: A thread that is currently executing in the Java Virtual Machine (JVM) or will execute when it gains access to the CPU.

**BLOCKED**: A thread that is waiting for a monitor lock to enter a synchronized block or method.

**WAITING**: The thread is waiting for another thread to perform a specific action. For example, it is waiting due to a call to wait() or join().

**TIMED_WAITING**: The thread is waiting for a specified period of time. For example, due to a call to sleep().

**TERMINATED**: The thread has completed its execution.




Object
   └── Throwable
        ├── Error
        │    ├── VirtualMachineError
        │    │    ├── OutOfMemoryError
        │    │    └── StackOverflowError
        │    └── LinkageError
        │         └── NoClassDefFoundError
        │
        └── Exception
             ├── Checked Exceptions
             │    ├── **IOException** - When there is a failure during input or output operations
             │    │    └── **FileNotFoundException** - When a file with the specified path cannot be found
             │    ├── **SQLException** - Occurs while accessing or manipulating a database
             │    ├── **ClassNotFoundException** - When trying to load a class dynamically that doesn't exist
             │    └── **InterruptedException** - When a thread is interrupted during sleep or wait
             │
             └── RuntimeException (Unchecked Exceptions)
                  ├── **NullPointerException** - Using a null reference to access object members
                  ├── **ArithmeticException** - Arithmetic errors like Division by zero
                  ├── **ArrayIndexOutOfBoundsException** - Array elements access with an invalid index
                  |── **IllegalArgumentException** - Passing illegal arguments to a method
                  └── **NumberFormatException** - Converting an invalid string into a number
                  
     