## Hindu Numerals to Roman Numerals

### G4C Project from November 28th

This is a Spring MVC Project to practice JUnit Tests, which also included looping and String concatenation. 

The following was provided as part of the assignment:

* A functioning Controller
* A basic view with an input box and a convert button
* A JUnit Test (HinduToRomanNumeralConverterTests) for a Service to convert numerals (integers) to Roman Numerals (Stings)

The first goal of the exercise was to create a method in the Services package to handle the conversion. 

The second goal was to write a method that would satisfy the Unit Tests what were provided with the exercise.

The stretch goal was to setup your method so that there were not any hard coded values. This would take the user input and programatically create a properly formatted Roman Numeral.

Here are the details on how I worked through the Stretch Goal:

* A private String variable "highRoman" is setup to handle the method return
* A while loop surrounds all the logic inside the method. This simply continues to loop while the input integer is not 0
* The user input is evaluated through a series of conditionals that determine its first Roman Numeral (hence the highRoman variable name, I guess), set it, subtract the proper amount of input and continue the same pattern until the input has all been converted to Strings

Here is a sample of one of the IF statments. These are repeated for each unique Numeral (13 of them):

```
if (input >= 1000) {
      highRoman += "M";
      input -= 1000;
      continue;
    }
```

I found out the hard way that the "continue" statement was necessary to throw the logic back up the IF statement chain to be evaluated again. Without it:

20 is evaulated as:

```
>= 10 (Numeral set to X)
```

Moved down to the tree, found to be:

```
>= 9 (Numeral set to XIX)
```

Moved down the tree, found to be: 

```
>=1 (Numeral set to XIXI)
```