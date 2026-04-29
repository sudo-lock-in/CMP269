# The Scenario: "Lehman Campus Payment System"
# The college needs a new system to handle different types of payments (Credit Cards, Meal # # Plans, and Financial Aid). You are tasked with building the class hierarchy for this system.
# This exercise is already completed. Use it as a reference to recreate Java Exercise 1
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
        super().__init__(_accountHolder, _balance)
        self.__creditLimit = creditLimit
    @Override
    def processPayment(self, amount: float):
        if amount > _balance + __creditLimit:
            print("Transaction Declined.")
        else:
            _balance -= amount
            totalTransactions += 1
            print("Transaction Accepted.")



# TODO below is incomplete


def exercise_3_polymorphism():
    """
    Goal: Demonstrate Duck Typing.
    Notice how this function doesn't care about the object's class,
    only that it has a 'get_status()' method!
    """
    print("\n--- Exercise 3: Polymorphism (Duck Typing) ---")

    undergrad = Exercise1_Student("Alice", 3.5)
    grad = Exercise2_GradStudent("Bob", 3.9, "AI Data")
    bot = Robot()

    # We can put completely unrelated objects in a list
    entities = [undergrad, grad, bot]

    for entity in entities:
        # As long as it "quacks" (has get_status()), Python executes it!
        print(entity.get_status())

if __name__ == "__main__":
    print("--- Exercise 1 & 2: Classes and Inheritance ---")
    student1 = Exercise1_Student("John Doe", 2.8)
    student2 = Exercise2_GradStudent("Jane Smith", 4.0, "Cybersecurity")

    print(student1.get_status())
    print(student2.get_status())

    exercise_3_polymorphism()
