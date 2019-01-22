package at.hul.main;

import at.hul.sort.*;
import at.hul.res.*;


public class Main {

    public static void main(String[] args) {
        double elapsedTime;

        int[] array = DataGenerator.generateDataArray(5,0,10);

        DataGenerator.printArray(array);

        System.out.println("\n---------------------------------------------------------------------------------------");

        Sorter selectionSort = new SelectionSort();

        Stopwatch stopwatch = new Stopwatch();
        array = selectionSort.sort(array);
        elapsedTime = stopwatch.elapsedTime();

        DataGenerator.printArray(array);

        System.out.println("\n\nElapsed Time: " + elapsedTime + "s");
    }
}
