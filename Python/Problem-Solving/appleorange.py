#https://www.hackerrank.com/challenges/apple-and-orange/problem

distance = list(map(int, input().split()))
aoLoc = list(map(int, input().split()))
quant = list(map(int, input().split()))
apples = list(map(int, input().split()))
oranges = list(map(int, input().split()))
appleCount = 0
orangesCount = 0

for i in apples:
    if aoLoc[0] + i >= distance[0] and aoLoc[0] + i <= distance[1]:
        appleCount += 1
        
for j in oranges:
    if aoLoc[1] + j >= distance[0] and aoLoc[1] + j <= distance[1]:
        orangesCount += 1
        
print(appleCount)
print(orangesCount)


