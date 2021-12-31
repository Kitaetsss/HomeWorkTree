package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int ios = 1;
        int clientDeviceYear = 2015;
        int clientIos = 2017;
        int clientAndroid = 2013;
        if (ios <= 1 && clientIos >= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (ios >= 10 && clientIos <= clientDeviceYear) {
            System.out.println("Установите версию приложения для android по ссылке");
        }
        int android = 10;
        if (android <= 1 && clientAndroid >= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (android >= 10 && clientAndroid <= clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        }
        System.out.println("Задание номер 3");

        int year = 2021;
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " не является высокосным");
        }

        System.out.println("Задание номер 4");

        int deliveryDistance = 95;
        int days = 0;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60 && deliveryDistance >= 20) {
            days = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            days = 3;
        }
        System.out.println("Потребуется дней " + days);

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
