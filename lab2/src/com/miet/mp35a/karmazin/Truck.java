package com.miet.mp35a.karmazin;

/**
 * ��������.
 *
 * @author Me :)
 */
public class Truck {
    /** ��� ���������. */
    public int weight;
    /** ������ ������ ���������. */
    public int bodyHeight;

    /**
     * ������������� ����� {@link Truck#weight}, {@link Truck#bodyHeight}.
     *
     * @param bodyHeight ��� ���������.
     * @param weight ������ ������ ���������.
     */
    public Truck(int weight, int bodyHeight) {
        this.weight = weight;
        this.bodyHeight = bodyHeight;
        Main.view("������ �������� � ����������� weight: " + weight +
                ", bodyHeight: " + bodyHeight);
    }
}
