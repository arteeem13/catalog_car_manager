package com.andreev;

import java.util.HashMap;
import java.util.Scanner;

import static com.andreev.ManageCarsCatalog.*;
import static com.andreev.Message.*;


public class CatalogRacingCars {

    protected static HashMap<Integer, String> modelRacingCar = new HashMap<>();
    protected static HashMap<Integer, Double> priceRacingCar = new HashMap<>();
    protected static HashMap<Integer, Double> maxSpeedRacingCar = new HashMap<>();

    public static void initRacingCarsCatalog() {
        modelRacingCar.put(0, "BMW");
        priceRacingCar.put(0, 20000.0);
        maxSpeedRacingCar.put(0, 300.0);

        modelRacingCar.put(1, "Toyota");
        priceRacingCar.put(1, 18000.5);
        maxSpeedRacingCar.put(1, 250.0);

        modelRacingCar.put(2, "Ferrari");
        priceRacingCar.put(2, 100000.0);
        maxSpeedRacingCar.put(2, 400.0);
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
            showMessageRacingCars(command - 1);
        else if (command == 9)
            manageCarsCatalog();
        else if (command == 0)
            showMessageBye();
        else
            showMessageError();
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

        manageCarsCatalog();
    }
}
