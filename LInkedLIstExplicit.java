package ProblemSolving;

class Node{
    String data;
    Node link;
}

class LinkedListNodes{
    Node firstNode ;
    int lenght;

    public void incrementLenght(){
        this.lenght++;
    }
    public void decrementLenght(){
        this.lenght--;
    }
    public int  getlength(){
        return lenght;
    }
    public void displayElements(){
        Node pointer =firstNode;
        System.out.print("( ");
        while(pointer!=null){
            System.out.print(pointer.data);
            pointer = pointer.link;
            if(pointer!=null){
                System.out.print(",");
            }

        }
        System.out.println(" )");
    }
    public void  setSecondNode(String Newdata){
        if(getlength()!=0){
        Node N = new Node();
        N.data = Newdata;
        N.link = null;
        firstNode.link = N;
            incrementLenght();
    }
}
    public boolean searchelement(String data){
        if(getlength()==0)return false;
        if(firstNode.data==data) return true;
        Node point = firstNode;
        while(point!= null){
            if(point.data == data){

                return true;
            }
            else {
                point = point.link;
            }
        }
            return false;
    }
    public void deleteLastNode(){

        if(getlength()!=0){
            if(getlength() ==1){
                decrementLenght();
                firstNode = null;
            }
            else {
                Node curPoint = firstNode;
                Node prePoint = new Node();
                while(curPoint.link!=null){
                    prePoint = curPoint;
                    curPoint = curPoint.link;
                }
                prePoint.link = null;
                decrementLenght();
            }
        }
    }

    public void insertNewNodeAtEnd(String data){
        Node NewNode = new Node();
        NewNode.data = data;
        NewNode.link = null;
        if(getlength()==0){
            firstNode = NewNode;
        }
        else{

            Node point = firstNode;
            while (point.link!=null){
                point = point.link;
            }
            point.link = NewNode;

        }
        incrementLenght();
    }
}

public class LInkedLIstExplicit {
    public static void main(String[] args) {
        //create a new linkedlist
        Node list = new Node();

        //create a pointer to manipulate the linkedlist
        LinkedListNodes pointer = new LinkedListNodes();

        //initialise the linked list head
        list.data = "Aathi";
        list.link = null;

        //instance the first node to the pointer
        pointer.firstNode = list;
        pointer.incrementLenght();

        //listlenght method
        System.out.println();
        System.out.println(pointer.getlength());
        pointer.displayElements();
        System.out.println();

        //insert Second node:
        System.out.print("Second node:");
        pointer.setSecondNode("Eswar");
        pointer.displayElements();
        System.out.println("lenght:" + pointer.getlength());
        System.out.println();


        //searching element:;
        System.out.println("Finding Element:"+pointer.searchelement("Eswar"));

        //deleting last Node:
        System.out.print("Deleting LastNode:");
        pointer.deleteLastNode();
        pointer.displayElements();
        System.out.println("Lenght:"+pointer.getlength());
        System.out.println();

        //Insert at the end:
        System.out.println("Insert Element at the end");
        pointer.insertNewNodeAtEnd("Hello");
        pointer.displayElements();
        System.out.println("Lenght:"+pointer.getlength());
        System.out.println();

    }
}
