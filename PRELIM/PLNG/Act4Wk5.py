prod1 = float(input("Input the 1st Product you're going to purchase:"))
prod2 = float(input("Input the 2nd Product you're going to purchase:"))

amt = float(input("Input the amount you're going to lend:"))

sum = float(prod1 + prod2)

if amt < sum:
    amt = sum - amt 
    print("You're still missing ₱", amt)
elif amt > sum:
    amt = amt - sum
    print("Thank you for your payment. You still have ₱",amt)
else:
    print("an ERROR occurred")