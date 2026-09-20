ans = "YES"


while ans.upper() == "YES":
    Java = input("Java Programming score: ")
    C = input("C Programming score: ")
    DH = input("Database Handling score: ")

    avg = (int(Java) + int(C) + int(DH)) / 3
    print(f"Average: {avg:.2f}")

    if avg >= 90 and avg <= 100:
        print("Grade: A Because the average is between 90 to 100.")
    elif avg >= 80:
        print("Grade: B Because the average is between 80 to 89.")
    elif avg >= 75:
        print("Grade: C Because the average is between 75 to 79.")
    elif avg < 75:
        print("Grade: F Because the average is below 75.")
    else:
        print("Invalid Input.")

    ans = input("Do you want to continue? (YES/NO): ")

if ans.upper() == "NO":
    print("Program Terminated. Thank you!")
        







