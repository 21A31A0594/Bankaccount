class bankacc:
    def __init__(self,account_name,account_num,balance):
        self.account_name= account_name
        self.account_num= account_num
        self.balance=balance
    def deposit(self,amount):
        if amount>0:
            self.balance+=amount
            print(f"Deposited Amount{amount}, Current Balance{self.balance}")
        else:
            print("Invalid Amount")
    def withdraw(self,amount):
        if amount>0:
            if amount<=self.balance:
                self.balance-=amount
                print(f"Withdraw Amount{amount}, Current Balance{self.balance}")
            else:
                print("Insuffient balance")
        else:
            print("Invalid Amount")
    def display_bal(self):
        print(f"Account Holder{self.account_name}")
        print(f"Account Number{self.account_num}")
        print(f"Current Balance{self.balance}")
customer1=bankacc("Akhil",725937458,1000)
customer1.display_bal()
customer1.deposit(2000)
customer1.display_bal()
customer1.withdraw(1500)
customer1.display_bal()