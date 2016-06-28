package elizaProDB;

import java.util.HashMap;

import java.util.Map;

import java.util.Random;

public class ElizaDB {

	public static Map<String, String> replacementMap = new HashMap<String, String>();

	public static Random rand = new Random();
	

	// String
	public ElizaDB() {
		replacementMap.put("i", "you");
		replacementMap.put("me", "you");
		replacementMap.put("my", "your");
		replacementMap.put("am", "are");
	}

	public String respond(String s) {
		String[] words = s.split(" ");
		String response = "";

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("i")) {
				words[i] = replacementMap.get("i");
			} else if (words[i].equals("me")) {
				words[i] = replacementMap.get("me");
			} else if (words[i].equals("my")) {
				words[i] = replacementMap.get("my");
			} else if (words[i].equals("am")) {
				words[i] = replacementMap.get("am");
			} else {
				words[i] = words[i];
			}
		}
		// response=(String[]) qualifierSet.toArray();
		for (int i = 0; i < words.length; i++) {
			response += words[i] + " ";
		}

		return response;
	}

//	public static void getHedge() {
//		String sqlaction = "SELECT hedge FROM(SELECT *FROM elizahedges ORDER BY DBMS_RANDOM.RANDOM)WHERE  rownum=1";
//		 InteractDB.accessDB(sqlaction);
//	}

	public static void getQualifier() {
		String sqlaction = "SELECT qualifier FROM(SELECT *FROM elizaqualifiers ORDER BY DBMS_RANDOM.RANDOM)WHERE  rownum=1";
		InteractDB.accessDB(sqlaction);
	}

	public static void getRandomQuestion() {
		String sqlaction = "SELECT question FROM(SELECT *FROM elizaquestions ORDER BY DBMS_RANDOM.RANDOM)WHERE  rownum=1";
		InteractDB.accessDB(sqlaction);
	}

}