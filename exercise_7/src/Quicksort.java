public class Quicksort {
    public static void main(String[] args){
        int[] test1 = new int[] {23, 14, 53, 69, 42, 78, 44, 38, 39};
        int[] test2 = new int[] {22, 10, 15, 18, 35, 29, 30, 37, 23};
        int[] test3 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        quickSort(test1);
        quickSort(test2);
        quickSort(test3);
        for (int i = 0; i < test1.length; i++){
            System.out.print(test1[i]+" ");
            System.out.print(test2[i]+ " ");
            System.out.print(test3[i] + " ");
            System.out.println();
        }


    }

    public static void quickSort(int[] keys){
        quickSort(keys, 0, keys.length-1);
    }
    public static void quickSort(int keys[], int leftIndex, int rightIndex){
        if (rightIndex > leftIndex){
            int pivotValue = keys[rightIndex];
            int i = leftIndex;
            int j = rightIndex;
            while (true){
                while (i < rightIndex && keys[i] <= pivotValue){
                    i = i+1;
                }
                while(j > i && keys[j] >= pivotValue){
                    j = j-1;
                }
                if (i >= j){
                    break;
                }
                swap(keys, i, j);
            }
            swap(keys, i, rightIndex);
            quickSort(keys, leftIndex, i-1);
            quickSort(keys, i+1, rightIndex);
        }
    }

    public static void swap(int[]keys, int index1, int index2){
        int tmp;
        tmp = keys[index1];
        keys[index1] = keys[index2];
        keys[index2] = tmp;
    }
}
