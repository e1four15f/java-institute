package com.miet.mp35a.karmazin;

/**
 * ������� � �_7
 * 1. ����������� ������ ����������� �������������� ������ �� ���������
 * �������:
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
    private static DPSPoint dpsPoint;
    private static Car goodCar, badCar;
    private static Truck goodTruck, badTruck;

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
        while(true) {
            try {
                goodCar.GetRadio().PlayTunes();
                break;
            } catch (Exception ex) {
                view(ex.getMessage());
                goodCar.GetRadio().SetCurrentStation("322 FM");
            }
        }

        // ������ ����� ���������� ��������
        goodCar.Move(140);
        dpsPoint.Pass(goodCar);
        dpsPoint.Pass(goodTruck);

        // ������ ����� �� ���������� ��������
        badCar.Move(130);
        badCar.Move(240);
        badCar.Move(60);
        dpsPoint.Pass(badCar);
        dpsPoint.Pass(badTruck);

        view("�����!");
    }

    /**
     * ����� model ���������� �������� �� ���������
     */
    static void model() {
        dpsPoint = new DPSPoint(150, 500, 200);
        goodCar = new Car("Audi");
        goodTruck = new Truck(450, 175);
        badCar = new Car("BMW");
        badTruck = new Truck(640, 215);
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























