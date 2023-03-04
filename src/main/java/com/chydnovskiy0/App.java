package com.chydnovskiy0;

/**
 * 1. Реализовать класс ListException, EmptyListException и FullListException
 * <p>
 * ListException является наследником класса Exception
 * EmptyListException наследуюет класс ListException
 * FullListException также наследуюет класс ListException
 * <p>
 * 2. В классе List добавить исключительные ситуации в методы:
 * - removeLast() на тот случай, если производится попытка удаления элемента
 * из пустого массива obj (исключение типа EmptyListException)
 * <p>
 * - add() на тот случай, если массив obj полностью заполнен данными  (исключение типа FullListException)
 * <p>
 * 3. Привести пример работы с классом List<E>. Воспроизвести исключения EmptyListException и FullListException,
 * перехватить эти исключения в блоке try...catch и вывести сообщения на экаран
 */
public class App {
    public static void main(String[] args) {
        try {
            run();
        } catch (FullListException | EmptyListException e) {
            e.printStackTrace();
        }
    }

    private static void run() throws FullListException, EmptyListException {
        final int LIST_SIZE = 10;
        List<Integer> list = getList(LIST_SIZE);
        printList(LIST_SIZE, list);

        //1.
        //when list is full, and we wont added new element
        //list.add(99);  // FullListException

        //2.
        //when size = 1, and add new element, after remove added element
//        List<Object> objectList = new List<>(1);
//        objectList.add(1);
//        objectList.removeLast();

        //3.
        //when size = 0, and add new element
//        List<Object> objectList = new List<>(0);
//        objectList.add(1);

        //4.
        //when size = 0 and remove last element
        List<Object> objectList = new List<>(0);
        objectList.removeLast(); //EmptyListException
    }

    private static void printList(int LIST_SIZE, List<Integer> list) {
        for (int i = 0; i < LIST_SIZE; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private static List<Integer> getList(int size) throws FullListException {
        List<Integer> list = new List<>(size);
        for (int i = 0; i < size; i++) {
            list.add(i + 1);
        }
        return list;
    }
}
