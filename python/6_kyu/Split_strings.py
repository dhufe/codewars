def solution(s):
    res = []
    for i in range(0, len(s), 2):
        sub = s[i:i+2]
        if len(sub) == 2:
            res.append(sub)
        else:
            res.append(sub + '_')

    return res