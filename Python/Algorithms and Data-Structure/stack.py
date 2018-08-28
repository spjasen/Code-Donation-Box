def createStack():
    stack = []
    return stack
def pushS(stack, item):
    stack.append(item)
    return True
def popS(stack):
    if len(stack) == 0:
        return False
    else:
        return stack.pop()
def printStack(stack):
    return stack

#Driver program
k = 0
stack = createStack()
while k != 4:
    k = int(input("Push(1)---Pop(2)---print(3)---Exit(4)"))
    if k == 1:
        p = input("Enter value to be pushed")
        pushS(stack, p)
        print(p, "is pushed")
    if k == 2:
        print(popS(stack), "poped")
    if k == 3:
        print("Stack is :", printStack(stack))


