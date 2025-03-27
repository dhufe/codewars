import math

def bouncing_ball(h, bounce, window):
    if h <= 0 or bounce <= 0 or bounce >= 1 or window >= h:
        return -1
    cnt = 0
    while h > window:
        h *= bounce
        cnt += 2
    return cnt - 1 if cnt else -1