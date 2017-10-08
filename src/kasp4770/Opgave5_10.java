package kasp4770;
//IKKE FÆRDIG
public class Opgave5_10 {
    public static void main(String[] args) {
        int i;

        for (i=100; i<=1000; i++){
            for(i=1; i<=10; i ++){
            if(i % 3 == 0 && i % 4 == 0)
                    System.out.print(i);

            }
            System.out.println();
        }

    }
}
