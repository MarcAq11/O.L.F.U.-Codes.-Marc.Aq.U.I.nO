ans = True

print("====================")
print("Multiples of 5")
print("====================")

while ans == True:
    x = float(input("Insert a number that is divisible by 5 and is within the range of 1 to 100:"))

    if (x <= 100 and x % 5 == 0):
        print("Your input is Valid.")
        ans == True
    elif(x > 100 and x % 5 == 0):
        print("Inputted number is out of the range.")
        break
    else:
        print("Invalid input")
        break
    