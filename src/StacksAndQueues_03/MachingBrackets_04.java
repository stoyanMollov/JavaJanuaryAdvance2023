package StacksAndQueues_03;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MachingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> indexes = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i ++){
            if (input.charAt(i) == '('){
                indexes.push(i);
            } else if (input.charAt(i) == ')') {
                int openBrackets = indexes.pop();

                String expression = input.substring(openBrackets,i + 1);
                System.out.println(expression);
            }
        }
    }
}
