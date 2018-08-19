'''
Demo of simple array operations in python
'''

import array
arr = array.array('i', [1, 2, 3, 4])
new_arr = array.array('i', [7, 5, 8, 9])
li = [5, 10]
arr.append(5)
arr.insert(2, 5)
arr.pop(4)
arr.remove(5)
arr.reverse()
arr.fromlist(li)
arr.extend(new_arr)
#-----------
print("New Created array :", end="")
for i in range(len(arr)):
    print(arr[i], end=" ")
print("\n")
#-----------
print(arr.index(5))
print(arr.itemsize)
print(len(arr))
print(arr.count(5))
li2 = arr.tolist()
print(li2)




