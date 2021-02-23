### **COMANDOS**

- **adduser \<nomedousuario>** (Adicionar Usuario)
- **sudo su \<nomedousuario>** (Trocar Usuario root)
- **su \<nomedousuario>** (Trocar para outro usuario)
- **usuario \<nomedousuario)** (Trocar para outro usuario)
- **passwd \<nomedousuario>** (Alterar Senha)
- **lastlog** (Exibir Informações de Login dos Usuarios)
- **last** (Exibir uma listagem de entrada e saida do usuario no sistema)
- **logname** (Exibir o nome do usuario atual logado no sistema)
- **id** (Exibir todos os identificadores do usuario)
- **cat /etc/passwd** (Exibit todos os usuarios)
- **userdel -r \<nomedousuario>** (Remover um usuario e a pasta pessoal do mesmo)

---
### **GRUPOS**
- **cat/etc/group (Exibir todos grupos do sistema)
- **groups** (Exibir todos os grupos de um usuario)
- **addgroup \<nomegrupo>** (Adicionar Grupo)
- **adduser \<usuario> \<grupo>** (Adicionar usuario ao grupo)
- **gpasswd -a \<usuario> \<grupo>** (Adicionar usuario ao grupo)
- **gpasswd -d \<usuario> \<grupo>** (Remover usuario ao grupo)
- **groupdel \<grupo>** (Remover Grupo)

---
### **PERMISSÕES**

r - Read - 4  
w - Write - 2  
x - eXecution - 1  

- **ls -lh** (Verificar Permissoes em um diretorio)
- **chmod \<somaPermissaoDono>\<somaPermissaoGrupo>\<somaPermissaoOutros>** (Mudar permissao de um arquivo ou diretorio)
