package ProblemSolving.TrainingArc.CoreConcepts;

/*
* TYPES OF MEMORY :
*   - Call Stack -> For handling the control flow
*   - Stack Memory -> For handling function's memory and the primitive types used inside them
*   - Heap Memory -> For handling Wrapper and Object Types
*   - String Pool -> stores String literals in JVM for better efficiency
*   - Method Area -> Aka meta space , stores static types in JVM
*   - Thread Local Pool -> Each thread has its own stack memory for primitive ,
*                          common heap memory for wrappers and objects,
*                          use threadLocal to add threadLocalMap inside that thread and
*                          avoid common access , making the objects private and avoids race condition
* */

 class ThreadLocalExample {

    // ThreadLocal variable holding a String (e.g., user name)
    private static final ThreadLocal<String> userThreadLocal = new ThreadLocal<>();

    public static void run() throws InterruptedException {

        Runnable task1 = () -> {
            userThreadLocal.set("Alice");
            System.out.println(Thread.currentThread().getName() + ": " + userThreadLocal.get());
            userThreadLocal.remove();
        };

        Runnable task2 = () -> {
            userThreadLocal.set("Bob");
            System.out.println(Thread.currentThread().getName() + ": " + userThreadLocal.get());
            userThreadLocal.remove();
        };

        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");

        System.out.println("Starting the threads");
        t1.start();
        t2.start();

        System.out.println("Joining the threads to main class ( Def behavior - main doesn't care and continues execution )");
        t1.join();
        t2.join();

        System.out.println("Thread Execution ends");
    }
}

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

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Class is loaded into JVM");
        System.out.println("All static tyes of main class is stored in method area (meta space) ");
        // will be added to the call stack
        System.out.println("print() will be added to the call stack");
        print();
        System.out.println("print() will be removed from the call stack along with all its locals");
        // will be removed from the call stack

        ThreadLocalExample.run();

        System.out.println("Main will be removed from the Call stack");
        System.out.println("Main will be removed from the Stack memory");
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
