package miscellaneous;


public class Student {
    int age;
    String Name;
    Student(int age, String Name){
        this.age=age;
        this.Name=Name;
    }


    @Override
    public String toString() {
        return "Age : "+age+" Name : " + Name;
    }
}
