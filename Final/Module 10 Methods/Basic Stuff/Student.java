public class Student {
    //identity //attributes

    String idNumber;
    String course;
    int year;

    //behaviors //methods
    public void study(){
        System.out.println("I'm studying...");
    }

    public void sleep(){
        System.out.println("Zzzzzzzzzz");
    }

    public String getIdNumber(){
        return idNumber;
    }
}
