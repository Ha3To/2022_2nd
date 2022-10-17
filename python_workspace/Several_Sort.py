import random, timeit

global Qc, Qs, Mc, Ms, Hc, Hs, HQc, HQs, HQc2, HQs2, Mc2, Ms2
Qc, Qs, Mc, Ms, Hc, Hs, HQc, HQs, HQc2, HQs2, Mc2, Ms2 = 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0

##
## 여기에 세 가지 정렬함수를 위한 코드를...
##
#-----------------------------------------------------------------------
def quick_sort(A, first, last):
	global Qc, Qs
	if first >= last:
		Qc += 1
		return
	left, right = first+1, last
	pivot = A[first]	#첫번째 값을 pivot으로 정함
	while left <= right: #pivot보다 작은 값은 왼쪽, 큰 값은 오른쪽에 배치
		while left <= last and A[left] < pivot:
			Qc += 2
			left += 1
		while right > first and A[right] > pivot:
			Qc += 2
			right -= 1
		if left <= right:	#A[left]와 A[right]를 맞바꿔 주기
			Qc += 1
			A[left], A[right] = A[right], A[left]
			Qs += 2
			left += 1
			right -= 1

	A[first], A[right] = A[right], A[first]	#pivot을 제 위치로 배치
	Qs += 2
	quick_sort(A, first, right-1)	#pivot을 기준으로 분류된 좌측값 재귀정렬
	quick_sort(A, right+1, last)	#pivot을 기준으로 분류된 우측값 재귀정렬
	
#-----------------------------------------------------------------------
	
def merge_sort(B, first, last):
	global Mc, Ms
	if first >= last:
		Mc += 1
		return
	merge_sort(B, first, (first+last)//2)		#첫번째 값 ~ 리스트 절반의 앞부분
	merge_sort(B, (first+last)//2+1, last)	#리스트 절반의 뒷부분 ~ 리스트 마지막 값
	merge_two_sorted_lists(B, first, last)	#리스트를 나눠진 리스트를 병합하는 함수
	
def merge_two_sorted_lists(B, first, last):
	global Mc, Ms
	m = (first + last)//2	#리스트를 반으로 가르는 중간 인덱스 값
	i, j = first, m+1	#나눠진 리스트 2개의 각각의 인덱스 값을 가리키는 변수
	K = []		#나눠진 2개의 리스트에서 서로 1개씩 값을 대조해서 오름차순으로 담을 빈 리스트
	while i <= m and j <= last:	#나눠진 2개의 리스트 중 한개라도 마지막 인덱스에 도달할때까지 반복
		Mc += 2
		if B[i] <= B[j]:	#나눠진 2개의 리스트에서 1개씩 값을 비교하는 조건문
			Mc += 1
			K.append(B[i])
			Ms += 1
			i += 1
		else:
			K.append(B[j])
			Ms += 1
			j += 1
	for a in range(i, m+1):	#마지막까지 리스트K로 들어가지 못한 원소들 K에 삽입(0번부터 m(중간원소)번까지)
		K.append(B[i])
		Ms += 1
	for a in range(j, last+1):	#마지막까지 리스트K로 들어가지 못한 원소들 K에 삽입(j번부터 마지막 원소까지)
		K.append(B[j])
		Ms += 1
	for i in range(first, last+1): #K리스트를 본래 리스트인 B리스트에 덮어씌우기
		B[i] = K[i - first]
		Ms += 1

#-----------------------------------------------------------------------

def heapify_down(C, k, n):
	global Hc, Hs
	while 2*k+1 < n:
		Hc += 1
		L, R = 2*k + 1, 2*k + 2	#L은 루트노드의 왼쪽, R은 루트노드의 오른쪽
		Hs += 2
		if L < n and C[L] > C[k]:
			Hc += 2
			m = L
			Hs += 1
		else:
			m = k
			Hs += 1
		if R < n and C[R] > C[m]:
			Hc += 2
			m = R
			Hs += 1
		# m = A[k], A[L], A[R] 중 최대값의 인덱스
		if m != k:
			Hc += 1
			C[k], C[m] = C[m], C[k]
			k = m
			Hs += 3
		else:
			break

def make_heap(C):
	global Hc, Hs
	n = len(C)
	for k  in range(n-1, -1, -1):	# A[n-1]-> ... -> A[0]
		heapify_down(C, k, n)

def heap_sort(C):
	global Hc, Hs
	make_heap(C)
	n = len(C)
	for k in range(len(C)-1, -1, -1):
		C[0],C[k] = C[k], C[0]
		n = n - 1	#A[n-1]은 정렬되었으므로
		Hs += 3
		heapify_down(C, 0, n)

#-----------------------------------------------------------------------

def hybrid_quick_sort(D, first, last):
    global HQc, HQs
    k = 10
    if first >= last:
        return
    left, right = first+1, last
    pivot = D[first]    #첫번째 값을 pivot으로 정함
    while left <= right: #pivot보다 작은 값은 왼쪽, 큰 값은 오른쪽에 배치
        while left <= last and D[left] < pivot:
            HQc += 1
            left += 1
        while right > first and D[right] > pivot:
            HQc += 1
            right -= 1
        if left <= right:    #A[left]와 A[right]를 맞바꿔 주기
            D[left], D[right] = D[right], D[left]
            HQs += 2
            left += 1
            right -= 1
    D[first], D[right] = D[right], D[first]    #pivot을 제 위치로 배치
    HQs += 2
    
    if(len(D[:right]) < k ):
        for i in range(1, len(D[:right])):	#피봇을 기준으로 나눠진 앞부분을 insertion sort해주기
            j = i-1
            while j >= 0 and D[j] > D[j+1]:
                HQc += 1
                D[j], D[j+1] = D[j+1], D[j]
                HQs += 2
                j = j-1
    else:
        hybrid_quick_sort(D, first, right-1)
        
    if(len(D[right+1:]) < k):
        for i in range(right+1, len(D)):	#피봇을 기준으로 나눠진 뒷부분을 insertion sort해주기
            p = i-1
            while p >= 0 and D[p] > D[p+1]:
                HQc += 1
                D[p], D[p+1] = D[p+1], D[p]
                HQs += 2
                p = p-1
    else:
        hybrid_quick_sort(D, right+1, last)
	
#-----------------------------------------------------------------------

def quick_sort2(E, first, last):
    global HQc2, HQs2
    k = 10
    
    if len(E[first:last]) <= k:
        return
    left, right = first+1, last
    pivot = E[first]    #첫번째 값을 pivot으로 정함
    while left <= right: #pivot보다 작은 값은 왼쪽, 큰 값은 오른쪽에 배치
        while left <= last and E[left] < pivot:
            HQc2 += 1
            left += 1
        while right > first and E[right] > pivot:
            HQc2 += 1
            right -= 1
        if left <= right:    #A[left]와 A[right]를 맞바꿔 주기
            E[left], E[right] = E[right], E[left]
            HQs2 += 2
            left += 1
            right -= 1
    E[first], E[right] = E[right], E[first]    #pivot을 제 위치로 배치
    HQs2 += 2
    
    quick_sort2(E, first, right-1)
    quick_sort2(E, right+1, last)
    
    return E
    
def hybrid_quick_sort2(E, first, last):
    global HQc2, HQs2
    quick_sort2(E, first, last)
    for i in range(1, len(E)):    #피봇을 기준으로 나눠진 앞부분을 insertion sort해주기
        j = i-1
        while j >= 0 and E[j] > E[j+1]:
            HQc2 += 1
            E[j], E[j+1] = E[j+1], E[j]
            HQs2 += 2
            j = j-1
	
#-----------------------------------------------------------------------

def Merge_Sort_3Way(F, first, last):
	global Mc2, Ms2
	if len(F[first-1 : last]) < 2:	#바닥조건: 리스트가 더이상 나눠지지 않으면 return
		Mc2 += 1
		return F
	else:
		mid1 = first +((last - first) // 3)#리스트의 1/3지점
		mid2 = first + 2 * ((last - first) // 3)#리스트의 2/3지점
	
	Merge_Sort_3Way(F, first, mid1)			#리스트 시작 ~ 리스트 1/3부분 (0 ~ 1/3)
	Merge_Sort_3Way(F, mid1+1, mid2+1)	#리스트 1/3 다음부분 ~ 리스트 2/3부분 (1/3 ~ 2/3)
	Merge_Sort_3Way(F, mid2+2, last)		#리스트 2/3 다음부분 ~ 리스트 마지막 값 (2/3 ~ 1)
	merge_three_sorted_lists(F, first, mid1, mid2, last)	#나눠진 리스트를 병합
	return F
	
def merge_three_sorted_lists(F, first, mid1, mid2, last):
	global Mc2, Ms2
	
	first_part = F[first-1 : mid1]	#리스트의 0 ~ 1/3지점까지
	second_part = F[mid1 : mid2+1]	#리스트의 0 ~ 2/3지점까지
	third_part = F[mid2+1 : last]		#리스트의 2/3 ~ 1지점까지
	
	first_part.append(float('inf'))	#리스트에서 비교할 값이 다 떨어지면 반복문진행이 안되므로 마지막 원소로 '무한'삽입
	second_part.append(float('inf'))
	third_part.append(float('inf'))
	
	i, j, z = 0, 0, 0	#나눠진 리스트 각각의 인덱스 값을 가리키는 변수
	for c in range(first-1, last):
		minimum = min([first_part[i], second_part[j], third_part[z]]) #각 리스트의 값들 중에 가장 작은 값 선별
		Mc2 += 1
		if minimum == first_part[i]:
			Mc2 += 1
			F[c] = first_part[i]
			Ms2 += 1
			i += 1
		elif minimum == second_part[j]:
			Mc2 += 1
			F[c] = second_part[j]
			Ms2 += 1
			j += 1
		else:
			F[c] = third_part[z]
			Ms2 += 1
			z += 1
#-----------------------------------------------------------------------

# 아래 코드는 바꾸지 말 것!
# 직접 실행해보면, 어떤 값이 출력되는지 알 수 있음
#

def check_sorted(A):
	for i in range(n-1):
		if A[i] > A[i+1]: return False
	return True

#
# Qc는 quick sort에서 리스트의 두 수를 비교한 횟수 저장
# Qs는 quick sort에서 두 수를 교환(swap)한 횟수 저장
# Mc, Ms는 merge sort에서 비교, 교환(또는 이동) 횟수 저장
# Hc, Hs는 heap sort에서 비교, 교환(또는 이동) 횟수 저장
#

n = int(input())
random.seed()
A = []
for i in range(n):
    A.append(random.randint(-1000,1000))
B = A[:]
C = A[:]
D = A[:]
E = A[:]
F = A[:]

print("")
print("Quick Sort:")
print("time =", timeit.timeit("quick_sort(A, 0, n-1)", globals=globals(), number=1))
print("  comparisons = {:10d}, swaps = {:10d}, total = {:10d}\n".format(Qc, Qs, Qc + Qs))

print("")
print("Merge Sort:")
print("time =", timeit.timeit("merge_sort(B, 0, n-1)", globals=globals(), number=1))
print("  comparisons = {:10d}, swaps = {:10d}, total = {:10d}\n".format(Mc, Ms, Mc + Ms))

print("")
print("Heap Sort:")
print("time =", timeit.timeit("heap_sort(C)", globals=globals(), number=1))
print("  comparisons = {:10d}, swaps = {:10d}, total = {:10d}\n".format(Hc, Hs, Hc + Hs))

print("")
print("Hybird Quick Sort:")
print("time =", timeit.timeit("hybrid_quick_sort(D, 0, n-1)", globals=globals(), number=1))
print("  comparisons = {:10d}, swaps = {:10d}, total = {:10d}\n".format(HQc, HQs, HQc + HQs))

print("")
print("Hybird Quick Sort2:")
print("time =", timeit.timeit("hybrid_quick_sort2(E, 0, n-1)", globals=globals(), number=1))
print("  comparisons = {:10d}, swaps = {:10d}, total = {:10d}\n".format(HQc2, HQs2, HQc2 + HQs2))

print("")
print("Merge Sort 3Way:")
print("time =", timeit.timeit("Merge_Sort_3Way(F, 1, n)", globals=globals(), number=1))
print("  comparisons = {:10d}, swaps = {:10d}, total = {:10d}\n".format(Mc2, Ms2, Mc2 + Ms2))

# 진짜 정렬되었는지 check한다. 정렬이 되지 않았다면, assert 함수가 fail됨!
assert(check_sorted(A))
assert(check_sorted(B))
assert(check_sorted(C))
assert(check_sorted(D))
assert(check_sorted(E))
assert(check_sorted(F))
