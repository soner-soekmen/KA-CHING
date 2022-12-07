public class Main {

    public static void main(String[] args) throws InterruptedException {
        String ka = "ka!";
        String ch = "ching!";
        String kach = "ka-ching!";
        for(int f = 1; f <= 100; f++) {
            if (f%15 == 0) {
                
                String str1 = Integer.toString(f);
                System.out.println(str1.replace(str1, kach));
                Thread.sleep(400);
                
                }

                else if (f%5 == 0) {
                
                    String str2 = Integer.toString(f);
                    System.out.println(str2.replace(str2, ch));
                    Thread.sleep(400);
                    
                    }

                
                else if (f%3 == 0) {
                
                    String str3 = Integer.toString(f);
                    System.out.println(str3.replace(str3, ka));
                    Thread.sleep(400);
                    
                    }
                    
                else if (f%3 != 0 && f%5 != 0 && f%15 != 0) {
                    System.out.println(f);
                    Thread.sleep(400);
                }
        } 
    }
}

