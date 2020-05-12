# PFG-Producer
Microservicio productor para el proyecto de fin de grado de Ivan Martin Alonso

## Docker
Para contruir la aplicacion seguir los siguientes pasos:    
### Crear las imagenes de cada microservicio:    

-   En el directorio del Productor : docker build -t productor .
-   En el directorio del Consumidor1 : docker build -t consumidor1 . 
-   En el directorio del Consumidor2 : "docker build -t consumidor2 .   

### Ejecutar Docker-Compose para levantar todos los contenedores:
El fichero Docker-Compose se encuentra en el directorio del productor.  
Ejecutar el comando: 
-   docker-compose up

 

