/*
Create an array to display the multiplication tables for the values 1-12. Your multiplication tables should display as
shown below. The interesection of a row value and a column value would be the product of the row * column.
 */
public class MultiplicationTable {

    public static void main(String args[]) {

        System.out.format("      ");
        for (int i = 1; i <= 12; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("------------------------------------------------------");

        for (int i = 1; i <= 12; i++) {
            // print left most column first
            System.out.format("%4d |", i);
            for (int j = 1; j <= 12; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}
