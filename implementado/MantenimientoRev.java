package implementado;
import Interface.Revisar;

public class MantenimientoRev implements Revisar{

    @Override
    public void revisar(String ObjetoaRevisar) {
        System.out.println("Su: " + ObjetoaRevisar + " esta siendo revisado en este instante!");
    }

    
}