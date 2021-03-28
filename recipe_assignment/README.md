# Title
My Favourite Recipes

## Recipe Application
This is a java spring boot rest application that retrives, inserts, updates and deletes recipes Using H2 Database. 


### About the Recipe Menu
* Application describes its attribute as creation of recipes date and time (formatted as dd-MM-YYYY HH:MM). 
* Categorize into veg or nonveg 
* Provide deatail of Number of people its serves as Order Count.
* Ingredients as a list along with cooking instructions.

### Requirements
 
#### Prerequisites

* [Java 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Maven 3.6.3 +](https://maven.apache.org/download.cgi) - Build tool
* Executing/Running shema.sql using (http://localhost:8080/h2-console).

#### Pull from git 
```
$ git clone https://github.com/Sheeba-Banu/Recipes
$ cd Recipes
```

### Build & run 

* Run test
```
$ mvn test
```

* Run the web server on dev mode
```
$ mvn spring-boot:run
```

* Run the web server on prod mode
```
$ mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

### Rest Services
After running the project & browse
Authentication : http://localhost:8080
Get all the recipes:  http://localhost:8080/recipes
Get recipe  based on Id: http://localhost:8080/recipes/{id}
Adding new recipe: http://localhost:8080/recipes
Updating recipe based on Id: http://localhost:8080/recipes/{id}
Deleting recipe based on Id: http://localhost:8080/recipes/{id}

** Replace '{id}' with integer value

### Built With
* [Spring boot 2.0.X](https://projects.spring.io/spring-boot/) -Backed Framework
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Sheeba Banu**