package metier;

import java.util.ArrayList;
import java.util.List;

public class Vehicule  {
	
	
	private String username;
	private String password;
	
	List<Piece> piecesOpti = new ArrayList() ;

	public Vehicule() {
	
	}

	public Vehicule(String username, String password, List<Piece> piecesOpti) {
		super();
		this.username = username;
		this.password = password;
		this.piecesOpti = piecesOpti;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Piece> getPiecesOpti() {
		return piecesOpti;
	}

	public void setPiecesOpti(List<Piece> piecesOpti) {
		this.piecesOpti = piecesOpti;
	}

	
	

}


