public class CalculoIMC{
    double valorResultado;
    double peso;
    double altura;
public static void main (String[] args){
    CalculoIMC pessoa = new CalculoIMC(); //instancia
    
    pessoa.peso = 55.600;
    pessoa.altura = 1.70;
    pessoa.valorResultado = pessoa.peso / (pessoa.altura * pessoa.altura);
    pessoa.valorResultado = pessoa.valorResultado;
    
        if(pessoa.valorResultado < 18.5){
        System.out.println("Baixo(com risco de outras doenças) ");
} 

    else if(pessoa.valorResultado > 18.5 && pessoa.valorResultado < 24.9){
        System.out.println("Massa Corporal Normal ");
} 

    else if(pessoa.valorResultado > 24.9 && pessoa.valorResultado < 29.9){
        System.out.println("Sobrepeso  ");
} 

    else if(pessoa.valorResultado > 29.9 && pessoa.valorResultado < 34.9){
        System.out.println("Obesidade Leve  ");
} 

    else if(pessoa.valorResultado > 34.9 && pessoa.valorResultado < 39.9){
        System.out.println("Obesidade Media  ");
} 

    else if(pessoa.valorResultado >= 40){
        System.out.println("Obesidade Morbida ");
}
}
}