package com.miet.mp35a.karmazin;

/**
 * �������� ������.
 *
 * @author Me :)
 */
public class Car {
    /** ����� ������. */
    public String brand;
    /** ������������ ��������. */
    public int maxVelocity;


    /** �����. */
    private Radio radio;
    public Radio GetRadio() {
        return radio;
    }

    /**
     * ������������� ����� {@link Car#brand}, {@link Car#maxVelocity},
     * {@link Car#radio}.
     *
     * @param brand ����� ������.
     */
    public Car(String brand) {
        this.brand = brand;
        this.maxVelocity = 0;
        this.radio = new Radio();
        Main.view("������� �������� ������ " + brand);
    }

    /**
     * ����� ������ ��������
     *
     * @param velocity �������� ������.
     */
    public void Move(int velocity) {
        if(velocity > maxVelocity) {
            maxVelocity = velocity;
            Main.view("������ " + brand + " ��������� ������������ �������� " + maxVelocity);
        }
    }
}
