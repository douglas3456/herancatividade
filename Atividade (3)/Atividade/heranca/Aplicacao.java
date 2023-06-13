package heranca;
public class Aplicacao {
  

    public static void main(String[] args) { 
        //pessoa funciona
        Pessoa pessoa= new Pessoa();
        pessoa.setNome("Douglas");
        pessoa.setSobrenome("Oliveira");
        pessoa.setIdade(15);
        pessoa.setTelefone("00000000");
        pessoa.setEmail("louco@luz.com");
       System.out.println(pessoa.Dados());
    
    // aluno funciona
    Aluno aluno= new Aluno();
    aluno.setNome("Douglas");
    aluno.setSobrenome("Oliveira");
    aluno.setIdade(15);
    aluno.setTelefone("00000000");
    aluno.setEmail("louco@luz.com");
    aluno.setTurma("Manhã");
    aluno.setMedia(5);
    aluno.setSituacao("passou");
    System.out.println(aluno.Dados());

    
// professor
    Professor professor= new Professor();
    professor.setNome("Douglas");
    professor.setSobrenome("Oliveira");
    professor.setIdade(15);
    professor.setTelefone("00000000");
    professor.setEmail("louco@luz.com");
    professor.setDisciplina("Matematica");
    professor.setCargaHoraria(20);
    professor.setValorHora(12);
    professor.getSalario();
  
   System.out.println(professor.Dados());
   
    }
}
