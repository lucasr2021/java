# Métodos
### Todas as aplicações de uma operação são consideradas métodos.
Uma classe é definida por atributos e métodos. Já vimos que atributo são, em sua grande maioria, variáveis
de diferentes tipos e valores.
Os métodos por sua vez, correspondem  a funções ou sub-rotinas disponíveis dentro de nossas classes.

# Criterio de nomeação de métodos
Esses critérios não são obrigatórios, mas é recomendavél que sejam seguidos, pois essas convenções
facilitam a vida dos programadores ao trabalharem em código de forma colabrorativa.
Ao sguir essas convenções, tornamos o código mai legível  para nós e para outras pessoas.
Para métodos os critérios são:
- deve ser nomeado como verbo
- seguir padrão CamelCase (todas as letras minúscula com exceção da primeira letra da segunda palavra).

exemplos sugeridos para nomclatura de métodos:

somar (int n1, int n2){}


abrirConexao(){}


concluirProcessamento(){}


findById(int id){}

calcularImprimir(){ // Há algo de errado nete metodo, ele deveria ter uma única responsabilidade: Calcular ou imprimir.
}

Em java não existe o conceito de métods globais. Todos os métdos devem ser definidos dentro de uma classe.
# criterios de definição de métodos
Mas, como saber a melhor forma de definir os métodos das nossas classes? para chegar à essa conclusão, somos auxiliados por
uma convenção estrutural para todos os métodos. Essa convenção é determinada pelo aspectos abaixo

- 1 Qual a proposta principal do método? voce deve se pergunta constantemente até comprender  a real finalidade do mesmo.
- 2 Qual tipo de retorno esperado após a execução do método? você deve analisar se o método será responsável por retornar
algum valor ou não.
### Abs
Caso o método não retorne nenhum valor , ele será representado pela palavra-chave void.

1. Quais os parâmetros serão necessários para execução dos metodos? Os métodos as vezes precisam de argumentos com criterios para execução.
2. O método possue o risco de apresentar alguma exceção? exceção são comuns na execução de metodos, as vezes é neessário prever e tratar 
possivél existência de uma exceção.
3. Qual a visibilidade do método? Será necessário que o método seja visível a tdda aplicação, somente em mesmo pacote, através de herança
ou somente nível a própria classe.

### abaixo temos um exemplo de uma classe com dois métodos e suas respectivas considerações.
1. 
public class MyClass
public double somar(int num1, int num2){
    //logica finalidade do método
    return ...;
    }

2.
public void imprimir (String texto){
    //logica finalidade do método
    //Aqui nãoprecisa do returns
    //pois não será retornado nada
}

//Throws Expection: Indica que o método ao ser utilizado
// Poderá gerar uma exceção

public double divir(int dividendo, int divisor) Throws Expection{
}

//Este método não pode ser visto por outras classes dentro do programa

private void metodoPrivado(){}

//Algus arquivos estruturais
public void validar(){
    // Este método deveria retornar alguns valor
    // No caso boolean (true ou false)
}

public void gravarCliente(String nome, String cpf){
    //Este método tem a finalidade de gravar
    //informações de um cliente, por que não criar
    // um objeto cliente e passa como parâmetro
    //veja abaixo
}

public void gravarCliente(Cliente cliente){}
//Ou
public void gravar(Cliente cliente){}