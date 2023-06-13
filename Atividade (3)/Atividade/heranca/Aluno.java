package heranca;

public class Aluno extends Pessoa {

String Turma;
int Media;
String Situacao;

public void setTurma(String turma) {
    Turma = turma;
}
public void setMedia(int media) {
    Media= media;
}
public void setSituacao(String situacao) {
    Situacao = situacao;
}
public String getTurma(){
    return Turma;
}
public int getMedia(){
    return Media;
}
public String getSituacao(){
    return Situacao;
}
public String Dados(){
    return getNome().toUpperCase()+"- "+getSobrenome().toUpperCase()+"-"+getIdade()+"-"+getTelefone()+" - "+getEmail()+"-"+getTurma()+"-"+getMedia()+"-"+getSituacao();
    
}

}
    