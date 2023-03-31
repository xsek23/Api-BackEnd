package daoAboutUs;

import java.nio.file.Files;
import java.nio.file.Paths;

public class AboutUs {
	public static String leerAboutUs() throws Exception {
			        String file = "/Users/alu2019033/Desktop/aboutUs.json";
			        String json = leerArchivo(file);
			        System.out.println(json);
					return json;
			    }
			    public static String leerArchivo(String file)throws Exception
			    {
			        return new String(Files.readAllBytes(Paths.get(file)));
			    
	   }
}