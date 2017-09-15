class ConstructorExample {
    int id;
    String name;
    int salary;

    ConstructorExample(int userId, String userName) {
        id = userId;
        name = userName;
    }

    ConstructorExample(int userId, String userName, int userSalary) {
        this(userId, userName);
        salary = userSalary;
    }

    public static void main(String[] args) {
        ConstructorExample instructor = new ConstructorExample(1, "Medalis", 120000);
        System.out.println("Name: "+ instructor.name);
    }

}