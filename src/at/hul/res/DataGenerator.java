package at.hul.res;

import java.util.Random;

public class DataGenerator {
    public static Random random = new Random();

    public static int[] generateDataArray(int size){
        int[] resultArray = new int[size];

        for (int i = 0; i < size; i++){
            resultArray[i] = random.nextInt();
        }

        return resultArray;
    }

    public static int[] generateDataArray(int size, int min, int max){
        int[] resultArray = new int[size];

        for (int i = 0; i < size; i++){
            resultArray[i] = random.nextInt(max - min + 1) + min;
        }

        return resultArray;
    }

    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}
