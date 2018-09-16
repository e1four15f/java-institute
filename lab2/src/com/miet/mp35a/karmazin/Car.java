package com.miet.mp35a.karmazin;

/**
 * Легковая машина.
 *
 * @author Me :)
 */
public class Car {
    /** Марка машины. */
    public String brand;
    /** Максимальная скорость. */
    public int maxVelocity;


    /** Радио. */
    private Radio radio;
    public Radio GetRadio() {
        return radio;
    }

    /**
     * Инициализация полей {@link Car#brand}, {@link Car#maxVelocity},
     * {@link Car#radio}.
     *
     * @param brand марка машины.
     */
    public Car(String brand) {
        this.brand = brand;
        this.maxVelocity = 0;
        this.radio = new Radio();
        Main.view("Создана легковая машина " + brand);
    }

    /**
     * Задаёт машине скорость
     *
     * @param velocity скорость машины.
     */
    public void Move(int velocity) {
        if(velocity > maxVelocity) {
            maxVelocity = velocity;
            Main.view("Машина " + brand + " достигает максимальной скорости " + maxVelocity);
        }
    }
}
