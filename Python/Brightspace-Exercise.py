from typing import override
class LehmanCourse:
    def __init__(self, course_name: str, credits: int):
        self.course_name = course_name
        self.credits = credits
        self._student_count = 0
    def enroll_student(self):
        self._student_count += 1
        print("Student enrolled!")
    def display_info(self):
        print(f"Course name: {self.course_name} | Credits: {self.credits} | Student count: {self._student_count}")
class LabCourse(LehmanCourse):
    def __init__(self, course_name: str, credits: int, lab_fee: float):
        super().__init__(course_name, credits)
        self.lab_free = lab_free
    @override
    def display_info(self):
        print(f"Course name: {self.course_name} | Credits: {self.credits} | Lab fee: {self.lab_free} | Student count: {self._student_count}")
class Professor:
    def get_role(self) -> str:
        return "Teaching and Research"
class Student:
    def get_role(self) -> str:
        return "Learning and Coding"
def print_role(person):
    print(person.get_role())

Dave = Professor()
print_role(Dave)
Arthur = Student()
print_role(Arthur)

my_course = LehmanCourse("CMP 269", 4)
my_course.enroll_student()
my_course.display_info()
