# Proyecto Integrador Manejador de Eventos Escolares

## Descripción
Este proyecto es una API RESTful desarrollada con Spring Boot que implementa un sistema de gestión de eventos que permite registrar, actualizar por id, buscar po id,buscar todos y eliminar . 

## Tecnologías Utilizadas
- Java 21
- Spring Boot 3.4.3
- Spring Security
- Spring Data JPA
- MySQL / PostgreSQL
- JWT (JSON Web Tokens)
- Maven
- Docker
- Swagger / OpenAPI

## Estructura del Proyecto

```
.
├── .mvn/                  # Configuración de Maven Wrapper
├── docs/                  # Documentación del proyecto
├── src/                   # Código fuente
│   ├── main/
│   │   ├── java/         
│   │   │   └── com/cesde/proyecto_integrador/
│   │   │       ├── config/       # Configuraciones Spring
│   │   │       │   └── data/     # Config acceso a datos
│   │   │       ├── controller/   # Endpoints API REST
│   │   │       ├── dto/          # Objetos transferencia
│   │   │       ├── exception/    # Manejo de errores
│   │   │       ├── model/        # Entidades dominio
│   │   │       ├── repository/   # Interfaces JPA
│   │   │       ├── security/     # Autenticación JWT
│   │   │       └── service/      # Lógica de negocio
│   │   │           └── impl/     # Implementaciones
│   │   └── resources/     # Recursos y configuraciones
│   └── test/
│       └── java/         # Pruebas unitarias
├── .dockerignore          
├── .env                   
├── .gitattributes         
├── .gitignore             
├── Dockerfile             
├── mvnw                   
├── mvnw.cmd               
├── pom.xml                
├── project.toml           
└── README.md              
```

## Configuración del Entorno

### Archivo .env
Crea un archivo `.env` en la raíz del proyecto con las siguientes variables:


### Base de Datos
La base de datos que se esta utilizando es MySQL
- CONFIGURACION DE LAS CREDENCIALES EN .ENV
 MySQL
DB_URL=jdbc:mysql://localhost:3306/data_pi?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC
DB_USERNAME=root
DB_PASSWORD=tu_contraseña

### Endpoints principales
- GET
- POST
- PUT
- DELETE
- la API estará disponible en: http://localhost:8080
- en el archivo json se encuentran los link especificos de cada entidad
###
Estas son las entidades que tienen funcionalidad 
- AsistenciaEvento
- CategoriaEventgo
- Estudiante
### Peticiones en EchoApi

## Estructura de Código Fuente

### Paquetes Principales
```
com.cesde.proyecto_integrador/
├── config/                # Configuraciones (CORS, OpenAPI, Security)
│   └── data/             # Carga inicial de datos
├── controller/            # Controladores REST por rol
├── dto/                   # DTOs para usuarios y categorías
├── exception/             # Manejo global de excepciones
├── model/                 # Entidades (User, Profile)
├── repository/            # Repositorios JPA
├── security/              # Configuración JWT
├── service/               # Servicios por rol de usuario
│   └── impl/             # Implementaciones de servicios
└── ProyectoIntegradorApplication.java
```

## Dependencias del Proyecto

A continuación se detallan las dependencias utilizadas en el proyecto, organizadas por categorías:

### Core de Spring Boot

- **spring-boot-starter-data-jpa**: Proporciona soporte para JPA (Java Persistence API), facilitando el acceso y la manipulación de bases de datos relacionales mediante ORM.
- **spring-boot-starter-web**: Incluye todo lo necesario para desarrollar aplicaciones web, incluyendo RESTful, usando Spring MVC y Apache Tomcat como servidor embebido.
- **spring-boot-devtools**: Herramientas para el desarrollo que permiten la recarga automática de la aplicación cuando se detectan cambios en el código.
- **spring-boot-starter-test**: Proporciona dependencias para pruebas unitarias e integración, incluyendo JUnit, Mockito y Spring Test.
- **spring-boot-starter-validation**: Ofrece validación de datos mediante la implementación de Bean Validation con Hibernate Validator.

### Seguridad

- **spring-boot-starter-security**: Implementa características de seguridad, autenticación y autorización en la aplicación.
- **jjwt (0.9.1)**: Biblioteca para crear y validar JSON Web Tokens (JWT), utilizada para la autenticación basada en tokens.
- **jaxb-api (2.3.1)** y **jaxb-runtime (2.3.1)**: Necesarios para el procesamiento XML en Java 9+, requeridos por JJWT para su funcionamiento correcto.

### Documentación de API

- **springdoc-openapi-starter-webmvc-ui (2.8.5)**: Genera automáticamente documentación OpenAPI 3 para APIs REST y proporciona Swagger UI para visualizar e interactuar con la API.

### Utilidades

- **lombok**: Reduce el código repetitivo (getters, setters, constructores, etc.) mediante anotaciones, mejorando la legibilidad y mantenibilidad del código.

Estas dependencias conforman el ecosistema tecnológico del proyecto, proporcionando las herramientas necesarias para el desarrollo de una API RESTful robusta, segura y bien documentada.

