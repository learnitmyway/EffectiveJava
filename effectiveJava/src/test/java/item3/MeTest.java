package item3;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MeTest {
	
	@Before
	public void test_isWalletStolen_false() {

		// GIVEN
		final Me me = Me.INSTANCE;
		
		// WHEN
		final boolean isWalletStolen = me.isWalletStolen();
		
		// THEN
		assertThat(isWalletStolen).isFalse();
	}

	@Test
	public void test_isWalletStolen_true() {

		// GIVEN
		final Me me = Me.INSTANCE;
		
		// WHEN
		me.stealWallet();
		
		// THEN
		assertThat(Me.INSTANCE.isWalletStolen()).isTrue();
	}

}
