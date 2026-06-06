//Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.

class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Prashant";
        String lasName = "Jain";
        String fullName = firstName.concat( " ").concat(lasName);
        System.out.println(fullName.toUpperCase());
    }
}
