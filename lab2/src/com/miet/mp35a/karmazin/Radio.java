package com.miet.mp35a.karmazin;

/**
 * Радио.
 *
 * @author Me :)
 */
public class Radio {
    /** Текущая станция. */
    private String currentStation;

    /**
     * Задать текущую радиостанцию.
     *
     * @param currentStation название радиостанции.
     */
    public void SetCurrentStation(String currentStation) {
        Main.view("На радио включена станция " + currentStation);
        this.currentStation = currentStation;
    }
    /** Статус работы. */
    private boolean working;

    /**
     * Инициализация полей {@link Radio#currentStation}, {@link Radio#working}.
     */
    public Radio() {
        currentStation = null;
        working = false;
    }

    /**
     * Запуск работы радио.
     *
     * @throws Exception Ошибка, если не выбрана радиостанция.
     */
    public void PlayTunes() throws Exception {
        if(currentStation != null)
        {
            working = true;
            Main.view("Играет музыка со станции " + currentStation);
        } else {
            throw new Exception("\u001B[31m" + "Не выбрана радиостанция" + "\u001B[0m");
        }
    }
}
