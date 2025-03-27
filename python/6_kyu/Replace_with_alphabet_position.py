def alphabet_position(text):
    res = ""
    a = [char for char in text.lower()]
    idx = 0
    for c in a:
        if ( ord(c) >= 97 and ord(c) <= 122):
            if idx: res += " "
            res += str(ord(c) - 96)
            idx += 1
    return res