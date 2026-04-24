def exercise_1_basics():
    course = "Puter"
    students = 100
    print(f"The course {course} has {students} students.")

def exercise_2_collections():
    colors = ["yellow", "blue", "red", "pink", "green"]
    print(colors)
    colors.append("teal")
    d = {
        "name": "Arthur",
        "gpa": 3.9
    }
    print(colors)
    print(d)

def exercise_3_logic():
    evens = []
    for i in range(5+1):
        print(i)
        if i % 2 == 0:
            evens.append(i)
    print(evens)

if __name__ == "__main__":
    print("--- Exercise 1 ---")
    exercise_1_basics()
    print("\n--- Exercise 2 ---")
    exercise_2_collections()
    print("\n--- Exercise 3 ---")
    exercise_3_logic()
