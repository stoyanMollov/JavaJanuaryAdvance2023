package StacksAndQueues_03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();

        String currentInput = scanner.nextLine();

        while (!currentInput.equals("Home")){

            if (currentInput.equals("back")){
                if (history.isEmpty() || history.size() == 1) {
                    System.out.println("no previous URLs ");
                    currentInput = scanner.nextLine();
                    continue;
                }
                    history.pop(); // ще ни върне в началото на нашия цикъл.
            }else {
                history.push(currentInput);
            }

            System.out.println(history.peek());

            currentInput = scanner.nextLine();
        }
    }
}
