from datetime import datetime

def main():
    date_format = "%d-%m-%m"  
    
    try:
        t_page = int(input("Enter total pages of the book: "))
        p_read = int(input("Enter how many pages have been read: "))
    except ValueError:
        print("Please enter valid integers for pages.")
        return

    today = datetime.now().date()
    issue_date = None
    due_date = None

    while issue_date is None:
        issue_input = input("Enter Issue Date (DD-MM-YYYY): ")
        try:
            issue_date = datetime.strptime(issue_input, "%d-%m-%Y").date()
        except ValueError:
            print("Invalid format. Please use DD-MM-YYYY (e.g., 14-10-2026).")

    while due_date is None:
        due_input = input("Enter the Due Date (DD-MM-YYYY): ")
        try:
            temp_date = datetime.strptime(due_input, "%d-%m-%Y").date()
            if temp_date < issue_date:
                print("Due Date cannot be before the issue date.")
            else:
                due_date = temp_date
        except ValueError:
            print("Invalid format. Please use DD-MM-YYYY (e.g., 14-10-2026).")

    print("\n--- Library System Calculations ---")

    td_allotted = (due_date - issue_date).days
    d_remain = (due_date - today).days

    if t_page > 0:
        percent_read = (p_read / t_page) * 100
    else:
        percent_read = 0.0
    print(f"Percentage of the book read: {percent_read:.2f}%")

    print(f"Days remaining to return the book: {d_remain} days \n(Total allowance: {td_allotted} days)")

    p_remain = t_page - p_read
    if p_remain <= 0:
        print("You have already finished the book")
    elif d_remain <= 0:
        print("Borrowing Time has expired.")
    else:
        p_pd = p_remain / d_remain
        print(f"Reading amount to finish the book: {p_pd:.1f} pages per day")

if __name__ == "__main__":
    main()
