def reverse(L, a):
	n = len(L)
	if a < n//2:
		L[a], L[-1-a] = L[-1-a], L[a]
		reverse(L, a+1)

L = list(input())  # 문자열을 입력받아 리스트로 변환
reverse(L, 0)
print(''.join(str(x) for x in L))

#재귀적으로 리스트 뒤집기를 한다면 양끝단 -> 그다음 -> 그다음 -> ... -> 가운데 순으로
#reverse를 호출하고, 결과값은 역순으로 나온다.
#재귀적 리스트 뒤집기의 바닥 조건은 a < n//2 이다. a가 n//2보다 크거나 같아지면 더 이상 reverse가 호출되지 않는다.