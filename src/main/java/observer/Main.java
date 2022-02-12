
/***
 * Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses
 *  agències de Borsa (Observers) canvis quan la Borsa puja o baixa.
 * 
 * @author Agustin Carnerero Peña.
 */


package observer;

public class Main {
   public static void main(String[] args) {
      //Se crea un objeto observable agente.
	   AgenteBolsa agente=new AgenteBolsa();
	  //Se crean tres objetos observadores agencia de valores.
	   Agencia agencia1=new Agencia(agente);
	   Agencia agencia2=new Agencia(agente);
	   Agencia agencia3=new Agencia(agente);
	   //Se agregan a la lista de observadores,que serán los que recibiran la notificacion
	   //cuando haya un cambio de tendencia en la bolsa.
	   agente.attach(agencia1);
	   agente.attach(agencia2);	  
	   agente.attach(agencia3);
	   //Se produce un cambio de estado en la tendencia del mercado a alcista.Los agentes reciben la noficacion.
	   agente.changeOfTrend(Tendencia.ALCISTA);
	   //Quitamos a un agencia de la bolsa de la lista.
	   agente.detach(agencia3);
	   //Se produce un cambio de tendencia del mercado a bajista.los agentes reciben notificacion
	   System.out.println("----------");
	   agente.changeOfTrend(Tendencia.BAJISTA);
	   
   }
}
