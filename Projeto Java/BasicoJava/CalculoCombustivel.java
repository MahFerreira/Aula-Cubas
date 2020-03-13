

public class CalculoCombustivel
{
    public static void main(String[] args){
        double alcool=2.90;
        double gasolina=4.40;
        double valor=gasolina/alcool;
        if(valor < 0.7){
            System.out.println("Gasolina e melhor");
        }
        else{
            System.out.println("Alcool e melhor");
        }
        
    }
}