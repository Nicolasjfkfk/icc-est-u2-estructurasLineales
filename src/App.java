import Materia.Queues.Stacks.Stack;

public class App {
    public static void main(String[] args) {
        runStack();
    }

    public static void runStack() {
        // Instanciar la pila personalizada
        Stack stack = new Stack();

        // Agregar elementos
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        // Operaciones con la pila
        System.out.println("Cima -> " + stack.peek());
        System.out.println("Retirar -> " + stack.pop());
        System.out.println("Cima -> " + stack.peek());
        System.out.println("Retirar -> " + stack.pop());
        System.out.println("Cima -> " + stack.peek());
    }
}
