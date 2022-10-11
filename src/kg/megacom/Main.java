package kg.megacom;

import kg.megacom.models.HeavyBox;
import kg.megacom.service.BoxService;
import kg.megacom.service.impl.BoxServiceImpl;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


//        Создать динамический массив, содержащий объекты класса HeavyBox.
//        Распечатать его содержимое используя for each.
//        Изменить вес первого ящика на 1.
//        Удалить последний ящик.
//        Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
//        Удалить все ящики.

        BoxService boxService = new BoxServiceImpl();

        System.out.println("--#1--");//Создать динамический массив, содержащий объекты класса HeavyBox.
        ArrayList<HeavyBox> boxList = new ArrayList<>();
        System.out.println("Добавление в список");
        boxList.add(new HeavyBox("box1", 55));
        boxList.add(new HeavyBox("box2", 16));
        boxList.add(new HeavyBox("box3", 35));
        boxList.add(new HeavyBox("box4", 60));

        System.out.println("--#2--");//Распечатать его содержимое используя for each.
        boxList.forEach(System.out::println);

        System.out.println("--#3--");//Изменить вес первого ящика на 1.
        boxService.changeWeight(boxList.get(0));
        System.out.println(boxList.get(0));

        System.out.println("--#4--"); //Удалить последний ящик.
        boxList.remove(boxList.size() - 1);
        for (HeavyBox item : boxList) {
            System.out.println(item);
        }
        System.out.println("--#5--");//Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
        System.out.println("--#5.1--");
        System.out.println(boxList);

        System.out.println("--#5.2--");
        for (HeavyBox item : boxList) {
            System.out.println(item);
        }

        System.out.println("--#5.3--");
        for (int i = 0; i < boxList.size(); i++) {
            System.out.println(boxList.get(i));
        }

        System.out.println("--#6--");//Удалить все ящики.
        boxList.clear();
        System.out.println(boxList);

    }
}
