/*
Book: Core Java SE 9 for the Impatient
Author: Cay S. Horstmann
ISBN-13: 978-0-13-469472-6 
ISMN-10: 0-13-469472-4
*/

import java.util.*;

public class coreJavaSE9_chapter1{
	public static void main(String[] args){
		System.out.println("Hello World!");
		/*1. Write a program that reads an integer and prints it in 
		binary, octal, and exadecimal. Print the reciprocal as a 
		hexadecimal floating-point number.*/
		/*2. Write a program that reads an integer angle(whichmay be 
		positive or negative) and normalizes it to a value between 0 
		and 359 degrees. Try it first with the % operator, then with 
		floorMod.*/
		/*3. Using only the conditonal operator, write a program that 
		reads three integers and prints the largest. Repeat with 
		Math.max.*/
		/*4. Write a program that prints the smallest and largets 
		positive double values. Hint: Look up Math.nextUp in the Java 
		API.*/
		/*5. What happens when you cast a double to an int that is
		larger than the largest possible int value? Try it out.*/
		/*6. Write a program that computes the factorial n!=1x2x...xn,
		using BigInteger. Compute the factorial of 1000.*/
		/*7. Write a program that reads in two integers between 0 and
		4294967295, stores them in int variables, and computes and
		displays their unsigned sum, difference, product, quotient, 
		and remainder. Do not convert then to long values.*/
		/*8.Write a program that reads a string and prints all of its
		nonempty substrings.*/
		/*9. Section 1.5.3, "String Comparison(page 25) has an example
		of two strings s and t that s.equals(t) but s!=t. Come up with
		a different example that doesn't use substring.*/
		/*10. Write a program that produces a random string of letters 
		and digits by generating a random long value and printing it 
		in base 36.*/
		/*11. Write a program that reads a line of text and prints all 
		characters that are not ASCII, together with their Unicode 
		values.*/
		/*12. The Java Development Kit includes a file src.zip with
		the source code of the Java library. Unzip and, with your
		favorite search tool, find usages of the labeled break and 
		continue sequences. Take one and rewrite it without a labeled
		statement.*/
		/*13. Write a program that prints a lottery combination,
		picking six distinct numbers between 1 and 49. To pick six
		distinct numbers, start with an array list filled with 1...49.
		Pick a random index and remove the element. Repeat six times.
		Print the result in sorted order.*/
		/*14. Write a program that reads a two-dimensional array of 
		integers and determines whether it is a magic square(that is, 
		whether the sum of all rows, all columns, and diagonals is the 
		same). Accept lines of input that you break into individual 
		integers, and stop when the user enters a blank line.
		For example, with input
		16 3 2 13
		5 10 11 8
		9 6 7 12
		4 15 14 1
		(Blank line)
		your program should respond affirmatively.*/
		/*15. Write a program that stores Pascal's triangel up to a 
		given n in an ArrayList<ArrayList<Integer>>.*/
		/*16. Improve the average method so that it is called with at
		least one parameter.*/
	}
}