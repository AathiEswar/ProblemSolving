package ProblemSolving.other;

import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> inNames = new ArrayList<>();
        ArrayList<String> inExp = new ArrayList<>();

        DynamicParent lists = new DynamicParent();

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String inputLine = sc.nextLine();
            if(inputLine == ""){
                break;
            }
            String[] line = inputLine.split("=");
            inNames.add(line[0].trim());
            inExp.add(line[1].trim());
        }


        // CASES :
        // Int - range or sets
        // Float - range or sets
        // String - sets

        for(int i = 0 ; i < inExp.size() ; i++){
            DynamicChild list = new DynamicChild();
            String line = inExp.get(i);
            // if its CSV
            if(line.contains(",")){
                String[] elements = line.split(",");
                for(String ele : elements){
                    list.populate(ele);
                }
            }
            // integer
            else{
                String[] inputRange = line.split("to");
              //  System.out.println(Arrays.toString(inputRange));
                int start = Integer.parseInt(inputRange[0].trim());
                if(inputRange.length == 1){
                    list.populate(start);
                }
                else {
                    int end = Integer.parseInt(inputRange[1].trim());
                    //System.out.println( + " " + end);
                    list.populateRange(start, end);
                }
            }
            lists.populate(list.list);
        }

//        lists.display();
        Set<List<Integer>> combs = lists.getCombinations(lists.pList ,inNames);
        for (List<Integer> list : combs) {
            System.out.println(list.toString());
        }
    }
}
