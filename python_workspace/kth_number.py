import heapq

Q = list(map(int,input().split())) # n개의 서로다른 값을 입력받음
result = [] # 사이클마다 나오는 k번째 작은 수를 모아놓을 리스트
max_heap = []
min_heap = []
for i in range(len(Q)):
	k = i//3 + 1 # 사이클마다 변하는 k
	
	# max_heap이 비어있거나, max_heap의 루트값보다 Q[i]값이 작거나 같다면, -Q[i] 삽입
	if len(max_heap) == 0 or -max_heap[0] >= Q[i]:
		heapq.heappush(max_heap, -Q[i])
		
	# 그 외의 경우, min_heap에 Q[i] 삽입
	else:	
		heapq.heappush(min_heap, Q[i])
		
	# min_heap의 가장 큰 값을 K번째 작은 수로 만들기 위하여 min_heap의 크기를 k개로 유지
	# 이렇게 해야 k값이 변해도 그 값에 맞춰 min_heap에서 값을 쉽게 꺼낼수있음
	if len(max_heap) > k:
		heapq.heappush(min_heap, -heapq.heappop(max_heap))
		
	elif len(max_heap) < k and len(min_heap) != 0:
		heapq.heappush(max_heap, -heapq.heappop(min_heap))
		
	#k번째 작은 수를 얻기위해 max_heap이 k개만큼 쌓이면 루트 값을 result에 저장
	if len(max_heap) == k:
		result.append(-max_heap[0])

print(sum(result)) #지금까지 모았던 값들의 합 출력



# 위 알고리즘의 전반적인 흐름은 입력받은 수들을 기준(자기보다 앞서서 비교되었던 수와 비교해서)에의해서 max_heap으로 삽입될지, min_heap으로 삽입될지를 결정짓고
# 그렇게 max_heap에대해서 k번째 작은 수를 추출해서 그 값들을 모아 합을 출력하는 알고리즘입니다.

# for i in range(len(Q))부분은 입력값n에대해서 사이클이 돌기때문에 n시간이 걸립니다.
# 그리고 for문에서 앞서 선언했던 리스트l과 min_heap을 힙구조로 변환하는데에 logn의 시간이 추가로 사용됩니다.
# 이외에는 변환된 heap에대한 append(), heappush(), 조건문(비교연산), sum() 등과같은 기본연산이기에 O()를 구하는데에는 크게 영향을 주지않기에,
# 이번 위 알고리즘에서의 O()는 O(nlogn)입니다.