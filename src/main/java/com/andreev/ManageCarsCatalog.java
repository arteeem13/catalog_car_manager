package com.andreev;

import java.util.Scanner;

import static com.andreev.AppMenu.*;
import static com.andreev.Message.showMessageBye;
import static com.andreev.Message.showMessageError;


public class ManageCarsCatalog {

    public static void manageCarsCatalog() {
        showMainMenu();
        int commandMainMenu = new Scanner(System.in).nextInt();
        if (commandMainMenu == 1) {
            showCatalogMenu();
            int commandCarType = new Scanner(System.in).nextInt();

            switch (commandCarType) {
                case 1:
                    CatalogRacingCars.getRacingCarsCatalog();
                    break;
                case 2:
                    CatalogCityCars.getCityCarsCatalog();
                    break;
                case 9:
                    manageCarsCatalog();
                    break;
                case 0:
                    showMessageBye();
                    break;
                default:
                    showMessageError();
                    break;
            }
        } else if (commandMainMenu == 2) {
            showNewCarMenu();
            int commandNewCarType = new Scanner(System.in).nextInt();

            switch (commandNewCarType) {
                case 1:
                    CatalogRacingCars.addNewRacingCar();
                    break;
                case 2:
                    CatalogCityCars.addNewCityCar();
                    break;
                case 9:
                    manageCarsCatalog();
                    break;
                case 0:
                    showMessageBye();
                    break;
                default:
                    showMessageError();
            }
        } else if (commandMainMenu == 0) {
            showMessageBye();
        } else {
            showMessageError();
        }
    }
}
