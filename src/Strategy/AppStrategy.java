package Strategy;

public class AppStrategy {
	void app() {
		StrategyUser user = new StrategyUser();
		user.setStrategi(new SortStrategy());
		user.StringWorker("asdasdadljkh");
	}
}
