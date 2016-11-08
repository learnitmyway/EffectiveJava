package item18;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class ProfessionalTest {
	
	final static int CAPITAL_GAINS = 10;
	final static int SALARY = 100;

	@Test
	public void test_allRounderEarnsMoreThanSoftwareEngineer() {

		// GIVEN
		final SoftwareEngineer softwareEngineer = new Professional();
		softwareEngineer.setSalary(SALARY);

		final AllRounder allRounder = new Professional();
		allRounder.setCapitalGains(CAPITAL_GAINS);
		allRounder.setSalary(SALARY);

		// WHEN
		final int salary = softwareEngineer.getSalary();
		final int totalEarnings = allRounder.getTotalEarnings();

		// THEN
		assertThat(totalEarnings).isGreaterThan(salary);
	}
	
	@Test
	public void test_allRounderEarnsMoreThanEtfInvestor() {

		// GIVEN
		final EtfInvestor etfInvestor = new Professional();
		etfInvestor.setCapitalGains(CAPITAL_GAINS);

		final AllRounder allRounder = new Professional();
		allRounder.setCapitalGains(CAPITAL_GAINS);
		allRounder.setSalary(SALARY);

		// WHEN
		final int capitalGains = etfInvestor.getCapitalGains();
		final int totalEarnings = allRounder.getTotalEarnings();

		// THEN
		assertThat(totalEarnings).isGreaterThan(capitalGains);
	}

}
