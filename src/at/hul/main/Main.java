package at.hul.main;

        import at.hul.res.DataGenerator;

public class Main {

    public static void main(String[] args) {
        int[] array = DataGenerator.generateDataArray(100,-10,10);

        DataGenerator.printArray(array);
    }
}
