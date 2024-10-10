## Primera entrega de analizador lexico

### Como correr el programa:

#### Opcion 1: Jar previamente compilado
```
    java -jar app.jar
```

#### Opcion 2: Compilar y ejecutar

Puede hacerse facilmente con la herramienta de gestion `maven`

Para instalarla en mac:
```
brew install maven
```

Una vez que ya tenemos maven ejecutar:

```
mvn clean compile
mvn package
java -jar target/testing2-1.0-SNAPSHOT.jar
```

### Archivos extra:
- `prueba.txt`: Archivo de prueba que contiene el codigo con el cual se realizaron pruebas del programa.
- `ts.csv`: Tabla de simbolos. Lo genera la aplicacion luego que el usuario toque el boton "Compilar".