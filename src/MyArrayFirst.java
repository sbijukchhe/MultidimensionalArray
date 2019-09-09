/*
Create a multidimensional array in IntelliJ that prints ten rows numbered 1-10 and five columns numbered 1-5.
Display them as a matrix as shown below.
row 0 col 0 row 0 col 1 row 0 col 2 row 0 col 3 row 0 col 4
row 1 col 0 row 1 col 1 row 1 col 2 row 1 col 3 row 1 col 4
row 2 col 0 row 2 col 1 row 2 col 2 row 2 col 3 row 2 col 4
row 3 col 0 row 3 col 1 row 3 col 2 row 3 col 3 row 3 col 4
row 4 col 0 row 4 col 1 row 4 col 2 row 4 col 3 row 4 col 4
row 5 col 0 row 5 col 1 row 5 col 2 row 5 col 3 row 5 col 4
row 6 col 0 row 6 col 1 row 6 col 2 row 6 col 3 row 6 col 4
row 7 col 0 row 7 col 1 row 7 col 2 row 7 col 3 row 7 col 4
row 8 col 0 row 8 col 1 row 8 col 2 row 8 col 3 row 8 col 4
row 9 col 0 row 9 col 1 row 9 col 2 row 9 col 3 row 9 col 4
Create an array to display the multiplication tables for the values 1-12.
Your multiplication tables should display as shown below. The interesection of a row value and a column value would be
the product of the row * column.
 */

public class MyArrayFirst {
    public static void main(String[] args) {

        int[][] arr1 = new int[10][5];

        for (int rows = 0; rows < arr1.length; rows++) {
                for (int cols = 0; cols < arr1[rows].length; cols++) {
                arr1[rows][cols] = rows;
                System.out.print("row "+arr1[rows][cols]);
                System.out.print("col "+arr1[rows][cols] + "\t");
            }
            System.out.println("\n");

        }

        //Print the elements of an array
//        for (int i = 0; i <10; i++) {
//            for (int j = 0; j <5; j++) {
//                System.out.print(arr1[i][j] + "\t");
//            }
//            System.out.println("\n");
//        }


//        for (int[] a : arr1
//        ) {
//            for (int i : a) {
//                System.out.print(i + "\t");
//            }
//            System.out.println("\n");
//        }
//        for (int rows = 0; rows < arr1.length; rows++) {
//            for (int cols = 0; cols < arr1[rows].length; cols++) {
//                arr1[rows][cols] = rows;
//                System.out.print("row"+arr1[rows][cols] + "\t");
//                System.out.print("col"+arr1[rows][cols] + "\t");
//            }
//            System.out.println("\n");
//
//        }
    }
}


