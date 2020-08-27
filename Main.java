import java.util.*;

interface f {
	int computeTest(); 
}

public class Main {
    //https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
    public static void main(String[] args) throws Exception {
            System.out.println(System.getProperty("java.version"));
        var i=1;
        //var t = 
        Thread t;
        (t = new Thread(() -> { System.out.println("Hello Lambda world!"); })).start();
        System.out.println("Hello world!");
        t.join();
        //var k =
        //MyFunctionalInterface = () -> { System.out.println("Hello Lambda world!"); };
    }
}
