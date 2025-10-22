# Sistema de Administración de Provincias y Ciudades
*Gestión de impuestos, gastos y análisis financiero de ciudades.*



##  Descripción general
Este proyecto en **Java** permite gestionar distintas **provincias** y sus **ciudades**, registrando los impuestos y gastos de cada una.lo cual quiere decir que los archivos dentro de la carpeta llevan la extension `.java` ejemplo: `administrador.java`.
El sistema puede determinar qué ciudades están en déficit y si más de la mitad de las ciudades de una provincia se encuentran en esa situación mostrando asi por pantalla su nombre y estado.
esto permite ver la situciacion de cada provincia en relacion de sus ciudades, pero para chequear su situacion financiera debe contar con un minimo de habitantes.

#### Estructura de carpetas
  
```plaintext
trabajoDocumentacion/
├── src/
│   ├── Ciudad.java
│   ├── Provincia.java
│   └── Administrador.java
└── README.md
```




## Estado del proyecto
Proyecto **estable** y **funcional** pero siempre puede haber algo para mejorar.  
Fue desarrollado con fines educativos para practicar programación orientada a objetos y la implementacion del uso de **Javadoc**, donde no lo pujde realizar de manera positiva por unos incovenientes de los programas.



## Características principales del sistema
- Registro de **ciudades** con sus habitantes, impuestos y gastos.  
- Asociación de **ciudades a provincias**.  
- Cálculo de:
          - Total de impuestos recaudados.  
          - Resultado económico de cada ciudad en relacion a los ingresos y egresos.  
          - Ciudades en **déficit**.  
          - Provincias con más de la mitad de ciudades en déficit.  
- Validación de datos y manejo de excepciones.



## Tecnologías utilizadas
- **Lenguaje:** Java 
- **Versión recomendada:** JDK 17 o superior  (en este caso usamos el JDK-19) [Descargar JDK](https://www.oracle.com/java/technologies/downloads/).
- **Entorno de desarrollo:** Visual Studio Code
- **Herramienta de documentación:** `javadoc`



## Instalación / Requisitos previos
1. Tener instalado **JDK 17** o superior.  
2. Configurar correctamente la variable de entorno `JAVA_HOME`.  
3. Clonar o descargar el proyecto si se tiene en otra plataforma o entorno.  
4. Abrir la carpeta en tu entorno preferido (VS Code en este caso).



## Uso
el sistema se puede utilizar para poder tener un control de las ciudsdes y comprobar y comparar sus estados.
este puede ser uno de sus usos: queremos cargar las ciudades de la provincia de buenos aires, para ver su situacion economica, debemos caragr sus habitantes, los impuestos que recolecta(ingresos) y los gastos que genera (egresos) , luego con los metodos se calcula el resultado y muestra por pantalla si esta provincia tiene ciudades en deficit, cuantas y cual es su nombre en el caso de que esta provincia tenga mas de la mita de las ciudades en deficit

## Ejemplos y capturas
este es una muestra del codigo y como esta comentado ya que no pude realizar el javadoc
![parte de codigo](TrabajoDocumentacio/img/Muestra)
