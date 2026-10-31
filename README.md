# Integrantes

- Samuel David Hernández Narváez
- Jorge Samuel Morelo Martínez

# Ejemplos Java: Bridge y Visitor

Este proyecto contiene cuatro ejemplos independientes para el taller de Programación III:

- `Bridge/Inicial`: notificaciones con condiciones para cada combinación.
- `Bridge/Refactorizada`: patrón Bridge, separando tipo de notificación y medio de envío.
- `Visitor/Inicial`: operaciones resueltas con condiciones dentro de las clases.
- `Visitor/Refactorizada`: patrón Visitor, separando las operaciones en visitantes.

## Requisitos

- JDK instalado (Java 8 o superior).
- Terminal o consola.

Cada carpeta contiene un `Main.java` independiente. No compiles todos los archivos juntos porque cada ejemplo tiene su propia clase `Main`.

## Cómo ejecutar un ejemplo

En la terminal, entra a la carpeta del ejemplo. Por ejemplo:

```bash
cd Bridge/Inicial
javac Main1.java
java Main1
```

Para ejecutar los demás, cambia a la carpeta correspondiente:

```bash
cd Bridge/Refactorizada
javac Main2.java
java Main2
```

```bash
cd Visitor/Inicial
javac Main3.java
java Main3
```

```bash
cd Visitor/Refactorizada
javac Main4.java
java Main4
```

En Windows, puedes abrir la carpeta del ejemplo en VS Code, abrir la terminal integrada y ejecutar los mismos comandos.

## Qué observar

### Bridge

En la versión inicial, la clase `Notificacion` debe conocer todas las combinaciones de tipo y medio. En la refactorizada, las notificaciones usan la interfaz `MedioEnvio`, y los medios (`CorreoElectronico`, `MensajeSMS`) se pueden cambiar de forma independiente.

### Visitor

En la versión inicial, las clases `Estudiante` y `Curso` deciden qué operación ejecutar con condiciones. En la refactorizada, los elementos implementan `aceptar(visitor)` y las operaciones se implementan en visitantes concretos como `InformeVisitor` y `EstadisticasVisitor`.

