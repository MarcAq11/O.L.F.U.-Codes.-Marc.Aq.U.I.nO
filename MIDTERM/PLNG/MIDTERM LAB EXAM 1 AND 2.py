class Book:
  def __init__(self, title, author, price):
    self.title = title
    self.author = author
    self.price = price
  def __str__(self):
    return f"Book: {self.title} | Author: {self.author} \nPrice: PHP {self.price}"

class EBook(Book):
  def __init__(self, title, author, price, file_size_mb):
    super().__init__(title, author, price)
    self.file_size_mb = file_size_mb
  def __str__(self):
    return super().__str__()
    return f"| File size: {self.file_size_mb}MB"
    
class Vehicle:
  def __init__(self, brand, daily_rate):
    self.brand = brand
    self.daily_rate = daily_rate

  def calculate_rental(self, days):
    return self.daily_rate * days

  def __str__(self):
    rentalcharge = self.calculate_rental(3)
    return f"{self.brand} | Daily rate: PHP {self.daily_rate}" f"\nRental Charge for 3 days: PHP {rentalcharge}"

class Car(Vehicle):
  def __init__(self, brand, daily_rate, seat_capacity):
    super().__init__(brand, daily_rate)
    self.seat_capacity = seat_capacity
  def __str__(self):
    return f"Car: {super().__str__()} " f"| Seats: {self.seat_capacity}"
class Motorcycle(Vehicle):
  def __init__(self, brand, daily_rate, engine_capacity_cc):
    super().__init__(brand, daily_rate)
    self.engine_capacity_cc = engine_capacity_cc
  def __str__(self):
    return f"Motorcycle: {super().__str__()} " f"| Engine: {self.engine_capacity_cc}"

def main():
    Books = [
    Book("Python Basics", "Maria Santos", 450.00),
    EBook("Learning OOP", "Ana Cruz", 300.00, 5),
    EBook("Learning CCP", "Jeffrey Epstein", 169.00, 67)
    ]

    for j in Books:
        print()
        print(j)
    
    Vehicle = [
    Car("Toyota", 1500.00, 5),
    Motorcycle("Honda", 500.00, 150)
   ]

    for i in Vehicle:
      print()
      print(i)
    
if __name__ == "__main__":
  main()
