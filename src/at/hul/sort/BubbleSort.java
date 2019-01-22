package at.hul.sort;

import at.hul.res.Sorter;

public class BubbleSort implements Sorter {

    @Override
    public int[] sort(int[] unsorted) {
        int[] sortedArray = unsorted;

        for (int i = 0; i < sortedArray.length-1; i++) {

            int size = sortedArray.length-1;
            for (int j = 0; j < size; j++) {
                if (sortedArray[j] > sortedArray[j+1]){
                    swap(sortedArray,j,j+1);
                }
            }
            size--;
        }


        return sortedArray;
    }



    @Override
    public final void swap(int[] array, int index1, int index2) {
        int num = array[index1];

        array[index1] = array[index2];
        array[index2] = num;
    }
}
