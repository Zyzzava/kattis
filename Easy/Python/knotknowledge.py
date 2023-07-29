def check(arr1, arr2):
    for num in arr1:
        if num not in arr2:
            print(num)
if __name__ == "__main__":
    n = int(input())
    n_learned = input().split() 
    learned = input().split()
    check(n_learned, learned)