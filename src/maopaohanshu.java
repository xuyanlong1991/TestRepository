public class maopaohanshu {
    public static void main(String[] args) {
        int arr[] = { 5, 10, 12, 6, 1,10 };
        System.out.println("排序前数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后组数为：");
        for (int num : arr) {
            System.out.print(num + " ");
            System.out.println("分支：xyltest");
        }
    }
}
