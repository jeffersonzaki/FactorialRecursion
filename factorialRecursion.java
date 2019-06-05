import javax.swing.*;

public class factorialRecursion {
    //declare output
    public static String output = " ";

    //compute factorial. Return an int
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    // * Main Method * //
    public static void main(String[] args) {
        //pass num as an int
        int num = Integer.parseInt(JOptionPane.showInputDialog("\nEnter a positive number e.g. 2"));
        //output num in factorial
        output += "\n The factorial of " + num + " is " + factorial(num);
        JOptionPane.showMessageDialog(null, output);
    }

}
