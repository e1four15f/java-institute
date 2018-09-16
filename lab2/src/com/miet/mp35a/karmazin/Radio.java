package com.miet.mp35a.karmazin;

/**
 * �����.
 *
 * @author Me :)
 */
public class Radio {
    /** ������� �������. */
    private String currentStation;

    /**
     * ������ ������� ������������.
     *
     * @param currentStation �������� ������������.
     */
    public void SetCurrentStation(String currentStation) {
        Main.view("�� ����� �������� ������� " + currentStation);
        this.currentStation = currentStation;
    }
    /** ������ ������. */
    private boolean working;

    /**
     * ������������� ����� {@link Radio#currentStation}, {@link Radio#working}.
     */
    public Radio() {
        currentStation = null;
        working = false;
    }

    /**
     * ������ ������ �����.
     *
     * @throws Exception ������, ���� �� ������� ������������.
     */
    public void PlayTunes() throws Exception {
        if(currentStation != null)
        {
            working = true;
            Main.view("������ ������ �� ������� " + currentStation);
        } else {
            throw new Exception("\u001B[31m" + "�� ������� ������������" + "\u001B[0m");
        }
    }
}
