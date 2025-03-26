def is_isogram(string):
    s = string.lower()

    for char in s :
        counts=s.count(char)
        if counts>1:
            return False

    return True