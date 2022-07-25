/******************************************************************************
 *  Compilation:  javac HelloGoodbye.java
 *  Execution:    java HelloGoodbye Kevin Bob
 *  
 *  Reads in two Names command-line arguments and prints "Hello Kevin and Bob" and "Goodbyu Kevin and Bob"
 *  Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello and 
 *  goodbye messages as shown below (with the names for the hello message in the same order as the command-line 
 *  arguments and with the names for the goodbye message in reverse order)
 *  % java HelloGoodbye Kevin Bob
 ******************************************************************************/

public class HelloGoodbye {
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println(args[0]);
        System.out.println("and");
    }
    
}
