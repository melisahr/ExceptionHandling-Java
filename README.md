# ExceptionHandling-Java

Overview:
I followed a YouTube video to understand exception handling. 
The project consist a Scanner, try-catch block, and a finally block.
The scanner will prompt the user to enter a number. It should not be inside
any of the three blocks. There are three integers variables x, y, and z.
The x and y are assign as whole number that can be entered. The z is the result which
can be solve as x divided by y. 
If we divide a number by zero or a string, then this will get an error/invalid response.
To correct this, use the try-catch block to handle the exceptions. 

Goal:

Create a program with two numbers and display the results. Add the try-catch block to handle
any exceptions and a finally block to close the scanner. 

How?

Surround all the variables and its println statement within the try block.
Create a catch block depending on the type of exception encountered. 
We added three exceptions in this project. 

ArithmeticException: 

This exception occursed when we divided the number by zero.
Use catch block add the name of the type of exception and assign it to e.
Then enter a println message to the user within the catch block. 

InputMismatchException

This exeception occurred by dividing the number by a string value. 
To handle this exception, use the catch(InputMismatchException e).
Within the catch block, add a println message and ensure its imported. 

All Exception

This is will catch ALL exceptions. 
Use the catch(Exception e) and within the block add a println message.

The last thing is to add a finally block right after the try-catch block. This
block will ALWAYS execute whether there is an exception or not.
The finally block will close the scanner or files. 
Within the finally block, we typed scanner.close(). 

***It's good practice to handle and address specific exceptions. And use all
exception at the end in case you forgot one. 


  
