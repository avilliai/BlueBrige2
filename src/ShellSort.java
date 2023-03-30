import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        //shellSort(arr);
//        [3, 5, 1, 6, 0, 8, 9, 4, 7, 2]
//        [0, 2, 1, 4, 3, 5, 7, 6, 9, 8]
//        [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        song(arr);
    }
    public static int song(int[] arr) {
        int[] newARRAY = Arrays.copyOfRange(arr, 0, 2);

        System.out.println(newARRAY.length);
        return newARRAY.length;
    }
    //希尔排序
    public static void shellSort(int[] arr) {
        //遍历所有的步长
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            //遍历所有的元素
            //System.out.println("-----------------------------------");
            for (int i = gap; i < arr.length; i++) {
                //遍历本组中所有元素
                //System.out.println("======");
                for (int j = i - gap; j >= 0; j -= gap) {
                    //System.out.println("i:"+i+"  j:"+j+"  gap:"+gap);
                    //如果当前元素大于加上步长后的那个元素
                    if (arr[j] > arr[j + gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            //打印每次排序后的结果
            System.out.println(Arrays.toString(arr));
        }
    }
}
