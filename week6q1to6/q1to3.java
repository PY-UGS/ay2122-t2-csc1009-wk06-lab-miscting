package week6q1to6;
import java.util.*;

public class q1to3 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        // Q1
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println("Q1 before change: " + list.toString());
        list = addAndSort(list, 6);
        System.out.println("Q1 after change: " + list.toString());
        // Q2
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 2 indexes to swap: ");

        int index1 = input.nextInt();
        int index2 = input.nextInt();
        
        System.out.println("Q2 before change: " + list.toString());
        list = swap(list, index1, index2);
        System.out.println("Q2 after change: " + list.toString());
        input.close();

        // q3
        LinkedList<Integer> randList = new LinkedList<>();
        Random randval = new Random();
        for (int i = 0; i < 500; i ++) {
            randList.add(randval.nextInt(9999 - 1000) + 1000);
        }

        int randomval = randval.nextInt(9999 - 1000) + 1000;
        int foundIndex = findValue(randList, randomval);
        System.out.println("Q3 The Index of " + randomval + " is " + foundIndex);
        
    }

    public static int findValue(LinkedList<Integer>list, int randomval) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == randomval) {
                return i;
            }
        }
        return -1;
    }
    
    public static LinkedList<Integer> addAndSort(LinkedList<Integer> list, int value) {
        for (int i = 0; i < list.size()    ; i++) {
            if (value <= list.get(i)) {
                list.add(i, value);
                break;
            }
            else if (value > list.getLast()) {
                list.add(value);
                break;
            }
        }
        return list;
    }

    public static LinkedList<Integer> swap(LinkedList<Integer> list ,int index1, int index2) {
        int value1 = list.get(index1);
        int value2 = list.get(index2);

        list.set(index1, value2);
        list.set(index2, value1);
    
        return list;
    }





}
