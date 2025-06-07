class Student:
    def __init__(self):
        self.name = ""
        self.age = 0
        self.gender = ""
    
    def addDetails(self):
        self.name = input("Enter the name: ")
        self.age = int(input("Enter the age: "))
        self.gender = input("Enter the gender (M/F): ")
        
    def displayDetails(self):
        # print("Name:", self.name)
        # print("Age:", self.age)
        # print("Gender:", self.gender)
        print("\t", self.name, "\t", self.age, "\t", self.gender)
        print("============================================================")
    
    def updateDetails(self):
        print('''
              1 : Name of the student
              2 : Age of the student
              3 : Gender of the student''')
        choice = int(input("Enter the field to update: "))
        match(choice):
            case 1:
                self.name = input("Enter the new name: ")
            case 2:
                self.age = int(input("Enter the new age: "))
            case 3:
                self.gender = input("Enter the new gender (M/F): ")
            # default:
            #     print("Invalid choice")
        # self.name = input("Enter the new name: ")
        # self.age = int(input("Enter the new age: "))
        # self.gender = input("Enter the new gender (M/F): ")
    def deleteDetails(self):
        self.name = ""
        self.age = 0
        self.gender = ""
count = 0     
my_dict = {}
while True:
    
    print('''
          Enter your Choice
          1 : Add Student
          2 : Display Student Details
          3 : Update Student Details
          4 : Delete Student Details
          5 : Exit''')
    
    n = int(input("Enter your Choice"))
    match(n):
        case 1:
            student = Student()
            student.addDetails()
            count = count + 1
            my_dict[count] = student
            # break
        case 2:
            print("Id\tName\tAge\tGender")
            print("================================================================")
            for i in my_dict:
                print(i, end="")
                my_dict[i].displayDetails()
            # break
        case 3:
            roll = int(input("Enter roll.no which you want to Update"))
            if roll in my_dict:
                print(f"Updating details of Student {roll}:")
                my_dict[roll].displayDetails()
                my_dict[roll].updateDetails()
            # student.updateDetails()
            # break
        case 4:
            roll = int(input("Enter roll.no which you want to Delete"))
            if roll in my_dict:
                print(f"Deleting details of Student {roll}:")
                my_dict[roll].displayDetails()
                del my_dict[roll] 
            # break
        case 5:
            exit()
