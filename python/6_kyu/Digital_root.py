def digital_root(n):
    tmp = n
    while True:
        s = list(map(int, str(tmp)))
        tmp = sum(s)
        if tmp <= 9:
            break
    return tmp