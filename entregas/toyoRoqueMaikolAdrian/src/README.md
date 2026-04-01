# Examen Parcial

En este directorio se llevará a cabo el desarrollo del examen parcial, mas especificamente la vista pública, comenzaré agregando la vista públicas desarrolladas en presencial para luego implmentar la vista privada. En principio podría encontrar problemas debido a algún error al crear las vistas públicas previamente. 

## Implementacion de vista privada

Habiendo implementado la vista privada de las clases auxiliares comenzaré a implementar la vista privada de la clase aparcamiento, lo lógico sería crear un array de plazas tomando el número de plazas que le paso como parámetro para crear el aparcamiento y de esta forma tener acceso a cada una de las plazas de forma independiente. El reto en este caso sería implementar los métodos de esta clase lo mejor posible sin poder modificar la vista pública anteriormente creada.

He decidido agregar un atributo estadoDePlazas a la clase aparcamiento para poder manejar el estado de cada plaza de una forma más eficiente respetando la vista publica de la clase.

## Prueba de cliente

En la vista publica del objeto no agregué ejecuciones en consola y me faltaron metodos por probar, en el commit anterior encontrarás la vista publica original del cliente, le pasaré mensajes a los distintos métodos e imprimiré los resultados en consola para probar que la logica de la vista privada de las clases haya sido implementada correctamente.

He cometido un error al pasarle el argumento "Activo" al constructor de la clase Plaza, cuando las variantes son "Disponible" u "Ocupado", para probar el metodo correctamente le pasaré una de estas dos variantes.

Me han faltado metodos que agregar a la vista publica de aparcamiento como registrarSalida, para registrar la salida de un vehiulo de una plaza determinada, de la misma forma en el caso del metodo registrarEntrada lo ideal hubiera sido pasarle el número de plaza como parámetro y no la plaza en sí, pues en un aparcamiento pueden haber más de una plaza de cada tipo por lo que es necesario saber que lugar ocupa esta plaza en el array para diferenciarla de las demás.

## Conclusiones

Al implementar la vista privada de las clases me he dado cuenta de ciertos errores que he cometido al crear las vistas públicas de las clases, me han faltado crear métodos en la clase aparcamiento como registrarSalida. Gracias a esto he podido comprender la importancia de establecer correctamente desde un principio las vistas públicas y las clases a utilizar.