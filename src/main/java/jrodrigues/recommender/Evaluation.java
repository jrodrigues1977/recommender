package jrodrigues.recommender;


import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;

import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

public class Evaluation {

	public static void main(String[] args) throws IOException, TasteException {

		// Used to keep the same test set.
		RandomUtils.useTestSeed();
		

		DataModel model = new ModelRecomender().getModel();

		AverageAbsoluteDifferenceRecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
		
		// Define how the tests will process, the lasts args are, runs evaluation (0.8 or 80%) and result tests (0.2 or 20%)
		RecommenderBuilder builder = new BuilderRecommender();
		double error = evaluator.evaluate(builder , null, model, 0.8, 0.2);

		System.out.println(error);
		
	}

}
