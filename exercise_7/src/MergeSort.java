import org.jetbrains.annotations.Contract;

public class MergeSort {
    public static void main (String[] args){

    }
    public  static  void mergeSort(int[] keys){

    }
    public  static  void mergeSort(int[] keys, int leftIndex, int rightIndex){
        if (leftIndex < rightIndex){
            int mid = leftIndex + (rightIndex - leftIndex)/2;
            mergeSort(keys,leftIndex,mid);
            mergeSort(keys,mid+1,rightIndex);
            merge(keys,leftIndex,mid,rightIndex);
        }
    }
    public static void merge(int[] keys, int leftIndex, int mid, int rightIndex){
        if (keys[mid] <= keys[mid+1]){
            return;
        }
        int pointer1 = leftIndex;
        int pointer2 = mid+1;
        while (pointer1 < mid+1 || pointer2 < rightIndex){
            if (keys[pointer1] <= keys[pointer2]){
                keys[pointer1+pointer2-mid+1] = keys[pointer1];
                pointer1++;
            }
            else{
                keys[pointer1+pointer2-mid+1] = keys[pointer2];
                pointer2++;
            }
        }

    }
}
