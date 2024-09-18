package main;

/*
Создать массив объектов класса согласно заданию.
Инициализацию значений полей осуществить с помощью различных конструкторов.
 В классе предусмотреть геттеры, метод, осуществляющий вывод на экран монитора
  соответствующую информацию об объекте и перегруженные конструкторы.

Предусмотреть статические методы подсчёта данных (на основе индивидуального задания).
Главный класс с методом main должен находиться в другом пакете.

Состав класса Tribe (племя): название, численность. знакомство с огнем.
 Подсчитать общую численность и количество племен знакомых с огнем.
*/

import design_classes.Console;
import design_classes.Design;
import design_classes.Developer;
import design_classes.Message;
import menu_class.MenuMain;
import tribe_classes.TribeLinkedList;
import tribe_classes.TribeNode;
import tribe_classes.Tribe;
import tribe_classes.WriterInfo;

public class Main
{
    public static void main(String[] args)
    {
        TribeLinkedList linkedList = new TribeLinkedList();
        objectCreation(linkedList);
        MenuMain menu = new MenuMain();
        while (true)
        {
            menu.menuOfMain();
            switch(menu.getChoice())
            {
                case '1':
                    Console.clear();
                    WriterInfo.printAllTribes(linkedList);
                    Message.waitForEnter();
                    break;
                case '2':
                    Console.clear();
                    linkedList.doTaskOfLab();
                    Message.waitForEnter();
                    break;
                case '3':
                    Console.clear();
                    Developer.printInfoOfDeveloper();
                    Message.waitForEnter();
                    break;
                case '4':
                    Console.clear();
                    Message.printMessage("Осуществляем выход из программы...", Design.PURPLE, Design.RED);
                    System.exit(0);
                default:
                    Console.clear();
                    Message.printMessage("Выбран некорректный номер задачи...", Design.PURPLE, Design.RED);
                    Message.waitForEnter();
            }
        }
    }
    public static void objectCreation(TribeLinkedList list)
    {
        list.addTribeNode(new TribeNode(new Tribe("Гонкары", true)));
        list.addTribeNode(new TribeNode(new Tribe("Ацтеки", "25000", true)));
        list.addTribeNode(new TribeNode(new Tribe("Курабура", "456750", false)));
        list.addTribeNode(new TribeNode(new Tribe()));
        list.addTribeNode(new TribeNode(new Tribe("Динопары" , false)));
        list.addTribeNode(new TribeNode(new Tribe("Франки", "500000", true)));
        list.addTribeNode(new TribeNode(new Tribe()));
        list.addTribeNode(new TribeNode(new Tribe("Бгуиры", true)));
        list.addTribeNode(new TribeNode(new Tribe()));
        list.addTribeNode(new TribeNode(new Tribe("Друзи", "1200", false)));
    }
}
