/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author workb
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaySomething();
    }
    
    public static void SaySomething()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        
        String username = input.nextLine();
        System.out.println(username + " this is not the greatest code in the world, it's just a tribute.");
    }
}
