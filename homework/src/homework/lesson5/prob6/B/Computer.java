package homework.lesson5.prob6.B;

public class Computer implements Cloneable{
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;
	
	Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed =processorSpeed;
	}

	public String getProcessor() {
		return processor;
	}

	public int getRamSize() {
		return ramSize;
	}
	
	public double computePower() {
		return ramSize*processorSpeed;
	}
	
	@Override
	public String toString() {
		return "\nManufacturer:"+manufacturer+"\nProcessor:" + processor
				+"\nRam:"+ramSize+"\nProcessorSpeed:"+processorSpeed;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (!(ob instanceof Computer))
			return false;

		Computer cp = (Computer) ob;

		if (cp.manufacturer.equals(this.manufacturer) && cp.processor.equals(this.processor)
				&& cp.ramSize == this.ramSize && cp.processorSpeed == this.processorSpeed) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int h = 2;
		h += manufacturer.hashCode();
		h += processor.hashCode();
		h += ramSize;
		int f1 = (int)Double.doubleToLongBits(processorSpeed);
		h += f1 ^ (f1 >>> 128);
		return h;
	}

}