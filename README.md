# 💿 Proyecto Disquera "Sonidos del Mañana"

Este proyecto es el desarrollo de la Interfaz Gráfica (Etapa 1) para un sistema de gestión de una disquera independiente, utilizando Java Swing en Apache NetBeans. Su objetivo es sentar las bases visuales y estructurales para un futuro sistema de gestión de Discos y Canciones.

## 🚀 Objetivo del Proyecto

El objetivo principal es diseñar una interfaz gráfica funcional, limpia y organizada que permita gestionar la información de discos y canciones de forma visual. [cite_start]El sistema incorpora formularios separados para las operaciones CRUD (Crear, Listar, Modificar, Eliminar y Buscar) para cada entidad[cite: 43].

## 🏗️ Estructura del Sistema (Paquetes)

El proyecto sigue una arquitectura organizada en cuatro paquetes principales para asegurar una clara separación de responsabilidades:

* **`disquera.run`**: Contiene la clase principal (`RunApp`) que inicia la aplicación (el punto de entrada).
* [cite_start]**`disquera.gui`**: Contiene todos los formularios (ventanas) de la aplicación (`FramePrincipal` y todos los `Frm...`)[cite: 21, 45].
* **`disquera.beans`**: Contiene las clases modelo para las entidades principales (`Disco.java` y `Cancion.java`). [cite_start]Estas clases están correctamente encapsuladas (atributos privados y métodos *getters/setters*)[cite: 27].
* [cite_start]**`disquera.exception`**: Contiene las clases de excepciones personalizadas (`DiscoException.java` y `CancionException.java`) para manejar errores específicos del negocio[cite: 27].

## 🖥️ Interfaz Principal (FramePrincipal)

El sistema inicia con un **Frame Principal** que sirve como menú de navegación. Todas las funcionalidades se acceden a través de un menú superior:

* [cite_start]**Menú Disco**: Contiene las opciones: Agregar, Modificar, Eliminar, Listar y Buscar Disco[cite: 46, 61, 62, 63, 64, 65, 66].
* [cite_start]**Menú Canción**: Contiene las opciones: Agregar, Modificar, Eliminar, Listar y Buscar Canción[cite: 46, 67, 68, 69, 70, 71, 72].



## 🛠️ Requisitos e Instalación

### Requisitos de Software
* **IDE**: Apache NetBeans (Versión 28 o superior)
* **Lenguaje**: Java SE

### ¿Cómo Ejecutar?
1.  Clonar este repositorio en tu máquina local.
2.  Abrir el proyecto en Apache NetBeans.
3.  Ejecutar la clase principal **`RunApp.java`** dentro del paquete `disquera.run`.

***
