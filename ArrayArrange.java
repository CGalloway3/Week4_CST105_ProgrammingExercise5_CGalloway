//This is my own work. Chad Galloway
/**  Program: Array Arrange
*    File: ArrayArrange.java
*    Summary: Reads text from a file and stores it in a two-dimensional array 
*             then outputs an inverse array as text.
*    Author: Chad Galloway 
*    Date: December 21, 2017
**/
package programmingexxercise5;

import java.io.File;
import java.util.Scanner;

public class ArrayArrange {

    public static void main(String[] args) throws Exception {
        
        // Initialize variables
        File file = new File(System.getProperty("user.dir") + "\\inputFile.txt");
        Scanner fileInput = new Scanner(file);
        String story = "";
        String inverseStory = "";
        int cursorPosition = 0;
        char[][] charArray = new char[20][45];
        
        // create the story from file.
        while ( fileInput.hasNext() ){
                story += fileInput.nextLine();
        }
        
        // Remove leading character from file input
        story = story.substring(1);
        
        //System.out.println(story); //Debugging code
         
        // Store the story in the array using a nested loop
        for ( int row = 0; row < 20; row++) {
            for ( int column = 0; column < 45; column++){
            
                // Check for the end of the story.
                if ( cursorPosition < story.length() ) {
                    charArray[row][column] = story.charAt(cursorPosition);
                }
                else {
                    charArray[row][column] = '@';
                }
                
                // Move the cursor position
                cursorPosition++;
                //System.out.print(charArray[row][column]); // Debugging code
            } 
            //System.out.println(" "); // Debugging code
        }
        //System.out.println(" "); // Debugging code
        
        // Write the inverse story using a nested loop
        for ( int column = 0; column < 45; column++){
            for ( int row = 0; row < 20; row++) {
                inverseStory += charArray[row][column];
            }
        }
        
        // Format the output of inverseStory into 9 rows 100 characters each.
        for (int x = 0; x < 9; x++) {
            System.out.println(inverseStory.substring(x * 100, x * 100 + 99));
        }
        
    }

}
