public class Count{
    public static void main(String[] args) {
        String str = "Hellokarthi the thanos of India";
        String[] words = str.split(" ");
        int count = 0;
        for(String word : words){
            count++;
        }
        System.out.println(count);
    }
}
