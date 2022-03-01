package week6q1to6;
import java.util.*;

public class q4to6 {
    public static void main(String[] args) {
        //Q4
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        hashmap.put(0,1);
        hashmap.put(1,3);
        hashmap.put(2,5);
        hashmap.put(3,1);
        hashmap.put(4,7);
        hashmap.put(5,9);
        hashmap.put(6,11);

        System.out.println("Q4 before change: " + hashmap.toString());
        hashmap = addAndSort(hashmap, 6);
        System.out.println("Q4 after change: " + hashmap.toString());
        
        //Q5
        System.out.println("Q5 before change: " + hashmap.toString());
        hashmap = swapValues(hashmap, 0, 4);
        System.out.println("Q5 after change: " + hashmap.toString());

        //Q6
        HashMap<Integer, Integer> randHash = new HashMap<>();
        Random randVal = new Random();
        for (int i = 0; i < 500; i++) {
            int randNum = randVal.nextInt(9999 - 1000) + 1000;
            randHash.put(i, randNum);
        }

        int randomval = randVal.nextInt(9999 - 1000) + 1000;
        int foundIndex = findValue(randHash, randomval);
        System.out.println("Q6 The Index of " + randomval + " is " + foundIndex);

    }


    public static HashMap<Integer, Integer> addAndSort(HashMap<Integer, Integer> hashmap, int value) {
        int temp1 = 0;
        int temp2;
        boolean check = false;

        for(int i = 0; i < hashmap.size()+1; i++) {
            if (check) {
                if (i == hashmap.size()) {
                    hashmap.put(i, temp1);
                    break;
                }
                else {
                    temp2 = hashmap.get(i);
                    hashmap.replace(i, temp1);
                    temp1 = temp2;
                }
            }
            else if (value < hashmap.get(i)) {
                temp1 = hashmap.get(i);
                check = true;
                hashmap.replace(i, value);
            }
        }
        return hashmap;
    }

    public static HashMap<Integer, Integer> swapValues(HashMap<Integer,Integer>hashmap, int index1, int index2) {
        int value1 = hashmap.get(index1);
        int value2 = hashmap.get(index2);

        hashmap.replace(index1, value2);
        hashmap.replace(index2, value1);
        return hashmap;
    }

    public static int findValue (HashMap<Integer, Integer> hashmap, int randVal) {
        for(int i = 0; i < hashmap.size(); i++) {
            if(hashmap.get(i) == randVal) {
                return i;
            }
        }
        return -1;
    }

}
