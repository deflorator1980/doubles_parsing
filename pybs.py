len = 10 
arr = [None] * len 
for i in range (0, len): 
    arr[i] = i+1

arr[2]=2.1 

for i, v in enumerate(arr): print i, v
