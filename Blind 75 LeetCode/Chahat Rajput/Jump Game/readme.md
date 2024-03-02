Explanation:-Jump Game

Approach:-We have to jump till then we have not reach at last element of the array

**Detailed Approach**

*Make a variable "reachable" which tells us that how many steps we need to reach at last position

*Loop 0 to n
    *we check that if reachable is not changed as i means reachable<i
        then there is a problem return false
    *In reachable store max(reachable,i+nums[i]) how many steps we take put into reachable
*Atlast return true if all things are satisfied   

**Example**

    arr[i]=2 3 1 1 4
    i= 0 1 2 3 4
    **Loop 0 to n
        
        reachable=max(reachable,i+nums[i])
        *1st step max(0,0+2)=>2

        *2nd step max(1,1+3)=>4(last element)
        
        *Now we reach at our desired element return true

**Complexity**

Time:-O(n) where n is size of an array,to reach at last index then return true

Space:-O(1) only one variable is used no extra space is needed