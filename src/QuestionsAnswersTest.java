import static org.junit.Assert.*;

import org.junit.Test;


public class QuestionsAnswersTest {

	@Test
	public void test() {
		
		QuestionsAnswers testing = new QuestionsAnswers();
		testing.put("What is your name?", "Karina Pizano");
		
		assertEquals(true, testing.testAnswer("What is your name?", "Karina Pizano"));
	}

}
