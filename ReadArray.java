public class ReadArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            int index = 5; // Change this value to test different scenarios
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        } finally {
            System.out.println("Operation complete.");
        }
    }
}



















  



  
