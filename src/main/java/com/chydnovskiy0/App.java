package com.chydnovskiy0;

/**
 * 1. Реализовать класс ListException, EmptyListException и FullListException
 *
 * ListException является наследником класса Exception
 * EmptyListException наследуюет класс ListException
 * FullListException также наследуюет класс ListException
 *
 * 2. В классе List добавить исключительные ситуации в методы:
 *
 * 	- removeLast() на тот случай, если производится попытка удаления элемента
 * 	  из пустого массива obj (исключение типа EmptyListException)
 *
 * 	- add() на тот случай, если массив obj полностью заполнен данными  (исключение типа FullListException)
 *
 * 3. Привести пример работы с классом List<E>. Воспроизвести исключения EmptyListException и FullListException,
 *     перехватить эти исключения в блоке try...catch и вывести сообщения на экаран
 */
public class App {
    public static void main(String[] args) {
        run();
    }

    private static void run() {

    }
}
