package kasp4770;
/*
(Conversion from inch to centimetre) Write a program that displays the following table: (note that 1 inch is 2.54 cm)

Inches      Centimetres
1           2.54
2           5.08
...
9           22.86
10          25.4

 */
public class Opgave5_4 {
    public static void main(String[] args) {

        int i;

        System.out.println("Inch" + "      Centimeter");

        for (i=1; i<=10; i++){ //making a loop that goes from 1-10 and adds 1 at every loop
            System.out.printf(i + "         " + (i*2.54)); //printing 'i'value and result

            System.out.println(); //New line for every loop
        }
    }
}
