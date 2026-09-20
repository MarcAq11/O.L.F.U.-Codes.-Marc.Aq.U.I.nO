ans = "YES"

while ans.upper() == "YES":
    print("The ARITHMETIC CALCULATOR")
    print("1. Addition      4. Division     6. Increment")
    print("2. Subtraction   5. Modulus      7. Decrement")
    print("3. Multiplication")

    choice = int(input("Select an arithmetic operation: "))


    match choice:
        case 1:
            x = float(input("Select the value of x: "))
            y = float(input("Select the value of y: "))
            fin = x + y
            print(f"Variable Values: x = {x}, y = {y}")
            print(f"Addition: x + y = {fin}")
            ans = input("Do you want to continue? (YES/NO):")
        case 2:
            x = float(input("Select the value of x: "))
            y = float(input("Select the value of y: "))
            fin = x - y
            print(f"Variable Values: x = {x}, y = {y}")
            print(f"Subtraction: x - y = {fin}")
            ans = input("Do you want to continue? (YES/NO):")
        case 3:
            x = float(input("Select the value of x: "))
            y = float(input("Select the value of y: "))
            fin = x * y
            print(f"Variable Values: x = {x}, y = {y}")
            print(f"Multiplication: x * y = {fin}")
            ans = input("Do you want to continue? (YES/NO):")
        case 4:
            x = float(input("Select the value of x: "))
            y = float(input("Select the value of y: "))
            fin = x / y
            print(f"Variable Values: x = {x}, y = {y}")
            print(f"Division: x + y = {fin}")
            ans = input("Do you want to continue? (YES/NO):")
        case 5:
            x = float(input("Select the value of x: "))
            y = float(input("Select the value of y: "))
            fin = x % y
            print(f"Variable Values: x = {x}, y = {y}")
            print(f"Modulus: x % y = {fin}")
            ans = input("Do you want to continue? (YES/NO):")
        case 6:
            x = float(input("Select the value of x: "))
            fin = x + 1
            print(f"Variable Values: x = {x}")
            print(f"Incremental: x = {fin}")
            ans = input("Do you want to continue? (YES/NO):")
        case 7:
            x = float(input("Select the value of x: "))
            fin = x - 1
            print(f"Variable Values: x = {x}")
            print(f"Decremental: x = {fin}")
            ans = input("Do you want to continue? (YES/NO):")
        







    
    
