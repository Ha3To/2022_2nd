def prefixSum2(X, n):
	# code for prefixSum2
	p = []
	p.append(X[0])
	for i in range(1, n-1):
		p.append(p[i-1] + X[i])
	return p

def max_sum(A):
    num = 0
    total = 0
    for i in range(1, len(A)):
        for j in range(len(A)-1, 0, -1):
            if(i <= j):
                max_num = A[j] - A[i-1]
            if(total < max_num):
                total = max_num
    return total



A = [int(x) for x in input().split()]
x = len(A)
sol = max_sum(prefixSum2(A, x))
print(sol)