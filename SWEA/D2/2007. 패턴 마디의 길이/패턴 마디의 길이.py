t = int(input())

for tc in range(1, t + 1):
    text = input()
    result = 0
    
    for i in range(1, len(text)):
        if text[i] == text[0]:
            if text[: i] == text[i : i * 2]:
                result = i
                break
        if i == 29:
            result = 30
    print(f"#{tc} {result}")