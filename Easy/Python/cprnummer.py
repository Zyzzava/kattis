def check(line) -> int:
    numbers = []
    for i in range(len(line)):
        if line[i].isdigit():
            numbers.append(int(line[i]))
        else:
            continue 
    modulo11rule = [4, 3, 2, 7, 6, 5, 4, 3, 2, 1]
    for i in range(len(numbers)):
        numbers[i]*=modulo11rule[i]
    if(sum(numbers) % 11 == 0):
        return 1
    else:
        return 0
if __name__ == "__main__":
    line = input()
    print(check(line))