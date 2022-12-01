#n값을 입력받고, n값만큼 각 막대기의 시작 및 끝 점을 입력받는다.
n = int(input());
lecture = []
for i in range(0, n):
	time = list(map(int, input().split()))
	lecture.append(time)

#입력받은 각각의 가로막대의 끝점(오른쪽 점)을 기준으로 오름차순 정렬
#key인자에 lambda함수의 반환값(lecture리스트의 각 원소들의 1번 인자)을 기준으로 정렬한다.
lecture.sort(key = lambda x : x[1])

L = [0] #못이 박히는 기준 막대 번호를 저장하는 공간(모든 막대에 못이 박혀야함으로 0번 막대는 미리 저장)
select = 0 #마지막으로 못에 박힌 기준 막대의 번호를 가리키는 변수

for i in range(1, n):
	if lecture[select][1] < lecture[i][0]: #안겹치는 조건(이전 기준 막대와 현재 막대가 안겹치면 못이 1개 더 필요해지므로 이 조건을 이용해 못의 개수를 파악)
		L.append(i) #이전 기준막대와 안겹치는 막대의 번호를 저장
		select = i #다음 기준막대의 번호를 변경
print(len(L)) #막대의 개수 출력