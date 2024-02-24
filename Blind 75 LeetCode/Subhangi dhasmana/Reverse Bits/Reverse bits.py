class Solution:
    def reverseBits(self, n: int) -> int:
        def f(n,r,count):
            if n<1:
                return r<<(32-count)
            return f(n>>1,(r<<1)|(n&1),count+1)
        return f(n,0,0)