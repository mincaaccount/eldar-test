# Proyecto eldar-test

Este proyecto es una aplicación que calcula la tasa para una determinada marca y un importe. A continuación, se describe cómo puedes llamar a la URL para calcular la tasa.

## Cómo calcular la tasa

Para calcular la tasa, realiza una solicitud a la siguiente URL utilizando una solicitud HTTP POST con un cuerpo JSON que contiene la marca y el importe:

### URL de la API

- URL: https://eldar-test-git-marcosinca-dev.apps.sandbox-m2.ll9k.p1.openshiftapps.com/calcularTasa

### Ejemplo de solicitud JSON

```json
{
    "marca": "VISA",
    "importe": 1000.0
}
