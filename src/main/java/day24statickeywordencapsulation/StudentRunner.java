package day24statickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {

        Student std1=new Student();

        System.out.println(std1.getStdId()); //TH202201

        System.out.println(std1.getGpa()) ; //3.8
        System.out.println(std1.isRetired()); //false

        std1.setStdId("Ab");
        System.out.println(std1.getStdId());  //Ab

        std1.setGpa(4.0);
        System.out.println(std1.getGpa()); //4.0

        std1.isRetired();
        System.out.println(std1.isRetired()); //true
    }


}
