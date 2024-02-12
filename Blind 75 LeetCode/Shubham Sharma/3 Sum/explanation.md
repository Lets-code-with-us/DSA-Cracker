## intuition 

* we dont have to return the index so first we sort the given array, so that we can use two pointer approach effectively.
* see, for three sum- 
  * nums[i]+num[j]+nums[k]=0
  * so, nums[j]+nums[k] = -nums[i]

* therefore, write a loop in which we will search two element that are equivaltent to the -nums[i]
  * set, j=i+1 and k=nums.size()-1;
  * and write similar two pointer code 
* to replace the repeated elements, check the condition as:
  * inside for loop (parent loop)-
    - if(i>0 && nums[i]==nums[i-1]) contiune;  | this will help in avoiding the repeated element
  * inside child loop-
    - if(j < k && nums[j] == nums[j+1] ) j++;
    - if(j < k && nums[k] == nums[k-1] ) k++;
