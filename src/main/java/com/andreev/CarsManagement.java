package com.andreev;


public class CarsManagement {

    public static void main(String[] args) {
        Message.showMessageHello();
        CatalogRacingCars.initRacingCarsCatalog();
        CatalogCityCars.initCityCarsCatalog();
        ManageCarsCatalog.manageCarsCatalog();
    }
}
