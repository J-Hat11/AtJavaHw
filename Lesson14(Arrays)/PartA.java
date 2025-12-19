//Part A:
//1. Given the declaration below, what is the value of array[3]?

//int[] array = {4, 3, 5, 2, 0};
//a) 0
//b) 2
//c) 3
//d) 5

//The answer would be B or '2' because the array starts at 0 for value 4 and works up to 3 for value 2.



//2. Given the declaration below, which of the following statements would cause a run-time error?

//int[] array = {4, 3, 5, 2, 0};
//a) array[0] = 1;
//b) array[4] = 1;
//c) array[5] = 1;
//d) array[2] = array[3];

//The answer would be C because the array only goes up to 4 so 5 would be out of bounds

//3. Consider the following code segment. What is the value of b[2] after the code executes?

//int[] a = { 0, 1, 2, 3, 4 };
//int[] b = { 0, 1, 4, 9 };
//a = b;
//b = a;
//a) 1
//b) 2
//c) 4
//d) There is a syntax error in the code.

//The answer would be C because when A=b it transforms int[]a= { 0, 1, 4, 9 };
//Then b=a would just make int[]b = { 0, 1, 4, 9 }; since that is what int[]a is now 
//So the 2nd value of the array is 4 for b[2]
