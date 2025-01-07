package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(numberToWords(1010));

    }




    public static boolean isPalindrome(int num){
        String stringNum = String.valueOf(Math.abs(num));
        String reversedNum = new StringBuilder(stringNum).reverse().toString();
        return stringNum.equals(reversedNum);
    }

    public static boolean isPerfectNumber (int num){
        if(num < 0){
            return false;
        }
        int toplam = 0;

        // Sayının bölenlerini topla, num'un kendisini hariç tutarak.
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                toplam += i;  // Bölenleri topluyoruz.
            }
        }

        // Eğer bölenlerin toplamı sayıya eşitse, mükemmel sayıdır.
        return toplam == num;
    }

    public static String numberToWords(int number){
        if(number < 0 ){
            return "Invalid Value" ;
        }
        else{
            String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

            String strNumber = String.valueOf(number);

            StringBuilder result = new StringBuilder() ;

            for(int i = 0 ; i < strNumber.length(); i++){
                int digit = Character.getNumericValue(strNumber.charAt(i));
                result.append(words[digit]).append(" ");

            }
            return result.toString().trim();
        }
    }

}
