¿Cuál es la diferencia técnica entre un tipo primitivo y una clase 
envolvente (Wrapper) en Java al manejar datos para el Modelo?

En Java los tipos primitivos(como int, double y boolean) almacenan el valor
 directo en la memoria y no puede ser null, por lo que siempre requieren 
un valor por defecto.

Por otro lado, la sclases envolventes,(osea Wrapper) son objetos escenciales
que vuelven al primitivo y si pueden tomar el valor null.

En la capa del Molde:
1. Manejo de bases de datos: Las clases Wrapper son esenciales para mapear campos 
de bases de datos donde una columna permite valores NULL o donde el ID(osea el usuario)
auto-incremental es null antes de insertarse.

2. Uso de Colecciones: Estructuras de datos como List o Map en Java solo aceptan objetos 
(ej. List<Integer>), por lo que no es posible utilizar tipos primitivos directos.