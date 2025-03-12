package app;

import services.GarageManager;

public class GarageApp {
    public static void run() {
            GarageManager myGarageManager = new GarageManager();
            System.out.println("Hello User, welcome to your garage app.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("What would you like to do?:\n - view \n - add");
            String response = myGarageManager.getSc().nextLine();
            if (response.equals("view garage")) {
                System.out.println(myGarageManager.getMyGarage());
            } else if (response.equals("add")) {
                myGarageManager.addToGarage();
            }

    }

}

