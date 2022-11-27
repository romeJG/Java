
package encapsulation;

public class EncapThis {
     private  double x,y;
   
    public  double getAddition(double x, double y)  {
        return  (x+y);
        
    }
    
    public  double getSubtraction(double x, double y)  {
        return  (x-y);
    }
  
    public  double getMultiplication(double x, double y)  {
        return  (x*y);
    }
   
    public  double getDivision(double x, double y)  {
        return  (x/y);
    }
     
    public  double getModulo(double x, double y)  {
        double ans=x%y;
        if (ans==0)
            ans=0;
        return (ans);
    }
}
