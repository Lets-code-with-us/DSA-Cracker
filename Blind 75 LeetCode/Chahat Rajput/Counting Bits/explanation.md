Explanation:-Counting Bits

Approach:-Count number of 1's in a number and then store them into a vector and return its

************ Detailed Approach *******************

*Make a vector initialize its first index v[0]=0 because no. of one in 0 is 0 

*Start loop from 1 to n in vector store no. of 1's count in a number by addition of previous index 

********* Example ***********
***i%2 gives 0 when even and odd when 1 
***i/2 gives you previous index element

***Suppose n=3
    0=>0
    1=>001
    2=>010
    3=>011

    #First Iteration
        Do this v[i]=v[i/2]+i%2;

        v[1]=v[1/2]+1%2;
        v[1]=v[0](0)+1;
        v[1]=1
        In vector:- v[0,1]
    
    #Second Iteration
        v[2]=v[2/2]+2%2;
        v[2]=v[1](1)+0;
        v[2]=1
       In vector:- v[0,1,1]
    
    #Third Iteration
        v[3]=v[3/2]+3%2;
        v[3]=v[1](1)+1;
        v[3]=2
       In vector:- v[0,1,1,2]
       
So at last final output will be [0,1,1,2]       