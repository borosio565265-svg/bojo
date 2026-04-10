package banjo;

import java.util.Scanner;

public class orosio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 7 floors, 5 rooms each
        int hotel[][] = new int[7][5];

        int choice;

        do {
            System.out.println("\n=== HOTEL RESERVATION SYSTEM ===");
            System.out.println("1. View Rooms");
            System.out.println("2. Check In");
            System.out.println("3. Check Out");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    // View Rooms
                    for (int i = 6; i >= 0; i--) {
                        System.out.print("Floor " + (i + 1) + ": ");
                        for (int j = 0; j < 5; j++) {
                            System.out.print("[" + hotel[i][j] + "]");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Check In
                    System.out.print("Enter floor (1-7): ");
                    int floorIn = scanner.nextInt();

                    System.out.print("Enter room (1-5): ");
                    int roomIn = scanner.nextInt();

                    if (floorIn >= 1 && floorIn <= 7 && roomIn >= 1 && roomIn <= 5) {
                        if (hotel[floorIn - 1][roomIn - 1] == 0) {
                            hotel[floorIn - 1][roomIn - 1] = 1;
                            System.out.println("Check-in successful!");
                        } else {
                            System.out.println("Room already occupied.");
                        }
                    } else {
                        System.out.println("Invalid floor or room number.");
                    }
                    break;

                case 3:
                    // Check Out
                    System.out.print("Enter floor (1-7): ");
                    int floorOut = scanner.nextInt();

                    System.out.print("Enter room (1-5): ");
                    int roomOut = scanner.nextInt();

                    if (floorOut >= 1 && floorOut <= 7 && roomOut >= 1 && roomOut <= 5) {
                        if (hotel[floorOut - 1][roomOut - 1] == 1) {
                            hotel[floorOut - 1][roomOut - 1] = 0;
                            System.out.println("Check-out successful!");
                        } else {
                            System.out.println("Room already empty.");
                        }
                    } else {
                        System.out.println("Invalid floor or room number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}