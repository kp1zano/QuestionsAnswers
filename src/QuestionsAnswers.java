import java.util.*;

public class QuestionsAnswers {
	
	public HashMap<String, String> mapper = new HashMap<String, String>();

	
	void put(String	question,	String	answer)	{
		mapper.put(question, answer);
	}
	
	boolean	testAnswer(String question,	String answer)	{
		
		String q = mapper.get(question);
		
		if(q != null){
			
			if(q.equals(answer)){
				return true;
			}
			return false;
		}
		return false;
	}
	
	String getRandomQuestion()	{
		
		Random rand = new Random();
		List<String> keys = new ArrayList<String>(mapper.keySet());
		String randomKey = keys.get(rand.nextInt(keys.size()));
		String value = mapper.get(randomKey);
		
		return value;
	}
}