package jrodrigues.recommender;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

public class ProductRecomender {

	public static void main(String[] args) throws IOException, TasteException {

		
		 DataModel model = new ModelRecomender().getModel();
		
		//
		Recommender recommender =  new BuilderRecommender().buildRecommender(model);
		
		// Generating a list of recommendations (arg2) for user XX (arg1)
		List<RecommendedItem> recommendations = recommender.recommend(15, 3);
		
		// Show results in console
		for (RecommendedItem recommend : recommendations) {
			System.out.println(recommend);
		}
		
	}

}
