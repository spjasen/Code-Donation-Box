#find angle between hour and minute eg: 3hr 30min = angle is 75
#Asked in Paytm Amazone infinera
#Difficulty ----> Easy
def angleFinder(h, m):
    if h<0 or m<0 or h>12 or m>60:
        print("invalid")
    if h == 12:
        h = 0
    if m==60:
        m = 0
    #formula to clculate angle of hour and minute    
    h_angle = 0.5 * (h * 60 + m)
    m_angle = 6 * m
    diff_angle = abs(h_angle - m_angle)
    angle = min(360-diff_angle , diff_angle)
    return angle
#code start here taking values of hour and minute
hour, minute = list(map(int, input().split()))
#sending these values to angleFinder function 
print(angleFinder(hour, minute))
            