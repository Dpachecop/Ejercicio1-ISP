package implementado;
import Interface.Reparar;

public class MantenimientoRep implements Reparar {

    @Override
    public void reparar(String ObjetoaReparar) {
      
        System.out.println("Su: " + ObjetoaReparar + " esta siendo reparado en este instante!");
    }
    
}
