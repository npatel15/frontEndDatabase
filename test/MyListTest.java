import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

import org.junit.jupiter.api.Test;
import  org.mockito.Mockito;

public class MyListTest {
	
	//Configured method to call the real, underlying method
	@Test
	public void test() {
		MyList listMock = Mockito.mock(MyList.class);
		when(listMock.size()).thenCallRealMethod();
		assertEquals(1, listMock.size());

	}

	//Throw an exception
	@Test
	public void throwExceptionTest() {
		assertThrows(NullPointerException.class, () -> {
		MyList listMock = Mockito.mock(MyList.class);
		doThrow(NullPointerException.class).when(listMock).clear();
		 
		listMock.clear();
	});
	}

}
