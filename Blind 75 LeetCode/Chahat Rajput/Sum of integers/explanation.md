Explanation:-Sum of Integers

Approach:-In this we have to use bit manipulation to solve it.Convert numbers into binary do there sum until carry becomes 0 and last return answer (a)


********Detail Approach*******

*First do "xor" of numbers (In xor the if no. is diff so it retrun 1 otherwise 0)

*Then apply "and" operation to find carry and do left shift of carry 

*Repeat these steps recusively until we don't  get any carry

Ex:- 3=> 0 1 1
     2=> 0 1 0

First operation a^b (same bits:-0 different bits:-1)
     3=> 0 1 1
     2=> 0 1 0
      -----------
    3^2=> 0 0 1

Second operation a&b 
       3=> 0 1 1
       2=> 0 1 0
      -----------
      3&2=> 1 0 1 0
	    ^
	    carry bit

Third operation (a&b) <<1 left shift carry by one so that it goes to its right spot
	(3&2)<<1 =>1 0 0

Make carry 0 repeat steps do "xor" ofthe values them
	3^2=> 0 0 1
    (3&2)<<1=>1 0 0
          ------------
	      1  0 1(5)

We can continue this until carry becomes 0

 
Complexity
Space:-O(1),Not any space is used
Time:-O(1),code can run up to just 32 times when a contains all 1 bits and b is equal to 1.