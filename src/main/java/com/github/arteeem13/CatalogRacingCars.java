package com.github.arteeem13;

import java.util.HashMap;
import java.util.Scanner;


public class CatalogRacingCars {

    protected static HashMap<Integer, String> modelRacingCar = new HashMap<>();
    protected static HashMap<Integer, Double> priceRacingCar = new HashMap<>();
    protected static HashMap<Integer, Double> maxSpeedRacingCar = new HashMap<>();

    public static void initRacingCarsCatalog() {
        RacingCar racingCarBMW = new RacingCar("BMW", 100000, 300);
        RacingCar racingCarToyota = new RacingCar("Toyota", 200000, 250);
        RacingCar racingCarFerrari = new RacingCar("Ferrari", 500000, 400);

        modelRacingCar.put(0, racingCarBMW.getModel());
        priceRacingCar.put(0, racingCarBMW.getPrice());
        maxSpeedRacingCar.put(0, racingCarBMW.getMaxSpeed());

        modelRacingCar.put(1, racingCarToyota.getModel());
        priceRacingCar.put(1, racingCarToyota.getPrice());
        maxSpeedRacingCar.put(1, racingCarToyota.getMaxSpeed());

        modelRacingCar.put(2, racingCarFerrari.getModel());
        priceRacingCar.put(2, racingCarFerrari.getPrice());
        maxSpeedRacingCar.put(2, racingCarFerrari.getMaxSpeed());
    }

    public static void getRacingCarsCatalog() {

        System.out.println("У нас есть несколько вариантов спортивных автомобилей:");

        for (int i = 0; i < CatalogRacingCars.modelRacingCar.size(); i++) {

            System.out.println("[" + (i + 1) + "] " + CatalogRacingCars.modelRacingCar.get(i));
        }
        System.out.println("[9] - вернуться в главное меню");
        System.out.println("[0] - выйти");
        System.out.println("Выберите понравившуюся модель:");

        int command = new Scanner(System.in).nextInt();

        if (command > 0 && command < CatalogRacingCars.modelRacingCar.size() + 1)
            Message.showMessageRacingCars(command - 1);
        else if (command == 9)
            ManageCarsCatalog.manageCarsCatalog();
        else if (command == 0)
            Message.showMessageBye();
        else
            Message.showMessageError();
    }

    public static void addNewRacingCar() {

        System.out.println("Введите модель автомобиля");
        String model = new Scanner(System.in).nextLine();

        System.out.println("Введите стоимость автомобиля в $");
        double price = new Scanner(System.in).nextDouble();

        System.out.println("Введите максимальную скорости автомобиля в км/ч");
        double maxSpeed = new Scanner(System.in).nextDouble();

        modelRacingCar.put(modelRacingCar.size(), model);
        priceRacingCar.put(priceRacingCar.size(), price);
        maxSpeedRacingCar.put(maxSpeedRacingCar.size(), maxSpeed);

        System.out.println("Спортивный автомобиль успешно добавлен!");

        ManageCarsCatalog.manageCarsCatalog();
    }
}
