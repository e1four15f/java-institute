package com.miet.mp35a.karmazin;

/**
 * Пункт ДПС, пропускающий определенные машины.
 *
 * @author Me :)
 */
public class DPSPoint {
    /** Лимит максимальной скорости. */
    private int speedLimit;
    /** Максимальный параметр веса. */
    private int maxWeight;
    /** Максимальный параметр высоты кузова. */
    private int maxBodyHeight;

    /**
     * Инициализация полей {@link DPSPoint#speedLimit}, {@link DPSPoint#maxWeight},
     * {@link DPSPoint#maxBodyHeight}.
     *
     * @param speedLimit лимит максимальной скорости.
     * @param maxBodyHeight максимальный параметр веса.
     * @param maxWeight максимальный параметр высоты кузова.
     */
    public DPSPoint(int speedLimit, int maxWeight, int maxBodyHeight) {
        this.speedLimit = speedLimit;
        this.maxWeight = maxWeight;
        this.maxBodyHeight = maxBodyHeight;
        Main.view("Создан пункт ДПС с параметрами speedLimit: " + speedLimit +
                ", maxWeight: " + maxWeight + ", maxBodyHeight: " + maxBodyHeight);
    }

    /**
     * Проверка пройдет ли легковая машина контроль.
     *
     * @param car легковая машина для проверки.
     * @return результат проверки контроля.
     */
    public boolean Pass(Car car) {
        boolean result = car.maxVelocity <= speedLimit;
        if(result) {
            Main.view("Легковая машина " + car.brand + " проходит!");
        } else {
            Main.view("Легковая машина " + car.brand + " не проходит!");
        }
        return result;
    }

    /**
     * Проверка пройдет ли грузовик контроль.
     *
     * @param truck грузовая машина для проверки.
     * @return результат проверки контроля.
     */
    public boolean Pass(Truck truck) {
        boolean result = truck.weight <= maxWeight && truck.bodyHeight <= maxBodyHeight;
        if(result) {
            Main.view("Грузовик " + truck.weight + ", " + truck.bodyHeight +  " проходит!");
        } else {
            Main.view("Грузовик " + truck.weight + ", " + truck.bodyHeight +  " не проходит!");
        }
        return result;
    }
}
