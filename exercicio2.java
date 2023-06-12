import java.util.Scanner;
class Boletim {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nomeAluno;
    double[] notas = new double[5];
    double media;
    System.out.print("Digite o nome do aluno: ");
    nomeAluno = input.nextLine();

    for (int i = 0; i < 5; i++) {
        System.out.print("Digite a nota " + (i + 1) + ": ");
        notas[i] = input.nextDouble();
    }

    media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / 5;

    if (media >= 60) {
        System.out.println(nomeAluno + " foi aprovado(a) com média " + media);
    } else if (media < 40) {
        System.out.println(nomeAluno + " foi reprovado(a) com média " + media);
    } else {
        System.out.println(nomeAluno + " ficou em recuperação com média " + media);
    }

    input.close();
}
}
