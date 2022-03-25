import java.util.Scanner;

class Calculador {

    void executar() {

        Academico academico = new Academico();
        Scanner teclado = new Scanner(System.in);
        float prova1, prova2, exame, sub;

        System.out.print("Digite a nota da prova 1...: ");
        prova1 = teclado.nextFloat();

        System.out.print("Digite a nota da prova 2...: ");
        prova2 = teclado.nextFloat();

        float media = academico.media(prova1, prova2);

        System.out.println("MÉDIA: " + media);

        System.out.print(academico.situacao(media));

        if (academico.aprovado(media) == false) {


            System.out.print("Digite a nota da substitutiva...: ");
            sub = teclado.nextFloat();

            media = academico.media(academico.maior(prova1, prova2), sub);
            System.out.println("MÉDIA: " + media);
            System.out.print(academico.situacao(media));

            if (academico.aprovado(media) == false) {

                System.out.print("exame...: ");
                exame = teclado.nextFloat();

                media = academico.media(media, exame);
                System.out.println("MÉDIA: " + media);
                System.out.print(academico.situacao(media));

            }
        }

        teclado.close();

    }

}