package Arrays;

import java.util.Arrays;

public class Arrayss {
    static int[] sortirovka(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 8, -1, 0, 1, 5, -6, 7, 11};
        sortirovka(array);
        for (int j : array) System.out.print(j + " ");
    }
}
