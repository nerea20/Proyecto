# Cuida a los tuyos

**Proyecto Intermodular · 2.º DAW**

## 1. Descripción

He elegido desarrollar **Cuida a los tuyos**, una plataforma web para facilitar el contacto entre familias que necesitan apoyo para cuidar de personas mayores y cuidadores/as que ofrecen sus servicios. Mi idea es incluir perfiles, experiencia y cualificaciones, disponibilidad, búsqueda por proximidad y valoraciones.

## 2. Tecnologías elegidas

- **Frontend:** Angular con TypeScript, HTML y CSS.
- **Backend:** Java 21 con Spring Boot.
- **Base de datos:** MySQL 8.4.
- **Contenedores:** Docker y Docker Compose.
- **Editor recomendado:** Visual Studio Code.

El frontend Angular está pendiente de generarse. En esta primera versión, Docker Compose levanta la base de datos y el backend inicial.

## 3. Requisitos previos

Antes de empezar, necesito tener instalado Git, Docker Desktop (Windows/macOS) o Docker Engine y Docker Compose (Linux). Recomiendo usar Visual Studio Code para editar el proyecto. En el primer arranque hace falta conexión a Internet para descargar las imágenes de Docker y las dependencias de Java.

## 4. Clonar el repositorio y ejecutar el proyecto

https://github.com/nerea20/Proyecto

### Paso 1. Clonar el repositorio

```bash
git clone https://github.com/nerea20/Proyecto.git
cd Cuida_a_los_tuyos_Sesion4
```

Si Git crea una carpeta con otro nombre, entro en esa carpeta.

### Paso 2. Crear el archivo de entorno

En macOS/Linux o una terminal Bash:

```bash
cp .env.example .env
```

En Windows PowerShell:

```powershell
Copy-Item .env.example .env
```

Después abro `.env` y cambio las contraseñas de ejemplo. 

### Paso 3. Arrancar los contenedores

Desde la carpeta raíz del proyecto:

```bash
docker compose up -d --build
```

En versiones antiguas de Docker Compose, el comando puede ser `docker-compose up -d --build`.

### Paso 4. Comprobar que funcionan

```bash
docker compose ps
```

Abro en el navegador `http://localhost:8080/api/health`. La respuesta esperada es:

```json
{"status":"ok","application":"Cuida a los tuyos"}
```

Para ver los registros del backend:

```bash
docker compose logs -f backend
```

Para detener los servicios:

```bash
docker compose down
```

Si ejecuto `docker compose down -v`, también elimino el volumen de MySQL y puedo perder los datos guardados.

## 5. Servicios incluidos y estado actual

- **MySQL 8.4:** base de datos local configurada mediante variables de entorno.
- **Backend Spring Boot:** API inicial con el endpoint `/api/health`.
- **Frontend Angular:** todavía tengo que generarlo.

Esta es una base inicial del entorno, no la aplicación completa.

## 6. Seguridad y datos personales

Durante el desarrollo utilizaré datos ficticios. No incluiré información real de personas mayores o cuidadores en pruebas ni en repositorios públicos. Antes de publicar la aplicación, tendré que configurar HTTPS, permisos, copias de seguridad y definir la base jurídica y los plazos de conservación de los datos. También revisaré las condiciones de los proveedores y las posibles transferencias internacionales.

## 7. Licencias

He incluido en la memoria una revisión inicial de las licencias de las tecnologías elegidas. Antes de publicar o distribuir el proyecto, comprobaré las licencias de las versiones exactas y de sus dependencias, especialmente las de Java y MySQL. Esta revisión es orientativa y no sustituye una comprobación legal.