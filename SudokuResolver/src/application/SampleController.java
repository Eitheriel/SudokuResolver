package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SampleController {

    @FXML
    private TextArea cell_0_0;
    @FXML
    private TextArea cell_0_1;
    @FXML
    private TextArea cell_0_2;
    @FXML
    private TextArea cell_0_3;
    @FXML
    private TextArea cell_0_4;
    @FXML
    private TextArea cell_0_5;
    @FXML
    private TextArea cell_0_6;
    @FXML
    private TextArea cell_0_7;
    @FXML
    private TextArea cell_0_8;
    @FXML
    private TextArea cell_1_0;
    @FXML
    private TextArea cell_1_1;
    @FXML
    private TextArea cell_1_2;
    @FXML
    private TextArea cell_1_3;
    @FXML
    private TextArea cell_1_4;
    @FXML
    private TextArea cell_1_5;
    @FXML
    private TextArea cell_1_6;   
    @FXML
    private TextArea cell_1_7;
    @FXML
    private TextArea cell_1_8;
    @FXML
    private TextArea cell_2_0;
    @FXML
    private TextArea cell_2_1;
    @FXML
    private TextArea cell_2_2;    
    @FXML
    private TextArea cell_2_3;
    @FXML
    private TextArea cell_2_4;
    @FXML
    private TextArea cell_2_5;
    @FXML
    private TextArea cell_2_6;   
    @FXML
    private TextArea cell_2_7;
    @FXML
    private TextArea cell_2_8;
    @FXML
    private TextArea cell_3_0;
    @FXML
    private TextArea cell_3_1;
    @FXML
    private TextArea cell_3_2;    
    @FXML
    private TextArea cell_3_3;
    @FXML
    private TextArea cell_3_4;
    @FXML
    private TextArea cell_3_5;
    @FXML
    private TextArea cell_3_6;   
    @FXML
    private TextArea cell_3_7;
    @FXML
    private TextArea cell_3_8;
    @FXML
    private TextArea cell_4_0;
    @FXML
    private TextArea cell_4_1;
    @FXML
    private TextArea cell_4_2;    
    @FXML
    private TextArea cell_4_3;
    @FXML
    private TextArea cell_4_4;
    @FXML
    private TextArea cell_4_5;
    @FXML
    private TextArea cell_4_6;   
    @FXML
    private TextArea cell_4_7;
    @FXML
    private TextArea cell_4_8;
    @FXML
    private TextArea cell_5_0;
    @FXML
    private TextArea cell_5_1;
    @FXML
    private TextArea cell_5_2;    
    @FXML
    private TextArea cell_5_3;
    @FXML
    private TextArea cell_5_4;
    @FXML
    private TextArea cell_5_5;
    @FXML
    private TextArea cell_5_6;   
    @FXML
    private TextArea cell_5_7;
    @FXML
    private TextArea cell_5_8;
    @FXML
    private TextArea cell_6_0;
    @FXML
    private TextArea cell_6_1;
    @FXML
    private TextArea cell_6_2;    
    @FXML
    private TextArea cell_6_3;
    @FXML
    private TextArea cell_6_4;
    @FXML
    private TextArea cell_6_5;
    @FXML
    private TextArea cell_6_6;   
    @FXML
    private TextArea cell_6_7;
    @FXML
    private TextArea cell_6_8;
    @FXML
    private TextArea cell_7_0;
    @FXML
    private TextArea cell_7_1;
    @FXML
    private TextArea cell_7_2;    
    @FXML
    private TextArea cell_7_3;
    @FXML
    private TextArea cell_7_4;
    @FXML
    private TextArea cell_7_5;
    @FXML
    private TextArea cell_7_6;   
    @FXML
    private TextArea cell_7_7;
    @FXML
    private TextArea cell_7_8;
    @FXML
    private TextArea cell_8_0;
    @FXML
    private TextArea cell_8_1;
    @FXML
    private TextArea cell_8_2;    
    @FXML
    private TextArea cell_8_3;
    @FXML
    private TextArea cell_8_4;
    @FXML
    private TextArea cell_8_5;
    @FXML
    private TextArea cell_8_6;   
    @FXML
    private TextArea cell_8_7;
    @FXML
    private TextArea cell_8_8;

    @FXML
    public Button vymaz;
    public Button exit;
    public Button vypocitej;
    
    @FXML
    public Label warning;
    

     /*String cell_0_0Conv = cell_0_0.getText();

     String cell_0_1Conv = cell_0_1.getText();

     String cell_0_2Conv = cell_0_2.getText();

     String cell_0_3Conv = cell_0_3.getText();

     String cell_0_4Conv = cell_0_4.getText();

     String cell_0_5Conv = cell_0_5.getText();

     String cell_0_6Conv = cell_0_6.getText();

     String cell_0_7Conv = cell_0_7.getText();

     String cell_0_8Conv = cell_0_8.getText();

     String cell_1_0Conv = cell_1_0.getText();

     String cell_1_1Conv = cell_1_1.getText();

     String cell_1_2Conv = cell_1_2.getText();

     String cell_1_3Conv = cell_1_3.getText();

     String cell_1_4Conv = cell_1_4.getText();

     String cell_1_5Conv = cell_1_5.getText();

     String cell_1_6Conv = cell_1_6.getText();   

     String cell_1_7Conv = cell_1_7.getText();

     String cell_1_8Conv = cell_1_8.getText();

     String cell_2_0Conv = cell_2_0.getText();

     String cell_2_1Conv = cell_2_1.getText();

     String cell_2_2Conv = cell_2_2.getText();    

     String cell_2_3Conv = cell_2_3.getText();

     String cell_2_4Conv = cell_2_4.getText();

     String cell_2_5Conv = cell_2_5.getText();

     String cell_2_6Conv = cell_2_6.getText();   

     String cell_2_7Conv = cell_2_7.getText();

     String cell_2_8Conv = cell_2_8.getText();

     String cell_3_0Conv = cell_3_0.getText();

     String cell_3_1Conv = cell_3_1.getText();

     String cell_3_2Conv = cell_3_2.getText();    

     String cell_3_3Conv = cell_3_3.getText();

     String cell_3_4Conv = cell_3_4.getText();

     String cell_3_5Conv = cell_3_5.getText();

     String cell_3_6Conv = cell_3_6.getText();   

     String cell_3_7Conv = cell_3_7.getText();

     String cell_3_8Conv = cell_3_8.getText();

     String cell_4_0Conv = cell_4_0.getText();

     String cell_4_1Conv = cell_4_1.getText();

     String cell_4_2Conv = cell_4_2.getText();    

     String cell_4_3Conv = cell_4_3.getText();

     String cell_4_4Conv = cell_4_4.getText();

     String cell_4_5Conv = cell_4_5.getText();

     String cell_4_6Conv = cell_4_6.getText();   

     String cell_4_7Conv = cell_4_7.getText();

     String cell_4_8Conv = cell_4_8.getText();

     String cell_5_0Conv = cell_5_0.getText();

     String cell_5_1Conv = cell_5_1.getText();

     String cell_5_2Conv = cell_5_2.getText();    

     String cell_5_3Conv = cell_5_3.getText();

     String cell_5_4Conv = cell_5_4.getText();

     String cell_5_5Conv = cell_5_5.getText();

     String cell_5_6Conv = cell_5_6.getText();   

     String cell_5_7Conv = cell_5_7.getText();

     String cell_5_8Conv = cell_5_8.getText();

     String cell_6_0Conv = cell_6_0.getText();

     String cell_6_1Conv = cell_6_1.getText();

     String cell_6_2Conv = cell_6_2.getText();    

     String cell_6_3Conv = cell_6_3.getText();

     String cell_6_4Conv = cell_6_4.getText();

     String cell_6_5Conv = cell_6_5.getText();

     String cell_6_6Conv = cell_6_6.getText();   

     String cell_6_7Conv = cell_6_7.getText();

     String cell_6_8Conv = cell_6_8.getText();

     String cell_7_0Conv = cell_7_0.getText();

     String cell_7_1Conv = cell_7_1.getText();

     String cell_7_2Conv = cell_7_2.getText();    

     String cell_7_3Conv = cell_7_3.getText();

     String cell_7_4Conv = cell_7_4.getText();

     String cell_7_5Conv = cell_7_5.getText();

     String cell_7_6Conv = cell_7_6.getText();   

     String cell_7_7Conv = cell_7_7.getText();

     String cell_7_8Conv = cell_7_8.getText();

     String cell_8_0Conv = cell_8_0.getText();

     String cell_8_1Conv = cell_8_1.getText();

     String cell_8_2Conv = cell_8_2.getText();    

     String cell_8_3Conv = cell_8_3.getText();

     String cell_8_4Conv = cell_8_4.getText();

     String cell_8_5Conv = cell_8_5.getText();

     String cell_8_6Conv = cell_8_6.getText();   

     String cell_8_7Conv = cell_8_7.getText();

     String cell_8_8Conv = cell_8_8.getText();*/
    

    public void VytvorPole() {
    	String cell_0_0Conv = cell_0_0.getText();
        String cell_0_1Conv = cell_0_1.getText();
        String cell_0_2Conv = cell_0_2.getText();
        String cell_0_3Conv = cell_0_3.getText();
        String cell_0_4Conv = cell_0_4.getText();
        String cell_0_5Conv = cell_0_5.getText();
        String cell_0_6Conv = cell_0_6.getText();
        String cell_0_7Conv = cell_0_7.getText();
        String cell_0_8Conv = cell_0_8.getText();
        String cell_1_0Conv = cell_1_0.getText();
        String cell_1_1Conv = cell_1_1.getText();
        String cell_1_2Conv = cell_1_2.getText();
        String cell_1_3Conv = cell_1_3.getText();
        String cell_1_4Conv = cell_1_4.getText();
        String cell_1_5Conv = cell_1_5.getText();
        String cell_1_6Conv = cell_1_6.getText();   
        String cell_1_7Conv = cell_1_7.getText();
        String cell_1_8Conv = cell_1_8.getText();
        String cell_2_0Conv = cell_2_0.getText();
        String cell_2_1Conv = cell_2_1.getText();
        String cell_2_2Conv = cell_2_2.getText();    
        String cell_2_3Conv = cell_2_3.getText();
        String cell_2_4Conv = cell_2_4.getText();
        String cell_2_5Conv = cell_2_5.getText();
        String cell_2_6Conv = cell_2_6.getText();   
        String cell_2_7Conv = cell_2_7.getText();
        String cell_2_8Conv = cell_2_8.getText();
        String cell_3_0Conv = cell_3_0.getText();
        String cell_3_1Conv = cell_3_1.getText();
        String cell_3_2Conv = cell_3_2.getText();    
        String cell_3_3Conv = cell_3_3.getText();
        String cell_3_4Conv = cell_3_4.getText();
        String cell_3_5Conv = cell_3_5.getText();
        String cell_3_6Conv = cell_3_6.getText();   
        String cell_3_7Conv = cell_3_7.getText();
        String cell_3_8Conv = cell_3_8.getText();
        String cell_4_0Conv = cell_4_0.getText();
        String cell_4_1Conv = cell_4_1.getText();
        String cell_4_2Conv = cell_4_2.getText();    
        String cell_4_3Conv = cell_4_3.getText();
        String cell_4_4Conv = cell_4_4.getText();
        String cell_4_5Conv = cell_4_5.getText();
        String cell_4_6Conv = cell_4_6.getText();   
        String cell_4_7Conv = cell_4_7.getText();
        String cell_4_8Conv = cell_4_8.getText();
        String cell_5_0Conv = cell_5_0.getText();
        String cell_5_1Conv = cell_5_1.getText();
        String cell_5_2Conv = cell_5_2.getText();    
        String cell_5_3Conv = cell_5_3.getText();
        String cell_5_4Conv = cell_5_4.getText();
        String cell_5_5Conv = cell_5_5.getText();
        String cell_5_6Conv = cell_5_6.getText();   
        String cell_5_7Conv = cell_5_7.getText();
        String cell_5_8Conv = cell_5_8.getText();
        String cell_6_0Conv = cell_6_0.getText();
        String cell_6_1Conv = cell_6_1.getText();
        String cell_6_2Conv = cell_6_2.getText();    
        String cell_6_3Conv = cell_6_3.getText();
        String cell_6_4Conv = cell_6_4.getText();
        String cell_6_5Conv = cell_6_5.getText();
        String cell_6_6Conv = cell_6_6.getText();   
        String cell_6_7Conv = cell_6_7.getText();
        String cell_6_8Conv = cell_6_8.getText();
        String cell_7_0Conv = cell_7_0.getText();
        String cell_7_1Conv = cell_7_1.getText();
        String cell_7_2Conv = cell_7_2.getText();    
        String cell_7_3Conv = cell_7_3.getText();
        String cell_7_4Conv = cell_7_4.getText();
        String cell_7_5Conv = cell_7_5.getText();
        String cell_7_6Conv = cell_7_6.getText();   
        String cell_7_7Conv = cell_7_7.getText();
        String cell_7_8Conv = cell_7_8.getText();
        String cell_8_0Conv = cell_8_0.getText();
        String cell_8_1Conv = cell_8_1.getText();
        String cell_8_2Conv = cell_8_2.getText();    
        String cell_8_3Conv = cell_8_3.getText();
        String cell_8_4Conv = cell_8_4.getText();
        String cell_8_5Conv = cell_8_5.getText();
        String cell_8_6Conv = cell_8_6.getText();   
        String cell_8_7Conv = cell_8_7.getText();
        String cell_8_8Conv = cell_8_8.getText();

        String[][] poleSudoku = new String[][]{
        		{cell_0_0Conv,cell_0_1Conv,cell_0_2Conv,cell_0_3Conv,cell_0_4Conv,cell_0_5Conv,cell_0_6Conv,cell_0_7Conv,cell_0_8Conv},
        		{cell_1_0Conv,cell_1_1Conv,cell_1_2Conv,cell_1_3Conv,cell_1_4Conv,cell_1_5Conv,cell_1_6Conv,cell_1_7Conv,cell_1_8Conv},
        		{cell_2_0Conv,cell_2_1Conv,cell_2_2Conv,cell_2_3Conv,cell_2_4Conv,cell_2_5Conv,cell_2_6Conv,cell_2_7Conv,cell_2_8Conv},
        		{cell_3_0Conv,cell_3_1Conv,cell_3_2Conv,cell_3_3Conv,cell_3_4Conv,cell_3_5Conv,cell_3_6Conv,cell_3_7Conv,cell_3_8Conv},
        		{cell_4_0Conv,cell_4_1Conv,cell_4_2Conv,cell_4_3Conv,cell_4_4Conv,cell_4_5Conv,cell_4_6Conv,cell_4_7Conv,cell_4_8Conv},
        		{cell_5_0Conv,cell_5_1Conv,cell_5_2Conv,cell_5_3Conv,cell_5_4Conv,cell_5_5Conv,cell_5_6Conv,cell_5_7Conv,cell_5_8Conv},
        		{cell_6_0Conv,cell_6_1Conv,cell_6_2Conv,cell_6_3Conv,cell_6_4Conv,cell_6_5Conv,cell_6_6Conv,cell_6_7Conv,cell_6_8Conv},
        		{cell_7_0Conv,cell_7_1Conv,cell_7_2Conv,cell_7_3Conv,cell_7_4Conv,cell_7_5Conv,cell_7_6Conv,cell_7_7Conv,cell_7_8Conv},
        		{cell_8_0Conv,cell_8_1Conv,cell_8_2Conv,cell_8_3Conv,cell_8_4Conv,cell_8_5Conv,cell_8_6Conv,cell_8_7Conv,cell_8_8Conv}};
        
        for(int i=0;i<9;i++)
         	for(int j=0;j<9;j++) {
         		SquarePiece sp = new SquarePiece();
         		sp.setValue(poleSudoku[i][j]);
         		if(!poleSudoku[i][j].isEmpty()) {
         			sp.Immobilize();
         		}
         		square[i][j]=sp;
         	}
    }
    
    public void VypisPole() {
        TextArea[][] poleVypisSudoku = {
		{cell_0_0,cell_0_1,cell_0_2,cell_0_3,cell_0_4,cell_0_5,cell_0_6,cell_0_7,cell_0_8},
		{cell_1_0,cell_1_1,cell_1_2,cell_1_3,cell_1_4,cell_1_5,cell_1_6,cell_1_7,cell_1_8},
		{cell_2_0,cell_2_1,cell_2_2,cell_2_3,cell_2_4,cell_2_5,cell_2_6,cell_2_7,cell_2_8},
		{cell_3_0,cell_3_1,cell_3_2,cell_3_3,cell_3_4,cell_3_5,cell_3_6,cell_3_7,cell_3_8},
		{cell_4_0,cell_4_1,cell_4_2,cell_4_3,cell_4_4,cell_4_5,cell_4_6,cell_4_7,cell_4_8},
		{cell_5_0,cell_5_1,cell_5_2,cell_5_3,cell_5_4,cell_5_5,cell_5_6,cell_5_7,cell_5_8},
		{cell_6_0,cell_6_1,cell_6_2,cell_6_3,cell_6_4,cell_6_5,cell_6_6,cell_6_7,cell_6_8},
		{cell_7_0,cell_7_1,cell_7_2,cell_7_3,cell_7_4,cell_7_5,cell_7_6,cell_7_7,cell_7_8},
		{cell_8_0,cell_8_1,cell_8_2,cell_8_3,cell_8_4,cell_8_5,cell_8_6,cell_8_7,cell_8_8}
        };
        
        for (int i=0; i<9; i++)
        	for (int j=0; j<9; j++) {
        		poleVypisSudoku[i][j].setText(square[i][j].getValue());
        	}
    }
    
    public void VymazPole() {
        TextArea[][] poleVypisSudoku = {
		{cell_0_0,cell_0_1,cell_0_2,cell_0_3,cell_0_4,cell_0_5,cell_0_6,cell_0_7,cell_0_8},
		{cell_1_0,cell_1_1,cell_1_2,cell_1_3,cell_1_4,cell_1_5,cell_1_6,cell_1_7,cell_1_8},
		{cell_2_0,cell_2_1,cell_2_2,cell_2_3,cell_2_4,cell_2_5,cell_2_6,cell_2_7,cell_2_8},
		{cell_3_0,cell_3_1,cell_3_2,cell_3_3,cell_3_4,cell_3_5,cell_3_6,cell_3_7,cell_3_8},
		{cell_4_0,cell_4_1,cell_4_2,cell_4_3,cell_4_4,cell_4_5,cell_4_6,cell_4_7,cell_4_8},
		{cell_5_0,cell_5_1,cell_5_2,cell_5_3,cell_5_4,cell_5_5,cell_5_6,cell_5_7,cell_5_8},
		{cell_6_0,cell_6_1,cell_6_2,cell_6_3,cell_6_4,cell_6_5,cell_6_6,cell_6_7,cell_6_8},
		{cell_7_0,cell_7_1,cell_7_2,cell_7_3,cell_7_4,cell_7_5,cell_7_6,cell_7_7,cell_7_8},
		{cell_8_0,cell_8_1,cell_8_2,cell_8_3,cell_8_4,cell_8_5,cell_8_6,cell_8_7,cell_8_8}
        };
        
        for (int i=0; i<9; i++)
        	for (int j=0; j<9; j++) {
        			poleVypisSudoku[i][j].setText("");
        	}
    }
    
    //=============================================================
    
    SquarePiece[][] square = new SquarePiece[9][9]; 
    
    public void Vymaz(ActionEvent event) {
    	VymazPole();
    }
    
    public void Vypis(ActionEvent event) {
    	VytvorPole();
    	PredvyplnPole();
    	//System.out.println(OverPritomost("1", 8, 0));
    	//Vymen(0, 3);
    	//Vyres();
    	
    	VypisPole();
    }
    
    public void ExitAction(ActionEvent event) {
    	Platform.exit();
    }
    	
    public void initialize(URL url, ResourceBundle rb) {
    }
   
    
    public void PredvyplnPole() {
    	for(int i=0;i<9;i+=3) 
    		for(int j=0;j<9;j+=3) {
    			PredvyplnKostku(i,j);
    	}
    }
    
    //pøedvyplnìní kostky hodnotami 1-9 do kostky 3x3 pole
    public void PredvyplnKostku(int konstSloupec, int konstRada) {
		ArrayList<String> zadaneHodnoty = new ArrayList<String>();
		ArrayList<String> doplnovaneHodnoty = new ArrayList<String>();
    	for(int i=0;i<3;i++) {
			//tady se vytvoøí pole zadaných hodnot uživatelem
			for (int k=0; k<3; k++) {
				if(!square[i+konstSloupec][k+konstRada].getValue().isEmpty())
					zadaneHodnoty.add(square[i+konstSloupec][k+konstRada].getValue());
			}
    	}
		//tady se vytvoøí pole hodnot, které budou dosazovány do tabulky
    	for (int j=0; j<9; j++) {
    		if (!zadaneHodnoty.contains(Integer.toString(j+1)))
    			doplnovaneHodnoty.add(Integer.toString(j+1));
    	}
    		
    	//tady se dosadí doplnovane hodnoty do jedné kostky
    	int counter1=0;
    	for (int i=0;i<3;i++) {
	    	for (int j=0; j<3; j++) {
	    		if(square[i+konstSloupec][j+konstRada].getValue().isEmpty()) {
	    			square[i+konstSloupec][j+konstRada].setValue(doplnovaneHodnoty.get(counter1));
	    			counter1++;
	    		}
	    	}
    	}
    }
    
    public void Vyres() {
    	boolean go = true;
		int counterPocetCyklu=0;
    	while(go) {
    		counterPocetCyklu++;
    		int counterZmeny=0;
            for (int i=0; i<9; i++)
            	for (int j=0; j<9; j++) {
            		//SquarePiece ctverecek = square[i][j];
            		if (OverPritomostVertikalne(square[i][j].getValue(),i,j)) {
            			Vymen(i,j);
            			counterZmeny++;
            		}	
            	}	
            if(counterZmeny == 0) {
            	go=false;
            	System.out.println("Všechno dopadlo v poøádku. Pocet cyklù: "+counterPocetCyklu);
            }
            if(counterPocetCyklu>500) {
            	go=false;
            	System.out.println("Nedopadlo to!");
            }
    	}
    }
    
    public void Vymen(int sloupec, int rada) {
    	if(square[sloupec][rada].IsMovable) {
    	//pokud hledá sloupeèek vìtší než 8
	    	for (int i=0; i<9;i++) {
	    		if(rada+i>8) {
	        		if(OverPritomostVertikalne(square[sloupec][rada].getValue(), sloupec, rada+i-9)) {
	        			continue;
	        		}
	        		else {
	        			if(square[sloupec][rada+i-9].IsMovable) {
	            		String predavanaHodnota = square[sloupec][rada].getValue();
	            		square[sloupec][rada].setValue(square[sloupec][rada+i-9].getValue());
	            		square[sloupec][rada+i-9].setValue(predavanaHodnota);
	            		break;
	        			}
	        		}
	    		}
	    		//pokud nehledá sloupeèek vìtší než 8
	    		else {
	        		if(OverPritomostVertikalne(square[sloupec][rada].getValue(), sloupec, rada+i)) {
	        			continue;
	        		}
	        		else {
	        	    	if(square[sloupec][rada+i].IsMovable) {
	            		String predavanaHodnota = square[sloupec][rada].getValue();
	            		square[sloupec][rada].setValue(square[sloupec][rada+i].getValue());
	            		square[sloupec][rada+i].setValue(predavanaHodnota);
	            		break;
	        	    	}
	        		}
	    		}
	    	}
    	}    	
    }

    //Ovìøí, že v daném sloupci není stejná hodnota, jako je ta zadaná
    public boolean OverPritomostVertikalne(String hodnota, int sloupec, int rada) {
        		for (int i=0; i<9;i++) {
        			if (i != sloupec) {
        				if(square[i][rada].getValue().equals(hodnota)) {
        					return true;
        				}
        			}
        		}
        		return false;
        	}
    
    public boolean OverPritomostHorizontalne(String hodnota, int sloupec, int rada) {
		for (int i=0; i<9;i++) {
			if (i != rada) {
				if(square[sloupec][i].getValue().equals(hodnota)) {
					return true;
				}
			}
		}
		return false;
	}
    
}
