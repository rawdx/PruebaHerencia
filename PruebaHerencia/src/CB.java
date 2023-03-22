
public class CB {
	int z;

	public int suma() {
		CA o = new CA();
		return o.x + o.y + z;
	}

	// CA a = new CB(1,2,3);
	// Error ya que no se puede instanciar una clase hija a traves de su clase
	// padre.
}
