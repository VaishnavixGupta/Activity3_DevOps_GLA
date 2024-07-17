import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={88,2,44,15,44};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
             //for each step,max item will come at last respective index
            for(int j=1;j<arr.length-i;j++){    //j<=arr.length-i-1
               //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            //if you did not swap for a particular value of i it means array is sorted,hence stop the program
            if(!swapped){       //(swapped==false)//(!swapped==true)
                break;
            }
        }
    }
}
