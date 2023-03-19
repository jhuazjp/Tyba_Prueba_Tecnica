# Pruebas de Automatizacion TYBA 
## Juan Pablo Sanabria Velandia

La presente automatizacion tiene por objetivo validar los diferentes casos de prueba para la plataforma Adventaje Demo

## Pre-requisitos 
* [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) - El IDE De preferencia
* [Chrome Driver](https://chromedriver.chromium.org/downloads) - driver para manipular el navegador chrome, descarga la version que tengas en tu PC
* [Java 8](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html) - El JDK para correr el robot
* [Gradle 6.9.3 o superior](https://gradle.org/install/) - El Gestor de dependencias

### Configuración 🔧

En el archivo  **serenity.conf**  se debe de establece la ruta en la cual se encuentra descargado los drivers para realizar la ejecucion de la automatizacion.
Al realizar la Modificar la ruta como se observa a continuacion **webdriver.chrome.driver**
```
drivers {
  windows {
    webdriver.chrome.driver="/Users/jupsa/Downloads/chromedriver_win32/chromedriver.exe"
    webdriver.edge.driver="/Users/jupsa/Downloads/edgedriver_win64/msedgedriver.exe"
  }
```
Agregar los siguientes pulguins a **IntellijIDEA**
- Gradle

- Gherkin

- Cucumber For Java

Una ves instalados, reiniciar el Intellij para tener listo el ambiente

### Ejecutando las pruebas ⚙️

#### Desde el entorno de desarrollo Intellij

* Si desea Ejecutar una suite de prueba ubicar el Archivo Runner correspondiente a la suite pruebas, dar clic derecho y Ejecuta o Run
* Si desea Ejecuta un caso en especia dar Clic en las flechas Verdes ubicadas lateralmente junto a los numeros de linea
#### Desde una terminal

*Para la ejecucion todo el conjunto de prueba
```
gradle clean test --tests *Runner
```
*Para la ejecucion de un grupo determinado de pruebas
```
gradle clean test --test AddProductsRunner
```
* Para ejecucion de un caso en particular 
```
gradle clean test -Dcucumber.filter.tags="@Prueba"
```
donde **@Prueba** corresponde al nombre del tag correspondiente al escenario a ejecutar en el **feature**
* Para la ejecucion en Edge 
```
gradle clean test aggregate -D"webdriver.driver"=edge
```
### Data de Pruebas ⚙️

Cada suite de pruebas contiene un archivo excel en la carpeta raiz del proyecto 
```
.src/main/resources/data/AddProducts.xlsx
.src/main/resources/data/CreateUser.xlsx
.src/main/resources/data/PayProducts.xlsx
```
Este excel sirve para validar el numero de pruebas a ejecutar y asi mismo si se desan cambiar los datos inmersos, ya que la automatizacion cuenta con la versatilidad de proveer los ejemplos de los casos de prueba atraves de este archivo
**NOTA**Para realizar la ejecucion de pruebas el archivo excel debe de estar cerrado ya que puede generar conflicto 

Adicionalmente cada hoja del excel corresponde a un caso de prueba especifico, por lo que es necesario tener presente que data se va a situar dentro de cada hoja para no generar conflicto o generar error en el caso de prueba debido a la data 

**NOTA:** En caso tal de que hayas instalado y configurado Gradle en tu maquina, debes ejecutar las lineas anteriores con el comando `gradle` en lugar de `gradlew` 
o puedes cambiar la configuracion de intellijIDEA para mapear la ruta en donde se encuentra almacenado Gradle 

## Ubicación reporte de pruebas generado
Se genera en:  `target/site/serenity/index.htm