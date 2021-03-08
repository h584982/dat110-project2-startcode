package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;
import no.hvl.dat110.messages.PublishMsg;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to
		Client client = new Client("TempServer", Common.BROKERHOST, Common.BROKERPORT);
		// - connect to the broker
		client.connect();
		String topic = "tempMeasure";
		TemperatureSensor sensor= new TemperatureSensor();
		for(int i= 0; i < COUNT; i++){
			// - publish the temperature(s)
			String message = Integer.toString(sensor.read());
			client.publish(topic, message);

		}
		// - disconnect from the broker
		client.disconnect();






		System.out.println("Temperature device stopping ... ");



	}
}
