
package HashSet;

import java.util.HashSet;

public class PlagiarismChecker {
    public static void main(String[] args) {

        String Doc1 = "Java is a versatile programming language." +
                " Widely used in enterprise solutions." +
                " Im Root.";

        String Doc2 = "Java is a versatile programming language." +
                "Often utilized for web development and desktop solutions." +
                " What the f**k";

        String[] LinesDoc1 = Doc1.split("\\.");
        String[] LinesDoc2 = Doc2.split("\\.");


        HashSet<String> uniqueLines = new HashSet<>();
        for (String s : LinesDoc1){
            uniqueLines.add(s);
        }

        int count = 0;
        for (String u : LinesDoc2){
            if (uniqueLines.contains(u)){
                count++;
            }
        }

        double plagiarismPercent = ((double) count / LinesDoc2.length) * 100;
        System.out.println("Plagiarism Percentage: " + plagiarismPercent + "%");
    }
}