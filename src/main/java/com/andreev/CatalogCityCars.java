package com.andreev;

import java.util.HashMap;
import java.util.Scanner;

public class CatalogCityCars {

    protected static HashMap<Integer, String> modelCityCar = new HashMap<>();
    protected static HashMap<Integer, Double> priceCityCar = new HashMap<>();
    protected static HashMap<Integer, Integer> capacityCityCar = new HashMap<>();

    public static void initCityCarsCatalog() {
        CityCar cityCarReno = new CityCar(4);
        CityCar cityCarLada = new CityCar(4);
        CityCar cityCarSUV = new CityCar(8);

        modelCityCar.put(0, cityCarReno.getModel());
        priceCityCar.put(0, cityCarReno.getPrice());
        capacityCityCar.put(0, cityCarReno.getCapacity());

        modelCityCar.put(1, cityCarLada.getModel());
        priceCityCar.put(1, cityCarLada.getPrice());
        capacityCityCar.put(1, cityCarLada.getCapacity());

        modelCityCar.put(2, cityCarSUV.getModel());
        priceCityCar.put(2, cityCarSUV.getPrice());
        capacityCityCar.put(2, cityCarSUV.getCapacity());
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
            Message.showMessageCityCars(command - 1);
        else if (command == 9)
            ManageCarsCatalog.manageCarsCatalog();
        else if (command == 0)
            Message.showMessageBye();
        else
            Message.showMessageError();
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
        ManageCarsCatalog.manageCarsCatalog();
    }
}
