def QuickSelect(L, k):
	p = L[0]
	A = []	#p > num
	B = []	#p == num
	C = []	#p < num
	for i in range(0, len(L)):
		if(p > L[i]):
			A.append(L[i])
		elif(p == L[i]):
			B.append(L[i])
		else:
			C.append(L[i])

	if(len(A) >= k):
		return QuickSelect(A, k)
	elif(len(A) + len(B) < k):
		return QuickSelect(C, k-len(A)-len(B))
	else:
		return p
	

n, k = map(int, input().split())
L = list(map(int,input().split()))
print(QuickSelect(L, k))

#n과 k에 각각 몇개의 수를 입력할건지, 몇번째 작은 수를 찾을 건지를 입력
#L에 n개만큼 정수들을 입력한다.
#입력받은 정수들 중에서 0번째 수를 피봇으로 정한다(피봇은 아무거나 정해도 상관없음)
#피봇을 기준으로 작은수, 같은수, 큰수를 각각 A, B, C리스트에 분류한다
#A리스트의 크기가 k보다 크거나 작으면 A리스트를 다시 QuickSelect한다
#A리스트와 B리스트 길이가 k보다 작으면 C리스트에서 k-(A리스트의 크기)-(B리스트의 크기)번째 수를 찾으면 된다