import java.util.Scanner;
class score {
    int marks;
    score(int marks) {
        this.marks = marks;
    }
    void result() {
        if (marks>89) {
            System.out.println("Grade: O");
        }
        else if (marks>79) {
            System.out.println("Grade: E");
        }
        else if (marks>69) {
            System.out.println("Grade: A");
        }
        else if (marks>59) {
            System.out.println("Grade: B");
        }
        else if (marks>49) {
            System.out.println("Grade: C");
        }
    }
}

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter your score: ");
        marks = sc.nextInt();
        score s1 = new score(marks);
        s1.result();
    }
}

