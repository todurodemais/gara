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

        Object[] lanches = {"x-bacon", "x-salada", "x-gordelas", "x-costela", "x-barbecue", "x-vegan","nada"};
        Object lancheEscolhido = JOptionPane.showInputDialog(null, "escolha um lanche", "cardapio", JOptionPane.INFORMATION_MESSAGE, null, lanches, lanches[0]);

        Object[] bebidas = {"chop", "chop-vinho", "caipirinha", "pepsi zero", "coca-cola zero", "água","nada"};
        Object bebidaEscolhida = JOptionPane.showInputDialog(null, "escolha uma bebida", "cardapio", JOptionPane.INFORMATION_MESSAGE, null, bebidas, bebidas[0]);

        Object[] sobremesas = {"milkshake", "sorvete", "petit gateau", "pudim", "banoffee","nada"};
        Object sobremesaEscolhida = JOptionPane.showInputDialog(null, "escolha uma sobremesa", "cardapio", JOptionPane.INFORMATION_MESSAGE, null, sobremesas, sobremesas[0]);

        Object[] acompanhamento = {"batata", "frango frito", "nuggets", "onion rings", "polenta", "torrada com molho verde", "bolinho de costela","nada"};
        Object acompanhamentoEscolhido = JOptionPane.showInputDialog(null, "escolha um acompanhamento", "cardapio", JOptionPane.INFORMATION_MESSAGE, null, acompanhamento, acompanhamento[0]);

        float preço = 0;
        String lancheescolhido = (String) lancheEscolhido;
        switch (lancheescolhido) {
            case "x-bacon":
                preço = (float) (preço + 20.00);
                break;
            case "x-salada":
                preço = (float) (preço + 15.00);
                break;
            case "x-gordelas":
                preço = (float) (preço + 30.00);
                break;
            case "x-costela":
                preço = (float) (preço + 32.00);
                break;
            case "x-barbecue":
                preço = (float) (preço + 22.00);
                break;
            case "x-vegan":
                preço = (float) (preço + 27.00);
                break;
            case "nada":
                preço = (float) (preço + 0.00);
                break;
        }
        String bebidaescolhida = (String) bebidaEscolhida;
        switch (bebidaescolhida) {
            case "chop":
                preço = (float) (preço + 15.00);
                break;
            case "chop-vinho":
                preço = (float) (preço + 20.00);
                break;
            case "caipirinha":
                preço = (float) (preço + 20.00);
                break;
            case "pepsi zero":
                preço = (float) (preço + 6.00);
                break;
            case "coca-cola zero":
                preço = (float) (preço + 6.00);
                break;
            case "água":
                preço = (float) (preço + 4.00);
                break;
            case "nada":
                preço = (float) (preço + 0.00);
                break;
        }
                
        String sobremesaescolhida = (String) sobremesaEscolhida;
        switch (sobremesaescolhida) {
            case "milkshake":
                preço = (float) (preço + 15.00);
                break;
            case "sorvete":
                preço = (float) (preço + 7.00);
                break;
            case "petit gateau":
                preço = (float) (preço + 20.00);
                break;
            case "polenta":
                preço = (float) (preço + 17.00);
                break;
            case "banoffee":
                preço = (float) (preço + 19.00);
                break;
            case "nada":
                preço = (float) (preço + 0.00);
                break;
        }
         String acompanhamentocolhido = (String) acompanhamentoEscolhido;
        switch (acompanhamentocolhido) {
            case "batata":
                preço = (float) (preço + 12.00);
                break;
            case "frango frito":
                preço = (float) (preço + 20.00);
                break;
            case "nuggets":
                preço = (float) (preço + 10.00);
                break;
            case "onion rings":
                preço = (float) (preço + 9.00);
                break;
            case "torrada com molho verde":
                preço = (float) (preço + 8.00);
                break;
            case "bolinho de costela":
                preço = (float) (preço + 30.00);
                break;
            case "nada":
                preço = (float) (preço + 0.00);
                break;
        }
        Object[] options = {"pagar","cancelar"};
        int opcaoEscolhida = JOptionPane.showOptionDialog(null,"valor a pagar: "+preço,"pagar a conta",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, options,options[0]);
        if (opcaoEscolhida == 0){
        JOptionPane.showMessageDialog(null,"a conta foi paga","conta",JOptionPane.WARNING_MESSAGE);
        }
        else {
        JOptionPane.showMessageDialog(null,"Pedido cancelado","conta",JOptionPane.ERROR_MESSAGE);    
        }    
    }
}            
