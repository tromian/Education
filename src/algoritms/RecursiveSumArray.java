package algoritms;


public class RecursiveSumArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr){

        int first = arr[0];
        int[] newArr = new int[arr.length-1];
        System.arraycopy(arr, 1, newArr, 0, arr.length - 1);
        if (newArr.length == 0){
            return first;
        }
        return first + sum(newArr);

    }



}
