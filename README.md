# Projeto Porkus 🐖

**Projeto Porkus** é um plugin customizado para Minecraft desenvolvido na plataforma Bukkit. O objetivo principal deste projeto é criar um **piglin personalizado**, chamado Porku, que atua como um companheiro para o jogador. Porku segue o jogador ao andar e interage com o ambiente, além de ter um comportamento de movimento limitado dentro de uma área específica.

## Funcionalidades Principais

- Invocação de Porku através de um item específico ou comando personalizado.
- Porku segue o jogador quando este se move, sem ser puxado diretamente, simulando um movimento mais natural.
- Restringe os movimentos de Porku dentro de uma área de 5x5 blocos ao redor do ponto onde foi invocado.
- Porku não desaparece até que um item especial (GoldenBrick) seja utilizado novamente.

## Problemas Conhecidos

### Falhas de Importação no Arquivo `PorkusFollowTask.java`

Atualmente, o arquivo `PorkusFollowTask.java`, responsável por gerenciar o comportamento de acompanhamento de Porku, está apresentando **falhas de importação** que precisam ser corrigidas. As classes necessárias para implementar a lógica de movimento e seguimento do Porku não estão sendo importadas corretamente, resultando em erros de compilação.

Algumas possíveis razões para esses erros incluem:

1. **Dependências não incluídas**: Certifique-se de que as bibliotecas necessárias estejam corretamente listadas no `pom.xml` ou outro gerenciador de dependências usado.
2. **Mudanças de versão**: Verifique se as versões das bibliotecas do Bukkit e Spigot estão corretas e compatíveis com o código.

Se você quiser contribuir para corrigir esse problema ou melhorar o projeto, fique à vontade para abrir um pull request ou relatar bugs na aba Issues.

## Tecnologias Utilizadas

- **Java**
- **Bukkit API** para Minecraft
- **Spigot** (para compatibilidade)
  
## Como Instalar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/projeto-porkus.git
