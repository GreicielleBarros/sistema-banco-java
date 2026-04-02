	import java.util.Scanner;

	public class SistemaBanco {
	    public static void main(String[] args) {

	        Scanner ajusteDeDados = new Scanner(System.in);

	        System.out.println("Como deseja ser chamado?");
	        String nomeUsuario = ajusteDeDados.nextLine();

	        System.out.println("Que ótimo. Seja bem-vindo, " + nomeUsuario + "!");
	        System.out.println();

	        System.out.println("Informe seu nome completo:");
	        String completoNome = ajusteDeDados.nextLine();

	        if (completoNome.split(" ").length > 1) {
	            System.out.println("Que bom ter você aqui.");
	            System.out.println();
	        } else {
	            System.out.println("Negado. Por favor, informe o nome completo.");
	            return;
	        }

	        System.out.println("Agora informe sua idade:");
	        int idadeUsuario = ajusteDeDados.nextInt();
	        ajusteDeDados.nextLine();

	        if (idadeUsuario >= 18) {
	            System.out.println("Ok. Agora vamos confirmar outros dados.");
	            System.out.println();
	        } else {
	            System.out.println("Que pena. Apenas responsável pode continuar.");
	            return;
	        }

	        System.out.println("Me informe seu CPF:");
	        String cpfUsuario = ajusteDeDados.nextLine();

	        if (cpfUsuario.length() == 11) {
	            System.out.println("Validando informações...");
	            System.out.println("Aguarde...");
	            System.out.println("Validado!");
	        } else {
	            System.out.println("CPF inválido: " + completoNome + "!");
	            return;
	        }

	        System.out.println("Digite a senha:");
	        final int SENHA_CORRETA = 923510;

	        int senhaTentativa01 = ajusteDeDados.nextInt();

	        if (senhaTentativa01 == SENHA_CORRETA) {
	            System.out.println("Acesso liberado.");
	        } else {
	            System.out.println("Erro: duas tentativas restantes.");

	            System.out.println("Digite a senha novamente:");
	            int senhaTentativa02 = ajusteDeDados.nextInt();

	            if (senhaTentativa02 == SENHA_CORRETA) {
	                System.out.println("Acesso liberado.");
	            } else {
	                System.out.println("Erro: uma tentativa restante.");

	                System.out.println("Digite a senha pela última vez:");
	                int senhaTentativa03 = ajusteDeDados.nextInt();

	                if (senhaTentativa03 == SENHA_CORRETA) {
	                    System.out.println("Acesso liberado.");
	                } else {
	                    System.out.println("Cartão bloqueado.");
	                    return;
	                }
	            }
	        }

	        System.out.println("Agora vamos validar seu telefone para contato:");

	        final String TELEFONE_CONTATO = "24999567364";

	        ajusteDeDados.nextLine();
	        String telefoneContato = ajusteDeDados.nextLine();

	        if (TELEFONE_CONTATO.equals(telefoneContato)) {
	            System.out.println("Compatível. Liberando acesso...");
	        } else {
	            System.out.println("Telefone incompatível.");
	        }

	        System.out.println("Acesso à sua poupança.");
	        System.out.println("Digite o número da conta poupança:");

	        int contaPoupanca = ajusteDeDados.nextInt();

	        if (contaPoupanca == 456821) {
	            System.out.println("Conta confirmada.");
	        } else {
	            System.out.println("Erro.");
	            return;
	        }

	        int saldoContaConjunta = 500;
	        int saldoContaAdicional = 800;
	        int total = saldoContaConjunta + saldoContaAdicional;

	        int saldoContaPoupanca = 6900;
	        int saldoContaCorrente = 570;
	        int valor = saldoContaPoupanca + saldoContaCorrente;

	        int limiteAdicional = 2600;
	        int quantidadeDeCartoes = 2;
	        int limitePorCartao = limiteAdicional / quantidadeDeCartoes;

	        System.out.println("Valor da conta conjunta: " + total);
	        System.out.println("Valor da conta poupança + corrente: " + valor);
	        System.out.println("Limite adicional para dois cartões: " + limiteAdicional);
	        System.out.println("Cartão 1: " + limitePorCartao);
	        System.out.println("Cartão 2: " + limitePorCartao);

	        ajusteDeDados.close();
	    }
	}


