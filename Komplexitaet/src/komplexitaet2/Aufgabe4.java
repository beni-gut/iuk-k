package komplexitaet2;

public class Aufgabe4 {
    static int search(char[] text, char[] pattern) {
        int start = 0;
        int limit = text.length - pattern.length + 1;
        while (start <= limit) {
            int i = start;
            int j = 0;
            while ((j < pattern.length) && (text[i] == pattern[j])) {
                i++;
                j++;
            }
            if (j == pattern.length) {
                return start;
            }
        }
        return -1;
    }
}
