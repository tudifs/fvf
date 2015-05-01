package de.tu_darmstadt.sport.fvf;

public interface PreferenceConstants {
	
	final public static String DATABASE_REMEMBER	= "database.rememberLastOpened";
	final public static String DATABASE_LASTDB		= "database.lastOpened";

	/**
	 * LEDS
	 */
	final public static String TEST_LEDS			= "test.leds";
	
	/**
	 * Startfrequenz [Hz]
	 */
	final public static String TEST_FREQUENCY_START	= "test.startFrequency";
	
	/**
	 * Frequenzsteigerung [Hz] 
	 */
	final public static String TEST_FREQUENCY_STEP	= "test.frequencyStep";
	
	/**
	 * Messzyklen pro Frequenz
	 */
	final public static String TEST_CYCLES			= "test.frequencyCycles";
	
	/**
	 * Pausendauer pro Messzyklus [s]
	 */
	final public static String TEST_CYCLE_PAUSE		= "test.cyclePause";
	
	/**
	 * Anzeigedauer pro LED [s]
	 */
	final public static String TEST_LED_DURATION	= "test.ledDuration";
	
	/**
	 * Pausendauer pro LED [s]
	 */
	final public static String TEST_LED_PAUSE		= "test.ledPause";
	
	/**
	 * Abbruchkriterium (Falschnennungen)
	 */
	final public static String TEST_STOP_CRITERIA	= "test.stopCriteria";
	
	/**
	 * Helligkeit der LEDs
	 */
	final public static String TEST_BRIGHTNESS		= "test.brightness";
	
	
	final public static String VISUAL_HIGHLIGHT_FLICKER_LED = "visual.hightlightFlickerLed";
	
	final public static String VISUAL_HIGHLIGHT_COLOR = "visual.hightlightColor";
	
	final public static String VISUAL_ANIMATE_FLICKER_LED = "visual.flickerLed";
	
	
	final public static String USB_PORT = "usb.port";
}
