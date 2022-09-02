

"""
list1 = list(map(int,input("\nEnter the numbers : ").strip().split()))
print("\nList is - ", list1)

list2 = list(map(int,input("\nEnter the numbers : ").strip().split()))
print("\nList is - ", list2)
# Print the lists
print("First List ", list1)
print("Second List ", list2)
"""
# Given lists
#listOne = [10, 20, 23, 11, 17]
#listTwo = [13, 43, 24, 36, 12]

listOne = list(map(int,input("\nEnter the numbers : ").strip().split()))
listTwo = list(map(int,input("\nEnter the numbers : ").strip().split()))


# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)

# Declare a third list that will contain the result
thirdList = []

# Iterate through first list to get odd elements
for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
        
# Iterate through first list to get even elements
for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)

# Print result
print("result List is:")
print(thirdList)
