package com.miet.mp35a.karmazin;

/**
 * ������� � �_7
 * 1. ����������� ������ ����������� �������������� ������ �� ���������
 * �������:\n
 * a. ������: ����� ������, ������������ ��������, �����, ����� Move.
 * b. �����: ������� �������, ������ ������ (���/����), ����� PlayTunes.
 * c. ��������: ���, ������ ������.
 * d. ����� ���, ������������ ������������ ������.
 * 2. ���������� ����� Pass, ��� ������ �������� ����� ������������� ������,
 * ������� �� �������� ������ ����� ������ (����� ��� ���������� �������� �
 * �������� ������, ������ � ������������ ������� ��������; ��������
 * ������ ������ ��������������� ������������ ���������� ���� � ������
 * ������).
 * 3. ����������� ��������� ��� ������������ ��������� �������.
 *
 * @author Me :)
 */
public class Main {

    /**
     * ������� �� ���������� ������
     *
     * @param key ���� ��� ����������� ������ ��� ������
     */
    static void view(String key) {
        System.out.println(key);
    }

    //TODO ������� ����������� �������� ��������� �� �������
    /**
     * �������� ������ �� ��������� ������
     */
    static void controller() {
        //�������� ������ �����
        Radio radio = new Radio();
        while(true) {
            try {
                radio.PlayTunes();
                break;
            } catch (Exception ex) {
                radio.SetCurrentStation("322 FM");
                view(ex.getMessage());
            }
        }

        // �������� ������ ������ ���
        DPSPoint dpsPoint = new DPSPoint(150, 500, 200);

        // ������ ����� ���������� ��������
        Car goodCar = new Car("Audi");
        goodCar.Move(140);
        dpsPoint.Pass(goodCar);

        Truck goodTruck = new Truck(450, 175);
        dpsPoint.Pass(goodTruck);

        // ������ ����� �� ���������� ��������
        Car badCar = new Car("BMW");
        badCar.Move(130);
        badCar.Move(240);
        badCar.Move(60);
        dpsPoint.Pass(badCar);

        Truck badTruck = new Truck(640, 215);
        dpsPoint.Pass(badTruck);

        view("�����!");
    }

    /**
     * ����� model ���������� �������� �� ���������
     */
    static void model() {

    }

    /**
     * C ������ main ���������� ���������� ���������
     *
     * @param args ��������� ��������� �����
     */
    public static void main(String[] args) {
        model();
        controller();
    }
}























