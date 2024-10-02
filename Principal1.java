public class Principal1 {

        public static void main(String[] args) {
            
            //Instancia da dos dados do cliente, empresa e funcionario
            PessoaFisica cliente1 = new PessoaFisica("Alexandre Campos", "Rua A, 123", "alex@gmail.com", "123.456.789-00");
            PessoaJuridica empresa1 = new PessoaJuridica("Ambev", "Av. B, 456", "contato@tech.com", "12.345.678/0001-00");
            Funcionario funcionario1 = new Funcionario("Marcos Silva", "Rua C, 789", "marcos@gmail.com", "987.654.321-00", 3500.00);
    
            
            //Exibição das informações deles
            System.out.println("Cliente Pessoa Física:");
            cliente1.exibirInformacoes();
    
            System.out.println("\nCliente Pessoa Jurídica:");
            empresa1.exibirInformacoes();
    
            System.out.println("\nFuncionário:");
            funcionario1.exibirInformacoes();
        }
    }
    

