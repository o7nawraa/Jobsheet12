import java.util.Scanner;
public class CinemaWithScanner07 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int row, column;
    String name, next;

    String[][] audience = new String [5][7];
    System.out.println("***** Cinema Program *****");
    System.out.println("What do you want today?");
    while (true)  {
        System.out.println("Menu:");
        System.out.println("1. Input Audience Data");
        System.out.println("2. Show Audience List");
        System.out.println("3. Exit");
        System.out.print("Choose An Option (1-3): ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
            System.out.println("\n ---Input Audience Data---");
            while (true) {
            System.out.print("Enter Auidience Name: ");
            name = sc.nextLine();
    
            System.out.print("Enter Seat Row Number (1-5): ");
            row = sc.nextInt();
    
            System.out.print("Enter Seat Column Number(1-7): ");
            column = sc.nextInt();
            sc.nextLine();
            
            if (row < 1 || row > 5 || column < 1 || column > 7) {
                System.out.println("Invalid row or column. Please try again");
                continue;
            }

            audience[row - 1][column - 1] = name;

            System.out.print("Are there any other audiences to be added? (y/n): ");
            next =sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
            break;

            case 2: 
            System.out.println("\n ----- Audience List -----");
            for (int i=0; i<audience.length; i++) {
                for (int j = 0; j < audience[i].length; j++){
                    System.out.print(audience[i][j] + "\t");
                }
                System.out.println();
            }
            break;

            case 3:
            System.out.println("Exiting The Program.");
            System.out.println("Have Nice Day! ^_^");
            return;

            default :
            System.out.println("Invalid choice. Please choose again.");
        }
    }
}
}

