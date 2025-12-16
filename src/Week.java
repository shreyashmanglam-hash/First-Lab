import java.util.Scanner;
class Name {
    int n;
    void display() {
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
    Name(int n) {
        this.n = n;
    }
}

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of the Weekday: ");
        n = sc.nextInt();
        Name n1 = new Name(n);
        n1.display();
    }
}


