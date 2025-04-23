# Cálculo de Impostos
<p> O foco deste repositório, é exibir um exemplo de código orientado a objeto, usando de entradas e saídas para calcular dados de impostos. </p>

![image](https://github.com/user-attachments/assets/bea9adea-be9c-4fd3-bbf7-8579cca3f029)

## Como o código foi estruturado?

<ol>
  <li>Foi desenvolvido com a ferramenta NetBeans, que possui funcionamento diferente. </li>
  <li>Composto por 4 classes e 1 interface:
  <ul>
    <li> Impostos (interface). </li>
    <li> PIS (classe para Programa de interação social). </li>
    <li> IPI (classe para Imposto sobre produtos industrializados). </li>
    <li> Pagamentos (classe para inserir informações dos pagamentos, com nomes das empresas e seus impostos em um Arraylist). </li>
    <li> Atividade4 (classe principal). </li>
  </ul></li>
  <li> Foi feito para haver uma comunicação direta entre as classes e a interface, o que gera o resultado visto. </li>
</ol>

## Na prática:
### Parte das entradas dos dados da empresa:

 <mark> Nesse momento, é questionado o nome da empresa e o tipo de imposto a pagar. </mark>
 
 <mark> É criada uma lista do tipo da interface, Impostos </mark>

![{0E6B72AA-AC23-499C-AC85-44B4EE564BD4}](https://github.com/user-attachments/assets/436e00f2-4696-4ddf-8acd-9346a3c5d020)


Agora, a interface Impostos é ativada, e usada como base para receber ambos os tipos de impostos. Ambas as classes de impostos usam a interface.

Caso seja inserido "IPI":

![{55B94EC8-8C5B-449C-91AD-B15D418D67DB}](https://github.com/user-attachments/assets/493806d4-1ee6-4ddc-8c78-28c39161862f)


Informações pedidas:
<ul>
  <li>
    Valor da alíquota.
  </li>
  <li>
    Valor do produto.
  </li>
  <li>
    Valor do frete.
  </li>
  <li>
    Valor do seguro.
  </li>
  <li>
    Valor das despesas extras.
  </li>
</ul>

Caso seja inserido "PIS":

![{43585980-6B53-4762-A14E-B6941D032EC2}](https://github.com/user-attachments/assets/59b41fb3-b210-4de4-be82-238d8ea3c922)

Informações pedidas:

<ul>
  <li>
    Total de débito.
  </li>
  <li>
    Total de crédito da corporação.
  </li>
</ul>

Caso seja inserido "pare":

![{A5159613-3082-49C7-8691-BD3ECFA3CF87}](https://github.com/user-attachments/assets/c8eadea3-8a6f-42fb-9148-329d42f3a19d)

Ocorre a impressão dos dados da lista de impostos do tipo da interface Impostos, independente da quantidade, enquanto não for digitado "pare", o código segue infinitamente.
