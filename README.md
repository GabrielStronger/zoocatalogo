# ZooCatalogo

Este projeto é uma implementação simples de um catálogo de animais utilizando programação orientada a objetos em Java. O sistema permite a criação de diferentes tipos de animais e a visualização de suas características.

## Estrutura do Código

O código é composto por três classes principais:

1. **Animal**: Classe base que representa um animal genérico. Contém atributos como nome, comprimento, patas, cor, ambiente e velocidade. Possui métodos para alterar esses atributos e exibir os dados do animal.

2. **Peixe**: Classe que estende a classe `Animal`. Representa peixes e possui um atributo adicional para características específicas, como barbatanas e cauda. A classe sobrescreve o método `dados()` para incluir a característica do peixe.

3. **Mamifero**: Classe que também estende a classe `Animal`. Representa mamíferos e inclui um atributo para o tipo de alimento que consome. Assim como `Peixe`, esta classe sobrescreve o método `dados()` para incluir informações sobre o alimento.

## Uso

A classe `ZooCatalogo` contém o método `main` que cria instâncias de `Animal`, `Peixe` e `Mamifero`, exibindo seus dados através do método `dados()`.

### Exemplo de Saída

Ao executar o programa, a seguinte saída é gerada:

