package management;

public class studentmanagementsystem {

	public static void main(String[] args) {
		
		class Student {
		    int id;
		    String name;
		    String department;
		    String phone;

		    Student(int id, String name, String department, String phone) {
		        this.id = id;
		        this.name = name;
		        this.department = department;
		        this.phone = phone;
		    }

		    void display() {
		        System.out.println("ID         : " + id);
		        System.out.println("Name       : " + name);
		        System.out.println("Department : " + department);
		        System.out.println("Phone      : " + phone);
		        System.out.println("-----------------------------");
		    }
		}

		public class StudentManagementSystem {

		    static ArrayList<Student> students = new ArrayList<>();
		    static Scanner input = new Scanner(System.in);

		    // Add Student
		    static void addStudent() {
		        System.out.print("Enter Student ID: ");
		        int id = input.nextInt();
		        input.nextLine();

		        System.out.print("Enter Student Name: ");
		        String name = input.nextLine();

		        System.out.print("Enter Department: ");
		        String department = input.nextLine();

		        System.out.print("Enter Phone Number: ");
		        String phone = input.nextLine();

		        students.add(new Student(id, name, department, phone));

		        System.out.println("Student added successfully!");
		    }

		    // View Students
		    static void viewStudents() {
		        if (students.isEmpty()) {
		            System.out.println("No students found.");
		            return;
		        }

		        System.out.println("\n===== Student List =====");

		        for (Student student : students) {
		            student.display();
		        }
		    }

		    // Search Student
		    static void searchStudent() {
		        System.out.print("Enter Student ID to search: ");
		        int id = input.nextInt();

		        for (Student student : students) {
		            if (student.id == id) {
		                System.out.println("\nStudent Found:");
		                student.display();
		                return;
		            }
		        }

		        System.out.println("Student not found.");
		    }

		    // Update Student
		    static void updateStudent() {
		        System.out.print("Enter Student ID to update: ");
		        int id = input.nextInt();
		        input.nextLine();

		        for (Student student : students) {
		            if (student.id == id) {

		                System.out.print("Enter New Name: ");
		                student.name = input.nextLine();

		                System.out.print("Enter New Department: ");
		                student.department = input.nextLine();

		                System.out.print("Enter New Phone: ");
		                student.phone = input.nextLine();

		                System.out.println("Student updated successfully!");
		                return;
		            }
		        }

		        System.out.println("Student not found.");
		    }

		    // Delete Student
		    static void deleteStudent() {
		        System.out.print("Enter Student ID to delete: ");
		        int id = input.nextInt();

		        for (Student student : students) {
		            if (student.id == id) {
		                students.remove(student);
		                System.out.println("Student deleted successfully!");
		                return;
		            }
		        }

		        System.out.println("Student not found.");
		    }

		    // Main Method
		    public static void main(String[] args) {

		        int choice;

		        do {
		            System.out.println("\n================================");
		            System.out.println("     STUDENT MANAGEMENT SYSTEM");
		            System.out.println("================================");
		            System.out.println("1. Add Student");
		            System.out.println("2. View Students");
		            System.out.println("3. Search Student");
		            System.out.println("4. Update Student");
		            System.out.println("5. Delete Student");
		            System.out.println("6. Exit");
		            System.out.println("================================");

		            System.out.print("Enter your choice: ");
		            choice = input.nextInt();

		            switch (choice) {
		                case 1:
		                    addStudent();
		                    break;

		                case 2:
		                    viewStudents();
		                    break;

		                case 3:
		                    searchStudent();
		                    break;

		                case 4:
		                    updateStudent();
		                    break;

		                case 5:
		                    deleteStudent();
		                    break;

		                case 6:
		                    System.out.println("Thank you for using Student Management System!");
		                    break;

		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }

		        } while (choice != 6);

		        input.close();
		    }
		}

	}

}
