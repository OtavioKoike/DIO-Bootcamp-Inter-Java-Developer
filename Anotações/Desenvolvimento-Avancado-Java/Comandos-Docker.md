# Comandos Docker

## Java 7

Executar imagem 
```
docker container run -it -m512M --entrypoint bash openjdk:7-jdk
```

Configurações

```
java -XX:+PrintFlagsFinal - version ! grep MaxHeapSize
```

---
## Java 10

Executar imagem 
```
docker run -it -m512M --entrypoint bash openjdk:10-jdk
```

---
## CPU

Executar Jshell
```
docker container run -it -cpus 2 openjdk:10-jdk
```

Quantidade de cpus disponiveis

```
Runtime.getRuntime().availableProcessors()
```