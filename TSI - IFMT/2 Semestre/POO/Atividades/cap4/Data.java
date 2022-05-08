public class Data{
    int dia;
    int mes;
    int ano;
    
    void informaData (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    // exercicio 9
    /*public void formatada(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);*/
   
   
    public String formatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}