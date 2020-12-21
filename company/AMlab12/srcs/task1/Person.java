package task1;

public class Person implements Comparable<Person>, People{
    private final String fio;
    
    public Person(String fio) {
    	this.fio = fio;
    }
    
    public String getFio() {
    	return fio;
    }

    @Override
    public String toString() {
        return "\n" + fio;
    }

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
