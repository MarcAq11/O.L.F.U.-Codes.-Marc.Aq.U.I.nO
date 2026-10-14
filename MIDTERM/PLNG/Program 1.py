# 1.
a = "Hello Python"

byte = a.encode("utf-8")

print(byte)

# 2. 
b = byte.decode("utf-8")

print(b)

# 3. 

c = byte.decode("utf-8")
d = byte.hex()

print(d)

# 4 
e = bytes.fromhex(d)

print(e)

# 5
f = bytearray(a, "utf-8")

print(f)

# 6
g = bytearray(byte)

print(g)

# 7
h = bytearray(a[6:12], "utf-8")

print(h)

# 8
i = a[0:1].lower()
print(i + a[1:12])


