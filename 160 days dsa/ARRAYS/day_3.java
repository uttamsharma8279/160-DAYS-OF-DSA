//problem statement:- Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on
package ARRAYS;

public class day_3 {
    static void reverseanarray(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

    }
    public static void main (String[] args){
        int[] arr ={1, 2, 3, 4, 5, 6, 7};

        reverseanarray(arr);

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
