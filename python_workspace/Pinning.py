#n값을 입력받고, n값만큼 각 막대기의 시작 및 끝 점을 입력받는다.
n = int(input())
s, f = [], []
for i in range(0, n):#n번의 입력을통해 막대의 시작점과 끝점을 s(시적점), f(끝점)리스트에 각각 저장
	start, finish = map(int, input().split())
	s.append(start)#시작점 리스트
	f.append(finish)#끝점 리스트

#입력받은 각각의 가로막대를 시작점, 끝점 정렬
s.sort()
f.sort()

#입력받은 막대값들을 하나의 리스트로 정렬
L = s + f
L.sort()

max_count = 0 #가장 많이 못이 지나간 막대 개수를 저장
count = 0 #현재 못이 지나간 막대 개수
a, b = 0, 0 #각 막대의 시작점 리스트, 끝점 리스트의 인덱스를 가르키는 변수

for scan in L: #모든 시작점 및 끝점을 스캔
	if a < n and s[a] == scan: #현재 지점(scan)이 시작점이면
		count += 1 #못이 지나간 막대 +1
		max_count = max(max_count, count)#가장 많이 지나간 막대 개수와 최대값 비교
		a += 1 #시작점 리스트의 다음 인덱스
	elif b < n and f[b] == scan: #현재 지점(scan)이 끝점이면
		count -= 1#못이 지나간 막대 -1
		b += 1#끝점 리스트의 다음 인덱스
		
print(max_count)#못이 가장 많은 막대를 지났을때 막대 개수 출력