# Segundo Parcial Práctico – Programación I

## Versión B

**Lenguaje:** Java  
**Modalidad:** Individual  
**Duración:** 60 minutos  
**Valor:** 100 puntos  
**Temas:** funciones, parámetros, retornos, arreglos unidimensionales, ciclos, condicionales, validaciones, contadores y acumuladores.

---

## Indicaciones generales

1. Lea completamente el problema antes de comenzar a programar.
2. Desarrolle la solución en una única clase de Java llamada `MonitorRed`.
3. Utilice un arreglo unidimensional para almacenar los datos.
4. Divida la solución en funciones o métodos `static` con responsabilidades concretas.
5. El método `main` debe coordinar las llamadas; no debe contener toda la lógica del programa.
6. Utilice parámetros y valores de retorno cuando corresponda.
7. No se permite utilizar:
   - `ArrayList` ni otras colecciones.
   - `Stream`.
   - Variables globales.
   - Métodos automáticos para sumar, ordenar, obtener mínimos o resolver los cálculos solicitados.
8. El programa debe validar los datos indicados en el enunciado.
9. La solución debe compilar y ejecutarse correctamente desde consola.

---

# Ejercicio – Monitoreo de tiempos de respuesta

El área de soporte de una empresa registra los tiempos de respuesta de un servidor durante varias mediciones. Cada tiempo se expresa en milisegundos y debe encontrarse entre **20 y 500 ms**.

La cantidad de mediciones que se registrará debe estar entre **3 y 20**.

Construya un programa que almacene los tiempos en un arreglo y permita obtener la siguiente información:

1. Cantidad de mediciones con tiempo entre **20 y 200 ms**, incluidos ambos límites.
2. Cantidad de mediciones con tiempo superior a **200 ms**.
3. Tiempo total acumulado de todas las mediciones.
4. Promedio de tiempo de respuesta.
5. Menor tiempo registrado.
6. Cantidad de mediciones cuyo tiempo fue inferior al promedio.
7. Número de la primera medición en la que apareció el menor tiempo.
8. Listado numerado de todos los tiempos registrados.

---

## Validaciones obligatorias

- La cantidad de mediciones debe estar entre 3 y 20.
- Cada tiempo debe estar entre 20 y 500 ms.
- Cuando un dato sea inválido, el programa debe mostrar un mensaje y solicitarlo nuevamente.
- Las mediciones deben mostrarse numeradas desde 1, aunque las posiciones del arreglo comiencen en 0.

---

## Funciones mínimas requeridas

El programa debe tener, como mínimo, funciones independientes para:

1. Leer y validar la cantidad de mediciones.
2. Verificar si un tiempo pertenece al rango permitido.
3. Cargar los tiempos en el arreglo.
4. Calcular la suma de los tiempos
5. Contar valores que pertenezcan a un rango.
6. Contar valores mayores que un límite. 
7. Calcular el promedio.
8. Buscar el menor tiempo.
9. Buscar la primera posición del menor tiempo.
10. Mostrar el resumen final.

Los nombres de las funciones quedan a criterio del estudiante, pero deben ser comprensibles. También deberá decidir:

- Qué parámetros recibe cada función.
- Qué tipo de dato retorna.
- Cuáles funciones deben ser `void`.

> Una función debe resolver una responsabilidad concreta. Crear una función que realice todo el ejercicio no se considera modularización.

---

## Caso de prueba

Puede utilizar los siguientes datos para comprobar parcialmente el programa:

```text
Cantidad de mediciones: 5
Tiempos: 300, 100, 250, 50, 200
```

Para este caso:

- Existen 3 mediciones entre 20 y 200 ms.
- Existen 2 mediciones superiores a 200 ms.
- El tiempo total es 900 ms.
- El promedio es 180 ms.
- El menor tiempo es 50 ms.
- Existen 2 mediciones por debajo del promedio.
- El menor tiempo apareció por primera vez en la medición 4.

El programa también será probado con otros valores, incluyendo datos inválidos y valores repetidos.

---

Analisis del ejercicio 
-Utilizo un Do while, dentro de ese do while utilizo un if, para ingresar la condicion, de que la cantidad de mediciones debe estar entre 3 y 20, en tal caso de que no cumpla esa condicion se registrara un error, que le dira al usuario que ingrese un nuevo valor que cumpla esa condicion
