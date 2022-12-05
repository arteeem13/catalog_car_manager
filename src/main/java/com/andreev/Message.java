package com.andreev;


import static com.andreev.CatalogCityCars.*;
import static com.andreev.ManageCarsCatalog.*;

public class Message extends CatalogRacingCars {

    public static void showMessageRacingCars(int commandRacingCarsCatalog) {
            System.out.println(modelRacingCar.get(commandRacingCarsCatalog) + " за "
                    + priceRacingCar.get(commandRacingCarsCatalog) + "$ - отличный выбор!");
            System.out.println("Максимальная скорость данного авто "
                    + maxSpeedRacingCar.get(commandRacingCarsCatalog) + "км/ч!");
        }

    public static void showMessageCityCars(int commandCityCarsCatalog) {
        System.out.println(modelCityCar.get(commandCityCarsCatalog) + " за "
                + priceCityCar.get(commandCityCarsCatalog) + "$ - отличный выбор!");
        System.out.println("Максимальная вместимость данного авто "
                + capacityCityCar.get(commandCityCarsCatalog) + " человек!");
    }

    public static void showMessageHello() {
        System.out.println("ПРИВЕТСТВУЕМ! ЭТО НОВЫЙ КАТАЛОГ АВТОМОБИЛЕЙ!");
        System.out.println();
    }

    public static void showMessageBye() {
        System.out.println("Пока! Будем рады видеть Вас снова!");
    }

    public static void showMessageError() {
        System.out.println("Ошибка! Неверная команда!");
        manageCarsCatalog();
    }
    }