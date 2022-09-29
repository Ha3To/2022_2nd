def reverse(A):
	n, i = len(A), 0
	while i < n//2:
		A[i], A[-1-i] = A[-1-i], A[i]
		i += 1

A = list(input())
reverse(A)
print(''.join(str(x) for x in A))
#join함수는 매개변수로 들어온 리스트의 요소들을 하나로 합쳐서 문자열로 반환하는 함수
#'구분자'.join(리스트) 와같은 형태로 사용
# ex) '_'.join(['a','b','c']) == "a_b_c"

#리스트 귀집기는 리스트 양쪽에서 가운데로 좁혀오는 방식