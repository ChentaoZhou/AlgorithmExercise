

//stupid class for testing purposes
public class Clock implements Comparable<Clock> {
	private int time;//number of seconds since midnight
	private String make;
	
	public Clock(String m, int t){
		time = t;
		make = m;
	}
	
	//copy constructor
	public Clock(Clock c){
		time = c.time;
		make = c.make;
	}

	@Override
	public int compareTo(Clock o) {
		// TODO Auto-generated method stub
		if(!make.equals(o.make)) return make.compareTo(o.make);
		return time - o.time;
	}
	
	public String toString(){
		return "(" + make + "," + time + ")";
	}
	
	public boolean equals(Clock o){
		return(make.equals(o.make) && (time==o.time));
	}
		

}
