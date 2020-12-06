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
        if (rightIndex > leftIndex){ //check if rightIndex is really right of leftIndex, in case something went wrong
            int pivotValue = keys[rightIndex]; //set the right most element as pivotelement
            int i = leftIndex;
            int j = rightIndex; //set counters as the left and right most element
            while (true){
                while (i < rightIndex && keys[i] <= pivotValue){
                    i = i+1; //count up i until we find an element that is bigger than the pivotelement or until i is at the right end of the array
                }
                while(j > i && keys[j] >= pivotValue){
                    j = j-1; //count down j until we find an element that is smaller than the pivotelement or until j is equal to i
                }
                if (i >= j){
                    break; // if j and i moved past each other break out of the loop, as there are no more elements in the wrong place
                }
                swap(keys, i, j); // when we found two elements in the wrong place, swap them
            }
            swap(keys, i, rightIndex); // swap the pivotelement to the middle of the array
            quickSort(keys, leftIndex, i-1);
            quickSort(keys, i+1, rightIndex); //continue the sort with the two new, smaller arrays
        }
    }

    public static void swap(int[]keys, int index1, int index2){
        int tmp;
        tmp = keys[index1];
        keys[index1] = keys[index2];
        keys[index2] = tmp;
    }
}
