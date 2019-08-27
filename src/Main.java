import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] num = {3,2,1,5,3,9,8};
        for (int i = 0; i < sort(num).length; i++) {
            System.out.println(sort(num)[i]);
        }
    }
    public static int[] sort(int[] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int i1 = 0; i1 < array.length -1 -i; i1++) {
                if (array[i1] > array[i1 + 1]){
                    int temp = array[i1];
                    array[i1] = array[i1 + 1];
                    array[i1 + 1] = temp;
                }
            }
        }
        return array;
    }
}
