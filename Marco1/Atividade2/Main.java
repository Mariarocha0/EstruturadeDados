package Marco1.Atividade2;

public class Main {
	public static void main(String[] args) {


        Vetor vetor = new Vetor();
        Aluno estudante = new Aluno("Fernando",21,8.2);
        Aluno estudante2 = new Aluno("Bianca",23,10);
        Aluno estudante3 = new Aluno("Letícia",20,6.0);

        vetor.acrescenta(estudante);
        vetor.acrescenta(estudante2);
        vetor.acrescenta(estudante3);

        System.out.println(vetor.tamanho());
        System.out.println(vetor.contem(estudante));
        System.out.println(vetor.contem(estudante2));
        System.out.println(vetor.contem(estudante3));


	}
}