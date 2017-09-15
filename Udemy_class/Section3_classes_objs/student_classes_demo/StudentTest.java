class StudentTest {

    public static void main(String[] args) {
        int[] studentIds = new int[] {1001, 1002, 1003};

        //Creating student objects and setting its states 
        StudentClasses student1 = new StudentClasses(studentIds[0], "Joan");
        student1.gender = "male";

        StudentClasses student2 = new StudentClasses(studentIds[1], "Raj");
        student2.gender = "male";

        StudentClasses student3 = new StudentClasses(studentIds[2], "medalis");
        student3.gender = "female";

        //Print each student name 
        System.out.println("Name of student1: " + student1.name);
        System.out.println("Name of student2: " + student2.name);
        System.out.println("Name of student3: " + student3.name);

       // Update student's name by invoking updateProfile method 
       student1.updateProfile("Mark");
       System.out.println("Updated name of student1: " + student1.name);  
    }
}