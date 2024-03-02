First, I create an unordered map to store each number in the list along with its frequency.
Then, I loop through each number in the list.
For each number, I increase its frequency count in the map.
If I find a number with a frequency greater than 1, it means there's a duplicate, so I return true.
If I've looped through all the numbers without finding any duplicates, I return false.
