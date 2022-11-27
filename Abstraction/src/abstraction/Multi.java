
package abstraction;

public abstract class Multi extends Sup {
    public  void compute(int x, int y){
       int z;
       z= x*y;
         System.out.println(x+ " * "+ y+ " = "+ z); 
    }
}