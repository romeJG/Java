
package abstraction;

public abstract class Divide extends Sup {
    public  void compute(int x, int y){
       int z;
       z= x-y;
         System.out.println(x+ " / "+ y+ " = "+ z); 
    }
}