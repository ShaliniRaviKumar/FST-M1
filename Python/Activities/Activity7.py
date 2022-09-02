numbers = list(map(int,input("\nEnter the numbers : ").strip().split()))
print("\nList is - ", numbers)
sum = 0 
for number in numbers:
  sum += int(number)
print(sum)


