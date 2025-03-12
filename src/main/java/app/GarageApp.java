package app;

import services.GarageManager;

public class GarageApp {
    public static void run() {
        GarageManager myGarageManager = new GarageManager();

        System.out.println("Hello User, welcome to your garage app.");
        pause(3000);

        System.out.println("What would you like to do?:\n - view \n - add");
        String response = myGarageManager.getScanner().nextLine();

        switch (response) {
            case "view garage":
                System.out.println(myGarageManager.getMyGarage());
                break;
            case "add":
                myGarageManager.addToGarage();
                break;
            default:
                System.out.println("Invalid option. Please choose 'view' or 'add'.");
                break;
        }
    }

    private static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
