package Task3;
public class Elements {
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 9, 10, 12, 15};

        System.out.println("Элементы массива, кратные 3:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
