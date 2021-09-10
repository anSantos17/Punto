import java.util.Scanner;
public class Linea2d{

  private Punto inicio;
  private Punto fin;

  public Linea2d(){

    inicio = new Punto();
    fin = new Punto();
  }

  public Linea2d( Punto pinicio, Punto pfin){

    this.inicio = pinicio;
    this.fin = pfin;
  }

  
  public void setPinicio(Punto x){
    this.inicio = x;
  }
  public void setPfin(Punto y){
    this.fin = y;
  }

  public Punto getPinicio(){
    return inicio;
  }
  public Punto getPfin(){
    return inicio;
  }

  public double longitudLinea(Punto p3){
    return inicio.distancia(fin);
  }

  public void moverV(double lvertical, double lhorizontal){
      this.inicio.moverV(lvertical);
      this.fin.moverV(lhorizontal);
  }

  public void moverH(double mhorizontal, double mvertical){
      this.inicio.moverH(mvertical);
      this.fin.moverH(mhorizontal);
  }

  public void moverD(double ldhorizontal, double ldvertical){
      this.fin.moverD(ldhorizontal,ldvertical);
      this.inicio.moverD(ldhorizontal,ldvertical);
  }
  

  public void leer(){
      this.inicio.leer();
      this.fin.leer();
    } 

  public void imprimir(){
      this.inicio.imprimir();
      this.fin.imprimir();
  }
}