package Basics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("size:");
        int size  = sc.nextInt();

        System.out.println("elements:");
        for(int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        // sort it
//        Collections.sort(list, (a,b) -> b-a);
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.toString());


    }
}
/* THINGS TO REMEMBER:
*
* 1. reverse ArrayList in rev order:
*   - Collections.sort(list, Collections.reverseOrder());
*   - Collections.sort(list, (a,b) -> b-a);
*
* 2. reverse an Array
*   - Array.sort(list, Collections.reverseOrder());
*
* 3. Everything comes from 'java.util.*' package.
*
* 4. methods in ArrayList: .add(), .get(index), .remove(index), .clear(), .size();
*
* */
