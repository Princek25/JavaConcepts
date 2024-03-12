package com.workspace.Theory;

/*

What is type conversion? --------------------------------------------------------------------

There are 2 types of type conversion -

1. Automatic (implicit)

When you declare small data type value in large data type then it will automatically convert
the value.

byte -> short -> int -> long -> float -> double

float f = 5;  // taking integer value in float.
float f = 5L; // taking long value in float.
output -> 5.0 // it automatically converted to float
but
float f = 5d // error you need to type cast.


2. Casting (explicit) -

byte <- short <- int <- long <- float <- double

When you declare larger data type value in smaller data type then you need to type casting.
for e.g -
int i = 5.0; // error -> float value is larger than int.
int i = (int)5.0f;
output -> 5

 */

public class Chapter2 {
}
