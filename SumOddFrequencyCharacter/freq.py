import collections
def findsum(arr, N):
    mp = collections.defaultdict(int)

    for i in range(N):
        mp[arr[i]] += 1

    print(mp[4])
    sum = 0

    for i in mp:
        # Check if frequency is odd
        if (mp[i] % 2 != 0):
            sum += (i * mp[i])
    return sum

arr = [ 1, 2, 4, 5, 6, 3, 1, 2, 3, 3 ]
N = len(arr)
print (findsum(arr, N))