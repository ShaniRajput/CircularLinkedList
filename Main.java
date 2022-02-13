import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value, position;
        char loop = 'y';
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (loop == 'y') {
            System.out.println("\nSelect the Operation:\n");
            System.out.println(
                    "1- Insert Value At Start\n2- Insert Value At Specific Position\n3- Insert Value At End\n4- Remove Value\n5- Remove Value through Position\n6- Show List\n7- Exit");
            System.out.print("\nPerform Operation: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Value: ");
                    value = input.nextInt();
                    list.insertStart(value);
                    break;
                case 2:
                    System.out.print("Enter Value: ");
                    value = input.nextInt();
                    System.out.print("Enter Position: ");
                    position = input.nextInt();
                    list.insertByPosition(value, position);
                    break;
                case 3:
                    System.out.print("Enter Value: ");
                    value = input.nextInt();
                    list.insertEnd(value);
                    break;
                case 4:
                    System.out.print("Enter Value: ");
                    value = input.nextInt();
                    list.removeByValue(value);
                    break;
                case 5:
                    System.out.print("Enter Position: ");
                    position = input.nextInt();
                    list.removeByPosition(position);
                    break;
                case 6:
                    System.out.print("Linked List:\n");
                    list.show();
                    break;
                case 7:
                    loop = 'n';
                    break;
                default:
                    System.out.println("Operation don't exists.");
            }
        }
        input.close();
    }
}
