/*
1- Explique brevemente en qué consisten los siguientes Algoritmos Fundamentales.
Algoritmos de Ordenación
- Ordenamiento por Inserción: inicialmente se tiene un solo elemento, que por defecto es
un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a
mayor, se toma el elemento k+1 y se compara con todos los elementos ya
ordenados, deteniéndose cuando se encuentra un elemento menor (todos los
elementos mayores han sido desplazados una posición a la derecha) o cuando ya
no se encuentran elementos (todos los elementos fueron desplazados y este es el
más pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los
demás elementos. 
- Algoritmo de la burbuja: Este algoritmo consiste en comparar cada elemento de la lista con el siguiente, 
si no están en el orden correcto, se intercambian entre sí sus valores. El
valor más pequeño flota hasta el principio de la lista como si fuera una burbuja en
un vaso de gaseosa.
- Ordenamiento por selección: inicialmente se recorre toda la lista buscando el
menor de todos los elementos, una vez terminada la recorrida el menor elemento
se coloca al inicio de la lista recorrida. En la siguiente iteración se recorre
nuevamente la lista pero comenzando en el segundo elemento. El procedimiento
continúa hasta que el último elemento recorrido es el menor de su subconjunto. 
- Algoritmo Quick-Sort: Elegimos un elemento de la lista de elementos a ordenar, al que llamaremos pivote. 
Resituamos los demás elementos de la lista a cada lado del pivote, de manera que a un lado queden todos los 
menores que él, y al otro los mayores. Los elementos iguales al pivote pueden ser colocados tanto a su 
derecha como a su izquierda, dependiendo de la implementación deseada. En este momento, el pivote ocupa
exactamente el lugar que le corresponderá en la lista ordenada. La lista queda separada en dos sublistas,
una formada por los elementos a la izquierda del pivote, y otra por los elementos a su derecha.
Repetimos este proceso de forma recursiva para cada sublista mientras éstas contengan más de un elemento.
Una vez terminado este proceso todos los elementos estarán ordenados.
Como se puede suponer, la eficiencia del algoritmo depende de la posición en la
que termine el pivote elegido, algunas alternativas son: Tomar un elemento cualquiera como pivote,
tiene la ventaja de no requerir ningún cálculo adicional, lo cual lo hace bastante rápido. Otra opción 
puede ser recorrer la lista para saber de antemano qué elemento ocupará la posición central de la lista, 
para elegirlo como pivote. No obstante, el cálculo adicional rebaja bastante la eficiencia del algoritmo
en el caso promedio. La opción a medio camino es tomar tres elementos de la lista - por ejemplo, el
primero, el segundo, y el último - y compararlos, eligiendo el valor del medio como pivote.
Algoritmos de Búsqueda
- Búsqueda Secuencial: Este algoritmo busca el elemento dado, recorriendo secuencialmente la 
lista desde un elemento al siguiente, comenzando en la primera posición de la lista y se detiene
cuando encuentra el elemento buscado o bien se alcanza el final de la lista sin haberlo encontrado.
El algoritmo debe comprobar primero el elemento almacenado en la primera posición de la lista, 
a continuación, el segundo elemento y así sucesivamente, hasta que se encuentra el elemento buscado
o se termina el recorrido de la lista
- Búsqueda Binaria: Este algoritmo se utiliza cuando disponemos de una lista ordenada, lo que nos
permite facilitar la búsqueda, ya que podemos ir disminuyendo el espacio de búsqueda a segmentos 
menores a la lista original y completa. La idea es no buscar en aquellos segmentos de la lista donde
sabemos que el valor seguro que no puede estar, considerando que la lista esta ordenada. 
Algoritmos de Recorrido
- Recorrido de Profundidad:  todos los descendientes de un hijo se procesan antes
del siguiente hijo. Para saber cómo regresarnos, vamos guardando los nodos 
visitados en una estructura de pila. Es por esto que se acostumbra programar 
esta búsqueda de forma recursiva, con lo que el manejo de la pila lo realiza 
el lenguaje de programación utilizado. 
- Recorrido de Anchura: el proceso se realiza horizontalmente desde el raıź a
todos sus hijos, a continuación, a los hijos de sus hijos y así ́ sucesivamente hasta
que todos los nodos han sido procesados. En otras palabras, en el recorrido en
anchura, cada nivel se procesa totalmente antes de que comience el siguiente
nivel. Para poder saber qué vértices visitar, utilizamos una cola. 
 */
