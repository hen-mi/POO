class Academico {

    float media(float prova1, float prova2) {

        float media;

        media = (prova1 + prova2) / 2;
        return media;

    }

    float maior(float prova1, float prova2) {

        float maior;
        maior = prova1;
        if (prova1 > prova2) {

            maior = prova1;
        } 
        else if (prova1 < prova2) {

            maior = prova2;
        }

        return maior;
    }

    boolean aprovado(float media) {

        if (media >= 6.0) {

          return true;
        } 
        else if (media < 6.0) {

          return false;
        }
      return false;
    }

    String situacao(float media) {

        String situacao = "REPROVADO\n";

        if (this.aprovado(media) == true) {

            situacao = "APROVADO\n";

        } else if (this.aprovado(media) == false) {
          
            situacao = "REPROVADO\n";
        }
        return situacao;
    }

}