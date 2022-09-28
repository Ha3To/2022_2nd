def fact(n):
	f = 1
	for i in range(1, n+1):
		f = f * i
	return f

def find_num1(n):
	if n == 1:
		return 1
	
	result = 0
	for i in range(0, n):
		result = result + (1 / fact(i))
	return result


def find_num2(n):
	if n == 1:
		return 1
	
	temp = 1
	total = 1
	for i in range(1, n):
		temp = temp * (1/i)
		total = total + temp
	return total
	
print(find_num1(1000))
print(find_num2(1000))
