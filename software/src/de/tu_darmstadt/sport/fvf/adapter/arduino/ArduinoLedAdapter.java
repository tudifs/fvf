package de.tu_darmstadt.sport.fvf.adapter.arduino;

import de.tu_darmstadt.sport.fvf.adapter.AbstractLedAdapter;
import de.tu_darmstadt.sport.fvf.driver.ArduinoLedDriver;
import de.tu_darmstadt.sport.fvf.driver.SerialAdapter;
import de.tu_darmstadt.sport.fvf.testrunner.ILedAdapter;
import de.tu_darmstadt.sport.fvf.testrunner.TestRunnerListenerCollection;

public class ArduinoLedAdapter extends AbstractLedAdapter {

	private ArduinoLedDriver driver;
	
	public ArduinoLedAdapter(ArduinoLedDriver driver) {
		this.driver = driver;
		this.driver.addListener(new SerialAdapter(){
			public void ledOn(int led) {
				listeners.fireEvent(TestRunnerListenerCollection.LED_ON, led, ILedAdapter.BRIGHTNESS_HIGH, false);
			}
			
			public void ledOff(int led) {
				listeners.fireEvent(TestRunnerListenerCollection.LED_OFF, led);
			}
			
			public void ledsOn(int led) {
				listeners.fireEvent(TestRunnerListenerCollection.LEDS_ON, led);
			}
			
			public void ledsOff(int led) {
				listeners.fireEvent(TestRunnerListenerCollection.LEDS_OFF, led);
			}
		});
	}

	public void ledOn(int led) {
		ledOn(led, ILedAdapter.BRIGHTNESS_HIGH);
	}
	
	public void ledOn(int led, int brightness) {
		driver.cmdLedOn(led);
	}
	
	public void ledFlicker(int led, double frequency) {
		ledFlicker(led, frequency, ILedAdapter.BRIGHTNESS_HIGH);
	}
	
	public void ledFlicker(int led, double frequency, int brightness) {
		driver.cmdLedFlicker(led, frequency);
	}

	public void ledOff(int led) {
		driver.cmdLedOff(led);
	}
	
}
