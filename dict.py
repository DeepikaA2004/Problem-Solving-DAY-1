from collections import defaultdict
n, m = map(int, input().split(" "))
A = [input() for _ in range(n)]
B = [input() for _ in range(m)]

A_dd = defaultdict(list)
for i in range(len(A)):
    A_dd[A[i]].append(i+1)
for word in B:
    if len(A_dd[word])>0:
        print(" ".join(list(map(str,A_dd[word]))))
    else:
        print(-1)