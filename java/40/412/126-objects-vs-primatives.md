What is an object?
An object is something which has a state or behavior and is made up of other data types.
One example is a class called pizza, it can have an int called quantity, a string called flavour, or a double called price.

What is a primitive?
A primitive is a basic data type, not built upon by any other data type or structure.
An example being an int, or a singular character. 
ex. int num = 1;
    char a = "a";
A string is not a primitive because it can be broken down into numerous single char data types.

Objects are like molecules, while primitives are like atoms.

How are they stored differently?
Primitives have their values stored at hard locations, with the variable storing their value in memory.
Objects have their values stored in other locations in memory, with the variables storing a pointer
to their location to be accessed later. 

How do we compare objects with eachother?

When comparing objects, Java uses the .equals() to compare the actual objects with eachother.

How do we compare primitives with eachother?

Primitives can use == to compare themselves, as it compares the pointers of each variable.

ex. x = 5
    y = 5  
    x == y --> true, compares pointers