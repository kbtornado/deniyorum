/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package deniyorum;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public static boolean search(ArrayList<Integer> array, int e){
        System.out.println("inside search");

        if(array == null)
            return false;
        
        for (int elt : array) {
            if(elt == e)
                return true;
        }
        return false;
    }

}
