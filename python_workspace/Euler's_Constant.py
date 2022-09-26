def fact(n):
	f = 1
	for i in range(1, n+1):
		f = f * i
	return f

def EN(n):
	if n == 1:
		return 1
	
	result = 0
	for i in range(0, n):
		result = result + (1 / fact(i))
	return result


def EN2(n):
	if n == 1:
		return 1
	
	temp = 1
	total = 1
	for i in range(1, n):
		temp = temp * (1/i)
		total = total + temp
	return total
	
print(EN(10000))
print(EN2(10000))
