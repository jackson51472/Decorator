# Hamburgueria - Padrão Decorator

## Introdução

Este projeto implementa uma hamburgueria usando o padrão **Decorator**, que permite adicionar funcionalidades a um objeto de maneira flexível e dinâmica.
No contexto deste projeto, o padrão Decorator é utilizado para adicionar ingredientes ao hambúrguer, modificando o seu custo sem alterar a estrutura base da classe `Hamburguer`.

## O que é o padrão Decorator?

O padrão **Decorator** é um padrão de projeto estrutural que permite que comportamentos sejam adicionados a um objeto de forma dinâmica. 
Ele é útil quando há a necessidade de modificar a funcionalidade de um objeto sem alterar seu código original ou criar subclasses específicas para cada combinação de comportamentos.

Com o **Decorator**, cada funcionalidade adicional é envolvida por um "decorador", permitindo que o objeto decorado agregue novas características conforme necessário.
Isso favorece o princípio **Aberto/Fechado** (Open/Closed Principle), que diz que classes devem estar abertas para extensão, mas fechadas para modificação.

## Descrição do Projeto

Neste projeto, o usuário pode personalizar seu hambúrguer escolhendo entre três adicionais:
- **Bacon**: Adiciona 1 ao custo.
- **Molho**: Adiciona 0.5 ao custo.
- **Vegetariano**: Custa 10.

O hambúrguer padrão tem um custo base de **10**.

### Estrutura da Lógica

1. **Classe base `Hamburguer`**:
   Esta classe representa o hambúrguer simples e possui um método `getPreco()` que retorna o preço base do hambúrguer.

2. **Decorators**:
   Os decoradores adicionam ingredientes extras ao hambúrguer. Cada decorador herda de uma classe abstrata `Decorator` e sobrepõe o método `getPreco()` para adicionar o preço do ingrediente ao preço do hambúrguer base.

   - **Bacon**: Adiciona 1 ao preço do hambúrguer.
   - **Molho**: Adiciona 0.5 ao preço do hambúrguer.
   - **Vegetariano**: O preço total do hambúrguer vegetariano é 10, substituindo o preço base.

