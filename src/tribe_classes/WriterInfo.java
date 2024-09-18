package tribe_classes;

import design_classes.Design;

public class WriterInfo
{
    public static void printAllTribes(TribeLinkedList list)
    {
        printHeaderOfTable();
        printRows(list);
    }
    static void printHeaderOfTable()
    {
        System.out.println(Design.LIGHT_WHITE + Design.BOLD +
                        "+-----+------------------+-------------+----------------+\n|" +
                Design.PURPLE + Design.BOLD + "  N  " +
                Design.LIGHT_WHITE + Design.BOLD +
                "|" +  Design.PURPLE + Design.BOLD +
                " НАЗВАНИЕ ПЛЕМЕНИ " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.PURPLE + Design.BOLD +
                " ЧИСЛЕННОСТЬ " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.PURPLE + Design.BOLD +
                " ВЛАДЕЮТ ОГНЕМ? " + Design.LIGHT_WHITE + Design.BOLD +
                "|\n" +
                             "+-----+------------------+-------------+----------------+");
    }
    static void printRows(TribeLinkedList list)
    {
        TribeNode current = list.getTribeNodeHead();
        int counter = 1;
        while (current != null)
        {
            Tribe tribe = current.getTribe();
            System.out.printf(Design.LIGHT_WHITE + Design.BOLD + "|" +  Design.BLUE + Design.BOLD +
                    " %-3d " + Design.LIGHT_WHITE + Design.BOLD +
                    "|" + Design.BLUE + Design.BOLD +
                    " %-16s " + Design.LIGHT_WHITE + Design.BOLD +
                    "|" +  Design.BLUE + Design.BOLD +
                    " %-11s " + Design.LIGHT_WHITE + Design.BOLD +
                    "|" +  Design.BLUE + Design.BOLD +
                    " %-14s " +  Design.LIGHT_WHITE + Design.BOLD +
                    "|\n", counter, tribe.getName(), tribe.getPopulation(), tribe.getFire());
            System.out.println(Design.LIGHT_WHITE + Design.BOLD +"+-----+------------------+-------------+----------------+");
            current = current.next;
            counter++;
        }
    }
}
