package com.miet.mp35a.karmazin;

/**
 * ����� ���, ������������ ������������ ������.
 *
 * @author Me :)
 */
public class DPSPoint {
    /** ����� ������������ ��������. */
    private int speedLimit;
    /** ������������ �������� ����. */
    private int maxWeight;
    /** ������������ �������� ������ ������. */
    private int maxBodyHeight;

    /**
     * ������������� ����� {@link DPSPoint#speedLimit}, {@link DPSPoint#maxWeight},
     * {@link DPSPoint#maxBodyHeight}.
     *
     * @param speedLimit ����� ������������ ��������.
     * @param maxBodyHeight ������������ �������� ����.
     * @param maxWeight ������������ �������� ������ ������.
     */
    public DPSPoint(int speedLimit, int maxWeight, int maxBodyHeight) {
        this.speedLimit = speedLimit;
        this.maxWeight = maxWeight;
        this.maxBodyHeight = maxBodyHeight;
        Main.view("������ ����� ��� � ����������� speedLimit: " + speedLimit +
                ", maxWeight: " + maxWeight + ", maxBodyHeight: " + maxBodyHeight);
    }

    /**
     * �������� ������� �� �������� ������ ��������.
     *
     * @param car �������� ������ ��� ��������.
     * @return ��������� �������� ��������.
     */
    public boolean Pass(Car car) {
        boolean result = car.maxVelocity <= speedLimit;
        if(result) {
            Main.view("�������� ������ " + car.brand + " ��������!");
        } else {
            Main.view("�������� ������ " + car.brand + " �� ��������!");
        }
        return result;
    }

    /**
     * �������� ������� �� �������� ��������.
     *
     * @param truck �������� ������ ��� ��������.
     * @return ��������� �������� ��������.
     */
    public boolean Pass(Truck truck) {
        boolean result = truck.weight <= maxWeight && truck.bodyHeight <= maxBodyHeight;
        if(result) {
            Main.view("�������� " + truck.weight + ", " + truck.bodyHeight +  " ��������!");
        } else {
            Main.view("�������� " + truck.weight + ", " + truck.bodyHeight +  " �� ��������!");
        }
        return result;
    }
}
