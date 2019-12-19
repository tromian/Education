package algoritms;


public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,5,1,3,9,2,10,3,1,6,3,4};

        qSort(arr,0,arr.length-1);

        for (int i : arr){
            System.out.println(i);
        }
    }

    static void qSort(int[] arr, int min, int max){

        if(arr.length < 2){
            return;
        }else {
            int med = min + (max - min)/2;  //select a position of pivot element
            int op = arr[med];              //

            int i = min, j = max;

            //algorithm picks a lowest or higher element vs pivot, and replace them
            while (i <= j){
                while (arr[i] < op) i++;
                while (arr[j] > op) j--;

                if (i <= j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
                //If previous array sorted vs pivot
                //We calls that steps again for left and right sides of array
                if (min < j)
                    qSort(arr, min, j);

                if (max > i)
                    qSort(arr, i, max);
            }

        }

    }


}
