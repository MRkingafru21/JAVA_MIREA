package task1;

public class Address implements Comparable<Address>, FullAddress {
    private final String address;
    
    public Address(String address) {
    	this.address = address;
    }
    
    public String getAddress() {
    	return address;
    }

    public String toString() {
        return "\n" + address;
    }

	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString(String[] word) {
		// TODO Auto-generated method stub
		return null;
	}
}
