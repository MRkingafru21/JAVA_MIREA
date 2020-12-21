package task1;

public class Shirt implements Comparable<Shirt> {
    private final String name;
    
    public Shirt(String name) {
    	this.name = name;
    }
    
    public String getAddress() {
    	return name;
    }

    @Override
    public String toString() {
        return "\n" + name;
    }

	@Override
	public int compareTo(Shirt o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
