/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number=random.nextInt(9 - 0 + 1) + 0;
        System.out.println("Программа запомнила число от нуля до 10");
        int userNumber = scanner.nextInt();
        if(number == userNumber){
            System.out.println("ты выйграл");
        }else{
            System.out.println(":(, неправильно. Задуманное число: "+number);
        }
    }
   
}    
