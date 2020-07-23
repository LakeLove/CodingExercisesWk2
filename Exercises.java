import java.util.Arrays;

public class Exercises {
    public static void main(String args[]) {
        //For loop from 100 to 5 by 5
        {
            for (int i = 100; i >= 5; i -= 5) {
                System.out.println(i);
            }
        }
        //Sum Integers from 9 to 17, print sum
        {
            int sum = 0;

            for (int i = 9; i <= 17; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
        //Find and print the smallest integer in an array a = [9, 5, 6, 3, 8, 2, 4];
        {
            int[] a = new int[]{9, 5, 6, 3, 8, 2, 4};
            int smallest = a[0];

            for (int i : a) {
                if (i < smallest) {
                    smallest = i;
                }
            }
            System.out.println(smallest);
        }
        //Find largest integer in an array
        {
            int[] a = new int[]{9, 5, 6, 3, 8, 2, 4};
            int largest=a[0];
            for (int i:a) {
                if (i>largest) {
                    largest=i;
                }
            }
            System.out.println(largest);
        }
        //Find and print index of first true element in an array of booleans a = [false, false, false, true, false];
        {
            boolean[] b = new boolean[]{false, false, false, true, false};

            for (int i = 0; i < b.length; i++) {
                if (b[i] == true) {
                    System.out.println(i);
                }
            }
        }
        //Find and print index of first true element in an array of booleans (must use a while loop)
        {
            boolean[] b = new boolean[]{false, false, false, true, false};

            int j = 0;
            while (b[j] != true) {
                j++;
            }
            System.out.println(j);
        }
        //add 5 to every element of an array of integers
        {
            int[] a = new int[]{9, 5, 6, 3, 8, 2, 4};
            for (int i = 0; i < a.length; i++) {
                a[i] += 5;
            }
        }
        //divide each element of a double array by 1.3
        {
            int[] a = new int[]{9, 5, 6, 3, 8, 2, 4};
            for (int i = 0; i < a.length; i++) {
                a[i] /= 1.3;
            }
        }
        //raise each element of a double array to it's 3rd power and subtract the original element's value by the value
        //divided by 3.0 a = [1.3, 5.4, 6.1, 1.0, 9.2];
        {
            double[] c = new double[]{1.3, 5.4, 6.1, 1.0, 9.2};

            for (int i = 0; i < c.length; i++) {
                c[i] = Math.pow(c[i], 3) - (c[i] / 3);
            }
        }
        //zero out a 4 by 6 integer array
        {
            int[][] c = new int[][]{{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
            for (int i = 0; i < c.length; i++) {
                Arrays.fill(c[i], 0);
            }
            for (int[] i:c) {
                System.out.println(Arrays.toString(i));
            }
        }
        //multiply each element of a 5 by 5 array of integers by 7
        {
            int[][] d = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[i].length; j++) {
                    d[i][j] *= 7;
                }
            }
            for (int[] i : d) {
                System.out.println(Arrays.toString(i));
            }
        }
        //create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans.
        //each element in the result should be true if the value in the argument array is even, else it's false.
        {
            int[][] d = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
            boolean[][] e = new boolean[5][5];
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[i].length; j++) {
                    e[i][j] = d[i][j] % 2 == 0;
                }
            }
            for (boolean[] i : e) {
                System.out.println(Arrays.toString(i));
            }
        }
        //create a method that takes two doubles and returns the first parameter raised to the second parameter's value
        {
            double a = 1, b = 2;
            a = Math.pow(a, b);
            System.out.println(a);
        }
        //create a method that returns a boolean if the Object passed to it is a Fish or not
        {
            Object object = null;
            System.out.println(object == "Fish");
        }
        //There is an object x which has a method (double)Balance().
        // Build an IF statement that prints "Paid Off" if the result of the balance call is less than of equal to 1.0,
        // else it prints the balance as a Dollar figure (2 decimal places)
        {
            double x = 6.64572;
            if (x <= 1.0) {
                System.out.println("Paid Off");
            } else {
                System.out.format("$%.2f", x);
            }
        }
        //Build a WHILE loop that turns on the heat if the thermo.getTemp() is less than 72.0
        //else it turns on the A/C if thermo.getTemp() is greater that 76.0.
        {
            boolean ac = false;
            boolean heat = false;
            Exercises thermo = null;
            while (thermo.getTemp()<72.0 || thermo.getTemp()>76.0) {
                if (thermo.getTemp()<72.0) heat = true;
                if (thermo.getTemp()>76.0) ac = true;
            }
        }
        //Find a number greater than Pi in a double array, print number and its index.
        {
            int[][] d = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[i].length; j++) {
                    if (d[i][j] > Math.PI) {
                        System.out.println(d[i][j]+" "+j);
                    };
                }
            }
        }
        //Given an array of objects (of class Xaction) w/nulls, sum all the values of the objects in the array,
        //using Xaction::getValue(). Print the sum.
        {
            Xaction[] x = new Xaction[]{};
            Double sum = 0.0;
            for (Xaction value : x) {
                if (value != null) {
                    //sum += value;
                }
            }
            System.out.println(sum);;
        }
        //reverse an array of objects of type Xaction
        {

        }
        //Print a 5's times table
        {
            for (int i = 1; i <=5; i++) {
                for (int j = 1; j <=5; j++) {
                    System.out.format("%3d",i*j);
                }
                System.out.println("\n");
            }
        }
        //determine the hypotenuse of a 9 by 7 right triangle, assign it to a double
        {
            double hypotenuse = Math.sqrt(Math.pow(9, 2)+(Math.pow(7, 2)));
        }
    }

    private static double getTemp() {
        return 75.4;
    }

    private static class Xaction {

    }
}
