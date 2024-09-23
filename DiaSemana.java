import javax.swing.JOptionPane;

public class DiaSemana {

	public static void main(String[] args) {
		String DiaSemana;
		int iDiaSemana;
		
		DiaSemana = JOptionPane.showInputDialog("Digite a opção\n"+"1 - Domingo\n"+"2 - Segunda\n"+"3 - Terça\n"+"4 - Quarta\n"+"5 - Quinta\n"+"6 - Sexta\n"+"7 - Sábado\n" );
		iDiaSemana= Integer.parseInt(DiaSemana);
		if (iDiaSemana == 1||iDiaSemana== 7){
		JOptionPane.showMessageDialog(null, " o dia da semana "+"informado é FINAL DE SEMANA"+ iDiaSemana);
		}else if(iDiaSemana>=2 && iDiaSemana <=6) {
			JOptionPane.showMessageDialog(null, "O dia da semana" + " informado é DIA ÚTIL" + iDiaSemana);
		}else {
			JOptionPane.showMessageDialog(null, "Opção inválida");
		
		}
		
		
		}
	}
