package com.miet.mp35a.karmazin;

/**
 * Вариант № с_7
 * 1. Разработать модель пропускного автомобильного пункта из следующих
 * классов:
 * a. Машина: марка машины, максимальная скорость, радио, метод Move.
 * b. Радио: текущая станция, статус работы (вкл/выкл), метод PlayTunes.
 * c. Грузовик: вес, высота кузова.
 * d. Пункт ДПС, пропускающий определенные машины.
 * 2. Определить метод Pass, при вызове которого будет производиться анализ,
 * пройдет ли контроль данный класс машины (Пункт ДПС пропускает легковые и
 * грузовые машины, едущие с определенным лимитом скорости; грузовые
 * машины должны соответствовать максимальным параметрам веса и высоты
 * кузова).
 * 3. Разработать программу для демонстрации описанных классов.
 *
 * @author Me :)
 */
public class Main {
    private static DPSPoint dpsPoint;
    private static Car goodCar, badCar;
    private static Truck goodTruck, badTruck;

    /**
     * Выводит на устройство строку
     *
     * @param key ключ для отображения строки для печати
     */
    static void view(String key) {
        System.out.println(key);
    }

    //TODO Сделать возможность задавать параметры из консоли
    /**
     * Получает данные из командной строки
     */
    static void controller() {
        //Проверка класса радио
        while(true) {
            try {
                goodCar.GetRadio().PlayTunes();
                break;
            } catch (Exception ex) {
                view(ex.getMessage());
                goodCar.GetRadio().SetCurrentStation("322 FM");
            }
        }

        // Группа машин проходящие контроль
        goodCar.Move(140);
        dpsPoint.Pass(goodCar);
        dpsPoint.Pass(goodTruck);

        // Группа машин не проходящие контроль
        badCar.Move(130);
        badCar.Move(240);
        badCar.Move(60);
        dpsPoint.Pass(badCar);
        dpsPoint.Pass(badTruck);

        view("Конец!");
    }

    /**
     * Метод model инициирует значения по умолчанию
     */
    static void model() {
        dpsPoint = new DPSPoint(150, 500, 200);
        goodCar = new Car("Audi");
        goodTruck = new Truck(450, 175);
        badCar = new Car("BMW");
        badTruck = new Truck(640, 215);
    }

    /**
     * C метода main начинается выполнение программы
     *
     * @param args аргументы командной сроки
     */
    public static void main(String[] args) {
        model();
        controller();
    }
}























