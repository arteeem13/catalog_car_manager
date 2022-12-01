package com.github.arteeem13;

public class AppMenu {

    public static void showMainMenu() {
        System.out.println("Выберите нужную команду:");
        System.out.println("[1] - открыть каталог");
        System.out.println("[2] - добавить авто");
        System.out.println("[0] - выйти");
    }

    public static void showCatalogMenu() {
        System.out.println("Какой тип автомобиля Вас интересует?");
        System.out.println("[1] - спортивный");
        System.out.println("[2] - для городской езды");
        System.out.println("[9] - вернуться в главное меню");
        System.out.println("[0] - выйти");
    }

    public static void showNewCarMenu() {
        System.out.println("Какой тип автомобиля Вы хотите добавить?");
        System.out.println("[1] - спортивный");
        System.out.println("[2] - для городской езды");
        System.out.println("[9] - вернуться в главное меню");
        System.out.println("[0] - выйти");
    }
}
