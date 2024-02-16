class Solution:
    def getSum(self, a: int, b: int) -> int:
        mask = 0xffffffff
        while (b & mask)>0:
            temp = (a&b)<<1
            a = a^b
            b = temp
        return (a & mask) if b > 0 else a