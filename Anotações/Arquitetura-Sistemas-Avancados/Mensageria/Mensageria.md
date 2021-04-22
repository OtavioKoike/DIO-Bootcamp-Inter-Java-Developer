# Microsserviços Message Broker

### Pros

- Desacoplamento
- Facil plug & play
- Comunicação Assincrona
- Simples escalabilidade
- Broadcasting
- Permite Event Source

### Contra

- Single point of failure
- Dificil monitoramento

---
## Exemplo de Comunicação

App Web faz uma requisição ao Proxy HTTP que acessa o serviço 1, o qual faz uma ação e salva no message Broker\
O serviço 2 acessa o dado do message Broker, faz uma ação e salva no message Broker\
O serviço 3 acessa o dado do message Broker e faz uma ação.

---
## Gerenciamento de Erro

- Dead Letter queue (Filas de re-tentativas)
- Monitoramento entre serviços
- Rastreamento de fluxo