# The Scenario: "Lehman Campus Payment System"
# The college needs a new system to handle different types of payments (Credit Cards, Meal # # Plans, and Financial Aid). You are tasked with building the class hierarchy for this system.
class Exercise1_Student:
    """
    Goal: Practice class definition, __init__, and the self keyword.
    """
    def __init__(self, name, gpa):
        self.name = name
        self.gpa = gpa
        # Using a single underscore denotes a "protected" or internal variable
        self._is_active = True

    def get_status(self):
        status = "Active" if self._is_active else "Inactive"
        return f"{self.name} is currently {status} with a {self.gpa} GPA."

class Exercise2_GradStudent(Exercise1_Student):
    """
    Goal: Practice Inheritance and super().
    """
    def __init__(self, name, gpa, research_lab):
        # Call the parent class constructor
        super().__init__(name, gpa)
        self.research_lab = research_lab

    # Overriding the parent method
    def get_status(self):
        base_status = super().get_status()
        return f"{base_status} They research in the {self.research_lab} lab."

class Robot:
    def get_status(self):
        return "BEEP BOOP. Robot systems nominal."

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
