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



## Conclusiones
1. **Aplicación práctica:**  
   Estos ejercicios refuerzan conceptos teóricos de pilas y su uso para resolver problemas prácticos.

2. **Desarrollo de habilidades:**  
   Ayudan a mejorar la lógica de programación, el uso eficiente de estructuras de datos y la depuración de código.

---


