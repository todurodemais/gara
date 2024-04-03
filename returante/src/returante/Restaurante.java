package returante;

import javax.swing.JOptionPane;

class Pessoa {

    public String nome;
    public String telefone;
    public int idade;
    public String cpf;
// construtor

    Pessoa(String _nome, String _cpf, String _telefone, int _idade) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.idade = _idade;
        this.telefone = _telefone;
    }

    Pessoa() {
    }
}

class Funcionário extends Pessoa {

    public float salário;
    public String benefícios;
    public String folga;
    public String horasdetrabalho;
// const. Funcionário

    Funcionário(String _nome, String _cpf, String _telefone, int _idade) {
        super(_nome, _cpf, _telefone, _idade);

    }

    Funcionário() {
    }
}

class Cliente extends Pessoa {

    public float valordaconta;
    public int númerodamesa;

    public Cliente(String _nome, String _cpf, String _telefone, int _idade) {
        super(_nome, _cpf, _telefone, _idade);
    }

    public void pagar() {
    }
}

class Caixa extends Funcionário {

    public void vercontadocliente() {
    }

    public void efetuarpagamento() {
    }

    Caixa(String _nome, String _cpf, String _telefone, int _idade) {
        super(_nome, _cpf, _telefone, _idade);
    }
}

class Supervisor extends Funcionário {

    public void mudargastos() {
    }
}

class Garçom extends Funcionário {

    public void fazerpedido() {
    }

    public void atendercliente() {
    }
}

public class Restaurante {

    public static void main(String[] args) {
        String nome;
        int idade;
        String cpf;
        String telefone;

        nome = JOptionPane.showInputDialog("nome do cliente");
        idade = Integer.parseInt(JOptionPane.showInputDialog("idade do cliente"));
        cpf = JOptionPane.showInputDialog("cpf do cliente");
        telefone = JOptionPane.showInputDialog("telefone do cliente");

        Cliente Cliente1 = new Cliente(nome, cpf, telefone, idade);

        Object[] lanches = {"x-bacon", "x-salada", "x-gordelas", "x-costela", "x-chedar", "x-vegan"};
        Object lancheEscolhido = JOptionPane.showInputDialog(null, "escolha um lanche", "cardapio", JOptionPane.INFORMATION_MESSAGE, null, lanches, lanches[0]);

        Object[] bebidas = {"chop", "chop-vinho", "caipirinha", "pepsi zero", "coca-cola zero", "água"};
        Object bebidaEscolhida = JOptionPane.showInputDialog(null, "escolha uma bebida", "cardapio", JOptionPane.INFORMATION_MESSAGE, null, bebidas, bebidas[0]);

        Object[] sobremesas = {"milkshake", "sorvete", "petit gateau", "pudim", "banoffee"};
        Object sobremesaEscolhida = JOptionPane.showInputDialog(null, "escolha uma sobremesa", "cardapio", JOptionPane.INFORMATION_MESSAGE, null, sobremesas, sobremesas[0]);

        Object[] acompanhamento = {"batata", "frango frito", "nuggets", "onion rings", "polenta", "torrada com molho verde", "bolinho de costela"};
        Object acompanhamentoEscolhida = JOptionPane.showInputDialog(null, "escolha um acompanhamento", "cardapio", JOptionPane.INFORMATION_MESSAGE, null, acompanhamento, acompanhamento[0]);
       
        float preço = 0;
        String lancheescolhido = (String) lancheEscolhido;
        switch (lancheescolhido ){
            case "x-bacon":
                preço = preço+20.00;
                break;
            case "x-salada":
                preço = preço+1.00
                
        }
            
    }
}
