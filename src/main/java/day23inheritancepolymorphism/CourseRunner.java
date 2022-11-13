package day23inheritancepolymorphism;

public class CourseRunner {
    public static void main(String[] args) {

        Math math =new Math(); //obje bu 3 farkli constraktir kullanarak elde etmeyey calisacaz
        math.liveSessions();
        math.practice();

     Math m = new Math(6);


    }
}
