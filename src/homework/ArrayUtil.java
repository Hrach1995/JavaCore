package homework;

public class ArrayUtil {
    public static void main(String[] args) {

        int [] numbers = {1,6,3,9,15,52,-3,5,8};

        for (int num : numbers) {
            System.out.print(num + ",");
        }

        System.out.println("\nՏպել մասիվի առաջին էլեմենտը");

        System.out.println(numbers[0]);

        System.out.println("Տպել մասիվի վերջին էլեմենտը");

        System.out.println(numbers[numbers.length - 1]);

        System.out.println("Տպել մասիվի երկարությունը");

        int spread = 0;

        for (int i = 0; i < numbers.length; i++) {
            spread++;
        }
        System.out.println(spread);

        System.out.println("Տպել մասիվի ամենափոքր թիվը");

        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println(minNumber);

        System.out.println("Տպել մասիվի մեջտեղի թիվը");

        if (numbers.length <= 2) {
            System.out.println("can't print middle values.");
        } else {
            int middle = numbers.length / 2;
            if (numbers.length % 2 == 0) {
                System.out.println(numbers[middle - 1] + "," + numbers[middle]);
            } else {
                System.out.println(numbers[middle]);
            }
        }

        System.out.println("Հաշվել ու տպել մասիվում զույգերի քանակը");

        int n = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                n++;
            }
        }
        System.out.println(n);

        int a = 0;

        System.out.println("Հաշվել ու տպել մասիվում կենտերի քանակը");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                a++;
            }
        }
        System.out.println(a);

        System.out.println("Տպել մասիվում էլեմենտների գումարը");

        int add = 0;

        for (int i = 0; i < numbers.length; i++) {

            add += numbers[i];
        }
        System.out.println(add);

        System.out.println("Տպել մասիվում թվերի միջին թվաբանականը");

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double avg = (double) sum / numbers.length;
        System.out.println(avg);

    }
}

