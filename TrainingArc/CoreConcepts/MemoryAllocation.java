package ProblemSolving.TrainingArc.CoreConcepts;

/*
* TYPES OF MEMORY :
*   - Call Stack -> For handling the control flow
*   - Stack Memory -> For handling function's memory and the primitive types used inside them
*   - Heap Memory -> For handling Wrapper and Object Types
* */

class ClassA{
    static {
        System.out.println("Class A static props and methods are added to method area");
    }

    ClassA(){
        System.out.println("An instance for Class A is created in heap memory and ref stored in stack memory");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Instance of Class A is destroyed ( unpredictable )");
        super.finalize();
    }
}

public class MemoryAllocation {

    public static void main(String[] args) {
        System.out.println("Main Class is loaded into JVM");
        System.out.println("Main method is stored in Method Area since its static");
        // will be added to the call stack
        System.out.println("print() will be added to the call stack");
        print();
        System.out.println("print() will be removed from the call stack along with all its used variables");
        // will be removed from the call stack
        System.out.println("Main will be removed from the Call stack");
    }

    static void print(){
        System.out.println("From Stack Memory");

        // will be added in the stack memory
        int birthYear = 1995;
        System.out.println("Added to the stack memory birthYear = " + birthYear);

        // will be added to the String pool memory ( method area )
        String name = "Java";
        System.out.println("Added to String pool name = " + name);

        String parent = new String("Sun microsystems");
        System.out.println("Added to the heap memory parent = new String('" + parent + "')");

        ClassA classA ;
        System.out.println("Class A is initialised in compile time");
        classA = new ClassA();
    }
}
