package Delegate;

import Delegate.Delegate;;

public class Application {

	public void DelegateUse() {
		Delegate delegate = new Delegate();
		
		delegate.SetWorker(new Builder()).work();
		delegate.SetWorker(new Seller()).work();
	}

}
