import  java.util.Scanner;
public class crud {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int choice, pos, val;

        while (true){
            System.out.println("\nArray Operations Menu\n");
            System.out.println("1. Display array");
            System.out.println("2. Add element");
            System.out.println("3. Update element");
            System.out.println("4. Delete element");
            System.out.println("5. Exit\n");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayArray(arr);
                    break;
                case 2:
                    System.out.print("Enter the position where you want to add an element: ");
                    pos = input.nextInt();
                    System.out.print("Enter the value you want to add: ");
                    val = input.nextInt();
                    addElement(arr, pos, val);
                    break;
                case 3:
                    System.out.print("Enter the position of the element you want to update: ");
                    pos = input.nextInt();
                    System.out.print("Enter the new value: ");
                    val = input.nextInt();
                    updateElement(arr, pos, val);
                    break;
                case 4:
                    System.out.print("Enter the position of the element you want to delete: ");
                    pos = input.nextInt();
                    deleteElement(arr, pos);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void displayArray(int[] arr) {
        System.out.print("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void addElement(int[] arr, int pos, int val) {
        if (pos < 1 || pos > arr.length) {
            System.out.println("Invalid position");
            return;
        }

        // Shift elements to the right
        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = val;
        System.out.println("Element added successfully");
    }

    public static void updateElement(int[] arr, int pos, int val) {
        if (pos < 1 || pos > arr.length) {
            System.out.println("Invalid position");
            return;
        }

        arr[pos - 1] = val;
        System.out.println("Element updated successfully");
    }

    public static void deleteElement(int[] arr, int pos) {
        if (pos < 1 || pos > arr.length) {
            System.out.println("Invalid position");
            return;
        }

        // Shift elements to the left
        for (int i = pos - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
        System.out.println("Element deleted successfully");
    }
}
