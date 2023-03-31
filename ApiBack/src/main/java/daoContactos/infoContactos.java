package daoContactos;

import daoAboutUs.AboutUs;

public class infoContactos {
	public static String leerContactos() throws Exception {
		 	
			        String file = "/Users/alu2019033/Desktop/contactos.json";
			        String json = AboutUs.leerArchivo(file);
			        System.out.println(json);
					return json;
			    }   
	    
	   }



	  
	    


