package observer;

public interface Observable {

	void attach(Agencia o);
	void detach(Agencia o);
	void notifies();
}
