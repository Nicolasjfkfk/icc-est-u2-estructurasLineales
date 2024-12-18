package Ejercicio_02_sorting;

import Materia.Queues.Stacks.StackGeneric;

public class StackSorter {
    public StackGeneric<Integer> sort(StackGeneric<Integer> stack) {
        StackGeneric<Integer> tempStack = new StackGeneric<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }

            tempStack.push(current);
        }

        return tempStack;
    }
}