package ProblemSolving.other;

import java.util.ArrayList;

/* GIVEN :
*       - Dynamic Number of Loops with one loop
*       - Input : range , sets , values ( 2D dynamic type list )
*       - Output : all combinations of the inputs
*
*  INFERENCES :
*       - Generics for input
*       - Dynamic Programming ?
*       - Recursions ?
*       - Functions for Loops ?
*       - BackTracking ?
*       - No of parameters will be given or not?
*
*   STEPS :
*       - Get a dynamic input of list of lists of any data type
*       - Iterate through them dynamically ( both data type and no of loops must be handled dynamically )
*       - print all combinations
*
*   METHOD 1 BRUTE FORCE :
*       - initialize empty list of list for int , float and string
*       - use switch case input style to prompt user what they will input and add the values in the list
*       - use those lists to iterate through and get the combinations ( might break the only one loop rule ) maybe use recursion?
*
*   CASES :
*       Int or Float - Range or sets
*       String - sets
* */
class DynamicChild<T>  {
    ArrayList<T> list = new ArrayList<T>();
    public DynamicChild(){

    }
    public int getLength(){
        return list.size();
    }
    public void populate(T... elements){

        for(T ele : elements){
            list.add(ele);
        }
    }

    public void populateRange(int start , int end){
        for(Integer i = start ; i <= end ; i++){
            list.add((T) i);
        }
    }
    public T get(int index){
        return list.get(index);
    }
    public void display(){
        for(int i = 0 ; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

