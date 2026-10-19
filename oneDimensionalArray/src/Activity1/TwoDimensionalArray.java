/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity1;

/**
 *
 * @author admin
 */
public class TwoDimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grade [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        
        };
        for (int i = 0; i < grade.length; i++){
            for (int j = 0; j < grade[i].length; j++){
                System.out.print(grade[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
