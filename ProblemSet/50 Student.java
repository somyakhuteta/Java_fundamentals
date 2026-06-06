//Define a Student class with fields like name and age, and use toString to print student details.

class Student{
    String name;
    int age;
    String rollnumber;
    String house;

    public Student(String name, int age, String rollnumber, String house){
        this.name=name;
        this.age=age;
        this.rollnumber=rollnumber;
        this.house=house;
    }

    @Override
    public String toString(){
        return "Student Details:{name;" + name +", age" + age
                + ", roll number:" + rollnumber
                + ", house:" + house + " }";
    }

    public static void main(String[] agrs){
        Student stu=new Student("Zeus", 9, "404", "None");
        System.out.println(stu);
    }
}