Explanation:Pacific Atlantic Flow

Approach:-We have to check that can we go in both oceans but condition is that 4 sides of that element(habe to be qual and less then of that ele).so at last we can check which block is same in pacific and atlantic so we store there indexs and return them.

**Detailed Approach**

    **Condition**

    2 3 4
    2 "4" 5

Ex:- we check "4" so its up, down,right,left <= "4" only then we can add its index into vector

*We can make two vectors for storing the grids which follow the "condition" then make recursive function which can go in all 4 directions 

*First check for pacific ocean for this we go from beggining to down in that way which follows condition then add into pacific vector
     ______
    |
    |

*Second check for atlantic ocean for this we go from beggining to down in that way which follows condition then add into atlantic vector
     |
  ___|

*Atlast check pacific[i][j] && atlantic[i][j] then push into "ans" and last return "ans"


**Complexity**
Time complexity: (O(m * n)), where (m) is the number of rows and (n) is the number of columns in the matrix. We check from the borders and each cell is visited exactly once.

Space complexity: (O(m * n)) for the storing results of both the oceans, (O(k)) for the result list, where (k) is the number of cells accessible from both oceans.