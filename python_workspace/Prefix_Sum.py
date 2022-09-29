import time, random

def prefixSum1(X, n):
	# code for prefixSum1
	S = []
	for i in range(0, n-1):
		S.append(0)
		for j in range(0, i):
			S[i] += X[j]
	return sum(S)
	
def prefixSum2(X, n):
	# code for prefixSum2
	S = []
	S.append(X[0])
	for i in range(1, n-1):
		S.append(S[i-1] + X[i])
	return sum(S)
	
random.seed()		# random 함수 초기화
X = []
a = int(input("숫자n을 입력하시오: "))# n 입력받음
for i in range(0, a):
	r = random.randint(-999, 999)
	X.append(r)# 리스트 X를 randint를 호출하여 n개의 랜덤한 숫자로 채움

before = time.process_time()
prefixSum1(X, a)# prefixSum1 호출
after = time.process_time()
print(after - before)

before = time.process_time()
prefixSum2(X, a)# prefixSum2 호출
after = time.process_time()
print(after - before)
# 두 함수의 수행시간 출력