# 1
fn = input("Input First Name: ")
ln = input("Input Last Name: ")
print("First Name: " + fn + "\nLast Name: " + ln)

# 2
fullname = f"{fn} {ln}"
print("Full Name: " + fullname)

# 3
print("First Character: " + fullname[0] + "\nLast Character: " + fullname[-1])

# 4
try:
    fn[0] = "D"
except:
    print("Error. \nThe Strings are immutable; individual characters cannot be changed directly.")

# 5
letter = "D"
newname = letter + fn[1:]

print("New Name: " + newname)
print("Original Name: " + fn)

# 6
print("Characters in the Full Name:")
for i in range(len(fullname)):
    print(fullname[i])

# 7 
length = len(fn)
Sliced1 = fullname[:length]
Sliced2 = fullname[length:]

print("Sliced first name: " + Sliced1)
print("Sliced last name: " + Sliced2)

# 8 
fullname.lower()

user = input("Input a letter: ")

find = fullname.find(user)

if user != -1:
    print("Character Found at index: ", fullname.find(user))
else:
    print("Character Not Found")
