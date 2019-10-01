package application;

public class SquarePiece {
	public boolean IsMovable;
	private String Value;
	
	public SquarePiece() {
		this.Value="";
	}
	
	public void Immobilize() {
		this.IsMovable=true;
	}
	
	public void setValue(String val) {
		this.Value=val;
	}
	
	public String getValue() {
		return this.Value;
	}

}
