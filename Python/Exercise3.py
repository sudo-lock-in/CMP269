class LehmanCourse:
    def __init__(self, course_name: str, credits: int):
        self.course_name = course_name
        self.credits = credits
        self._student_count = 0
    def enroll_student(self):
        self._student_count += 1
        print("Student enrolled!")
    def display_info(self):
        print(f"Course name: {self.course_name} | Credits: {self.credits} | Student count: {self.student_count}")
