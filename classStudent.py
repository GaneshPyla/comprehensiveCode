class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age

    def display(self):
        print("Name: " + self.name + ", Grade: " + self.grade + ", Age: " + str(self.age))


class School(Student):
    def __init__(self, name, grade, age, school_name):
        super().__init__(name, grade, age)
        self.school_name = school_name

    def school_student_display(self):
        print("Name: " + self.name + ", Grade: " + self.grade + ", Age: " + str(self.age) + ", School: " + self.school_name)


student = Student("John", "10th", 16)
student.display()

school_student = School("Alice", "12th", 18, "ABC School")
school_student.school_student_display()
