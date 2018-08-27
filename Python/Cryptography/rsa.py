import random


def egcd(a, b):
    if a == 0:
        return b, 0, 1
    g, y, x = egcd(b % a, a)
    return g, x - (b // a) * y, y


def modinv(m):
    pose = [x for x in range(2, 200) if phi % x != 0]
    e = pose.pop(0)
    while True:
        g, x, y = egcd(e, m)
        if g != 1:
            e = pose.pop(0)
        else:
            break
    return e, x % m


primes = list(map(int, "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,"
                  "61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, "
                  "193, 197, 199".split(",")))
sug = [21]
for _ in range(7):
    sug.append(random.choice(primes))
print("Suggestions : " + "|".join(map(str, sug)))
p = int(input("p:"))
q = int(input("q:"))
n = p * q
phi = (p - 1) * (q - 1)
e, d = modinv(phi)

print("p=%d q=%d\nn=%d e=%d d=%d" % (p, q, n, e, d))

data = input("ur text : ")
intdata = [x for x in map(ord, data)]
print("intform : " + "".join(map(str, intdata)))
crypteddata = [((x ** e) % n) for x in intdata]
print("crypted : " + "".join(map(str, crypteddata)))
decrypteddata = [(x ** d) % n for x in crypteddata]
print("decrytd : " + "".join(map(str, decrypteddata)))
decryptedchar = [x for x in map(chr, decrypteddata)]
print("chrform : " + "".join(map(str, decryptedchar)))

# Example
# Suggestions : 21|79|103|41|5|19|5|43
# p: 21
# q: 61
# p=21 q=61
# n=1281 e=7 d=343
# ur text :  mango
# intform : 10997110103111
# crypted : 10911474461216804
# decrytd : 10997110103111
# chrform : mango
