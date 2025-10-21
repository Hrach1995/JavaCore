package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        for (int i = 0; i <= 10; i++) {
            da.add(i);
        }
        da.print();

        da.set(2, 999);
        da.print();

        System.out.println("---------------");

        da.add(4, 555);
        da.print();

        System.out.println("-----------------");

        da.deleteByindex(2);
        da.print();

        System.out.println("---------------------------");

        System.out.println("exists(999) → " + da.exists(999));
        System.out.println("exists(8) → " + da.exists(8));

        System.out.println("------------");
        System.out.println(da.getByIndex(0));
        System.out.println(da.getByIndex(5));
        System.out.println(da.getByIndex(13));



    }
}
