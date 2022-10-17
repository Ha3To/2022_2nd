# #1. 분할 정복
# def bs(A, l, r, k):
#   if l>r:
#     return None
#   m=(l+r)//2
#   if A[m]>k:
#     return bs(A, l, m-1, k)
#   elif A[m] < k:
#     return bs(A, m+1, r, k)
#   else:
#     return m

#A에 이중리스트로 주어진 값 저장
n, k = map(int, input().split()) #4, 16
A=[] #[[2, 5, 10, 19],[3, 8, 16, 19],[7, 20, 20, 32],[13, 25, 37, 44]] 
for i in range(n):
  A.append(list(map(int, input().split())))

def bs(A, k, n, i, j): #(i,j)의 형태로 반환, 없으면 -1,-1 출력 //n은 2^f의 형태!
  if n == 1:
    if A[i][j] == k:
      return (i, j)
    return (-1, -1)
  elif n%2==0:
    x = A[i+n//2-1][j+n//2-1]
    y = A[i+n//2][j+n//2]
    if k == x:
      return (i+n//2-1, j+n//2-1)
    elif k == y:
      return (i+n//2, j+n//2)
    elif k<x: #1,2,3사분면에 존재, 그 중 한 곳에 존재
      result = bs(A, k, n//2, i, j+n//2) #1사분면
      if result != (-1, -1): 
        return result
      result = bs(A, k, n//2, i, j) #2사분면
      if result != (-1, -1): 
        return result
      result = bs(A, k, n//2, i+n//2, j) #3사분면
      if result != (-1, -1): 
        return result
    elif k>y: #1,3,4사분면에 존재, 그 중 한 곳에 존재
      result = bs(A, k, n//2, i, j+n//2) #1사분면
      if result != (-1, -1): 
        return result
      result = bs(A, k, n//2, i+n//2, j) #3사분면
      if result != (-1, -1): 
        return result
      result = bs(A, k, n//2, i+n//2, j+n//2) #4사분면
      if result != (-1, -1): 
        return result
    else:#elif x<k<y: #1,3사분면에 존재 그 중 한 곳에 존재
      result = bs(A, k, n//2, i, j+n//2) #1사분면
      if result != (-1, -1): 
        return result
      result = bs(A, k, n//2, i+n//2, j) #3사분면
      if result != (-1, -1): 
        return result
    return (-1, -1)
  else: #n이 2^f형태가 아닌 입력은 문제에서 주어지지 않음
    print("n이 2^f형태가 아니라서 주어진 조건과 다름!!")
#n=짝수라 가정
print(bs(A, k, n, 0, 0))


#문제의 주어진 조건대로 값이 들어오기 때문에 n//2의 값을 기준으로 4등분하여 1,2,3,4분면으로 나눠서 접근하였다.
#슬라이싱하면 따로 시간이 더 들기 때문에 인덱스로 접근하였다.
#x = A[i+n//2-1][j+n//2-1], y = A[i+n//2][j+n//2] 값과 비교해서 찾으면 바로 그 위치에 있는 것이다.
#그리고 x와 y에 대해서 k값을 비교해서 k가 x보다 작다면 1,2,3사분면에 존재하고 k가 y보다 크다면 1,3,4분면에 존재하고 x<k<y면 1,3사분면에 존재한다.
#여기서 없다면 (-1,-1)을 출력해야하기 때문에 n=1인 바닥조건에서 k값이 없으면 (-1,-1)이 반환되어야 하지만 여러 사분면 중에서 k값이 있다면 한 곳에서만 존재한다.
#따라서 조건문으로 (-1,-1)이 아닌 경우에만 그 값을 반환하고 모두 없을 경우에는 사분면의 조건을 따지는 문장이 다 끝나고 마지막에 (-1,-1)을 반환해서 없는 것을 의미하게 했다.
#또한 함수를 여러번 호출하면 그때마다 값을 계산하므로 값을 저장해두고 그 값으로 비교 후 조건에 충족된다면 그 값을 반환하게 했다.
#그렇게 수행시간을 분석해보면 T(n)=3T(n/2)+C=3(3T(n/2^2)+c)+c=3^2 * T(n/2^2)+c(1+3)이므로 n=2^k로 가정하고 쭉 점화식을 전개하면
#3^k * T(n/2^k)+c(1+3+3^2+......+3^(k-1))=3^k * c+c(1+3+3^2+......+3^(k-1))=c(1+3+....+3^k)=c'*3^k이 된다.
#따라서 [LaTex] Markdown 수식 작성법을 활용하여 Big-O로 표기하면 O(3^k)=O(3^{log_{2}n})=O(n^{log_{2}3})=O(n^{1.5849....})이다.



# #2. 이진 탐색
# def bs(A, k):
#   l = 0
#   r = len(A)-1
#   while l <= r:
#     m = (l+r)//2
#     if A[m]>k:
#       r=m-1
#     elif A[m]<k:
#       l=m+1
#     else:
#       return m
#   return None

# n, k = map(int, input().split())
# A=[]
# for i in range(n):
#   A.append(list(map(int, input().split())))
#   result = bs(A[i], k)
#   if result != None:
#     print(f"({i}, {result})")
#     break
#   elif i == n-1:
#     print(f"(-1, -1)")

# #행별로 이진탐색이 더 빠름
# #O(logn)