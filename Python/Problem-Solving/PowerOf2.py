#Find if number is power of 2
# Qus asked in Oracle, Intel, apnabazar, Microsoft
#difficulty : Basic
#py3 Code

#this function checks by dividing no by 2 if n becomes 1 then it is power of 2 otherwise not a power of 2
def isPowerOf2(n):
    if n == 0:
        return False
    while n != 1:
        if n % 2 != 0:
            return False
        n = n//2
    return True

nValues = []
limit = int(input())
#Taking nValues
for i in range(limit):
     nValues.append(int(input()))
#checking if isPowerOf2 function returns true or false if returns true prints yes otherwise no
for i in nValues:
    if (isPowerOf2(i)):
        print("YES")
    else:    
        print("NO")  