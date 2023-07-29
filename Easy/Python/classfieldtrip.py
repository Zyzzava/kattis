def merged(l1, l2):
    l3 = l1+l2
    return "".join(sorted(l3))

if __name__ == "__main__":
     list1 = input()
     list2 = input()
     print(merged(list1, list2))