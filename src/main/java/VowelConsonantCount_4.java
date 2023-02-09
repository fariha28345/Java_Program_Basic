import java.util.Scanner;
public class VowelConsonantCount_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowel = 0, consonant = 0;

        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                consonant++;
            }
        }
        System.out.println("Vowel: " + vowel);
        System.out.println("Consonant: " + consonant);
    }
}
