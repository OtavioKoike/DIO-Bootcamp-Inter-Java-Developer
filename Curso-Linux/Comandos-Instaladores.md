### **GERENCIADORES**

- **apt** (Gerenciador de pacotes do sistema)
- **dpkg** (Gerenciador de pacotes do sistema do tipo deb) 
- **rpm** (Gerenciador de pacotes Fedora)
- **yum** (Gerenciador de pacotes Fedora)

---
### **PACOTES**

- apt
    - **sudo apt install \<pacote>** (Instalação)
    - **sudo apt upgrade \<pacote>** (Atualização)
    - **sudo apt remove \<pacote>** (Remoção)
- dpkg
    - **sudo dpkg -i \<pacote.deb>** (Instalação)
    - **sudo dpkg -I \<pacote.deb>** (Descrição)
    - **sudo dpkg -r \<pacote.deb>** (Remoção)
- rpm
    - **sudo rpm -ivh --nodeps \<pacote.rpm>** (Instalação)
    - **sudo rpm -U \<pacote.rpm>** (Atualização)
    - **sudo -e \<pacote.rpm>** (Remoção)
- yum
    - **sudo yum install \<pacote>** (Instalação)
    - **sudo yum update \<pacote>** (Atualização)
    - **sudo yum remove \<pacote>** (Remoção)

---	
### **SITES DE PACOTES**
- **pkgs.org**
- **rpm.pbone.net**

---
### **ATUALIZAÇÃO DE SISTEMA**
- **sudo apt update && apt upgrade**