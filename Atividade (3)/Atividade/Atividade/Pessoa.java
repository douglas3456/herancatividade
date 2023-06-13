import java.util.Scanner;

public class Pessoa{

    public String Nome;
    public String Sobrenome;
    public  int Idade;
    public double Salario;
    public double Altura;
    public String Nomecompleto;
    public int Validaridade;
    public double ValidarimpostoRenda;
    
    public void setValidarimpostoRenda(double ImpostoRenda){
        ValidarimpostoRenda=ImpostoRenda;
    }
    
    public void setValidaridade(int validaridade){
        Validaridade=validaridade;
    }
    public void setNomecompleto(String nomeCompleto){
        Nomecompleto=nomeCompleto;
    }

    public void setNome(String nome){
        Nome=nome;
    }
    public void setSobrenome(String sobrenome){
        Sobrenome=sobrenome;
    }
    public void setIdade(int idade){
        Idade=idade;
    }
    public void setSalario(double salario){
        Salario=salario;
    }
    public void setAltura(double altura){
        Altura=altura;
    }
    public String getNome(){
        return Nome;
    }
    public String getSobrenome(){
        return Sobrenome;
    }
    public int getIdade(){
        return Idade;
    } 
    public double getSalario(){
        return Salario;
    }
    public double getAltura(){
        return Altura;
    }
    public String getNomecompleto(){
        return Nomecompleto;
    }
public String converterMaiusculo(String Nome){
    return  Nome;
}
public int getValidaridade(){
    return Validaridade;
}
public double getValidarimpostoRenda(){
    return ValidarimpostoRenda;
}
public String gerarNomeCompleto(){

        String Nome = this.getNome();
        String Sobrenome = this.getSobrenome();
        String Nomecompleto = Nome+' '+Sobrenome;
        
         return Nomecompleto;
}
        
public void detalhe(){

    String nome = this.getNome();
    String Sobrenome = this.getSobrenome();
    int idade = this.getIdade();
    String nomeCompleto = this.getNomecompleto();
    double Altura = this.getAltura();
    int validaridade = this.getValidaridade();
    double ImpostoRenda = this.getValidarimpostoRenda();

    System.out.println("Nome: "+nome);
    System.out.println("Sobrenome: "+Sobrenome);
    System.out.println("Idade "+idade);
    System.out.println(validaridade);
    System.out.println("Altura: " + Altura);
    System.out.println("Qual é o imposto?"+ImpostoRenda);
    System.out.println(nomeCompleto);
}
public void Salvar(){
  Scanner ler = new Scanner(System.in);

      String Nomecompleto;
      int idade,validaridade,ImpostoRenda;
      double Salario,Altura,ValidarimpostoRenda;

      System.out.println("Digite o seu nome completo");
      Nomecompleto = ler.next();
      this.setNomecompleto(Nomecompleto);

      System.out.println("Digite a sua idade");
       idade= ler.nextInt();
      this.setIdade(idade);

      System.out.println("Digite a cor do seu carro");
      Validaridade = ler.nextInt();
      this.setValidaridade(Validaridade);

      System.out.println("Digite  o seu salario:");
      Salario = ler.nextDouble();
      this.setSalario(Salario);

      System.out.println("qual a sua açtura?");
      Altura = ler.nextDouble();
      this.setAltura(Altura);

      System.out.println("O imposto de renda será:");
      ValidarimpostoRenda = ler.nextInt();
      this.setValidarimpostoRenda(ValidarimpostoRenda);

      
}
    
  
    
     public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.detalhe();
        pessoa.Salvar();
        
        

        pessoa.setNome("Douglas");
        String  Nomecompleto = pessoa.gerarNomeCompleto();
        System.out.println(Nomecompleto);

        
        String setNome = "Douglas";  
        pessoa.converterMaiusculo("Douglas");
        setNome = setNome.toUpperCase();  
        System.out.println(setNome);
        
       
        
        int Idade = pessoa.getIdade();
        
         if(Idade >= 18){
            System.out.println("Adulto");
        }else if (Idade <= 18 ){
           System.out.println("Criança");
            
           
           
        }
        
        double ValidarimpostoRenda = pessoa.getValidarimpostoRenda();
    
        if(ValidarimpostoRenda <= 1.903){
            System.out.println("será isento");
        }else if (ValidarimpostoRenda <= 2.826 ){
           System.out.println("Será de 7,50%");
      
      
      if(ValidarimpostoRenda <= 3751){
        System.out.println("será de 15,00%");
      }else if (ValidarimpostoRenda <= 4664 ){
       System.out.println("Será de 22,50%");
     
     }else{
      System.out.println("será 27,50%");
     }
      }
     
       
        
    }
}