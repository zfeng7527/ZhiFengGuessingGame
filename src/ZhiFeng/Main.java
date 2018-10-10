package ZhiFeng;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Guess A numbeer from 0 to 20:");
        int answer =(int)(Math.random()*21);
        System.out.println(answer);
        Scanner input = new Scanner(System.in);
        while(input.nextInt() != answer){
            System.out.print("Guess again:");
        }
        System.out.print("You got it! The answer was "+answer+"!");
    }
}
