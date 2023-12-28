# chatgpt-models-comparation

### Descripción
Este proyecto Java es una aplicación web Spring Boot diseñada para interactuar con la API de OpenAI. 
A través de ella, puedes introducir un prompt específico y obtener respuestas del modelo ChatGPT, permitiéndote comparar las salidas generadas por las versiones 3.5 y 4.0 del modelo.

### Configuración
#### Antes de arrancar el proyecto asegurate de incluir como variable de entorno tu api key de openAI.
`OPENAI_KEY=TU_API_KEY_AQUI`

### Ejecución
#### - Clona este repositorio en tu máquina local:
`git clone https://github.com/Saulmtr/chatgpt-models-comparation.git`
#### - Navega al directorio del proyecto:
`cd chatgpt-models-comparation`
#### - Compila y ejecuta la aplicación
`mvn spring-boot:run`
#### - Accede a la aplicación en tu navegador web y escribe el prompt como parámetro
`http://localhost:8080/chatGPT/start?prompt=peticion`

### Ahora puedes comparar las respuestas a ese prompt con los dos modelos.
