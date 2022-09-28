def gcd_sub(a, b):
    while a*b != 0:
        if a > b: a = a - b
        else: b = b - a
    return a + b

def gcd_mod(a, b):
    while a*b != 0:
        if a > b: a = a % b
        else: b = b % a
    return a + b

def gcd_rec(a, b):
    if a == 0 or b == 0:
        return a+b
    return gcd_rec(b, a%b)

a, b = tuple (map(int, input().split()))

x = gcd_sub(a, b)
y = gcd_mod(a, b)
z = gcd_rec(a, b)
print(x, y, z)