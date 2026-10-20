print("Welcome!")
balance = int(input("Enter your balance: "))

while True:
    print("-" * 38)
    print("Select an option:")
    print("1. Withdraw Amount")
    print("2. Deposit Amount")
    print("3. Exit")
    print("-" * 38)
    
    choice = input(" ")
    print("-" * 38)
    
    if choice == "1":
        print("How much amount you want to withdraw from your account?")
        withdraw_amount = int(input("Amount: "))
        if withdraw_amount > balance:
            print("Insufficient balance!")
        else:
            balance -= withdraw_amount
            print(f"Your new balance is: {balance}")
            
    elif choice == "2":
        print("How much amount you want to deposit in your account?")
        deposit_amount = int(input("Amount: "))
        balance += deposit_amount
        print(f"Your new balance is: {balance}")
        
    elif choice == "3":
        print("Thank you for using the system!")
        break  
        
    else:
        print("Invalid choice! Please select 1, 2, or 3.")
