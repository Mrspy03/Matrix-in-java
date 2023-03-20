import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Student {
    private String name;
    private int rollno, m, t = 0;
    private int[] marks = new int[5];

    public void input() {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter Student Name=");
        name = t.nextLine();
        System.out.print("Enter Student Roll no=");
        rollno = t.nextInt();
        // for input
        System.out.print("enter student marks=");
        for (int i = 0; i < 5; i++) {
            marks[i] = t.nextInt();
        }

    }

    public void display() {
        System.out.println("name=" + name);
        System.out.println("rollno=" + rollno);
        for (int i = 0; i < 5; i++) {
            t += marks[i];
        }
        System.out.println("Total Marks =" + t);
        float pre = (t / 600) * 100;
        System.out.println("Percentage=" + pre + "%");
    }

    public class Marks {
        public static void main(String args[]) {
            Student st = new Student();
            st.input();
            st.display();

        }
    }

}
