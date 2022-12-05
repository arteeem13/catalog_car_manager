package com.andreev;

import java.util.HashMap;
import java.util.Scanner;

import static com.andreev.ManageCarsCatalog.*;
import static com.andreev.Message.*;

public class CatalogCityCars {

    protected static HashMap<Integer, String> modelCityCar = new HashMap<>();
    protected static HashMap<Integer, Double> priceCityCar = new HashMap<>();
    protected static HashMap<Integer, Integer> capacityCityCar = new HashMap<>();

    public static void initCityCarsCatalog() {
        modelCityCar.put(0, "Reno");
        priceCityCar.put(0, 15050.0);
        capacityCityCar.put(0, 4);

        modelCityCar.put(1, "Lada");
        priceCityCar.put(1, 8000.7);
        capacityCityCar.put(1, 4);

        modelCityCar.put(2, "SUV");
        priceCityCar.put(2, 16000.0);
        capacityCityCar.put(2, 8);
    }

    public static void getCityCarsCatalog() {

        System.out.println("У нас есть несколько вариантов городских автомобилей:");

        for (int i = 0; i < CatalogCityCars.modelCityCar.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + CatalogCityCars.modelCityCar.get(i));
        }
        System.out.println("[9] - вернуться в главное меню");
        System.out.println("[0] - выйти");

        System.out.println("Выберите понравившуюся модель:");

        int command = new Scanner(System.in).nextInt();

        if (command > 0 && command < CatalogCityCars.modelCityCar.size() + 1)
            showMessageCityCars(command - 1);
        else if (command == 9)
            manageCarsCatalog();
        else if (command == 0)
            showMessageBye();
        else
            showMessageError();
    }

    public static void addNewCityCar() {

        System.out.println("Введите модель автомобиля");
        String model = new Scanner(System.in).nextLine();

        System.out.println("Введите стоимость автомобиля в $");
        double price = new Scanner(System.in).nextDouble();

        System.out.println("Введите вместимость автомобиля");
        int capacity = new Scanner(System.in).nextInt();

        modelCityCar.put(modelCityCar.size(), model);
        priceCityCar.put(priceCityCar.size(), price);
        capacityCityCar.put(capacityCityCar.size(), capacity);

        System.out.println("Городской автомобиль успешно добавлен!");
        manageCarsCatalog();
    }
}
