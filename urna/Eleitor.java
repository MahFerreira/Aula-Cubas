public class Eleitor {

    private String nome;
    private String cpf;
    private String titulo;

    public Eleitor(String nome, String cpf, String titulo){
        this.nome = nome;
        this.cpf = cpf;
        this.titulo = titulo;
    }


    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getTitulo(){
        return titulo;
    }




}
