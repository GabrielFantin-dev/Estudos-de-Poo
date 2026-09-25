import aula.Caneta;
public class Caneta{
    protected String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada?" + this.tampada);
        System.out.println("A ponta é " + this.ponta);
        System.out.println("A carga é " + this.carga);
        System.out.println("O modelo é " + this.modelo);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }


}