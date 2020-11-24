import java.util.HashMap;
import java.util.List;

public class Voto {

    private int candidato = 0;
    public static HashMap<Integer, Integer> todososvotos = new HashMap<>();

    public Voto(int candidato){
        this.candidato = candidato;
    }

    public void addVoto(){
        Candidato seucandidato = new Candidato(candidato);
        seucandidato.addVotos(1);
        todososvotos.put(candidato, seucandidato.Votos());
    }
}
