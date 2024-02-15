Explanation:-Number of 1 bits

Approach:-Do bit manipulation and if  most right bit is 1 then flip it with 0 with and opearation and so on.

******** Detailed Approach *********

*Initialize a variable count which increases when we flip a bit

*"n" is given in binary we simple use and operator to fins number of 1's in "n"

Ex:- n=01101 which is 13 in decimal

Apply a loop until n!=0 inside loop do this n=n&(n-1)
	**Ist count++***
   #Loop Ist iteration
	=>count=1
	n(13)=0 1 1 0 1
      n-1(12)=0 1 1 0 0
	-------------------
      n=n&(n-1)=0 1 1 0 0 (12)

   #Loop 2nd iteration
	=>count=2
	n(12)=0 1 1 0 0
      n-1(11)=0 1 0 1 1
	-------------------
      n=n&(n-1)=0 1 0 0 0 (8)

    #Loop 2nd iteration
	=>count=3
	n(8)=0 1 0 0 0
      n-1(7)=0 0 1 1 1
	-------------------
      n=n&(n-1)=0 0 0 0 0 (0)

Now n==0 so loop ends and we have count=3 which is number of 1's present in a "n" that is 3

