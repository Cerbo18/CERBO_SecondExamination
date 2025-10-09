
package cerbo_secondexamination;

import java.util.Scanner;


public class CERBO_SecondExamination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTreee tree = new BinaryTreee();

        System.out.println("Enter a passage:");
        String input = scanner.nextLine();
        //Clean the input
        String cleanedInput = input.replaceAll("[.,?!]", "");
        String[] words = cleanedInput.split("\\s+");

        //Insert word to the tree
        for (String word : words) {
            if (!word.isEmpty()) {
                tree.insert(word);
            }
        }
        tree.inorderPrint();
        tree.printPreOrder();
        tree.printPostOrder();
    }
    
}
