# Instalação de ambiente

## Instalando o Java 15

> Verificar versão mais atualizada

```
$ sudo add-apt-repository ppa:linuxuprising/java
$ sudo apt update
$ sudo apt-get install oracle-java15-installer

$ export JAVA_HOME="/usr/lib/jvm/java-15-oracle"
$ export PATH=$JAVA_HOME/bin:$PATH

$ java --version
```

## Ferramentas de build

### Gradle
+ https://gradle.org/

> Verificar versão mais atualizada

- versão 6.8.3
- Ganhando popularidade (Android Studio)
- Usa linguagem de programação Groovy

``` 
$ mkdir /opt/gradle
$ unzip -d /opt/gradle gradle-6.8.3-bin.zip
$ ls /opt/gradle/gradle-6.8.3
$ export PATH=$PATH:/opt/gradle/gradle-6.8.3/bin

$gradle -v
```

### Maven
+ https://maven.apache.org/

- versão 3.6.3
- Legados do ANT
- Baseado em XML

> Verificar versão mais atualizada

```
$ mkdir /opt/maven
$ unzip -d /opt/maven apache-maven-3.6.3-bin.zip
$ ls opt/maven/apache-maven-3.6.3
$ export PATH=$PATH:/opt/maven/apache-maven-3.6.3/bin

$ mvn -v
```

### Wrappers
+ https://github.com/takari/maven-wrapper
+ https://docs.gradle.org/current/userguide/gradle_wrapper.html

```
$ gradle wrapper
$ ./gradlew -v

$ mvn -N io.takari:maven:wrapper
$ ./mvnw -v
```

- Garante a mesma versão para todos os desenvolvedores

## Instalando o IntelliJ

+ https://www.jetbrains.com/idea/download

> Verificar versão mais atualizada

```
$ sudo tar -xzf ideaIC-2020.3.2.tar.gz
$ cd idea-IC-203.7148.57/bin/
$ ./idea.sh
```