package ProblemSolving.other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DynamicParent<T> {
    ArrayList<ArrayList<T>> pList = new ArrayList<>();

    public DynamicParent(){

    }
    public int getLength(){
        return pList.size();
    }

    public void populate(ArrayList<T>... subLists){
        for(ArrayList<T> subList : subLists){
            pList.add(subList);
        }
    }
    public <T> Set<ArrayList<T>> getCombinations(ArrayList<ArrayList<T>> lists ,ArrayList<String> inName) {
        Set<ArrayList<T>> combinations = new HashSet<>();
        Set<ArrayList<T>> newCombinations;

        int index = 0;

        for (T element : lists.get(0)) {
            ArrayList<T> newList = new ArrayList<T>();
            newList.add((T) (inName.get(0) + ":" + element));
            combinations.add(newList);
        }
        index++;
        // [ [1] [2] ]
        while (index < lists.size()) {
            ArrayList<T> nextList = lists.get(index); // [ [3] [4] ]
            newCombinations = new HashSet<>(); // {}
            for (List<T> first : combinations) { // [1]
                for (T second : nextList) { // [4]
                    ArrayList<T> newList = new ArrayList<>(); // []
                    newList.addAll(first); // newList = [ [1] ]
                    newList.add((T) (inName.get(index) + ":" + second));
                    newCombinations.add(newList);
                }
            }
            combinations = newCombinations;
            index++;
        }
        return combinations;
    }
    public void display(){
        for(int i = 0 ; i < pList.size();i++){
            System.out.println(pList.get(i));
        }
    }


}
