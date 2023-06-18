package labTest2;

public class TimeOfDay {
	private int hour;
	private int  minutes;
	private boolean isAM;
	
	public TimeOfDay() {
		this (12,00,true);
	}
	
	
	public TimeOfDay(int hour,int minutes, boolean isAM) {
		if(hour<1||hour>12||minutes<0||minutes>59) {
			throw new IllegalArgumentException();
		}
		else
			this.hour=hour;
			this.minutes =  minutes;
			this.isAM = isAM;
	}
	
	public TimeOfDay(TimeOfDay other) {
		this.hour = other.hour;
		this.minutes = other.minutes;
		this.isAM = other.isAM;
	}
	
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minutes;
	}
	
	public TimeOfDay setHour(int hour) {
		if(hour>12||hour<1) {
		 throw new IllegalArgumentException();
		}
		else
		this.hour = hour;
		return this;
	}
	public TimeOfDay setMinute(int minutes) {
		if(minutes>59||minutes<0) {
		 throw new IllegalArgumentException();
		}
		else
		this.minutes = minutes;
		return this;
	}
	public boolean isAM() {
		return this.isAM;
	}


	public TimeOfDay advance(int i) {
		int count = minutes;
		if(i >0) {
			if(count+i>59) {
		
			hour++;
			minutes = (count+i)-60;
		}
		else 
			minutes = minutes+i;
	}
		if(i<0) {
			if(count+i<0) {
		
			hour--;
			minutes = (count+i)+60;
		}
		else 
			minutes = minutes+i;
	}
		return null;
		
	}
	
	@Override
	public String toString() {
		String m = "AM";
		if (!this.isAM()) {
			m = "PM";
		} 
		return String.format("%s:%02d ", this.getHour(), this.getMinute()) + m;
	
	}
}
