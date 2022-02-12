package observer;

import java.util.ArrayList;
import java.util.List;

public class AgenteBolsa implements Observable {

	private Tendencia trend;
	//registro de agencias de bolsa a notificar
	private List<Agencia> listaDeAgencias;

	public AgenteBolsa() {
		this.listaDeAgencias = new ArrayList<>();
	}

	public Tendencia getTrend() {
		return trend;
	}
	
	public void changeOfTrend(Tendencia mercado) {
		switch (mercado) {
		case ALCISTA:
			trend = Tendencia.ALCISTA;
			System.out.println("mercado alcista");
			notifies();
			break;
		case BAJISTA:
			trend = Tendencia.BAJISTA;
			System.out.println("mercado bajista");
			notifies();
			break;
		default:
			System.err.println("tendencia no definida");
		}

	}

	@Override
	public void attach(Agencia agencia) {
		listaDeAgencias.add(agencia);
	}

	@Override
	public void detach(Agencia agencia) {
		listaDeAgencias.remove(agencia);

	}

	@Override
	public void notifies() {
		if (listaDeAgencias == null) {
			System.err.println("Lista vacia");
		}
		for (Agencia agencia : listaDeAgencias) {
			agencia.update();
		}
	}

}
