package Arrays;

public class ArraysNew {
    static int[] sortirovka(int[] array) {
        int a;

        for (int i = 0; i < array.length; i++) {
            int index = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{4, 2, 8, -1, 0, 1, 5, -6, 7, 11};
        sortirovka(arrays);
        for (int j : arrays) System.out.print(j + " ");
    }
}
