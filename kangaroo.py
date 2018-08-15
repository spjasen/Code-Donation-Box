sv = list(map(int,input().split()))
i = 0
k1v = sv[0]
k2v = sv[2]
while i == 0:
    k1v = k1v + sv[1]
    k2v = k2v + sv[3]
    if k1v == k2v:
        print('YES')
        break
    if k1v > 100000000 or k2v > 100000000:
        print('NO')
        break
    
    
#x1, v1, x2, v2 = map(int, raw_input().split())
#X = [x1, v1]
#Y = [x2, v2]
#back = min(X, Y)
#fwd = max(X, Y)
#dist = fwd[0] - back[0]

#while back[0] < fwd[0]:
 #   back[0] += back[1]
  #  fwd[0] += fwd[1]
   # if fwd[0] - back[0] >= dist:
    #    break

#print ["NO", "YES"][back[0] == fwd[0]]    