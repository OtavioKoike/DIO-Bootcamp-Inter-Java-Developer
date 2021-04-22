# Compilando e Executando um Programa Java

## Novo Projeto Pelo Terminal

```
mkdir hello-java
cd hello-java
nano Hello.java
```

---
## Codigo Projeto

```
public class Hello{
        public static void main(String[] args){
                System.out.println("Hello!");
        }
}
```

---
## Compilando Projeto Pelo Terminal

```
java -version
javac Hello.java
java Hello
```

---
## Executar Jar Pelo Terminal
```
java -jar path/arquivo.jar
```