# catalog_car_manager

## Описание проекта
### Приложение catalog_car_manager создано для работы с каталогом автомабилей менеджерами.
### Функциональность позволяет просматривать имеющиеся авто и добавлять новые. На данный момент реализовано
### 2 типа автомобилей: спортивные и для городской езды, но при необходимости можно расширить список доступных
### типов авто.

## Описание классов
### 1. Car - родительский класс для всех типов автомобилей. Имеет два поля: price и madel
### 2. RacingCar и CityСar - потомки Car. Обладают свойствами Car и имеют свои особенные.
### Для спортивных автомобилей это максимальная скорость, для городских авто вместимсоть.
### 3. В классах CatalogCityCars и CatalogRacingCars реализованы функции по получению данных каталога и
### созданию автомобилей
### 4. В AppMenu релизованы меню приложения, в Message основные функции выхываемых сообщений транслируемых
### пользователю во время действий
### 5. ManageCarsCatalog содржит логику ветвления при работе с приложением
### 6. CarsManagement содержит функцию main. При запуске сначала инициализируются каталоги
### initRacingCarsCatalog, initCityCarsCatalog. Затем запускается работа с системой manageCarsCatalog