package at.hul.sort;

import at.hul.res.Sorter;

public class SelectionSort implements Sorter {

    @Override
    public int[] sort(int[] unsorted) {

        for (int i = 0; i < unsorted.length-1; i++) {

            int pointer = i+1;
            do{

                if (unsorted[i] > unsorted[pointer]){
                    swap(unsorted, pointer, i);
                }
                pointer++;

            }while (pointer < unsorted.length);

        }

        return unsorted;
    }

    @Override
    public void swap(int[] array, int index1, int index2) {
        int num = array[index1];

        array[index1] = array[index2];
        array[index2] = num;
    }


}
