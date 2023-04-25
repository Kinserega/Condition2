public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    } public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }

    } public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int jear = 2010;
        if (clientOS == 1) {
            if (jear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (jear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }}
    } public static void task3() {
        System.out.println("Задача 3");
        int jear = 2400;
        if ((jear % 4 == 0) && (jear % 100 != 0)) {
            System.out.println(jear + " год является високосным.");
        } else if ((jear % 4 == 0) && (jear % 100 == 0) && (jear % 400 == 0)) {
            System.out.println(jear + " год является високосным.");
        } else {
            System.out.println(jear + " год  не является високосным.");
        }

    } public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance =95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <=60){
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <=100){
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else {
            System.out.println("Доставки нет");
        }
    } public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 111:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}