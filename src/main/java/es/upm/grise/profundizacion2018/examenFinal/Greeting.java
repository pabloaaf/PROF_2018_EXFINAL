package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class Greeting {
	public String getGreeting( Language language, MyCalendar calendar ) {
		// Get current hour
		// = Calendar.getInstance();
		int hour = calendar.get( Calendar.HOUR_OF_DAY );
		
		// Find out the greeting language
		if ( language == null )
			language = getDefaultLanguage();
		
		// Get the moment of the day
		TimeOfTheDay moment;
		if( hour < 12 ) 
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;
			
		// Return the message		
		return getMessage( moment, language );
	}
	
	public Language getDefaultLanguage(){
		return Message.getDefaultLanguage();
	}
	
	public String getMessage(TimeOfTheDay moment, Language language){
		return Message.getMessage( moment, language );
	}
	

}
