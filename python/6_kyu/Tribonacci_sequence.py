def tribonacci(signature, n):
    if n > 0:
        result = []
        result.extend(signature)
        idx = 3
        for i in range(3,n):
            result.append(sum(result[i-3:i]))
        if n<=3:
            return signature[0:n]
        else:
            return result
    return []