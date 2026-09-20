
# Strings
txt = "Hello, World"
print(txt[5:9])
print(txt.upper())
name = "Python"
print(f"I love",name)
print(" ")
print("======================")
print(" ")

# Boolean Statements
print(10>9, 10==9, 10<9)

print(10>9, 10==9, bool("Hello"), bool(0))
print(" ")
print("======================")
print(" ")


# Operators
a=15
b=4
print(a%b, a//b,a**b)
a+=10
print(f"The Final Value of a:", a)
print(" ")
print("======================")
print(" ")

# Lists
thislist = ["apple", "banana", "cherry", "apple"]
print(thislist)
print(" ")
print("======================")
print(" ")


# Lists allow duplicate values
thislist = ["apple", "banana", "cherry", "apple", "apple", "cherry"]
print(thislist)
print(" ")
print("======================")
print(" ")

# Append an item
thislist = ["apple", "banana", "cherry"]
thislist.append("orange")
print(thislist)
print(" ")
print("======================")
print(" ")

# Insert an Item
thislist = ["apple", "banana", "cherry"]
thislist.insert(2, "Dr. Sultana")
print(thislist)
print(" ")
print("======================")
print(" ")

# Remove a Specified Value
thislist.remove("Dr. Sultana")
print(thislist)
print(" ")
print("======================")
print(" ")


# Remove a specified Index
thislist.pop(1)
print(thislist)
print(" ")
print("======================")
print(" ")


# Remove the first item
del thislist[0]
print(thislist)
print(" ")
print("======================")
print(" ")

# Loop through a list
thislist = ["apple", "banana", "cherry"]
range(len(thislist))
for i in thislist:
    print(i)
print(" ")
print("======================")
print(" ")

# Loop throuhg index numbers
thislist = ["apple", "banana", "cherry", "Dr. Sultana"]
for i in range(len(thislist)):
    print(thislist[i])
print(" ")
print("======================")
print(" ")

# Challenge Lists:
colors = ["red", "green", "blue"]
print(colors[0])
colors.insert(1, "yellow")
print(colors[1])
colors.append("purple")
del colors[0]
print(colors)
print(" ")
print("======================")
print(" ")

# Tuples
thistuple = ("apple", "banana", "cherry")
print(thistuple)
print(" ")
print("======================")
print(" ")

# Negative Tuple Indexing
thistuple = ("apple", "banana", "cherry")
print(thistuple[-1])
print(" ")
print("======================")
print(" ")

# Slice a tuple
thistuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
print(thistuple[2:5])
print(" ")
print("======================")
print(" ")

#   Python Condition

# If statements
a = 33
b = 33
if b>a: print("b is greater than a")
elif a==b: print("a and b are equal")
else: print("a is greater than b")
print(" ")
print("======================")
print(" ")

# If Else, Else if
a = 200
b = 33
if b>a: print("b is greater than a")
elif a==b: print("a and b are equal")
else: print("a is greater than b")
print(" ")
print("======================")
print(" ")

# Challenge
age = 20
if age<13: print("Child")
elif age<18: print("Teenager")
else: print("Adult")
print(" ")
print("======================")
print(" ")