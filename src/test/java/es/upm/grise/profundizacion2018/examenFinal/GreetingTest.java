package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GreetingTest {
	private MyCalendar mockMyCalendar;
	private Greeting greeting;
	
	@Before
 	public void setUp(){
 		mockMyCalendar = Mockito.mock(MyCalendar.class);
 		for(int i=13; i<25;i++){
 	 		Mockito.when(mockMyCalendar.get(i)).thenReturn(10); 			
 		}
 		greeting = Mockito.spy(new Greeting());
 	}
	
	@Test
	public void smokeTest1() {
		assertEquals("Good morning", greeting.getGreeting(null, mockMyCalendar));
	}
	
	@Test
	public void smokeTest2() {
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH, mockMyCalendar));
	}
	
	@Test
	public void smokeTest3() {
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH, mockMyCalendar));
	}
	
	@Test
	public void smokeTest4() {
		assertEquals("Good morning", greeting.getGreeting(null, mockMyCalendar));
		Mockito.verify(greeting).getDefaultLanguage();
		Mockito.verify(greeting).getMessage(TimeOfTheDay.MORNING, Language.ENGLISH);
	}
	
	@Test
	public void smokeTest5() {
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH, mockMyCalendar));
		Mockito.verify(greeting, Mockito.never()).getDefaultLanguage();
		Mockito.verify(greeting).getMessage(TimeOfTheDay.MORNING, Language.ENGLISH);
	}

}
