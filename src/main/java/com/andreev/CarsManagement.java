package com.andreev;


import static com.andreev.CatalogCityCars.*;
import static com.andreev.CatalogRacingCars.*;
import static com.andreev.ManageCarsCatalog.*;
import static com.andreev.Message.*;

public class CarsManagement {

    public static void main(String[] args) {
        showMessageHello();
        initRacingCarsCatalog();
        initCityCarsCatalog();
        manageCarsCatalog();
    }
}
