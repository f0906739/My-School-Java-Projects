
/**
 * Write a description of class ArrayList here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @1/29/20
 */

import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayData {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args){
        String menu = "1. Add Values\n2. Change Value\n3. Insert Value\n4. Get Index\n5. Get Size\n6. Print\n7. Total\n8. Average\n9. Remove Value\n10. Remove Location\n11. Clear\n12. Exit";
        ArrayData test = new ArrayData();
        Scanner op = new Scanner(System.in);
        int selection, value, index;

        do {
            out.println("\n"+menu);
            selection = op.nextInt();

            if (selection == 1){
                value = -1;
                while(value != 0){
                    out.print("Add a value to the Data Set: ");
                    value = op.nextInt();
                    if (value != 0)
                        test.addValues(value);
                }
            }else if(selection == 2){
                out.print("Which index? ");
                index = op.nextInt();
                out.print("Change old value to what new value? ");
                value = op.nextInt();
                test.changeValue(index,value);
            }else if(selection == 3){
                out.print("Which index? ");
                index = op.nextInt();
                out.print("Which value? ");
                value = op.nextInt();
                test.insertValue(index,value);
            }else if (selection == 4){
                out.print("Which index? ");
                index = op.nextInt();
                test.getIndex(index);
            }else if(selection == 5){
                test.getSize();
            }else if(selection == 6){
                test.printArray();
            }else if(selection == 7){
                test.total();
            }else if (selection == 8){
                test.average();
            }else if (selection == 9){
                out.print("Which value? ");
                value = op.nextInt();

                test.removeValue(value);
            }else if (selection == 10){
                out.print("Which index? ");
                index = op.nextInt();
                test.removeLocation(index);
            }else if (selection == 11){
                test.clear();
            }else if (selection == 12){
                out.println("\n\nHave a good day!");
            }



        }while (selection != 12);
    }

    public void addValues(int n){
        list.add(n);
    }

    public void changeValue(int index, int newValue){
        if (index >= list.size() || index < 0){
            out.print("Error: Index out of Bounds");
        }else
            list.set(index, newValue);
            out.printf("Changed value at location %d to %d.",index,newValue);
    }

    public void insertValue(int index, int value){
        list.add(index, value);
        out.printf("Inserted value at location %d to %d",index,value);
    }

    public void printArray(){
        out.println(list);
    }

    public void getIndex(int index){
        if (index >= list.size() || index < 0)
            out.print("Error: Index out of Bounds");
        else
            out.printf("The value at location %d is %d.", index, list.get(index));
    }

    public void getSize(){
        out.printf("The size of the list is %d.",list.size());
    }

    public void total(){
        int total = 0;
        for (int index = 0; index<list.size(); index++){
            total += list.get(index);
        }
        out.printf("The total of all values is %d.", total);
    }

    public void average(){
        int total = 0;
        for (int index = 0; index<list.size(); index++){
            total += list.get(index);
        }
        out.printf("The average of all values is %d.", total/list.size());

    }

    public void removeValue(int value){
        if (list.contains(value)){
            out.printf("Removed the value %d at location %d.", value, list.indexOf(value));
            list.remove(list.indexOf(value));
        }else
            out.print("Error: Value not in ArrayList");
    }

    public void removeLocation(int index){
        if (index >= list.size() || index < 0)
            out.print("Error: Index out of Bounds");
        else{
            int popped = list.remove(index);
            out.println("Removed Value: "+popped);
        }
    }

    public void clear(){
        list.clear();
        out.println("The ArrayList is now empty.");
    }

}
