package observer;

public class Agencia implements Observer {
	private AgenteBolsa agente=null;
	
	//Se guarda una refencia a observable
	public Agencia (AgenteBolsa agente) {
		this.agente=agente;
	}
	
	@Override
	public void update() {		
		if(agente.getTrend()==Tendencia.ALCISTA) {
			System.out.println("Cambio de tendencia de bajista a alcista");
			System.out.println("Abrir posiciones largas");
		}
		else {
			System.out.println("Cambio de tendencia de alcista a bajista");
			System.out.println("Abrir posiciones cortas");
		}
		
	}

}
