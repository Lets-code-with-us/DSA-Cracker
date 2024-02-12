Explanation:3 Sum

Approach:-Sort array take  using two moving pointers and one fixed pointer
to find sum target zero.

****** Detailed Approach ******

*Sort array

*using a loop(i) to iterate whole array

*two pointers i and j where j=i+1 and k=size-1

*move j and k to checking the sum of the three elements (a[i]+a[j]+a[k])

*if sum<0,increase j (to get bigger)

*if sum>0,decrease k (to get smaller)

*if sum==0,insert (a[i],a[j],a[k]) into vector do j++,k-- while skipping duplicates.

*Return the list of unique triplets

****** Complexity ******

Time:-O(NlogN) =>Sorting takes +O(N^2)=>loop takes,N size of the array
Space:-O(1),Since use space for storing answer can be O(1)
