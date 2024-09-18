package tribe_classes;

import design_classes.Design;
import design_classes.Message;

public class TribeLinkedList
{
    private TribeNode head;
    public static int totalPopulation = 0;
    public static int countTribesWithFire = 0;
    public static int countAllTribes = 0;
    public TribeLinkedList()
    {
        this.head = null;
    }
    public void addTribeNode(TribeNode node)
    {
        Tribe buffer = node.getTribe();
        if (buffer.getPopulation().matches("\\d+")) {
            totalPopulation = totalPopulation + Integer.parseInt(buffer.getPopulation());
        }
        if (buffer.getFire().equals("ДА"))
        {
            countTribesWithFire++;
        }
        if (this.head == null)
        {
            this.head = node;
        }
        else
        {
            TribeNode current = this.head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = node;
        }
        countAllTribes++;
    }
    public TribeNode getTribeNodeHead()
    {
        return this.head;
    }
    public void doTaskOfLab()
    {
        Message.printMessage("Общая численность всех известных племен - " + totalPopulation, Design.GREEN, Design.YELLOW);
        Message.printMessage("Количество племен, владеющих огнем - " + countTribesWithFire + " из общего количества - " + countAllTribes, Design.GREEN, Design.YELLOW);
    }
}
