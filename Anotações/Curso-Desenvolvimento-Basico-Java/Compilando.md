# Compilando e Executando um Programa Java

## Novo Projeto Pelo Terminal

```
$ mkdir hello-java
$ cd hello-java
$ nano Hello.java
```

```
public class Hello{
        public static void main(String[] args){
                System.out.println("Hello!");
        }
}
```

```
java -version
javac Hello.java
java Hello
```