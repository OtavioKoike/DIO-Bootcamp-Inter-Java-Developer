# Http Client API

Um dos recursos que foram incluidos na proxima versao do JDK 11 é a **API do cliente HTTP** padronizada que visa substituir a classe HttpUrlConnection legada, que está presente no JDK desde os primeiros anos do Java.

O problema com essa API antiga é descrito na proposta de aprimoramento, principalmente porque agora ela é considerada antiga e dificil de usar.

> A nova API suporta HTTP/1.1 e HTTP/2.

A versão mais recente do protocolo HTTP foi projetada para melhorar o desempenho geral do envio de solicitações por um cliente e do recebimento de respostas do servidor. Isso é conseguido atraves da introduçao de varias alterações, como de cabeçalho e Push Promise. Açém disso, o novo cliente HTTP tambem suporta nativamente WebSockets.

> codigo no projeto Desenvolvimento Avancado