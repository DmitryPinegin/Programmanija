package Arrays;

public class ArraysNew {
    static int[] sortirovka(int[] array) {
        for(int i = 1; i < array.length; i++) {
            if(array[0] > array[i]) {
                int num = array[i - 1];
                array[i - 1] = array[i];
                array[i] = num;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 8, -1, 0, 1, 5, -6, 7, 11};
        sortirovka(array);
        for (int j : array) System.out.print(j + " ");
    }
}
