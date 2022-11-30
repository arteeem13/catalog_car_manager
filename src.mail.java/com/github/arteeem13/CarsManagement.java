package com.github.arteeem13;

import static com.github.arteeem13.CatalogCityCars.initCityCarsCatalog;
import static com.github.arteeem13.CatalogRacingCars.initRacingCarsCatalog;
import static com.github.arteeem13.Message.showMessageHello;
import static com.github.arteeem13.ManageCarsCatalog.manageCarsCatalog;

public class CarsManagement {

    public static void main(String[] args) {
        showMessageHello();
        initRacingCarsCatalog();
        initCityCarsCatalog();
        manageCarsCatalog();
    }
}
