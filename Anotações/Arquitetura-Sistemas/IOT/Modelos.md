# Modelos de conexão

## Cliente Servidor

O Cliente faz um request HTTP ao servidor\
O Servidor retorna um response ao cliente

---
## Publish / Subscribe

Os sensores fazem um Publish no MQTT Broker para armazenar dados\
O app faz um Subscribe no MQTT Broker para pedir dados dados\
O servidor faz um Subscribe no MQTT Broker para disponibilizar dados\
O MQTT Broker faz um Publish no servidor e/ou no app para armazenar e/ou mostrar dados\

### Publish

```
pub [protocolo] :// [broker] / [user identifier] / [sensor] / [information type]
```

### Subscribe

```
sub [protocolo] :// [broker] / [user identifier] / [sensor] / [information type]
```
> \+ referencia todos os dados do diretorio

---
## QoS 0 

> Publish

- Nivel minimo de menor esforça
- Sem garantia de entrega
- Mensagem não é transmitida

---
# QoS 1 

> Publish / Puback

- Garante que a mensagem foi entrege no minimo uma vez ao recebedor
- Mensagem pode ser retransmitida se não houver confirmação de entrega

# QoS 2

> Publish / Pubrec / Pubrel / Pubcomp

- Garante que a mensagem foi entregue no minimo uma vez ao recebedor
- Mensagem pode ser retransmitida se nao houver confirmação de entrega