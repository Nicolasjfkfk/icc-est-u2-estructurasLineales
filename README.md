# Ejercicios de Pilas y Colas

## Descripción del Proyecto
Este proyecto implementa soluciones para dos ejercicios prácticos relacionados con estructuras de datos lineales (**pilas**). Los ejercicios son:

1. **Validación de Signos**  
2. **Ordenamiento de un Stack**

Cada solución está estructurada en clases Java y organizadas en paquetes.

---

## Ejercicio 1: Validación de Signos
**Paquete:** `Ejercicio_01_sign`  
**Clase Principal:** `SignValidator`  
### Descripción
Este ejercicio implementa un algoritmo que verifica si un string compuesto por los caracteres `(`, `)`, `{`, `}`, `[` y `]` es válido.  

Un string es válido si:
- Cada corchete abierto tiene un correspondiente corchete de cierre.
- Los corchetes se cierran en el orden correcto.

### Ejemplos
```plaintext
Input: "([]){}"  
Output: true  

Input: "({)}"  
Output: false  

Input: "[{()"  
Output: false  

Input: "()"  
Output: true  
```

---

## Ejercicio 2: Ordenar un Stack
**Paquete:** `Ejercicio_02_sorting`  
**Clase Principal:** `StackSorter`  
### Descripción
Este ejercicio implementa un algoritmo para ordenar un stack de números enteros de forma que el elemento más pequeño quede en el tope del stack.  

### Ejemplo
```plaintext
Input (Stack Original): (tope) 5->1->4->2  
Output (Stack Ordenado): (tope) 1->2->4->5  
```



## Conclusion
Los ejercicios abordan problemas fundamentales en el uso de pilas, como la validación de estructuras anidadas y el manejo eficiente de datos para tareas como el ordenamiento. Esto resalta la versatilidad de las pilas en diversos escenarios de programación.

---


