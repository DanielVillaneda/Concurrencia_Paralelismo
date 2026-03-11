# Jean Carlos Godoy - Elkin Daniel Villaneda
# ¿Qué diferencia existe entre paralelismo y concurrencia?

La concurrencia es la capacidad de un sistema para manejar varias tareas al mismo tiempo, pero no necesariamente ejecutándolas exactamente al mismo instante. En muchos casos, el procesador alterna rápidamente entre tareas, dando la impresión de que se ejecutan simultáneamente.

El paralelismo, en cambio, ocurre cuando varias tareas se ejecutan realmente al mismo tiempo, normalmente utilizando múltiples núcleos del procesador. Cada núcleo puede ejecutar un hilo diferente de manera simultánea.

# ¿Qué problema ocurre cuando varios hilos acceden al mismo recurso?

Cuando varios hilos acceden al mismo recurso (por ejemplo una variable, un archivo o una base de datos) pueden interferir entre sí, especialmente si al menos uno de ellos modifica ese recurso.

Esto puede provocar: 

- Resultados incorrectos
  
- Datos inconsistentes
  
- Pérdida de información
  
- Comportamientos impredecibles en el programa.

Este problema aparece porque los hilos ejecutan instrucciones de forma no controlada ni ordenada.

# ¿Qué es una condición de carrera (Race Condition)?

Una condición de carrera ocurre cuando dos o más hilos acceden simultáneamente a un recurso compartido y el resultado final depende del orden en que se ejecuten las operaciones.

Como el orden de ejecución de los hilos no es predecible, el resultado del programa puede cambiar cada vez que se ejecuta.

# ¿Por qué es importante sincronizar el acceso a recursos compartidos?

La sincronización es importante porque garantiza que solo un hilo a la vez pueda acceder o modificar un recurso compartido, evitando conflictos entre hilos.

Al sincronizar el acceso se logra:

- Mantener la integridad de los datos

- Evitar condiciones de carrera

- Obtener resultados correctos y consistentes

- Controlar el acceso a recursos críticos del programa
