import Materia.Queues.Stacks.Stack;
import Materia.Queues.Stacks.StackGeneric;
import Models.Pantalla;

public class App {
    public static void main(String[] args) {
       // runStack();
        runStackGeneric();
    }

    public static void runStack() {
        Stack stack = new Stack();

        // Agregar elementos
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        System.out.println("\nCantidad = " + stack.getSize());

        // Operaciones con la pila
        System.out.println("Cima -> " + stack.peek());
        System.out.println("Retirar -> " + stack.pop());
        System.out.println("Cima -> " + stack.peek());
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
}

