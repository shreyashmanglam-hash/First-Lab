import java.util.Scanner;
class Read {
    String first;
    String last;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        first = sc.nextLine();
        System.out.println("Enter last name: ");
        last = sc.nextLine();
    }
    void display() {
        System.out.printf("%s %s",last,first);
    }
}
public class reverse {
    public static void main(String[] args) {
        Read r1 = new Read();
        r1.input();
        r1.display();
    }
}