def PalinArray(arr ,n):
    count = 0
    for ele in arr:
        if ((str(ele) == str(ele)[::-1])):
            count += 1
    if (count == len(arr)):
        return 1
    else:
        return 0