import java.util.Scanner;
public class Main {
  

  public static void main(String[] args) {
    
    
    Punto p= new Punto();
    Punto p1 = new Punto();
    Punto3d p3 =new Punto3d();
    Linea2d p4 = new Linea2d();
    p.leer();
    p1.leer();
    p.distancia();
    p.imprimir();
    p.distancia(p1);
    p.imprimir();

      Scanner s = new Scanner(System.in);
      System.out.println("Ingrese la cantidad que quiere mover verticalmente ");
      double vertical = s.nextDouble();
      p.moverV(vertical);
      p.imprimir();

      System.out.println("Ingrese la cantidad que quiere mover Horizontalmente");
      double horizontal = s.nextDouble();
      p.moverH(horizontal);
      p.imprimir();

      System.out.println("Ingrese la cantidad que quiere mover en x seguido de la cantidad que quiere mover en y");
      double dhorizontal = s.nextDouble();
      double dvertical = s.nextDouble();
      p.moverD(dhorizontal, dvertical);
      p.imprimir();

    p3.leer();
    
      System.out.println("Ingrese la cantidad que quiere mover para la altura ");
      double altura = s.nextDouble();
      p3.moverZ(altura);
      p3.imprimir();
      
      System.out.println("Ingrese la cantidad que quiere mover en z de forma diagonal");
      double daltura = s.nextDouble();
      p3.moverD(dhorizontal, dvertical, daltura);
      p3.imprimir();

    p4.leer();
    
      System.out.println("Ingrese la cantidad que quiere mover verticalmente seguida de la cantidad que quiere mover Horizontalmente");
      double lvertical = s.nextDouble();
      double lhorizontal = s.nextDouble();
      p4.moverV(lvertical,lhorizontal);
      p4.imprimir();

      System.out.println("Ingrese la cantidad que quiere mover Horizontalmente seguida de la cantidad que quiere mover verticalmente");
      double mhorizontal = s.nextDouble();
      double mvertical = s.nextDouble();
      p4.moverH(mhorizontal, mvertical);
      p4.imprimir();

      System.out.println("Ingrese la cantidad que quiere mover en x seguido de la cantidad que quiere mover en y");
      double ldhorizontal = s.nextDouble();
      double ldvertical = s.nextDouble();
      p4.moverD(ldhorizontal, ldvertical);
      p4.imprimir();
 
  }
}