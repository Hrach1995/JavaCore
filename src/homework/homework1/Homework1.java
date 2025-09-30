package homework.homework1;

public class Homework1 {

    public static void main(String[] args) {

// Գրել ծրագիր, որը if-ով կպարզի և կտպի՝ որը մեծ է

        int x = 5;
        int y = 7;

        if (x > y) {
            System.out.println("x > y");
        } else if (y > x) {
            System.out.println("y >  x");
        } else {
            System.out.println("x = y");
        }

// Օգտագործել for ցիկլ՝ տպելու համար առաջին 5 բնական թվերը (1, 2, 3, 4, 5)։

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

// Հայտարարեք երկու ամբողջ փոփոխական (int a = 5; int b = 7;) և տպեք դրանց գումարը։

        // erb mi angam e petq u verj

        int a = 5;
        int b = 7;

        System.out.println(a + b);

        // erb petq e heto el ogtagorcel "c"_n

        int c = a + b;

        System.out.println(c);

// Տրված է int n = 3;։ Օգտագործելով for ցիկլ, տպեք n-ի բազմապատկման աղյուսակը 1-ից մինչև 10։

        int n = 3;

        for (int i = 1; i <= 10 ; i++) {
            int h = n * i;

            System.out.println(n + "*" + i + " = " + h);
        }

    }

}




