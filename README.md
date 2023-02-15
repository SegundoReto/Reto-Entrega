# Aplicación para realizar reservas. 1.0
---
## :coffee::coffee: Introducción :coffee::coffee:
En este documento vamos a explicar el contenido de este repositorio y los pasos a seguir para poder usarlo. En las distintas carpetas
se encuentran los archivos necesarios para ejecutar la aplicación y que esta envie emails y guarde toda la información en la base de datos.

      

---
## :robot::robot: Carpeta Programación :robot::robot:

En la carpeta de programación se encuentran todas las librerias necesarias para ejecutar el código del proyecto, que habrá que añadir
a nuestro IDE, en este caso IntelliJ.

Añadimos el proyecto.


![image](https://user-images.githubusercontent.com/113427191/219030848-2138e279-8e2f-4803-88aa-7a9def864adc.png)


Seleccionamos el directorio donde este la carpeta del proyecto y la abrimos.


![image](https://user-images.githubusercontent.com/113427191/219031207-ed5735eb-39d9-4cbe-9dd3-fa634697ab80.png)


Para poder ejecutar hara falta tener las librerias.


![image](https://user-images.githubusercontent.com/113427191/219027341-95ed74e1-276b-41f2-94b3-575b7ecbd0e7.png)


![image](https://user-images.githubusercontent.com/113427191/219027546-b95cc7e3-8e7e-41f7-bea2-86ab95db081d.png)


Le damos al + y añadimos todos los .jar, esto creara una librería para el proyecto en el que estemos trabajando.

## A tener en cuenta.
---

- **Para que no de ningún problema debemos de tener el SDK Java 19, si usamos cualquier otro la aplicación no se ejecutará.**

- **Si el IDE no reconoce las librerias simplemente lo reiniciamos.**

- **Algunas lineas de código de la aplicación requieren de ruta absoluta, es cuestión de poner la vuestra donde este el proyecto.**

- **A su vez la conexión con la base de datos usa una ip y puerto ya existentes, si queremos tener la base de datos en localhost habría que cambiarlo,
normalmente suele ser 'localhost/3306/nombredelabasededatos' y usuario y contraseña correspondientes**

## :scroll::scroll: Carpeta Bases de Datos :scroll::scroll:
---

Aqui encontraremos el .sql para crear la base de datos, es importante resaltar que solo funciona usando **MySQL**:dolphin: ya que la sintaxis suele ser distinta
en cada gestor.

El archivo .drawio se puede abrir facilmente desde un navegador.

## :triangular_flag_on_post::triangular_flag_on_post: Carpeta Lenguaje de Marcas :triangular_flag_on_post::triangular_flag_on_post:

---
Aqui podemos encontrar todos los html que contienen la página web del proyecto.

![image](https://user-images.githubusercontent.com/113427191/219080425-8499439e-3c76-40ae-af37-275011118072.png)

---
Tambien hay un esquema XML para validar la información que sacamos del registro de la aplicación.
:warning::warning: Carpeta de FOL :warning::warning:
---
Aqui tenemos por una parte un organigrama con los trabajadores, una evaluación de riesgos de cada puesto y por último el protocolo
de protección.
---

<sub>Ignacio Herrera, Iker Soto, Ekain Iraola y Iker Cao</sub>




