#Find LCM and GCD of given no

a, b = list(map(int, input().split()))
def gcd(a, b):
    if a==0:
        return b
    return gcd(b%a, a)
lcm = a*b // gcd(a,b)
print(lcm,gcd(a, b))
