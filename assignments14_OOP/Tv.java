package assignments14_OOP;

public class Tv {
	
			/*Question-5
		
		Write a custom class TV that has 4 instance variables: int channel=1, 
		int volumeLevel=1, boolean on = false, String brand = "undefined".
		Create one "no arguments" constructor that prints message:
		"Creating TV object using no Args- constructor".
		
		Also, create one more constructor that defines the instance variable brand, 
		and displays the message: "Creating TV object using 1 arg - constructor".
		Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), 
		channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
		Declare methods channelUp() to increase variable channel by one, 
		and channelDown() to decrease variable channel by one.
		Declare methods volumeUp() to increase variable volume by one, 
		and volumeDown() to decrease variable volume by one.
		Create isOn(), turnOn() and turnOff() methods for "on" instance variable. 
		If the tv is already on, no need to turn it on again, 
		display the message: "TV is already ON". If the tv is already off, 
		then no need to turn it off again, display the message: "TV is already OFF".
		The value of a variable channel cannot be negative or zero, 
		and cannot be higher than 120. If the user will try to set an invalid channel, 
		display the message: "ERROR: TV is either OFF or invalid Channel".
		Volume can be only in the range between 1 and 7. 
		You may change volume only if TV is on. Otherwise, 
		display the message: "ERROR: TV is either OFF or invalid Volume level". 
		Create isOn() method that will check tv status.
		*/
			private int channel=1;
			private int volumeLevel=1;
			boolean on = false;
			String brand = "undefined";
	
			public Tv() {
				System.out.println("Creating TV object using no Args- constructor");
			}
			
			public Tv(String brand){
				this.brand=brand;
				System.out.println("Creating TV object using 1 arg - constructor");
			}

			public int getChannel() {
				return channel;
			}
			/*
			The value of a variable channel cannot be negative or zero, 
			and cannot be higher than 120. If the user will try to set an invalid channel, 
			display the message: "ERROR: TV is either OFF or invalid Channel".*/
			public void setChannel(int channel) {
				
				if(channel<=0 || channel>120) {
					System.out.println("ERROR: TV is either OFF or invalid Channel");
				}else {
					this.channel = channel;
				}
			}

			public int getVolumeLevel() {
				return volumeLevel;
			}
			/*Volume can be only in the range between 1 and 7. 
			You may change volume only if TV is on. Otherwise, 
			display the message: "ERROR: TV is either OFF or invalid Volume level". 
			Create isOn() method that will check tv status.*/
			
			public void setVolumeLevel(int volumeLevel) {
				
				if(volumeLevel<1 & volumeLevel>7 || on==false) {
					System.out.println("ERROR: TV is either OFF or invalid Volume level");
				}else {
					this.volumeLevel = volumeLevel;
				}
			}

			public String getBrand() {
				return brand;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}
			
			public void channelUp() {
				volumeLevel++;
			}
			public void channelDown() {
				volumeLevel--;
			}
			
			
			public void isOn(Boolean on ) {
				
				if(on.equals(true)) {
					System.out.println("TV is already ON");
				}else {
					System.out.println("TV is already OFF");
				}
			}
			
			public void turnOn() {
				if(on==false) {
					on=true;
				}else {
					isOn(on);
				}
			}
			
			public void turnOff() {
				if(on==true) {
					on=false;
				}else {
					isOn(on);
				}
				
			}
			
			
			
}
