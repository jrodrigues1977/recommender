package jrodrigues.recommender;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class ModelRecomender {

	
	public FileDataModel getModel() throws IOException{
		// Loading data
				File file = new File("src/main/resources/cursos.csv");
				
				// Converting file into a data model
				return  new FileDataModel (file);
				
				
	}
	
}
