package item3;

public enum Me {
	INSTANCE;
	
	private boolean isWalletStolen = false;

	public void stealWallet() {
		if (!isWalletStolen) {
			isWalletStolen = true;
		} else {
			throw new UnsupportedOperationException("You can't steal my again!");
		}
	}

	public boolean isWalletStolen() {
		return isWalletStolen;
	}

}
