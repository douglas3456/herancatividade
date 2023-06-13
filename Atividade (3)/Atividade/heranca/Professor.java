package heranca;
public class Professor extends Pessoa {
    
    String Disciplina;
    int CargaHoraria;
    double ValorHora;
    double Salario;
    

    public void setDisciplina(String disciplina) {
    Disciplina = disciplina;
}
public void setCargaHoraria(int horaria ) {
    CargaHoraria= horaria;
}
public void setValorHora(double Hora) {
    ValorHora = Hora;
}
public void setSalario(double salario) {
    Salario= salario;
}
public String getDisciplina(){
    return Disciplina;
}
public int getCargaHoraria(){
    return CargaHoraria;
}
public double getValorHora(){
    return ValorHora;
}
 public double getSalario(){
    return ValorHora*CargaHoraria;
} 


public String Dados(){
    return getNome().toUpperCase()+"- "+getSobrenome().toUpperCase()+"-"+getIdade()+"-"+getTelefone()+" - "+getEmail()+"-"+getDisciplina()+"-"+getCargaHoraria()+"-"+getValorHora()+"-"+getSalario();
    

}
}

