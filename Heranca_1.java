class Pessoa {
    String nome;
    String endereco;
    String email;

    //Construtor da classe Pessoa com os atributos
    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    
    //Construtor que exibe as informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
    }
}

    //Classe na qual mostra a pessoa física 
    class PessoaFisica extends Pessoa {
        String cpf;

        //Construtor da pessoa fisica
    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    //Sobrescreve o metodo informações
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
    }
}

    //Classe que representa a pessoa
class PessoaJuridica extends Pessoa {
    public String cnpj;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    //Classe que exibe as informações
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CNPJ: " + cnpj);
    }
}

    //Classe que exibe os funcionarios
class Funcionario extends Pessoa {
    public String cpf;
    public double salario;

    public Funcionario(String nome, String endereco, String email, String cpf, double salario) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.salario = salario;
    }

    //Classe que exibe as informações dentro da herança
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + salario);
    }
}
