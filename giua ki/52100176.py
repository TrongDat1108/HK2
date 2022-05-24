import numpy as np 


def req1(A):
    temp = list()

    for i in A:
        temp.append(sum(i))
    
    minimum = min(temp)
    
    result = list()
    
    for j in range(len(A)):
        if sum(A[j]) == minimum:
            mini = j
            result.append(mini)
    return result
	
def req2(A):
    temp = list()
    temp = np.diag(A)
    
    result = list()
    for i in temp:
        check = 1
        
        if(i < 2):
            check = 0
        
        for j in range(2, i):
            if i % j == 0:
                check = 0
                break
        if check == 1:
            result.append(i)
        
        else:
            index = None
    
    minimum = min(result)
    for i in range(len(result)):
        if result[i] == minimum:
            index = result[i]
    
    return index

def req3(A):
    def checkFibonacci(n):
        f0 = 0;
        f1 = 1;
        fn = 1;
    
        if (n < 0):
            return -1;
        elif (n == 0 or n == 1):
            return n;
        else:
            for i in range(2, n):
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            return fn;
 
    result = []
    for i in range(len(A)):
        temp = []
        lst = A[i]
        for j in lst:
            if checkFibonacci(j) == True and j >= 0:
               temp.append(j)
        temp2 = max(temp)
        result.append(temp2)
            
    index = 1000
    
    if len(result) != 0:
        index = sum(result)
        
    A = np.where(A> 0, index, A)
    
    return A

def req4(A, threshold):
	return 1	

A = np.array([[1, 3, 4, 5],
              [2, 2, 4, 3],
             [-1, 1, 3, -6],
             [0, -4, -3, 5]])
print(req1(A))
print(req2(A))
print(req3(A))