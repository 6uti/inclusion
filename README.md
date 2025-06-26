# Test Inclusion

**Test Inclusion** es una aplicación Java Spring Boot que permite resolver operaciones matemáticas basadas en una lista de entradas (test cases), mediante una API REST o una interfaz web construida con Thymeleaf. El proyecto ha sido desplegado en un servidor EC2 de AWS.

---

## 🚀 Tecnologías

- Java 21
- Spring Boot
- Thymeleaf (Frontend)
- JUnit (Tests)
- AWS EC2 (Despliegue)
- Maven

---

## 🧮 Funcionalidad

La aplicación recibe una lista de objetos con 3 valores enteros (`x`, `y`, `n`) y calcula el valor más grande menor o igual que `n` que cumple con la expresión:

```text
result = n - (n - y) % x
```

Puedes usar tanto una API REST como un formulario web.

---

## 🌐 Endpoints disponibles

### 🔹 Interfaz Web (Thymeleaf)

- `GET /`  
  Muestra el formulario para ingresar casos de prueba.

- `POST /solve-form`  
  Procesa los datos del formulario y muestra los resultados.

### 🔹 API REST

- `POST /api/solve`  
  Recibe un `application/json` con una lista de casos y devuelve los resultados.

```json
{
  "testCases": [
    { "x": 7, "y": 5, "n": 123 },
    { "x": 5, "y": 0, "n": 4 }
  ]
}
```

🔁 Respuesta:

```json
{
  "results": [119, 0]
}
```

---

## 📂 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com.prueba.inclusion.inclusion/
│   │       ├── controller/
│   │       ├── dto/
│   │       ├── service/
│   │       └── InclusionApplication.java
│   └── resources/
│       └── templates/       ← Vistas Thymeleaf (index.html, result.html)
└── test/
    └── java/                ← Tests con JUnit
```

---

## ⚙️ Configuración y ejecución

### 📦 Compilar el proyecto

```bash
mvn clean package
```

### ▶️ Ejecutar localmente

```bash
java -jar target/inclusion-0.0.1-SNAPSHOT.jar
```

### 🌍 Acceder a la app

- Frontend: [http://localhost:8080/](http://localhost:8080/)
- API REST: `POST http://localhost:8080/api/solve`

---

## ☁️ Despliegue en AWS EC2

1. Crear y configurar una instancia EC2 (Amazon Linux o Ubuntu)
2. Instalar Java 21 y Maven
3. Subir el `.jar` vía SCP o SFTP
4. Ejecutar:

```bash
java -jar test-inclusion.jar
```

Asegúrate de abrir el puerto `8080` en el grupo de seguridad de tu instancia.

---

## 🧪 Pruebas

Los métodos clave están cubiertos por tests unitarios usando **JUnit 5**.

```bash
mvn test
```

---

## 📄 Licencia

Este proyecto se publica bajo licencia MIT.  
Desarrollado con fines educativos y prácticos.

---

## ✍️ Autor

**Jonathan Gutierrez Rojas**  
Contacto: jgutierrezrojas17@gmail.com
