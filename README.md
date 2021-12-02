
#Instalacion Servidor Mqtt

En este documento se describen las acciones para poder dejar funcionando la logica de descarga de firmware para jajicaiot.

Es necesario instalar en el servidor, la parte servidora y cliente de mosquitto.

Para poder instalarlo, hay que seguir los siguientes pasos.

 1. Descargarse de github la parte servidor con git clone --recursive https://github.com/r126401/jajicaServer.git
 2. Configurar el fichero launcher.conf según las especificaciones.
 3. Ejecutar la aplicacion en segundo plano `python3 mqtt-launcher-master &` , Es posible que sea necesario instalar la libreria adicional de paho `pip install paho-mqtt`
 4. Ejecutar de nuevo la aplicacion en segundo plano.

#ServidorWeb
La parte del servidor tiene varias funciones.

 - Contiene las claves publica y privada para la conexion https al servidor para descargarse la nueva version OTA
 - directorio lastVersion. El fichero lastVersion.json contiene los datos necesarios que utilizará el dispositivo para conectarse al servidor web y descargarse la ultima version. 
  {"token": "5586625c-d148-482b-a71d-662399f97414", "date": "04/10/21 18:11", "dlgComando": 100, "idDevice": "otaServer", "dlgResultCode": 200, "otaServer": "jajicaiot.ddns.net", "otaPort": 8070, "otaUrl": "/firmware//", "otaFile": "newVersion_2110041515.bin", "otaVersion": "2110041515"}
 - directorio firmware. Para cada tipo de dispositivo contiene las versiones que se han ido liberando. La version especificada en el directorio lastVersion será la que el dispositivo se descargará.
 
 

    Escrito por Emilio Jimenez. r126401@gmail.com
