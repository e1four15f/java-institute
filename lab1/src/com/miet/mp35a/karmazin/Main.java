package com.miet.mp35a.karmazin;

import java.util.Scanner;

/**
 *Класс определяет, является ли введенное пользователем число палиндромом
 *(например 121, 12321, 454), в случае положительного ответа предусматривается
 *проверка на принадлежность к классу палиндромов квадрата данного числа.
 * @author Me :)
 */
public class Main {
    /**
     * Переменная poly хранит информацию о введённом числе
     */
    public static long poly;

    /**
     * Метод view - выводит на устройство строку
     * @param key передаем ключ для отображения строки для печати
     */
    static void view(String key) {
        System.out.println(key);
    }

    /**
     * Метод controller - получает данные из командной строки и
     * сохраняет их в глобальной переменной poly
     */
    static void controller() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            view("Введите число: ");
            try {
                poly = Integer.parseInt(scan.nextLine());
                break;
            }
            catch(Exception ex) {
                view("Введено не число!");
            }
        }
        scan.close();
        view("Ваше число: " + poly);

        if (IsPoly(poly)) {
            view("Число " + poly + " является палиндромом!");
        } else {
            view("Число " + poly + " не является палиндромом!");
        }

        long polySquared = (long)Math.pow(poly, 2);
        if (IsPoly(polySquared)) {
            view("Квадрат числа " + poly + " равен " + polySquared + " и является палиндромом!");
        } else {
            view("Квадрат числа " + poly + " равен " + polySquared + " и не является палиндромом!");
        }

        view("Конец!");
    }

    /**
     * Метод IsPoly - проверяет является ли число poly
     * палиндромом и возвращает boolean
     * @param poly передаем число для проверки
     * @return True/False является ли число палиндромом
     */
    static boolean IsPoly(long poly) {
        boolean isPoly = false;

        long temp = poly;
        long b = 0;
        while(temp != 0) {
            b = b * 10 + temp % 10;
            temp /= 10;
        }

        if (poly == b) {
            isPoly = true;
        }

        return isPoly;
    }

    /**
     * Метод model инициирует poly значениями по умолчанию
     */
    static void model() {
        poly = 0;
    }

    /**
     * C метода main начинается выполнение программы
     * @param args аргументы командной сроки
     */
    public static void main(String[] args) {
        model();
        controller();
    }
}























