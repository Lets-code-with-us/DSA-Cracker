class Solution:

    def fascinating(self, n):
        pro2 = n * 2
        pro3 = n * 3
        num_string = str(n) + str(pro2) + str(pro3)
        
        if (len(num_string) != 9):
            return False
            
        else:
            for digit in '123456789':
                count = 0
                for num in num_string:
                    if (digit == num):
                        count += 1
                if (count != 1):
                    return False
            return True