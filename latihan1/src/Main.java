public class Main {
    public static void displayData(int item) {
        System.out.println("Hey - your input is: " + item);
    }

    //Linear Complexity
    public static void displayAllCubes(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        int[] inputs = {1, 2, 3, 4, 5, 6, 7 };
        int n = 1000;
        //constant complexity
//        displayData(n);
        displayAllCubes(inputs);
    }
}