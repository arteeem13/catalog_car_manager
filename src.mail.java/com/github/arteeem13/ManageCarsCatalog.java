package com.github.arteeem13;

import java.util.Scanner;

import static com.github.arteeem13.AppMenu.*;
import static com.github.arteeem13.CatalogCityCars.addNewCityCar;
import static com.github.arteeem13.CatalogCityCars.getCityCarsCatalog;
import static com.github.arteeem13.CatalogRacingCars.addNewRacingCar;
import static com.github.arteeem13.CatalogRacingCars.getRacingCarsCatalog;
import static com.github.arteeem13.Message.showMessageBye;
import static com.github.arteeem13.Message.showMessageError;

public class ManageCarsCatalog {

    public static void manageCarsCatalog() {
        showMainMenu();
        int commandMainMenu = new Scanner(System.in).nextInt();
        if (commandMainMenu == 1) {
            showCatalogMenu();
            int commandCarType = new Scanner(System.in).nextInt();

            switch (commandCarType) {
                case 1:
                    getRacingCarsCatalog();
                    break;
                case 2:
                    getCityCarsCatalog();
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
                    addNewRacingCar();
                    break;
                case 2:
                    addNewCityCar();
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
