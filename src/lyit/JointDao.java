package lyit;

public interface JointDao {
	
	public abstract void add();
	
	public abstract void list();
	
	public abstract void view ();
	
	public abstract void edit();
	
	public abstract void delete ();
	
	public abstract void writeRecordsToFile();
	
	public abstract void readRecordsFromFile();
}
