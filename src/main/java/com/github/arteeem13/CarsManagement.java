package com.github.arteeem13;

import static com.github.arteeem13.CatalogCityCars.initCityCarsCatalog;
import static com.github.arteeem13.CatalogRacingCars.initRacingCarsCatalog;


public class CarsManagement {

    public static void main(String[] args) {
        Message.showMessageHello();
        initRacingCarsCatalog();
        initCityCarsCatalog();
        ManageCarsCatalog.manageCarsCatalog();
    }
}
