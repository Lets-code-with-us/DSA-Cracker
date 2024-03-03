Arrays.sort(nums); // Sort the array in ascending order
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                // If the current element is positive, there's no way to get a sum of zero
                break;
            }

            int target = -nums[i]; // The target sum for the remaining two elements
            int left = i + 1; // Pointer for the left element
            int right = nums.length - 1; // Pointer for the right element

            if (i == 0 || nums[i] != nums[i - 1]) {
                // Ignore duplicates for the first element
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == target) {
                        // Found a triplet with sum zero
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip the same second and third numbers
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Move towards larger values
                    } else {
                        right--; // Move towards smaller values
                    }
                }
            }
        }

        return result;
    }