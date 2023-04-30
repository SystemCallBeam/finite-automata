import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Graph g = new Graph();

        while(!s.equals("-")) {
            System.out.println(g.isAccept(s));
            g.toString();
            s = sc.nextLine();
        }
        sc.close();
        
    }
}