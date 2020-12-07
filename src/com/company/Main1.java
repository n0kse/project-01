package com.company;

import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main1 {
    public static final String ANSI_RESET = "\u001B[0m"; //цвета текста (6-14)
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static void animationRED(String text) throws InterruptedException { //анимация красный текст
        System.out.println();
        char[] chArray = text.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            System.out.print(ANSI_RED + chArray[i] + ANSI_RESET);
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }

    private static void animationGREEN(String text) throws InterruptedException { //анимация зеленый текст
        System.out.println();
        char[] chArray = text.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            System.out.print(ANSI_GREEN + chArray[i] + ANSI_RESET);
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }

    private static void animationYELLOW(String text) throws InterruptedException { //анимация желтый текст
        System.out.println();
        char[] chArray = text.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            System.out.print(ANSI_YELLOW + chArray[i] + ANSI_RESET);
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }

    private static void animationBLUE(String text) throws InterruptedException { //анимация синий текст
        System.out.println();
        char[] chArray = text.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            System.out.print(ANSI_BLUE + chArray[i] + ANSI_RESET);
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }

    private static void animationPURPLE(String text) throws InterruptedException { //анимация фиолетовый текст
        System.out.println();
        char[] chArray = text.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            System.out.print(ANSI_PURPLE + chArray[i] + ANSI_RESET);
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }

    private static void animationCYAN(String text) throws InterruptedException { //анимация голубой текст
        System.out.println();
        char[] chArray = text.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            System.out.print(ANSI_CYAN + chArray[i] + ANSI_RESET);
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }

    private static void animationBLACK(String text) throws InterruptedException { //анимация черный текст
        System.out.println(text);
    }

    private static void animationWHITE(String text) throws InterruptedException { //анимация белый текст
        System.out.println();
        char[] chArray = text.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            System.out.print(ANSI_WHITE + chArray[i] + ANSI_RESET);
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //intro(); TODO УБРАТЬ КОММЕНТАРИЙ С ЭТОЙ СТРОКИ!!!
        mainMenu();
    }

    public static void intro() throws InterruptedException {
        String text1 = "Запуск симуляции.";
        String text2 = "System message: канал связи открыт.";
        String text3 = "Для продолжения, введите идендификатор.";
        Scanner input = new Scanner(System.in);
        animationBLACK(text1);
        TimeUnit.SECONDS.sleep(1);
        animationYELLOW(text2);
        animationYELLOW(text3);
        System.out.println();
        String name = input.nextLine();
        String text4 = "Приятно познакомиться, " + name + ". Я создатель.";
        String text5 = "Дальнейшие указания помогут выжить тебе.";
        String textEXTRA = "Слушай внимате1101000010111011" +
                "110100011000110011010000101111011101000010111110";
        String text6 = "Error code: 402 \nСбой в работе модуля коммуникации";
        String text7 = name + ", ты меня слышишь?";
        String text8 = "Этого я и боялся. Дела пло⍰⍰";
        String text9 = "System message: канал связи прерван. Unexpected error.";
        TimeUnit.MILLISECONDS.sleep(500);
        animationBLACK(text4);
        TimeUnit.SECONDS.sleep(2);
        animationBLACK(text5);
        TimeUnit.MILLISECONDS.sleep(500);
        animationWHITE(textEXTRA);
        TimeUnit.MILLISECONDS.sleep(500);
        animationRED(text6);
        System.out.println();
        TimeUnit.SECONDS.sleep(3);
        animationBLACK(text7);
        String saySomething = input.nextLine();
        animationBLACK(text8);
        TimeUnit.SECONDS.sleep(5);
        animationRED(text9);
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

    public static void mainMenu() throws InterruptedException {
        String title = "Главное меню";
        animationPURPLE(title); //нет, я не люблю фиолетовый цвет, просто хочу, чтобы эта надпись была фиолетовой!!!
        System.out.println();
        String choice = "Для продолжения введите номер команды БЕЗ точки";
        System.out.println();
        String menu1 = "1. Новая игра";
        String menu2 = "2. Загрузить";
        String menu3 = "3. Помощь";
        String menu4 = "4. Завершение работы";
        TimeUnit.MILLISECONDS.sleep(500);
        animationBLACK(menu1);
        TimeUnit.MILLISECONDS.sleep(500);
        animationBLACK(menu2);
        TimeUnit.MILLISECONDS.sleep(500);
        animationBLACK(menu3);
        TimeUnit.MILLISECONDS.sleep(500);
        animationBLACK(menu4);
        TimeUnit.MILLISECONDS.sleep(500);
        animationRED(choice);
        TimeUnit.SECONDS.sleep(1);
        String answ = JOptionPane.showInputDialog("Введите номер дейсвтия");
        int answ1 = Integer.parseInt(answ.trim());
        switch (answ1) {
            case 1:
                System.out.println("1");
                instruction();
                //String answ = JOptionPane.showInputDialog("Confirm?");
               // System.out.println(answ);

                break;
                /*
                TODO CODE HERE
                break
                 */
            case 2:
                System.out.println("2");
                break;
                /*
                TODO CODE HERE
                break
                 */
            case 3:
                System.out.println("3");
                break;
                /*
                TODO CODE HERE
                break
                 */
            case 4:
                System.out.println("4");
                break;
                /*
                TODO CODE HERE
                break
                 */


        }

    }

    public static void instruction() throws InterruptedException {
        String text1 = "Внимаение! Сейчас вам предстоит прослушать инструктаж";
        String text2 = "От того, как вы усвоите его, зависит ваша жизнь";
        String text3 = "1. При вводе команд, вводите число БЕЗ дополнительных знаков ";
        String text4 = "2. Относитесь к системе коммуникации с осторожностью.";
        String text5 = "Это ваше иденственное спасение";
        String text6 = "3. Выполняйте все указания, чтобы остаться в живых";
        String text7 = "4. Если в ходе игрового процесса возникнет вопрос, введите /help ";
        animationRED(text1);
        TimeUnit.MILLISECONDS.sleep(500);
        animationWHITE(text2);
        TimeUnit.MILLISECONDS.sleep(500);
        animationWHITE(text3);
        TimeUnit.MILLISECONDS.sleep(500);
        animationWHITE(text4);
        TimeUnit.MILLISECONDS.sleep(500);
        animationWHITE(text5);
        TimeUnit.MILLISECONDS.sleep(500);
        animationWHITE(text6);
        TimeUnit.MILLISECONDS.sleep(500);
        animationWHITE(text7);
    }
}
