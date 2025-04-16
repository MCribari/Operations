package operaciones;

public class Operaciones {
    public static void main(String[] args) {

        double A = 26.0 / 4;
        double B = 78.5 / 2;
        double C = 105.0 / 75;
        int D = (0 == 1) ? (45 / 0) : 0;
        int E = 28 * 4;
        int F = (78) - (-12) + (-15);
        int G = 10 / 5 + (-3) + 1;
        double H = 16 / 3.0 + 16 / 5;

        System.out.println("2.1.");
        System.out.println("A. " + A);
        System.out.println("B. " + B);
        System.out.println("C. " + C);
        System.out.println("D. " + D);
        System.out.println("E. " + E);
        System.out.println("F. " + F);
        System.out.println("G. " + G);
        System.out.println("H. " + H);

        System.out.println();

        boolean I = (1 == 2);
        boolean J = (1 > 2);
        boolean K = (1 <= 2);
        boolean L = (1 != 2);
        boolean M = (35 < 8 / 13);
        boolean N = (1 < 2) && (2 < 3);
        boolean O = (1 < 2) && (2 < 0);
        boolean P = (1 < 2) || (2 < 0);

        System.out.println("2.2.");
        System.out.println("A. " + I);
        System.out.println("B. " + J);
        System.out.println("C. " + K);
        System.out.println("D. " + L);
        System.out.println("E. " + M);
        System.out.println("F. " + N);
        System.out.println("G. " + O);
        System.out.println("H. " + P);

        System.out.println();

        System.out.println("2.3");

        try {
            int result = 1 / 0;
            System.out.println("A." + (1 < result));
        } catch (ArithmeticException e) {
            System.out.println("A. Error - Division por cero");
        }

        try {
            boolean result = false && (1 < (1 / 0));
            System.out.println("B. " + result);
        } catch (ArithmeticException e) {
            System.out.println("B. Error - Division por cero");
        }

        try {
            boolean result = (1 < (1 / 0)) && false;
            System.out.println("C. " + result);
        } catch (ArithmeticException e) {
            System.out.println("C. Error - Division por cero");
        }

        try {
            boolean result = true || (1 < (1 / 0));
            System.out.println("D. " + result);
        } catch (ArithmeticException e) {
            System.out.println("D. Error - Division por cero");
        }

        System.out.println();

        int U = 5;
        int V = 3;
        int W = -12;

        boolean X = U>3;
        boolean Y = V<C;
        boolean Z = U*V==15;
        boolean T = U+V+W==5;

        System.out.println("2.4.");
        System.out.println("A. " + X);
        System.out.println("B. " + Y);
        System.out.println("C. " + Z);
        System.out.println("D. " + T);

        System.out.println();

        int AA = 5;
        int AB = 3;
        int AC = -12;

        boolean AD = AA>AC;
        boolean AE = AB!=AC;
        boolean AF = AA*AB==-30;
        boolean AG = (AA+AB==8) && (AA-AB==-2);
        boolean AH = AA/AB<3;
        boolean AI = AA*AC>AB;
        boolean AJ = AC/2==2;
        boolean AK = AA*AB+AC/2>1;

        System.out.println("2.5.");
        System.out.println("A."+AD);
        System.out.println("B."+AE);
        System.out.println("C."+AF);
        System.out.println("D."+AG);
        System.out.println("E."+AH);
        System.out.println("F."+AI);
        System.out.println("G."+AJ);
        System.out.println("H."+AK);



    }

}
