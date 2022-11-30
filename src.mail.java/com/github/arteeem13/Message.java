package com.github.arteeem13;

import static com.github.arteeem13.ManageCarsCatalog.manageCarsCatalog;

public class Message extends CatalogRacingCars {

    public static void showMessageRacingCars(int commandRacingCarsCatalog) {
            System.out.println(CatalogRacingCars.modelRacingCar.get(commandRacingCarsCatalog) + " за "
                    + CatalogRacingCars.priceRacingCar.get(commandRacingCarsCatalog) + "$ - отличный выбор!");
            System.out.println("Максимальная скорость данного авто "
                    + CatalogRacingCars.maxSpeedRacingCar.get(commandRacingCarsCatalog) + "км/ч!");
        }

    public static void showMessageCityCars(int commandCityCarsCatalog) {
        System.out.println(CatalogCityCars.modelCityCar.get(commandCityCarsCatalog) + " за "
                + CatalogCityCars.priceCityCar.get(commandCityCarsCatalog) + "$ - отличный выбор!");
        System.out.println("Максимальная вместимость данного авто "
                + CatalogCityCars.capacityCityCar.get(commandCityCarsCatalog) + " человек!");
    }

    public static void showMessageHello() {
        System.out.println("ПРИВЕТСТВУЕМ! ЭТО НОВЫЙ КАТАЛОГ АВТОМОБИЛЕЙ!");
        System.out.println();
    }

    public static void showMessageBye() {
        System.out.println("Пока! Будем рады видеть Вас снова!");
        return;
    }

    public static void showMessageError() {
        System.out.println("Ошибка! Неверная команда!");
        manageCarsCatalog();
    }
    }