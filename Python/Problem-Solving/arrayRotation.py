'''
METHOD 1 (Using temp array)
Example :
Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
1) Store d elements in a temp array
   temp[] = [1, 2]
2) Shift rest of the arr[]
   arr[] = [3, 4, 5, 6, 7, 6, 7]
3) Store back the d elements
   arr[] = [3, 4, 5, 6, 7, 1, 2]
Time complexity : O(n)
Auxiliary Space : O(d)
---Ref : https://www.geeksforgeeks.org/
'''

import array
arr = array.array('i', [])
d = int(input())
n = int(input())
for i in range(n):
    arr.append(int(input()))
temparr = array.array('i', [])
temparr2 = array.array('i', [])
for i in range(n):
   if i >= d:
      temparr2.append(arr[i])
   if i < d:
      temparr.append(arr[i])
del arr[:] 
arr = temparr2 + temparr
print(arr)
