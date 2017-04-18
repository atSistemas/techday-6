# techday-6
Techday 6: Spring Boot + Docker

## Maven

```mvn clean install```

## Docker

```docker build --tag [usuario]/wpaas:0.0.1-SNAPSHOT .```

```docker run --name wpaas --detach --publish 8080:8484 [usuario]/wpaas:0.0.1-SNAPSHOT```

```docker run --name wpaas --detach --publish 8080:8484 --env "WPAAS_USER_WALLPAPER=http://bit.ly/2puvkvy" [usuario]/wpaas:0.0.1-SNAPSHOT```

## Pruebas

http://localhost:8080/wpaas?character=borat
http://localhost:8080/wpaas?character=hasselhof
http://localhost:8080/wpaas?character=user
