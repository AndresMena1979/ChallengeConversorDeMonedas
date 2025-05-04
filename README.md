<h1 align="center">Challenge del Conversor de monedas.</h1>

<p align="center">
  Proyecto de consola desarrollado en Java para convertir valores entre diferentes monedas utilizando una API de tipo de cambio en tiempo real.
</p>

---

## 📌 Descripción

Este proyecto es un **conversor de monedas en Java** que permite al usuario convertir entre diferentes divisas, como:

- Dólar estadounidense (USD)
- Peso argentino (ARS)
- Real brasileño (BRL)
- Peso colombiano (COP)

Utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio en tiempo real y realizar los cálculos.

---

## 🛠️ Tecnologías usadas

- Java 21+
- API HTTP (`HttpClient`)
- GSON (para parsear JSON)
- IntelliJ IDEA (IDE recomendada)
- ExchangeRate-API

---

## 💡 Funcionalidades

- Menú interactivo en consola
- Conversión de múltiples monedas (USD ↔ ARS, BRL, COP)
- Manejo de errores de entrada del usuario (`InputMismatchException`)
- Diseño modular con clases separadas:
  - `Principal` (punto de entrada)
  - `ConvertirMoneda` (lógica de conversión)
  - `LlamarApi` (conexión a la API)
  - `Moneda` (clase `record` para mapear los datos de la API)

## 🖥️ Cómo ejecutar

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/conversor-monedas-java.git

2. Abre el proyecto en IntelliJ o cualquier IDE compatible con Java.

3. Asegúrate de tener Java 17 o superior instalado.

4. Ejecuta la clase Principal.java.

## 🎯 Ejemplo de uso

![image](https://github.com/user-attachments/assets/5041aabe-3245-4962-a826-96193b16bcdf)


## ❗ Consideraciones

- Se requiere una conexión a Internet activa para que funcione la API.
- Asegúrate de tener una clave válida si usas una API con autenticación.
- Este proyecto es educativo y puede extenderse para usar una interfaz gráfica o integrarse en una aplicación web.
  
## 📄 Licencia

Este proyecto está bajo la licencia MIT. Puedes usarlo y modificarlo libremente.

## 🙌 Agradecimientos

- [Alura Latam](https://www.aluracursos.com/)
- [Oracle Java](https://www.oracle.com/java/)
- [ExchangeRate-API](https://www.exchangerate-api.com/)
