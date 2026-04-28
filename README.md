# 🚀 AdaByron 2026 - Soluciones

Este repositorio contiene las soluciones y planteamientos de los problemas de la competición de programación **AdaByron 2026**.

## 📊 Estado de los Ejercicios

| ID | Nombre del Problema | Estado |
| :--- | :--- | :--- |
| **A** | Dibujando tableros con fichas | ✅ Completado |
| **E** | El número misterioso (Constante de Kaprekar) | ✅ Completado |
| **H** | Control de acceso en el laboratorio | ✅ Completado |
| **J** | El planificador de procesos de AByronOS | ⚠️ A medias |

---

## 📝 Descripción de los Problemas

### [A] Dibujando tableros con fichas
Simulación de un tablero de ajedrez a partir de una lista de coordenadas.
* **Objetivo:** Recibir la posición de piezas (blancas en mayúsculas, negras en minúsculas) y dibujar el tablero de 8x8.
* **Reto:** Manejar correctamente el fondo de las casillas claras (`\u25FB`) y oscuras (`\u25FC`) y traducir los códigos de pieza a sus correspondientes símbolos Unicode.

### [E] El número misterioso
Cálculo de iteraciones para alcanzar la **Constante de Kaprekar (6174)**.
* **Objetivo:** Dado un número de 4 cifras, reordenar sus dígitos para obtener el mayor y el menor posible, restarlos y repetir el proceso.
* **Reto:** Implementar el bucle de iteraciones hasta que la diferencia sea exactamente 6174.

### [H] Control de acceso en el laboratorio
Validador de registros de entrada y salida de personal.
* **Objetivo:** Verificar si una secuencia de eventos 'E' (Entrada) y 'S' (Salida) cumple las normas de seguridad.
* **Condiciones:** No superar el aforo máximo, no permitir salidas si la sala está vacía y asegurar que la sala quede vacía al finalizar el registro.

### [J] El planificador de procesos de AByronOS (Por Terminar)
Simulación de la gestión de procesos de un sistema operativo.
* **Fase 1:** Manejo de una lista de PIDs con capacidad de "cancelación" (eliminar los últimos $N$ elementos).
* **Fase 2:** Organización por bloques de 4 procesos, priorizando los PIDs pares sobre los impares dentro de cada bloque.
* **Estado actual:** La lógica de reordenamiento por bloques y tipos de PID está pendiente de finalización.

---

## 🛠️ Tecnologías utilizadas
* Lenguaje: Python & Java


---
*Competición AdaByron 2026 - Equipo Espet-Tech*
