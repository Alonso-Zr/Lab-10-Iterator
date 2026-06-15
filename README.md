**JUSTIFICACIÓN DE IMPLEMENTACIIÓN**

*Contexto*

Sistema para visualización de la asistencia de los trabajadores 
acceden los encargados de RR.HH.  Se desplega una lista que 
muestra detalladamente la asistencia y los datos principales 
de los trabajadores como nombre, apellido, telefóno. 
Se utilizara el patrón iteretator y como estructura de datos
utilizaremos los nodos. 

*Estructura de datos utilizada*
- Inicialmente se pensó en usar una Pila, 
  pero se descartó porque no funciona a favor de lo necesitado
- Usar Nodos permite que la estructura crece solo cuando
  un trabajador marca su entrada. Además, si necesitamos 
 insertar un registro en una hora específica para mantener 
 el orden cronológico, los nodos nos permiten enlazar
 al trabajador en su lugar exacto cambiando un enlace, sin 
 tener que empujar el resto de los registros.

*Patron de diseño utilizado*
- La elección de Iterator de diseño garantiza que el main
 que imprime los datos no necesite conocer la estructura interna. 
- El iterator se encarga de recorrer la estructura de principio
  a fin de manera secuencial, entregando
  los datos en el orden cronológico

*Algoritmo de ordenamiento*
- El algoritmo de ordenamiento utilizado
  es el Insertar Ordenado (Sorted Insert)
- El algoritmo evalúa cada dato en el instante que entra, 
  recorre la lista hasta encontrar su posición exacta y lo enlaza. 
  Debido a esto, la lista esta ordenada cronológicamente.