t = int(input())

for i in range(1, t + 1):
    n = list(map(int, input().split()))
    n.sort()

    result = sum(n[1:9]) 
    result1 = round(result / 8)
    
    print(f"#{i} {result1}")