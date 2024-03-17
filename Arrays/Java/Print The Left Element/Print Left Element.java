class Solution {
    
    public long leftElement(long arr[], long n)
    {
        Arrays.sort(arr); // Inbuilt Function for Sorting Array Elements in Ascending Order 
        if(n%2==0) // checks if size of array is divisible by 2
        {  // opening of if statement 
        return arr[((int)n/2)-1]; // returns the position divisble by 2 and decraeses by 1
        } // closing of if statement 
        else
        {
        return arr[(int)n/2];  // return position of n/2 
    
        } // closing of else
    } // closing of function 
} // closing of declared class 


