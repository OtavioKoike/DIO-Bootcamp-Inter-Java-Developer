### **Comandos Terminal Windows**
- **cd** (Navegar por Diretorios)
- **dir** (Listar Arquivos e Diretorios)
- **mkdir** (Criar Diretorios)
- **del** (Apagar Arquivos)
- **rmdir** (Apagar Diretorios Vazios)
- **rmdir /S /Q** (Apagar Diretorios não Vazios)
- **cls** (Limpar a tela)

---
### **Objetos Internos Git**
- Blobs 
    - (Bolhas - Onde arquivos ficam guardados, possui metadados)
    - (Tipo blob, Tamanho, \0, Conteudo)
	- (Gera um sha1)
- Trees 
    - (Arvoes - Armazena e aponta Blobs e commits)
    - (Tipo tree, Tamanho, \0, Blob, Sha1, NomeArquivo)
    - (Gera um sha1)
- Commits 
    - (Junta tudo, aponta para arvore, parente, autor e mensagem)
	- (Tipo commit, Tamanho, Arvore, Sha1, Parente, Sha1, Autor, NomeAutor, Mensagem, Explicacao, Timestamp)
	- (Gera um sha1)

---
#### **Comandos GIT**
- **git init** (Inicializa um repositorio dentro da pasta)
- **git add** (Mover arquivos e dar inicio ao versionamento)
    - **git add ***
- **git commit** (Criar commit)
    - **git comit -m "\<Explicacao>"**
- **git status** (Monitorar o status do arquivos)

- **git config --list** (Configurações)
- **git config --global --unset user.email** (Apagar email)
- **git config --global --unset user.nickname** (Apagar nickname)
- **git config --global user.email** (Setar email)
- **git config --global user.nickname** (Setar nickname)

---
### **Comandos GITHUB**
- **git remote add origin \<url>** (Apontar repositorio local para github)
- **git remote -v** (Listar repositorios cadastrados)
- **git push origin master**(Levar repositorio local para Github)
- **git pull origin master** (Trás repositorio Github para local)
- **git clone \<url>** (Clonar repositorio do Github)

---
### **Dica**
- Visualização do Arquivo Markdown no VS Code
	- **Ctrl + Shift + V**