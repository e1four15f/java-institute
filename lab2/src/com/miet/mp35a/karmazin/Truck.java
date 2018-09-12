package com.miet.mp35a.karmazin;

/**
 * Грузовик.
 *
 * @author Me :)
 */
public class Truck {
    /** Вес грузовика. */
    public int weight;
    /** Высота кузова грузовика. */
    public int bodyHeight;

    /**
     * Инициализация полей {@link Truck#weight}, {@link Truck#bodyHeight}.
     *
     * @param bodyHeight вес грузовика.
     * @param weight высота кузова грузовика.
     */
    public Truck(int weight, int bodyHeight) {
        this.weight = weight;
        this.bodyHeight = bodyHeight;
        Main.view("Создан грузовик с параметрами weight: " + weight +
                ", bodyHeight: " + bodyHeight);
    }
}
