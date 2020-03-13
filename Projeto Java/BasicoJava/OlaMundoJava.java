

public class OlaMundoJava
{
    public static void main(String[] args){
        double valorSalario=1300.45;
        int numeroDepende=5;
        char letra='B';
        boolean temSaldo=true;
        
        double valor1=10.20;
        double valor2=30.20;
        double soma=valor1+valor2;
        if(soma > 100){
            System.out.println("A soma de " + valor1 + "mais" + valor2 + "é maior que 100");
        }    
        else{
            System.out.println("A soma de " + valor1 + " mais "+ valor2 + "é menor que 100");
        }
    }
}
