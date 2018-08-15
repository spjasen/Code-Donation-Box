#Problem statement:
#https://www.hackerrank.com/challenges/circular-array-rotation/problem

# contributed by:
# github.com/vinitkadam

# python 3 code:

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the circularArrayRotation function below.
def circularArrayRotation(a, k, queries, n):
    l = []
    if( k < len(a)):
        l = a[n-k:] + a[0: n - k]  
    else:
        k = k % n
        l = a[n -k:] + a[0:n-k]
    result = []
    for q in queries:
        result.append(l[q])
    return result
        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nkq = input().split()

    n = int(nkq[0])

    k = int(nkq[1])

    q = int(nkq[2])

    a = list(map(int, input().rstrip().split()))

    queries = []

    for _ in range(q):
        queries_item = int(input())
        queries.append(queries_item)

    result = circularArrayRotation(a, k, queries, n)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
