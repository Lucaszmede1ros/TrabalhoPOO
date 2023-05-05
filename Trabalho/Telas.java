//Todas as importacoes necessarias
import Variavel.VarGasto;

// classe de telas
public class Telas
{
	public String telaConsulta(){

		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" MENU ");
		bodybuilder.append("\n1 - Adicionar Gasto");
		bodybuilder.append("\n2 - Adicionar Ganho");
		bodybuilder.append("\n3 - Relatorio de Gastos");
		bodybuilder.append("\n4 - Relatorio de Ganhos");
		bodybuilder.append("\n5 - Relatorio mensal");
		bodybuilder.append("\n6 - Sair");
		bodybuilder.append("\n");
		bodybuilder.append("\nSelecione uma opção");

		return  bodybuilder.toString();
	}

	public String telaAdicionaGasto() {

		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" Adicionar Gasto ");
		bodybuilder.append("\n1 - Habilitação");
		bodybuilder.append("\n2 - Entreterimento");
		bodybuilder.append("\n3 - Alimentação");
		bodybuilder.append("\n4 - Transporte");
		return bodybuilder.toString();
	}

	public String telaFormaPagamento() {
		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" Selecione a forma de pagamento ");
		bodybuilder.append("\n1 - Cheque");
		bodybuilder.append("\n2 - Pix");
		bodybuilder.append("\n3 - Débito");
		return bodybuilder.toString();

	}
	public String adicionaGanho() {
		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" ADICIONAR GANHO ");

		return bodybuilder.toString();
	}

	public String mostraGastos() {
		return "s";
	}

	public static String validaFormaPagamento(int numero){
		try {
			if (numero == 1) {
				return "Cheque";
			} else if (numero == 2) {
				return "Pix";
			} else if (numero == 3) {
				return "Débito";
			} else {
				return "Erro Forma de pagamento";
			}
		} catch (Exception e) {
			return "Erro Forma de pagamento";
		}
	}

	public static Enum<VarGasto> tipoGasto(int numero) {
		if (numero > 0 && numero < 10) {
			switch (numero) {
//Case 1 a 4 com o mesmo nome de variável
				case 1:
					return VarGasto.HABILITACAO;
				case 2:
					return VarGasto.ENTRETERIMENTO;
				case 3:
					return VarGasto.ALIMENTACAO;
				case 4:
					return VarGasto.TRANSPORTE;
				default:
					break;
			}
		} else {
			return null;
		}
		return null;
	}

}
