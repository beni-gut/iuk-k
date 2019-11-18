package komplexitaet2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aufgabe2 {
    public static void main(String[] args) {
        final int size = 10_000_000;

        List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        {
            // access elements in the middle of the list
            long start = System.currentTimeMillis();
            int position = size/2;
            for (int i = 0; i < 1000; i++) {
                list.get(position);
            }
            long stop = System.currentTimeMillis();
            System.out.println("Time: " + (stop - start) + " ms");
        }

        {
            // remove and insert element at start of the list
            long start = System.currentTimeMillis();
            int position = 0;
            for (int i = 0; i < 1000; i++) {
                list.remove(position);
                list.add(position, 0);
            }
            long stop = System.currentTimeMillis();
            System.out.println("Time: " + (stop - start) + " ms");
        }


    }
}
