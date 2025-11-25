public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
                "Our product will transform the market",
                "Programming is both painful and engaging",
                "This has nothing to do with machine learning",
                "We need to leverage our core competencies",
                "Let's talk about data and algorithms",
                "Chatbots are great but must be used carefully",
                "This blockchain-based solution will disrupt the industry",
                "The team showed great Synergy in the last project",
                "Use simple words without hype and fluff",
                "Our new technology presents a significant paradigm shift",
                "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business
        // presentations
        String[] keywords = { "synergy", "disrupt", "leverage", "Paradigm", "transform" };
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        for (int i = 0; i < sentences.length; i++) {
            String[] arr = new String[countWords(sentences[i])];
            String str1 = sentences[i].toLowerCase();
            int index = 0;
            String str = "";
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == ' ') {
                    arr[index] = str;
                    index++;
                    str = "";
                } else {
                    str += str1.charAt(j);
                }
            }
            for (int k = 0; k < arr.length; k++) {
                for (int m = 0; m < keywords.length; m++) {
                    if (arr[k].equals(keywords[m].toLowerCase())) {
                        System.out.println(sentences[i]);
                        break;
                    }

                }
            }

        }

    }

    public static int countWords(String sentetence) {

        int count = 0;

        for (int i = 0; i < sentetence.length(); i++) {
            if (sentetence.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
