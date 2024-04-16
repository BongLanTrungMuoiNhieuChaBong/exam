import java.util.Random;

public class exam {
        //1.1
//    public static void square(int size){
//        for (int i = 0; i < size ; i++){
//            for (int j = 0; j< size; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        square(4);
//    }//1.2
//    public static void triangle( int size){
//        for (int i = 0; i < size; i++){
//            for (int j = 0 ; j <= i;j++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        triangle(4);
//    }
        //1.3
//    public static void triangle1(int size){
//        for (int i = 0;  i < size; i++){
//            for (int j = 0; j < size ; j++) { // em khong biet dieu kien cho nay nen de nhu the nao a
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        triangle1(4);
//    }
        //2
//    public static void analyzeString(String inputString) {
//        String[] words = inputString.split("\\s+");
//        int wordCount = words.length;
//        System.out.println("Số từ trong chuỗi: " + wordCount);
//        System.out.print("Index của các ký tự 'o' trong chuỗi: ");
//        for (int i = 0; i < inputString.length(); i++) {
//            if (inputString.charAt(i) == 'o') {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        String inputStr = " bong lan trung muoi nhieu cha bong";
//        analyzeString(inputStr);
//
//    }
        //3
        public static boolean isPrimeNumber(int n) {
            if (n < 2) {
                return false;
            }
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            int randomNumber = generateRandomNumber(0 , 100);
            System.out.println(" so ngau nhien la " +randomNumber);
            boolean isPrime = isPrimeNumber(randomNumber);

            if (isPrime) {
                System.out.println("So " + randomNumber + " la so nguyen to.");
            } else {
                System.out.println("So " + randomNumber + " khong la so nguyen to.");
            }
        }
        public static int generateRandomNumber(int min, int max) {
            // ddoạn này em muốn cho ra trong khoảng 0 - 100 nên em để max - min nhưng mà sao lại ra tận âm mấy chục ngìn ý ạ
            Random random = new Random(max - min);
            return random.nextInt() ;
        }

////4
//    // dieu kien so nguyen to
//    public static boolean isprime (int number){
//        if (number<=1){
//            return false;
//        }
//        for ( int i = 2; i <= Math.sqrt(number); i++){
//            if (number % i==0){
//                return false;
//            }
//        }
//        return true;
//
//    }
//    //10 so nguyen to dau tien
//    public static void firstelements(int n){
//        System.out.println(" liet ke " +n+ " so nguyen to");
//        int count = 0;
//        int number = 2;
//        while (count < n){
//            if (isprime(number)){
//                System.out.println(number +"");
//                count++;
//            }
//            number++;
//        }
//        System.out.println();
//
//    }
//    // so nguyen to nho hon 10
//    public static void smallprime(int small){
//        System.out.println("liet ke cac so nguyen to nho hon " +small+":");
//        for (int i = 2;i < small; i++){
//            if (isprime(i)){
//                System.out.println( i +" ");
//            }
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        firstelements(10);
//        smallprime(10);
//    }

        //5
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(" nhap so hang cua cua mang:");
//        int row = scanner.nextInt();
//        System.out.print(" nhap so cot cua mang ");
//        int colum =  scanner.nextInt();
//        int [][] array = new int[row][colum];
//        System.out.println( " nhap cac phan tu cua mang");
        // em k biet tiep theo nen lam gi a



}

