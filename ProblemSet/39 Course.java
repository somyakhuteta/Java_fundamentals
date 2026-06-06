class Course {
    int enrolledStudents;
    String courseName;
    static int maxCapacity;
    boolean isEnrolled;
    
    static int getMaxCapacity(){
        return maxCapacity;
    }
    void enrollStudent(String studentName){
        if(isEnrolled){
            System.out.println("Student is already enrolled");
        }
        else{
            this.isEnrolled=true;
            System.out.println("Thankyou for enrolling in our course");
        }

    }
    void unenrollStudent(String studentName){
        if(isEnrolled){
            this.isEnrolled=false;
            System.out.println("You are sucessfully unenrolled")
        }
        else{
            System.out.println("You are not enrolled in this course");
        }
    }

}
