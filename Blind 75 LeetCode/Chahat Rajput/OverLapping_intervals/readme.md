Explanation:-Overlapping Intervals

Appproach:-We have to remove overlapping intervals from the array and then we have to return the no. of intervals we have to remove from interval

**Detailed Approach**
0. Initialze variable to storing count of overlap intervals c=0;
1.Sort the array first from start(first element of 2d array ex [1,5] so accoriding to 1) or from ending(Second element of 2d array ex [1,5] so accoriding to 5)

2.We just need to check that is interval is overlapped or not So there will be 3 cases to find whether Interval is overlapp or not

3.Loop from 0 to n(size of interval)
    

        Ist case(No Overlap):-
            **Example**
             interval=([0,2],[3,6]) 
          Let' assume [cs,ce],[ns,ne]

                *If 2<=3 then it is safe case because there is no overlap

        2nd Case(Overlap)
            **Example**
              interval=([0,4],[2,7]) 
              *If 4<=7 the this is overlapp now situation is occur which one have to remove so remove that one which is greatest because it can again occur overlapp with others  and then increment j because we move from pointed interval and move to next interval also do c++

        3rd Case(Overlapp)
            *Just revrese of 2nd case ([0,7],[2,4]) 7>4 then do same but increment j because we left with  pointed interval and move to next interval also do c++ 

         
**Complexity**
Time:-(nlogn),n is the size of array, for sorting and rest for removing overlapp intervals.
Space:-O(n),for storing temporary array of 2 indexs [0,1] (more clear when see code )

        // if ce>ne then (reverse of 2nd case)