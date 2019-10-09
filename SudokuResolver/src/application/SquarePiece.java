package application;

import java.util.ArrayList;

public class SquarePiece {
	public boolean IsMovable;
	private String Value;
	private ArrayList<String> DosazovanaCisla;
	
	public SquarePiece() {
		this.IsMovable=true;
		this.Value="";
		this.DosazovanaCisla=new ArrayList<String>();
	}
	
	public void Immobilize() {
		this.IsMovable=false;
	}
	
	public void setValue(String val) {
		this.Value=val;
	}
	
	public String getValue() {
		return this.Value;
	}
	
	public void setDosazovana(String val) {
		this.DosazovanaCisla.add(val);
	}
	
	public ArrayList<String> getDosazovana(){
		return this.DosazovanaCisla;
	}
	
	public void clearDosazovana() {
		this.DosazovanaCisla.clear();
	}

}
