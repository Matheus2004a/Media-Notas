import java.util.Scanner;

public class Medianotas {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nome_aluno;
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, med_notas = 0;

        System.out.print("Digite seu nome:");
        nome_aluno = teclado.nextLine();
        
        System.out.print("Digite sua nota de matemática do 1º Bimestre:");
        nota1 = teclado.nextFloat();

        System.out.print("Digite sua nota de matemática do 2º Bimestre:");
        nota2 = teclado.nextFloat();

        System.out.print("Digite sua nota de matemática do 3º Bimestre:");
        nota3 = teclado.nextFloat();

        System.out.print("Digite sua nota de matemática do 4º Bimestre:");
        nota4 = teclado.nextFloat();

        //Calculando média das notas
        med_notas = (nota1 + nota2 + nota3 + nota4) / 4;

        if (med_notas < 6){
            System.out.print("Você foi reprovado. Sua média final foi: " + med_notas);
        }
        else{
            System.out.print("Parabéns! Você foi aprovado. Sua média final foi: " + med_notas);
        }
    }
}
