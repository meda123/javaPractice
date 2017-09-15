class StudentClasses {
    // variable declarations 
    int id;
    String name;
    String gender = "male";

    // Note: Two constructor functions 
    StudentClasses(int id, String name) {
        this(name); //Invoking overloaded constructor. If present, should be 1st statement
        this.id = id;
    }

     StudentClasses(String name) {
        this.name = name;
    }

    //method definitions 
    boolean updateProfile(String name) {
        this.name = name;
        return true;
    }
}