import java.util.*;

class Area {
    double area(int r) {
        return (3.14 * r * r);
    }

    int area(int l, int b) {
        return (l * b);
    }

    double area(float h, float b) {
        return (0.5 * h * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        Area areaCalculator = new Area();

        while (op != 4) {
            System.out.println("1) Circle Area\n2) Rectangle Area\n3) Triangle Area\n4) Exit");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter the radius: ");
                    int r = sc.nextInt();
                    System.out.println("Area: " + areaCalculator.area(r));
                    break;

                case 2:
                    System.out.print("Enter length and breadth: ");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Area: " + areaCalculator.area(l, b));
                    break;

                case 3:
                    System.out.print("Enter height and breadth: ");
                    float h = sc.nextFloat();
                    float bb = sc.nextFloat();
                    System.out.println("Area: " + areaCalculator.area(h, bb));
                    break;
            }
        }
    }
}

