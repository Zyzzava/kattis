def main():
    line = input()
    nums = line.split()
    R1, S = map(int, nums)
    print(S * 2 - R1)

if __name__ == "__main__":
    main()