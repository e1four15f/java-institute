package com.miet.mp35a.karmazin;

/**
 * Вариант № с_7
 * 1. Разработать модель пропускного автомобильного пункта из следующих
 * классов:\n
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

        // Проверка класса пункта ДПС
        DPSPoint dpsPoint = new DPSPoint(150, 500, 200);

        // Группа машин проходящие контроль
        Car goodCar = new Car("Audi");
        goodCar.Move(140);
        dpsPoint.Pass(goodCar);

        Truck goodTruck = new Truck(450, 175);
        dpsPoint.Pass(goodTruck);

        // Группа машин не проходящие контроль
        Car badCar = new Car("BMW");
        badCar.Move(130);
        badCar.Move(240);
        badCar.Move(60);
        dpsPoint.Pass(badCar);

        Truck badTruck = new Truck(640, 215);
        dpsPoint.Pass(badTruck);

        view("Конец!");
    }

    /**
     * Метод model инициирует значения по умолчанию
     */
    static void model() {

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























