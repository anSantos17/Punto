import java.util.Scanner;

public class Punto {
    private double px;
    private double py;
    
    public Punto(){
      this.px=0;
      this.py=0;
    }
    
    public Punto(double x, double y){
      this.px=x;
      this.py=y;
    } 

    public void setX(double x){
      this.px=x;
    }    
    public double getX(){
      return this.px;
    }

    public void setY(double y){
      this.py=y;
    }
    public double getY(){
      return this.py;
    }

    public void moverV(double vertical){
      this.py = this.py + vertical;
    }

    public void moverH(double horizontal){
      this.px = this.px + horizontal;
    }

    public void moverD(double dhorizontal, double dvertical){
      this.px = this.px + dhorizontal;
      this.py = this.py + dvertical; 
    }

    public void distancia(){
      double px,py;
      px = (double) Math.pow(this.px, 2);
      py = (double) Math.pow(this.py, 2);
      double res = Math.sqrt(px+py);
    }

    public double distancia(Punto p1){
      Punto num = new Punto();
      num.px = (double) Math.pow(p1.px,2) - Math.pow(this.px,2);
      num.py = (double) Math.pow(p1.py,2) - Math.pow(this.py,2);
      double res = Math.sqrt(num.px + num.py);
      return res;
    }

    public void leer(){
      Scanner s = new Scanner(System.in);
      System.out.println("Ingrese la coordenada x seguida de la coordenada y ");
      this.px=s.nextDouble();
      this.py=s.nextDouble();
    }

    public void imprimir(){
      System.out.println(String.format("(%.2f ,%.2f)", this.px, this.py));    
    }
 
}