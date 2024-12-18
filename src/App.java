import Controller.MenuController;
import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Queues.Queue;
import Materia.Queues.QueueGeneric;
import Materia.Queues.Stacks.Stack;
import Materia.Queues.Stacks.StackGeneric;
import Models.Pantalla;

public class App {
    public static void main(String[] args) {
        runSignValidator();
        runStackSorter();
        //runContactManager();
       // runStack();
       // runStackGeneric();
       // runQueue();
       // runQueueGeneric();

    }
    public static void runContactManager(){
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }

    public static void runStack() {
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

        System.out.println("\nCantidad = " + stack.getSize());
    }

    public static void runStackGeneric() {
        StackGeneric<Pantalla> router = new StackGeneric<>();

        router.push(new Pantalla(1, "Home Page", "/Home"));
        router.push(new Pantalla(2, "Menu Page", "/Home/menu"));
        router.push(new Pantalla(3, "Users Page", "/Home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        router.pop();
        System.out.println("Regreso a: " + router.peek().getRuta());
        System.out.println("Estoy en: " + router.peek().getRuta());

        router.push(new Pantalla(4, "Settings Page", "/Home/menu/settings"));
        System.out.println("Cantidad de pantallas: " + router.size());
        System.out.println("Estoy en: " + router.peek().getRuta());
        router.printStack();
    }

    public static void runQueue(){
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());

    }

    public static void runQueueGeneric() {
        QueueGeneric<Pantalla> routerQueue = new QueueGeneric<>();
        // Agregar elementos a la cola
        routerQueue.enqueue(new Pantalla(1, "Home Page", "/Home"));
        routerQueue.enqueue(new Pantalla(2, "Menu Page", "/Home/menu"));
        routerQueue.enqueue(new Pantalla(3, "Users Page", "/Home/menu/users"));

        // Imprimir la cola
        System.out.println("Estado inicial de la cola:");
        routerQueue.printQueue();

        // Operaciones con la cola
        System.out.println("\nElemento al frente: " + routerQueue.peek().getRuta());
        System.out.println("Desencolar: " + routerQueue.dequeue().getRuta());
        System.out.println("Elemento al frente tras desencolar: " + routerQueue.peek().getRuta());

        // Agregar un nuevo elemento
        routerQueue.enqueue(new Pantalla(4, "Settings Page", "/Home/menu/settings"));

        // Imprimir la cola final
        System.out.println("\nEstado final de la cola:");
        routerQueue.printQueue(); 
        System.out.println("\nTamaño de la cola: " + routerQueue.size());

        }

        public static void runSignValidator() {
        SignValidator validator = new SignValidator();

        String input1 = "([]){}";
        String input2 = "({)}";
        String input3 = "[{()";
        String input4 = "()";

        System.out.println("Ejemplo 1:\n  Input: \"" + input1 + "\"\n  Output: " + validator.isValid(input1));
        System.out.println("Ejemplo 2:\n  Input: \"" + input2 + "\"\n  Output: " + validator.isValid(input2));
        System.out.println("Ejemplo 3:\n  Input: \"" + input3 + "\"\nOutput: " + validator.isValid(input3));
        System.out.println("Ejemplo 4:\n  Input: \"" + input4 + "\"\n  Output: " + validator.isValid(input4));
    }

    public static void runStackSorter() {
        StackSorter sorter = new StackSorter();
        StackGeneric<Integer> stack = new StackGeneric<>();

        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack:");
        stack.printStack();

        StackGeneric<Integer> sortedStack = sorter.sort(stack);

        System.out.println("Sorted Stack:");
        sortedStack.printStack();
    }
}