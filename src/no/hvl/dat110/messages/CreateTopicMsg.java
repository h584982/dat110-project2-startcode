package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	
	// TODO: 
	// Implement object variables - a topic is required
	
	// Constructor, get/set-methods, and toString method
    // as described in the project text	
	
	String topic;
	
	
	public CreateTopicMsg(String topic, String user ) {
		super(MessageType.CREATETOPIC, user);
		this.topic=topic;
	}
	
	
	
/*	@Override
	public String toString() {
		return ;
	};
*/	
}
