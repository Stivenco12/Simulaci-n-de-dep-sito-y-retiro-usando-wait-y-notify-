# Simulación de Depósito y Retiro usando Wait y Notify

## Descripción

Este proyecto es una simulación de una cuenta bancaria que permite realizar operaciones de depósito y retiro de manera sincronizada utilizando los métodos `wait()` y `notify()` en Java.

## Características principales

- Implementa una clase `cuentaBanacaria` que gestiona el saldo de manera segura.
- Uso de `synchronized` para garantizar acceso seguro al saldo.
- `wait()` y `notify()` para coordinar la ejecución entre hilos.
- Simulación de operaciones concurrentes de depósito y retiro.

## Estructura del Proyecto

El proyecto sigue la estructura de un proyecto Maven:

```
Simulacion-de-deposito-y-retiro-usando-wait-y-notify
│── pom.xml  # Archivo de configuración de Maven
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── waitnotify
│   │   │   │   ├── Main.java  # Código principal del programa
│── target  # Directorio de salida tras la compilación
```

## Requisitos

- Java 8 o superior
- Apache Maven

## Instalación y Ejecución

1. Clonar el repositorio o descargar el proyecto.
2. Navegar al directorio del proyecto.
3. Ejecuta el Main.

## Funcionamiento

El programa crea una cuenta bancaria con un saldo inicial de 0 y ejecuta hilos que intentan depositar y retirar dinero. Si un hilo intenta retirar una cantidad mayor al saldo disponible, entra en espera (`wait()`) hasta que se realice un depósito que permita completar la transacción (`notify()`).

## Autor : Stivenco12

Desarrollado como una demostración de la sincronización de hilos en Java utilizando `wait` y `notify`.

