public class Data{
    int dia;
    int mes;
    int ano;
    
    void informaData (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
   
    public String formatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}