def laalpha():
    a = input("Enter the first word: ")
    b = input("Enter the second word: ")
    c = input("Enter the third word: ")
    
    last_word = max(a, b, c)
    
    print(f"\nThe word that comes last alphabetically is: {last_word}")

laalpha()
