list = list(map(int,input("\nEnter the numbers : ").strip().split()))
print("\nList is - ", list)

# Get first element in list
firstElement = list[0]
print(firstElement)
# Get last element in list
lastElement = list[-1]
print(lastElement)

# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)