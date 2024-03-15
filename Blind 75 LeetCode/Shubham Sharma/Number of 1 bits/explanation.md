## intuition 
* first we check the binary number have 1 in its right most digit or not
  - n&1 == 1 ; if this statement is true than there is 1 bit in in the right most digit
  - then we increase the value of count by 1 
  - now after checking the right most digit, we will use rigthshift operator to remove that digit by 1
  - n=n>>1; 
* return the count 