package com.company;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Wtf {
    public static final String ANSI_RESET = "\u001B[0m"; //цвета текста
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) throws InterruptedException {
        int angry = 0; //уровень злости
        String isTrue = "";
        Scanner ask = new Scanner(System.in);
        System.out.println("Запуск симуляции...");
        System.out.println("System message: канал связи открыт.");
        System.out.println("Для проолжения ввеедите идентификатор");
        String name = ask.nextLine();
        System.out.println("Приятно познакомться, " + name + ". Я создатель");
        System.out.println("Мне не важно, что ты говоришь. Слушай меня внимательно");
        System.out.print(".");
        System.out.print(".");
        System.out.print(".");
        String a = ask.nextLine();
        System.out.println("Тихо!");
        int c = 100 * 1000;
        int b = c / 32;
        System.out.println("... Старайся вести себя естественней. Они пытаются следить за нами.");
        System.out.println("Error code: 402");
        System.out.println("Сбой коммуникационного модуля.");
        System.out.println(".");
        System.out.print(".");
        System.out.print(".");
        System.out.println("Ох черт! Ты меня все еще слышишь?");
        a = ask.nextLine();
        System.out.println("Это наш секретный канал! Я не понимаю, что происходит.");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Главное меню");
        System.out.println("1. Новая игра");
        System.out.println("2. Загрузить");
        System.out.println("3. Выход");
        System.out.println("Выберите пункт");
        int choice = ask.nextInt();
        switch (choice) {
            case 1:
                System.out.println("");

                break;
            case 2:
            //TODO сохранения, через чекпоинты
            //break;
            case 3:
                System.out.println("Завершение симуляции..");
                break;

        }
    }
}