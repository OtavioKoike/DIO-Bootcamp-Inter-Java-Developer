
### **DIRETORIOS**

- **/** (Raiz)
- **/bin/** (Binarios, executaveis)
- **/boot/** (Arquivos do sistema de boot)
- **/dev/** (Arquivos dos dispositivos, drivers, bibliotecas)
- **/etc/** (Arquivos de configuração do sistema)
- **/home/** (Diretorio do usuario)
- **/lib/** (Bibliotecas do sistema) 
- **/media/** (Diretorio de montagem e dispositivos externos)
- **/opt/** (Intalação de programas não oficiais)
- **/sbin/** (Armazena arquivos executaveis que representa comandos administrativos)
- **/srv/** (Diretorio de serviços fornecidos pelo sistema)
- **/tmp/** (Diretorio para arquivos temporarios)
- **/usr/** (Segunda hierarquia do sistema, usuarios comuns e programas)
- **/var/** (Diretorio com arquivos gerados pelos programas do sistema)
- **/root/** (Diretorio do usuario administrador do sistema)
- **/proc/** (Diretorio virtual controlado pelo kernel)

---
### **COMANDOS**

- Comando Como Administrador
    - **sudo \<comando>**

- Caminho 
	- **pwd** (Caminho atual)
	- **cd \<diretorio>** (Entrar em um diretorio)
	- **cd .** (Diretorio atual)
	- **cd ..** (Diretorio anterior)
	- **cd /** (Diretorio raiz)
	- **cd ~** (Diretorio pessoal)

- Listagem de Diretorios e Arquivos
    - **ls** (Diretorio atual)
	- **ls \<diretorio>** (Diretorio expecifico)
	- **ls -lh** (Diretorio atual com Permissoes dos Arquivos)
	- **ls -l** (Diretorio atual com detalhes)
	- **ls -F** (Coloca uma barra na frente de cada diretorio)
	- **ls -a** (Diretorio atual com ocultos)
	- **ls -s** (Diretorio atual com tamanho de cada arquivo, em bloco)

- Manipulação de Diretorio
	- **mkdir \<diretorio>** (Criar)
	- **rmdir \<diretorio>** (Remover vazio)
	- **rm -r \<diretorio>** (Remover não vazio)
	- **rm -r*** (Remover todos arquivos do diretorio atual)

- Manipulação de Arquivo
	- **touch \<arquivo.tipo>** (Criar vazio/sem conteudo)
	- **touch -a \<arquivo.tipo>** (Alterar Hora de acesso)
	- **touch -m \<arquivo.tipo>** (Alterar Hora de modificação)
	- **touch -c \<arquivo.tipo>** (Alterar Hora de acesso sem criar um novo arquivo)
	- **touch -t \<YYYYMMDDhhmm.ss>** (Alterar Hora especifica de acesso e modificacao)
	- **rm \<arquivo>** (Remover)
	- **rm -f \<diretorio>** (Remover sem perguntas)

- Manipulação de Diretorios e Arquivos
    - **mv \<nomeAtual> \<novoNome>** (Renomear)
    - **mv \<nomeAtual> \<diretorioDestino>** (Mover)
    - **mv -i \<nomeAtual> \<diretorioDestino>** (Mover com Confirmação)
    - **mv -n \<nomeAtual> \<diretorioDestino>** (Mover sem Substituição)
    - **mv -b \<nomeAtual> \<diretorioDestino>** (Mover substituindo pelo Backup)
    - **mv -u \<nomeAtual> \<diretorioDestino>** (Mover substituindo se o arquivo de destino for antigo ou nao existe)
    
    - **cp \<arquivo> \<diretorioDestino>** (Copiar Arquivo)
    - **cp -i \<arquivo> \<diretorioDestino>** (Copiar Arquivo com Confirmação)
    - **cp -v \<arquivo> \<diretorioDestino>** (Copiar Arquivo com Retorno)
    - **cp -r \<diretorio>** (Copiar Diretorio)
    - **cp -l \<arquivo> \<diretorioDestino>** (Criar hard links)
    - **cp -s \<arquivo> \<diretorioDestino>** (Criar links simbolicos)
    - **cp -u \<arquivo> \<diretorioDestino>** (Copiar Arquivo se o arquivo de destino for antigo ou nao existe)

    - **cmp \<arquivo> \<arquivo>** (Comparar Arquivos)
    - **diff \<arquivo> \<arquivo>** (Mostra diferença entre Arquivos)

- Manual
    - **man \<comando>** (Manual do comando)
	- **\<comando> --help** (Ajuda do comando em Portugues)
	- **whatis \<comando>** (O que faz o comando?)

- Historico de Comandos
	- **history** (Vizualizar historico)
	- **history -c** (Apagar historico)

- Criar atalho de comando	
	- **alias \<atalho>='\<comando>'**

---
### **Manipulação de Arquivos de Texto**
- **nano \<arquivo>** (Editor de texto)
- **vi \<arquivo>** (Editor de texto)
- **cat \<arquivo>** (Exibe o conteudo)
- **tac \<arquivo>** (Exibe o conteudo invertendo as linhas)
- **head \<arquivo>** (Exibe as 10 primeiras linhas do conteudo)
- **tail \<arquivo>** (Exibe as 10 ultimas linhas do conteudo)
- **more \<arquivo>** (Paginacao de texto)
- **less \<arquivo>** (Paginacao de texto)
- **grep \<palavra> \<arquivo>** (Busca e marca a palavra no arquivo)
- **nl \<arquivo>** (Exibe o arquivo com a quantidade de linhas)
- **wc -l \<arquivo>** (Exibe a quantidade de linhas no arquivo)
- **wc -w \<arquivo>** (Exibe a quantidade de palavras no arquivo)
- **wc -c \<arquivo>** (Exibe a quantidade de bytes no arquivo)
- **wc -m \<arquivo>** (Exibe a quantidade de caracteres no arquivo)
- **sort -n \<arquivo>** (Organiza a saida do arquivo em ordem numerica)

### **Comando de redirecionamento**
(Redireciona a saida de um comando para outro)  
- **|** (Permite a execução de dois comandos)
- **\>** (Criar/substituir no arquivo)
- **\>>** (Adiciona no arquivo)
- **<** (Direciona a entrada de um arquivo para a saida de um comando)
- **&** (Permite usar dois comandos com duas saidas no terminal)(Quebra os processos)
- **&&** (Permite usar dois comandos com uma saida no terminal) (Executa os dois concecutivos)

### **Manipulação de Diretorios e Arquivos**
- **file \<nome>** (Exibe o tipo)
- **find \<diretorioInicial> -name "<nome>"** (Exibe o caminho a partir do diretorio)
- **find \<diretorioInicial> -name "<nome>*"** (Exibe o caminho a partir do diretorio com o comeco do nome)
- **whichis \<arquivo>** (Exibe o caminho)
- **whereis \<arquivo>** (Exibe o caminho e seu manual)

### **Calendario e Data**
- **cal** (Calendario do mes atual)
- **cal \<ano>** (Calendario do ano especifico)
- **cal \<mes> \<ano>** (calendaro do mes e ano especifico)
- **date** (Data Atual)

---
### **COMANDOS DE DIRETORIOS**

- Informações 
    - **lscpu** (Processador)
    - **cat /proc/cpuinfo** (Processador)
    - **cat /proc/meminfo** (Memoria)
    - **cat /etc/passwd** (Usuarios)

- Dispositivos
	- **lspci** (Hardwares conectados)
	- **lsusb** (Usb conectados)
	- **lshw** (Todos Hardwares)
	- **lshw -short** (Caminhos de Hardwares)

- Kernel
	- **uname** (Nome)
	- **uname -r** (Versão)
	- **uname -m** (Arquitetura)
	- **arch** (Arquitetura)
	
- Memoria
	- **free** (fisica e swap (virtual))
	- **du -h ~** (Quanto o diretorio pessoal utiliza do HD)
	- **du -h ~/\<diretorio>** (Quanto o diretorio especifico utiliza do HD)

- Sistema
	- **shutdown -h now** (Desligar)
	- **init 0** (Desligar)
	- **telinit 0** (Desligar)
	- **halt** (Desligar)
	- **shutdown -r** (Reiniciar)
	- **reboot** (Reiniciar)
	- **last reboot** (Informações sobre reinicialização do sistema)
	
---
### A**TALHOS**

- Acesso ao terminal
	- **Ctrl + Alt + T**

- Cancela o comando atual em funcionamento
	- **Ctrl + C**

- Pausa o comando atual, em primeiro ou segundo plano
	- **Ctrl + Z**

- Apaga uma palavra na linha atual
	- **Ctrl + W**

- Apaga a linha inteira
	- **Ctrl + U**

- Busca um comando recente
	- **Ctrl + R \<palavra|letra>**

- Repete o ultimo comando 
	- **!!**

- Limpar terminal
	- **clear**

- Faz o logout da sessão atual
	- **Ctrl + D** 
	- **exit**
	- **logout**

---
### **DICAS**

- Seta para cima roda a lista de comandos feitos

- Autocomplete
	- **\<comando> \<Comeco do nome> + Tab**

- ^ significa Ctrl
- M significa Alt

- -h significa Human Readable -> Leitura facilitada para humano

- Saida no terminal
	- **echo "\<frase>"** (Saida no terminal)
	- **echo -e "\<frase> \n>"** (Saida no terminal com caracteres de formatação)

---
### **INSTALAÇÕES**

- **sudo apt install cowsay (Vaquinha)**
- **sudo apt install xcowsay (Vaquinha 3D)**
- **sudo apt install cmatrix (Matrix)**

---
### **DEMAIS COMANDOS**

- Tempo 
    - **time \<comando>** (Tempo que que um comando leva para ser processado)
    - **uptime** (Tempo que o sistema esta rodando)

- Animais
	- **cowsay "\<frase>"** (Vaquinha)
	- **cowsay -d "\<frase>"** (Vaquinha morta)
	- **cowsay -g "\<frase>"** (Vaquinha querendo dinheiro)
	- **cowsay -f tux "\<frase>"** (Pinguin)
	- **cowsay -f vader "\<frase>"** (Vaquinha de Dart Vader)
	- **cowsay -f vadre-koala "\<frase>"** (Coala de Dart Vader)
	- **cowsay -f dragon "\<frase>"** (Dragão)
	- **xcowsay "\<frase>"** (Vaquinha 3D)
	- **cmatrix** (Efeito Matriz)

- sequencia
	- **seq \<numeroInicial> \<numeroFinal>** (Imprime sequencia de numeros)

---
### **VARIAVEIS DE AMBIENTE**
	
- env (Exibir todas Variaveis de ambiente)
- PS1 (Prompt da linha de comando)
- HOME (Diretorio "/home" de um usuario
- PATH (Lista de diretorios vasculhados quando um comando é executado)

    - **\<nomeVariavel>=\<atribuicao>** (Atribuicao pode ser um caminho)
    - **export \<nomeVariavel>** (Exportar para variaveis de Ambiente)
    - **cd $\<nomeVariavel>** (Usa a variavel como caminho)