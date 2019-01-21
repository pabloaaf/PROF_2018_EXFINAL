package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GreetingTest {
	private MyCalendar mockMyCalendar;
	
	@Before
 	public void setUp(){
 		mockMyCalendar = Mockito.mock(MyCalendar.class);
 		for(int i=13; i<25;i++){
 	 		Mockito.when(mockMyCalendar.get(i)).thenReturn(10); 			
 		}
 	}
	
	@Test
	public void smokeTest1() {
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(null, mockMyCalendar));
	}
	
	@Test
	public void smokeTest2() {
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH, mockMyCalendar));
	}
	
	@Test
	public void smokeTest3() {
		Greeting greeting = new Greeting();
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH, mockMyCalendar));
	}

}
