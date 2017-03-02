package item18;

class Professional implements AllRounder {
	private int salary;
	private int capitalGains;
	
	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public int getCapitalGains() {
		return capitalGains;
	}

	@Override
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void setCapitalGains(int capitalGains) {
		this.capitalGains = capitalGains;
	}

	@Override
	public int getTotalEarnings() {
		return salary + capitalGains;
	}

}
