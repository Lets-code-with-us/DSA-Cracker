Explanation:-Word Break

Approach:-Break the string and then check if it is present in Dictionary or not if yes then return true if no return false

*****Detailed Approach****

*Make a set in which store unique strings and then compare them

*Now make a "temp" temporary string in which store break string 

*Loop i(length of break word) to length of string 
	*storing char by char into temp
	*now check if string not in set return false otherwise start from next index of i for creating new string

*At last return true if all conditions met otherwise false

**Complexity**

Time:-O(n),where n is the length of the string and finding unique 
string from set
Space:-O(n),for storing strings into set 