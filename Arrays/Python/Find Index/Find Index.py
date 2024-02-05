class Solution:
    def findIndex (self,a, N, key ):
        indices = dict()
        count = 0
        for i in range(len(a)):
            if (key == a[i]):
                indices[count] = i
                count += 1
            else:
                pass
        if (len(indices) != 0):
            return indices.get(0, -1), indices.get(count - 1, -1)
        else:
            return (-1, -1)