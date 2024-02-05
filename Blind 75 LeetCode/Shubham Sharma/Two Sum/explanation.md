Step:
* first be cerate a map to store the element and their respective index.
    map<int, int> map;
* secound,create loop and calculate the value sum, such as
    sum = target - nums[i]; 
    and find the sum value in map -> ( map.find(sum); ) 
* if value is not presnet in the map than, we add the value with their index in map.
    map[nums[i]] = i;
* if we find the value in than return the index of element find in map and the current index.