package com.miet.mp35a.karmazin;

import java.util.Scanner;

/**
 *����� ����������, �������� �� ��������� ������������� ����� �����������
 *(�������� 121, 12321, 454), � ������ �������������� ������ �����������������
 *�������� �� �������������� � ������ ����������� �������� ������� �����.
 * @author Me :)
 */
public class Main {
    /**
     * ���������� poly ������ ���������� � �������� �����
     */
    public static long poly;

    /**
     * ����� view - ������� �� ���������� ������
     * @param key �������� ���� ��� ����������� ������ ��� ������
     */
    static void view(String key) {
        System.out.println(key);
    }

    /**
     * ����� controller - �������� ������ �� ��������� ������ �
     * ��������� �� � ���������� ���������� poly
     */
    static void controller() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            view("������� �����: ");
            try {
                poly = Integer.parseInt(scan.nextLine());
                break;
            }
            catch(Exception ex) {
                view("������� �� �����!");
            }
        }
        scan.close();
        view("���� �����: " + poly);

        if (IsPoly(poly)) {
            view("����� " + poly + " �������� �����������!");
        } else {
            view("����� " + poly + " �� �������� �����������!");
        }

        long polySquared = (long)Math.pow(poly, 2);
        if (IsPoly(polySquared)) {
            view("������� ����� " + poly + " ����� " + polySquared + " � �������� �����������!");
        } else {
            view("������� ����� " + poly + " ����� " + polySquared + " � �� �������� �����������!");
        }

        view("�����!");
    }

    /**
     * ����� IsPoly - ��������� �������� �� ����� poly
     * ����������� � ���������� boolean
     * @param poly �������� ����� ��� ��������
     * @return True/False �������� �� ����� �����������
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
     * ����� model ���������� poly ���������� �� ���������
     */
    static void model() {
        poly = 0;
    }

    /**
     * C ������ main ���������� ���������� ���������
     * @param args ��������� ��������� �����
     */
    public static void main(String[] args) {
        model();
        controller();
    }
}























