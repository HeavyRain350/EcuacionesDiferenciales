/**
 *
 * @author Erik Mejia Hernandez 33140667
 */
public class CrecDecre {
    private double constante,k,condInicial,condIntermedia,condFinal,tBuscado;
    private int tCondInt;
    
    public double calcularResultado(double condInit,double condInter,double condFin,int tInt){
        condInicial = condInit;
        condIntermedia = condInter;
        condFinal = condFin;
        tCondInt = tInt;
        constante = condInicial;
        
        k=calcularK();
        tBuscado = calcularTBuscado();
        return tBuscado;
    }
    
    private double calcularK(){
        return (Math.log(condIntermedia))/tCondInt;
    }
    
    private double calcularTBuscado(){
        return (Math.log(condFinal))/k;
    }
    
    
}
