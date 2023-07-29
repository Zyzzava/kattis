def last_factorial_digit(n):
    if n == 0:
        return 1
    elif n <= 2 or n == 4:
        return n
    elif n == 3:
        return 6
    else:
        return 0

if __name__ == "__main__":
    N = int(input())
    for i in range(N):
        number = int(input())
        print(last_factorial_digit(number))