package Strategy;

public class StrategyUser {
	Strategy strategi;

	public void setStrategi(Strategy strategi) {
		this.strategi = strategi;
	}
	public void StringWorker(String s) {
		strategi.StringWorker(s);
	}
}
