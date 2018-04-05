import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;



public class Ficheros {

    protected String nombreArchivo;
    protected String extension;
    protected BufferedReader br = null;
    protected String line = "";
    protected String separador = ",";
	
	public Ficheros( String nombreArchivo, String extension ) {
		this.nombreArchivo = nombreArchivo;
		this.extension = extension;
	}

    protected void lecturaFicheros() {
    
	    try {
	
	        br = new BufferedReader( new FileReader( "./src/ficheros/" + this.nombreArchivo + this.extension ) );
	        while ( ( line = br.readLine() ) != null) {
	           
	            String[] datos = line.split(this.separador); //<-- Separador por ( , )
	            
                for(int i =0; i < datos.length; i++) {

                	System.out.println( datos[i] );

                }
	        }
	
	    }
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
    }
    
    protected void escrituraFichero(ArrayList<Persona> persona) {// Escritura lineas texto en fichero txt
            try {
              
                BufferedWriter bw = new BufferedWriter(new FileWriter(  "./src/ficheros/" + this.nombreArchivo + this.extension ));
                
        		for (int i = 0; i < persona.size(); i++){	
               
                	bw.write( persona.get(i).toString() + "\r\n");
                	
        		} 	
                
                bw.close();
                
                System.out.println( " Se grabaron datos correctamente en " + this.nombreArchivo + this.extension );
            }
            catch (IOException e) {
            	
                System.out.println(" No se ha podido escribir sobre el fichero " + this.nombreArchivo + this.extension );
            }  
    }
    
}//<-- Fin class