# The Scenario: "Lehman Campus Payment System"
# The college needs a new system to handle different types of payments (Credit Cards, Meal # # Plans, and Financial Aid). You are tasked with building the class hierarchy for this system.
# This exercise is already completed. Use it as a reference to recreate Java Exercise 1
from typing import override

class Payable:
    def processPayment(self, amount: float):
        pass
    def getPaymentStatus(self) -> str:
        pass


class PaymentMethod(Payable):
    def __init__(self, accountHolder: str, balance: float):
        self._accountHolder = accountHolder
        self._balance = balance
    totalTransactions = 0
    def validateAccount():
        pass


class CreditCard(PaymentMethod):
    def __init__(self, accountHolder: str, balance: float, creditLimit: float):
        super().__init__(accountHolder, balance)
        self.__creditLimit = creditLimit
    @override
    def processPayment(self, amount: float):
        if amount > _balance + __creditLimit:
            print("Transaction Declined.")
        else:
            _balance -= amount
            totalTransactions += 1
            print("Transaction Accepted.")

class MealPlan(PaymentMethod):
    def __init__(self, accountHolder: str, balance: float):
        self._accountHolder = accountHolder
        self._balance = balance
    @override
    def validateAccount():
        if _balance >= 0:
            print("Valid")
        else:
            print("Invalid")
    @override
    def processPayment(self, amount: float):
        if amount > _balance:
            print("Transaction Declined.")
        else:
            _balance -= amount
            totalTransactions += 1
            print("Transaction Accepted.")


if __name__ == "__main__":
    paymentQueue = []
    meal = MealPlan("Arthur", 1000)
    paymentQueue.append(meal)
    card = CreditCard("King Arthur", 500, 500)
    paymentQueue.append(card)
    for c in paymentQueue:
        c.processPayment(50)
    print(totalTransactions)
