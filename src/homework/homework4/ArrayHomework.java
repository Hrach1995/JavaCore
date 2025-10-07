package homework.homework4;

public class ArrayHomework {
    public static void main(String[] args) {

        System.out.println("---Խնդիր 1---");

        int[] numbers = {7, 2, 5, 3, 2, 6, 3, 6, 0, -1};
        int n = 6;
        int quantity = 0;

        for (int num : numbers) {
            if (num == n)
                quantity++;
        }
        System.out.println(quantity);

        System.out.println("---Խնդիր 2---");

        for (int i = 0; i < numbers.length / 2; i++) {
            int tup = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = tup;
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("---Խնդիր 3---");

        int recurrent = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    recurrent++;
                }
            }
        }
        System.out.println("Repeating numbers are _ " + recurrent);
        System.out.println();

        System.out.println("---Խնդիր 4---");

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

        String vowel = "աեէըիոուօ";

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (vowel.indexOf(chars[i]) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels _ " + count);

    }
}
