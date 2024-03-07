public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        String s1 = "A";
        String s2 = "B";
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println("Before change: " + x + ", " + y + ", " + s1 + ", " + s2 + ", " + p1.getX() + ", " + p1.getY() + ", " + p2.getX() + ", " + p2.getY());
        change(x, y, s1, s2, p1, p2);
        System.out.println("After change: " + x + ", " + y + ", " + s1 + ", " + s2 + ", " + p1.getX() + ", " + p1.getY() + ", " + p2.getX() + ", " + p2.getY());
    }

    public static void change(int a, int b, String n, String m, Point p, Point q) {
        System.out.println("Start change: " + a + ", " + b + ", " + n + ", " + m + ", " + p.getX() + ", " + p.getY() + ", " + q.getX() + ", " + q.getY());
        a = 30;
        b = 40;
        n = "C";
        m = "D";
        p.setX(10);
        q = new Point(5, 6);
        System.out.println("End change: " + a + ", " + b + ", " + n + ", " + m + ", " + p.getX() + ", " + p.getY() + ", " + q.getX() + ", " + q.getY());
    }
}
/*  explanation:

-the main method creates several variables (x, y, s1, s2) of primitive type (int) and two objects of type Point (p1 and p2).
-the values of these variables are displayed before calling the change method.
-the change method takes parameters (a, b, n, m, p, q) and modifies some of these variables.
 it also modifies the coordinates of the p point but creates a new q point.
-the values of the variables are displayed again after calling the change method.
-the execution shows how the values of the variables change when passed to a method and
 modified inside it. Changes made to primitive variables (a, b, n, m) in the change method
  are not reflected in the main method because they are passed by value, while changes made to objects
 (p) are reflected because they are passed by reference.




