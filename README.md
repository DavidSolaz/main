# Mandelbrot Java con Gradle

Este proyecto permite visualizar el conjunto de Mandelbrot usando Java puro y Gradle en IntelliJ IDEA.

## Estructura

```
main/
├── build.gradle
├── README.md
├── .gitignore
└── src/
    └── main/
        └── java/
            └── com/
                └── davidsolaz/
                    └── mandelbrot/
                        └── Mandelbrot.java
```

## Cómo ejecutar

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/DavidSolaz/main.git
   cd main
   ```

2. **Abre el proyecto en IntelliJ IDEA.**

3. **Ejecuta con Gradle:**
   ```
   ./gradlew run
   ```
   O desde IntelliJ: ve al panel Gradle y ejecuta la tarea `application > run`.

## Frontend

El frontend gráfico está hecho en Java Swing. Al ejecutar el proyecto se abrirá una ventana mostrando el conjunto de Mandelbrot.

---