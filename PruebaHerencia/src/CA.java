
public class CA extends CB implements IC, Comparable {

	int x, y;

	@Override
	public int suma() {
		return x + y;
	}

	@Override
	public int mayor() {
		if (x > y)
			return x;
		return y;
	}

	@Override
	public int compareTo(Object uno, Object dos) {
		if(uno.equals(dos))
			return 0;
		
		if ((((CA) uno).mayor() > ((CA) dos).mayor()))
			return 1;
		return -1;
	}
}
