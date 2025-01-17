# Ejercicio: Frase (des)Motivadora

Desarrollar una aplicación en Java que implemente una arquitectura Cliente-Servidor utilizando hilos para manejar múltiples conexiones simultáneamente. Además, se deberá simular la interacción de varios clientes con el servidor de manera concurrente.

## Descripción General

1. Crearás una aplicación que constará de tres ficheros Java diferentes:
    - **Servidor.java**: Contendrá la lógica del servidor para aceptar y manejar conexiones de clientes de forma concurrente.
    - **Cliente.java**: Definirá la lógica de un cliente que se conectará al servidor, realizará una solicitud y mostrará la respuesta recibida.
    - **SimuladorClientes.java**: Permitirá gestionar múltiples clientes ejecutándose al mismo tiempo y realizará la interacción con cada cliente.

2. El servidor deberá almacenar al menos dos frases predefinidas: una motivadora y otra desmotivadora. Cuando un cliente se conecte, el servidor le preguntará qué tipo de frase quiere y cuando obtenga respuesta del cliente, le enviará la frase correspondiente.

3. El simulador de clientes pedirá al usuario el número de clientes a lanzar, iniciará los clientes de manera concurrente y esperará a que todos terminen antes de permitir que el usuario decida si desea realizar otra simulación o finalizar el programa.
