# Business Intelligence

O BI é composto basicamente por:

- Ferramentas
- Infraestrutura
- Profissionais (Corpo técnico)
- Dados

O dados são recebidos por Indicadores de mercado, Dados gerenciais, Dados da operação e Pesquisa de campo

---
## OLTP x OLAP

> Online Transaction Processing

> Online Analytical Processing

### Foco

OLAP - Foco no nivel estrategico da organização. Vista a analise empresarial e tomada de decisão\
OLTP - Foco no nivel operacional da organização. Visa a execução operacional do negocio

### Performance

OLAP - Otimização para leitura e geração de analise e relatorios gerenciais\
OLTP - Alta velocidade na manipulação de dados operacionais, porem ineficiente para geração de analises gerenciais

### Estrutura de Dados

OLAP - Os dados estão estruturados na modelagem dimensional. Os dados normalmente possuem alto nivel de sumarização\
OLTP - Os dados são normalmente estruturados em um modelo relacional normalizado, otimizado para a utilização transacional. Os dados possuem alto nivel de detalhes

### Armazenamento


OLAP - O armazenamento é feito em estruturas de Data Warehouse com otimização no desempenho em grandes volumes de dados\
OLTP - O armazenamento é feito em sistemas convencionais de banco de dados atraves dos sistemas de informações da organização

### Abrangencia

OLAP - E utilizado pelos gestores e analistas para a tomada de desição\
OLTP - E utilizado por tecnicos e analistas e engloba varios usuarios da organização

### Frequencia de atualização

OLAP - A atualização das informações é feita no processo de carga dos dados. Frequencia baixa, podendo ser diaria, mensal ou anual (ou criterio especifico)\
OLTP - A atualização dos dados é feita no momento da transição. Frequencia muito alta de atualizações

### Volatilidade

OLAP - Dados historicos e nao volateis. Os dados não sofrem alterações, salvo necessidades especificas (por motivos de erros ou inconsistencias de informações)\
OLTP - Dados volateis, passiveis de modificacao e exclusao

### Tipos de permissões nos dados

OLAP - É permitido apenas a insersão e leitura. Sendo que para o usuario está apenas disponivel a leitura\
OLTP - Podem ser feito leitura, inserção, modificação e exclusão dos dados

---
# Big Data

Big data é um termo que descreve o grande volume de dados, tanto estruturados quando não estruturados

