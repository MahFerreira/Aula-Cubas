public class Candidato {

    private int votos = 0;
    private int numero = 0;

    public Candidato(int numero){
        this.numero = numero;

    }

    public int Votos(){
        return votos;
    }

    public void addVotos(int v){
        votos+=v;
    }



}
