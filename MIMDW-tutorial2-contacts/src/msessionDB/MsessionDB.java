package msessionDB;

import java.util.ArrayList;

import mSession.Msession;
import msessionDB.MsessionDB;

public class MsessionDB {
	private static MsessionDB instance =null;
	
	public static MsessionDB getInstance() {
		
		if(instance == null)
			instance = new MsessionDB();
		
		return instance;
	}
	
	private ArrayList<Msession> sessions = new ArrayList<Msession>();
	
	public ArrayList<Msession> list() {
		return sessions;
	}
	
	public Msession find(String sessName) {
		for(int i=0; i < this.sessions.size(); i++){
		        if( this.sessions.get(i).name.equals(sessName) ){
		            return this.sessions.get(i);
		        }
		}
		return null;
	}
	
	public void add ( Msession msession ) {
		sessions.add(msession);
	}
	
	public void remove ( Msession msession ) {
		sessions.remove(msession);
	}
	
}
