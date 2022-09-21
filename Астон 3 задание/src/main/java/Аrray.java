public class Аrray {
    public static void main(String[] args) {
        int length = 10;
        int[] array = new int[length];

        for (int index = 1; index <= length; index++) {
            array[index - 1] = index;
            if (index % 3 == 0) {
                System.out.println(index);
            }
        }
    }
}



