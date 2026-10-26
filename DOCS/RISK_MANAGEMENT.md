# Gestión de riesgos técnicos y prevención (PRL)

## Proyecto: Cuida a los tuyos

**Módulo:** Proyecto Intermodular --- 2.º DAW\
**Repositorio:** \https://github.com/nerea20/Proyecto\
**Autora:** \Nerea\
**Fecha:** 26/10/2026

------------------------------------------------------------------------

## 1. Identificación y registro de riesgos técnicos

En mi proyecto **Cuida a los tuyos** voy a desarrollar una plataforma
web que permita poner en contacto a familias que necesitan cuidados para
personas mayores con cuidadores que ofrecen sus servicios. Los usuarios
podrán crear perfiles, consultar la experiencia y las cualificaciones de
los cuidadores, revisar su disponibilidad, buscar por ubicación y
consultar valoraciones.

Durante la planificación del proyecto he identificado seis riesgos
técnicos que podrían afectar al funcionamiento, la seguridad o el avance
del desarrollo.

  ------------------------------------------------------------------------
  Código            Área              Riesgo            Descripción y
                                      identificado      posibles
                                                        consecuencias
  ----------------- ----------------- ----------------- ------------------
  RT-01             Backend           Errores en la     Los errores al
                                      gestión de        registrar
                                      usuarios y        usuarios, iniciar
                                      perfiles          sesión o guardar
                                                        perfiles pueden
                                                        impedir que se
                                                        utilice
                                                        correctamente la
                                                        plataforma.

  RT-02             Frontend          Fallos en         Los formularios
                                      formularios e     podrían no validar
                                      interfaz          los datos
                                                        correctamente o
                                                        presentar errores
                                                        de navegación.

  RT-03             Base de datos     Pérdida o         Un error de base
                                      corrupción de     de datos o de los
                                      datos             volúmenes de
                                                        Docker podría
                                                        provocar la
                                                        pérdida de
                                                        perfiles,
                                                        cualificaciones,
                                                        disponibilidad o
                                                        valoraciones.

  RT-04             Infraestructura y Fallos al         Una configuración
                    despliegue        ejecutar los      incorrecta de
                                      servicios con     Docker Compose,
                                      Docker            variables de
                                                        entorno o
                                                        conexiones podría
                                                        impedir que
                                                        arranquen los
                                                        servicios.

  RT-05             Seguridad         Acceso no         Una configuración
                                      autorizado o      incorrecta,
                                      exposición de     permisos
                                      datos personales  inadecuados o
                                                        credenciales
                                                        publicadas podrían
                                                        exponer
                                                        información de los
                                                        usuarios.

  RT-06             Equipo y control  Conflictos o      Una mala gestión
                    de versiones      pérdida de        de ramas o cambios
                                      cambios en Git    simultáneos puede
                                                        provocar
                                                        conflictos,
                                                        pérdida de cambios
                                                        y retrasos.
  ------------------------------------------------------------------------

## 2. Matriz de evaluación de riesgos

He utilizado una escala del 1 al 5 para valorar la probabilidad (P) y el
impacto (I). El nivel de riesgo se calcula con la fórmula **R = P × I**.

  -----------------------------------------------------------------------------
  Código     Riesgo                    P             I       Cálculo Nivel
  ---------- ------------- ------------- ------------- ------------- ----------
  RT-01      Errores en la             3             4    3 × 4 = 12 Moderado
             gestión de                                              
             usuarios y                                              
             perfiles                                                

  RT-02      Fallos en                 3             3     3 × 3 = 9 Moderado
             formularios e                                           
             interfaz                                                

  RT-03      Pérdida o                 3             5    3 × 5 = 15 Crítico
             corrupción de                                           
             datos                                                   

  RT-04      Fallos al                 3             4    3 × 4 = 12 Moderado
             ejecutar los                                            
             servicios con                                           
             Docker                                                  

  RT-05      Acceso no                 3             5    3 × 5 = 15 Crítico
             autorizado o                                            
             exposición de                                           
             datos                                                   
             personales                                              

  RT-06      Conflictos o              3             3     3 × 3 = 9 Moderado
             pérdida de                                              
             cambios en                                              
             Git                                                     
  -----------------------------------------------------------------------------

### Justificación de las puntuaciones

-   **RT-01:** he valorado este riesgo con probabilidad 3 e impacto 4
    porque los errores del backend pueden impedir que las familias y los
    cuidadores se registren o consulten sus perfiles.
-   **RT-02:** he asignado probabilidad 3 e impacto 3 porque los fallos
    de validación o navegación pueden dificultar el uso de la
    plataforma.
-   **RT-03:** he asignado probabilidad 3 e impacto 5 porque la pérdida
    de datos podría afectar a perfiles, cualificaciones, disponibilidad
    y valoraciones.
-   **RT-04:** he asignado probabilidad 3 e impacto 4 porque una
    configuración incorrecta puede impedir la comunicación entre el
    backend y MySQL y retrasar las pruebas.
-   **RT-05:** he asignado probabilidad 3 e impacto 5 porque una brecha
    de seguridad podría comprometer la privacidad de los usuarios.
-   **RT-06:** he asignado probabilidad 3 e impacto 3 porque los
    conflictos de versiones pueden hacerme perder tiempo y retrasar el
    desarrollo.

### Clasificación de severidad

-   **Bajo (verde):** de 1 a 6.
-   **Moderado (amarillo):** de 8 a 12.
-   **Crítico (rojo):** de 15 a 25.

Según mi evaluación, RT-01, RT-02, RT-04 y RT-06 son moderados. RT-03 y
RT-05 son críticos. No he asignado ningún riesgo a la categoría baja.

## 3. Matriz gráfica de severidad 5 × 5

Las filas representan la probabilidad y las columnas el impacto. He
situado los seis riesgos en las celdas que corresponden a sus
puntuaciones.

  -----------------------------------------------------------------------------------
  Probabilidad /            1 ---    2 --- Menor 3 ---      4 ---      5 ---
  Impacto          Insignificante                Moderado   Mayor      Catastrófico
  -------------- ---------------- -------------- ---------- ---------- --------------
  **5 --- Muy                   5             10 15         20         25
  alta**                                                               

  **4 --- Alta**                4              8 12         16         20

  **3 ---                       3              6 **9 ---    **12 ---   **15 ---
  Media**                                        RT-02,     RT-01,     RT-03, RT-05**
                                                 RT-06**    RT-04**    

  **2 --- Baja**                2              4 6          8          10

  **1 --- Muy                   1              2 3          4          5
  baja**                                                               
  -----------------------------------------------------------------------------------

**Leyenda:** verde = bajo (1--6); amarillo = moderado (8--12); rojo =
crítico (15--25). En Markdown estándar las celdas no se colorean
automáticamente, así que indico la clasificación mediante esta leyenda.

## 4. Fichas del plan de contingencia

He seleccionado RT-05 y RT-03, con nivel crítico 15, y RT-04, con nivel
moderado 12. He elegido RT-04 como tercer riesgo prioritario por su
importancia para arrancar y probar los servicios del proyecto.

### 4.1. RT-05 --- Acceso no autorizado o exposición de datos personales

**Descripción:** una configuración de seguridad incorrecta, permisos
inadecuados o la publicación accidental de credenciales podría permitir
el acceso a información privada.\
**Probabilidad:** 3. **Impacto:** 5. **Nivel:** 3 × 5 = 15 (crítico).

**Disparador:** consideraré que el riesgo se ha materializado si detecto
una contraseña real publicada en GitHub, un usuario sin autorización
accede a datos privados o aparecen accesos sospechosos en los registros.

**Medidas preventivas:** - Excluir `.env` del repositorio mediante
`.gitignore`. - Utilizar `.env.example` con valores de ejemplo, nunca
credenciales reales. - Revisar los permisos de acceso y los cambios
antes de publicar. - Evitar almacenar o mostrar datos personales que no
sean necesarios.

**Plan de contingencia:** 1. Detendré temporalmente la funcionalidad
afectada si existe riesgo de exposición. 2. Identificaré qué información
se ha expuesto y el origen del problema. 3. Cambiaré o revocaré
inmediatamente cualquier contraseña o clave real filtrada. 4. Corregiré
los permisos o la configuración que causó el problema. 5. Revisaré los
registros disponibles para determinar el alcance. 6. Haré pruebas para
comprobar que el acceso no autorizado ya no es posible. 7. Documentaré
el incidente y las medidas adoptadas.

**Responsable:** yo misma, como desarrolladora del proyecto.

### 4.2. RT-03 --- Pérdida o corrupción de datos

**Descripción:** un error en la base de datos, una modificación
incorrecta del esquema o un problema con los volúmenes de Docker podría
provocar la pérdida de perfiles, cualificaciones, disponibilidad o
valoraciones.\
**Probabilidad:** 3. **Impacto:** 5. **Nivel:** 3 × 5 = 15 (crítico).

**Disparador:** consideraré que el riesgo se ha materializado si faltan
datos guardados, aparecen errores de lectura o escritura o el servicio
no recupera los datos tras reiniciarse.

**Medidas preventivas:** - Realizar copias de seguridad periódicas. -
Utilizar volúmenes persistentes. - Probar las modificaciones de la base
de datos antes de aplicarlas. - No eliminar volúmenes de Docker sin
comprobar antes su contenido. - Verificar que las copias de seguridad se
pueden restaurar.

**Plan de contingencia:** 1. Detendré las operaciones que puedan agravar
la pérdida. 2. Revisaré los registros de la base de datos y el estado de
los contenedores. 3. Comprobaré si los datos siguen en el volumen
persistente. 4. Si los datos se han perdido o dañado, restauraré la
última copia de seguridad válida. 5. Corregiré la modificación del
esquema o volveré a una versión estable si fuera necesario. 6.
Reiniciaré los servicios necesarios y comprobaré la conexión con la base
de datos. 7. Verificaré que los datos recuperados son correctos.

**Responsable:** yo misma, encargándome del backend y de la base de
datos.

**Precaución:** no ejecutaré `docker compose down -v` como primera
medida, ya que puede eliminar volúmenes y provocar una pérdida
adicional.

### 4.3. RT-04 --- Fallos al ejecutar los servicios con Docker

**Descripción:** una configuración incorrecta de Docker Compose, de las
variables de entorno o de la conexión entre el backend y MySQL podría
impedir que los servicios arranquen o se comuniquen.\
**Probabilidad:** 3. **Impacto:** 4. **Nivel:** 3 × 4 = 12 (moderado).

**Disparador:** consideraré que el riesgo se ha materializado si,
después de ejecutar `docker compose up --build`, un servicio termina con
errores, se reinicia continuamente o el backend no puede conectarse a
MySQL.

**Medidas preventivas:** - Mantener actualizado `docker-compose.yml`. -
Comprobar que las variables necesarias están definidas en el `.env`
local. - Mantener `.env.example` con las variables requeridas y valores
de ejemplo. - Revisar los puertos y nombres de los servicios. - Probar
los cambios en local antes de publicarlos en el repositorio.

**Plan de contingencia:** 1. Ejecutaré `docker compose ps` para
comprobar el estado de los servicios. 2. Consultaré los registros
mediante `docker compose logs`. 3. Comprobaré que existe el `.env` local
y contiene las variables necesarias. 4. Revisaré `docker-compose.yml`,
los puertos y nombres de los servicios. 5. Corregiré los errores
detectados. 6. Reconstruiré y arrancaré los servicios con
`docker compose up --build -d`. 7. Ejecutaré de nuevo
`docker compose ps` y comprobaré que los servicios funcionan.

**Responsable:** yo misma, como responsable de la infraestructura y de
la configuración de Docker.

## 5. Plan de ergonomía, salud y prevención de riesgos laborales (PRL)

Durante el desarrollo de **Cuida a los tuyos** pasaré tiempo delante del
ordenador programando, diseñando interfaces, trabajando con bases de
datos y utilizando Git y Docker. Aplicaré medidas para cuidar mi salud
física y mental.

### 5.1. Ergonomía y espacio de trabajo

-   Mantendré la espalda apoyada en el respaldo, los hombros relajados y
    los pies apoyados en el suelo.
-   Colocaré la parte superior del monitor aproximadamente a la altura
    de los ojos y a una distancia de 40--50 cm.
-   Procuraré mantener los antebrazos apoyados y los codos cerca de un
    ángulo de 90 grados.
-   Utilizaré iluminación suficiente, evitando reflejos en la pantalla.
-   Mantendré la mesa despejada y colocaré el teclado y el ratón para
    evitar posturas forzadas.

### 5.2. Carga mental y descansos

-   Aplicaré la regla 20-20-20: cada 20 minutos miraré durante al menos
    20 segundos a un objeto situado a unos 6 metros.
-   Podré utilizar la técnica Pomodoro, alternando periodos de
    concentración con descansos breves.
-   Planificaré las tareas de forma realista según su dificultad y el
    tiempo disponible.
-   Dividiré las tareas grandes en otras más pequeñas.
-   Si encuentro dificultades técnicas o una carga de trabajo excesiva,
    revisaré la planificación para evitar acumular tareas.

### 5.3. Desconexión digital

Me comprometo a respetar la desconexión digital y a evitar que el
trabajo interfiera continuamente en mi tiempo personal.

-   Respetaré mis horarios de estudio y descanso.
-   Evitaré prolongar innecesariamente las sesiones de programación.
-   Organizaré las entregas con antelación para reducir el trabajo de
    última hora.
-   Si una tarea se retrasa, revisaré la planificación en lugar de
    depender de sesiones excesivamente largas.
-   Reservaré tiempo para descansar y desconectar de las pantallas.

### 5.4. Compromiso personal

Me comprometo a aplicar estas medidas durante la planificación, el
desarrollo, las pruebas y la preparación de la entrega. Considero que
cuidar la ergonomía, gestionar mi carga mental y respetar la desconexión
digital me ayudará a trabajar en mejores condiciones.

