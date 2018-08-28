class Node:
  def __init__(self,nm,h):
    self.h=h
    self.nm=nm
    self.cons=[]
  
  def addcons(self,n,cost):
    a=(n,cost)
    if a in self.cons:
      return
    self.cons.append(a)
    n.addcons(self,cost)
  
  def __str__(self):
    return self.nm
  
def get_next(cv,sn,cn,lsn,g):
  if g == cn:
    return
  print('->',end="")
  cc=99999
  lc=0
  for n,c in cn.cons:
    if n == sn or n == lsn:
      continue
    tc=c+cv+n.h
    if tc < cc:
      cc=tc
      lc=c
      ln=n
  print(ln,end="")
  get_next(cv+lc,sn,ln,cn,g)


if __name__ == '__main__':
  a=Node('a',10)
  s=Node('s',7)
  b=Node('b',9)
  c=Node('c',5)
  g=Node('g',0)

  s.addcons(a,1)
  s.addcons(b,1)
  a.addcons(b,9)
  b.addcons(c,6)
  c.addcons(g,5)
  b.addcons(g,12)

  print("Shortest path is\n",s,end="")
  get_next(1,s,s,None,g)
  print("")

#   Example run
#   Shortest path is
#  s->b->c->g 
