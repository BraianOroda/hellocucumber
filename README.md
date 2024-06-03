# Proyecto Selenium + Java

Este proyecto comprende un framework de automatizacion utilizando Selenium + Java + Cucumber.

### Notas:
Comando para ejecutar los test por defecto
```
mvn test
```

Ejecutar los test seteado con el perfil QA
```
mvn -Pqa test
```
Ejecutar un test usando un tag en especifico 
```
mvn test -Dcucumber.filter.tag="@tag" 
```
