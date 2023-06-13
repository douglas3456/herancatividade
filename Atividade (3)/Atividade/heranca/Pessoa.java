package heranca;

public class Pessoa{
   String Nome;
   String Sobrenome;
   int Idade;
   String Email;
   String Telefone;
   
   public void setNome(String nome){
         Nome=nome;
   }
   public void setSobrenome(String sobrenome){
    Sobrenome=sobrenome;
   }
   public void setIdade(int idade){
       Idade=idade;
   }
   public void setEmail(String email){
    Email=email;
   }
   public void setTelefone(String telefone){
    Telefone=telefone;
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
    public String getTelefone(){
        return Telefone;
    }
    public String getEmail(){
        return Email;
    }
    public String Dados(){
        return getNome().toUpperCase()+"- "+getSobrenome().toUpperCase()+"-"+getIdade()+"-"+getTelefone()+" - "+getEmail();
    
    }
    
}  
