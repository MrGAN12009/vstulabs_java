import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String[] strArr = new String[100];
        for(int i = 0; i < 100; i++){
            strArr[i] = "";
        }
        int[] count = new int[100];
        int i = 0;


        for(char c : text.toCharArray()){
            if (c == ' ') {
                count[i] += 1;
                strArr[i] += c;
            }
            if (c != '.'){
                strArr[i] += c;
            } else {
                strArr[i] += c;
                i++;
            }
        }

        for(int j = 0; j < i; j++){
            int k = 0;
            for(int l = 0; l < i; l++){
                if (count[k] < count[l]){
                    k = l;
                }
            }
            if (count[k] == 0){
                return;
            }
            count[k] = 0;
            System.out.print(strArr[k]);
        }

    }
}