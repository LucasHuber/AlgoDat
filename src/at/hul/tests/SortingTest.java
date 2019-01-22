package at.hul.tests;

import at.hul.res.DataGenerator;
import at.hul.res.Sorter;
import at.hul.res.Stopwatch;
import at.hul.sort.BubbleSort;
import at.hul.sort.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTest {
    private int[] numbers = DataGenerator.generateDataArray(10000,-1000,1000);

    @Test
    public void bubbleTest(){
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();

        sort(bubbleSort, numbers, "Bubblesort");

        sort(selectionSort, numbers, "Selectionsort");
    }

    private void check(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]){
                fail("Test failed: Error at Index " + (i-1) + " and Number " + array[i-1]);
            }
        }
    }

    private void sort(Sorter sorter, int[] array, String sortName){
        Stopwatch sw = new Stopwatch();
        int[] sortedArray = array.clone();
        sorter.sort(sortedArray);
        double elapsedTime = sw.elapsedTime();

        check(sortedArray);

        System.out.println("\n\n");
        DataGenerator.printArray(this.numbers);
        System.out.println("\n---------------------------------------------------------------------------------------");
        DataGenerator.printArray(sortedArray);

        System.out.println("\n\nTest successful: " + sortName + " finished in " + elapsedTime + "s");
    }
}
