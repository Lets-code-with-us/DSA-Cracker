# Sum of Two Integers

## Class: Solution

This class contains a method to calculate the sum of two integers without using the addition operator (+).

### Method: `getSum`

Calculates the sum of two integers without using the addition operator (+).

#### Parameters

- `a`: An integer representing the first operand.
- `b`: An integer representing the second operand.

#### Returns

An integer representing the sum of the two integers `a` and `b`.

### Approach

The `getSum` method calculates the sum of two integers without using the addition operator (+) by utilizing bitwise operations.

1. **Bitwise Addition:**
   - Initialize a variable `c` to store the carry value.
   - Perform bitwise addition iteratively until there is no carry (i.e., `b` becomes zero):
      - Calculate the carry value `c` by performing a bitwise AND operation between `a` and `b`.
      - Update `a` by performing a bitwise XOR operation between `a` and `b` to obtain the sum without considering the carry.
      - Update `b` by left shifting the carry value `c` by one position.

2. **Result:**
   - After the loop completes, return `a`, which represents the sum of the two integers `a` and `b`.

The approach efficiently calculates the sum of two integers without using the addition operator by utilizing bitwise operations to handle carry and sum calculations.
