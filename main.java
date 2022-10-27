public class main {
    public static void main(String[] args) {
        fighter f1 = new fighter("buse naz" , 10, 120 , 100 , 50);
        fighter f2 = new fighter("sinan" , 20, 85 , 85 , 60);

        match match = new match(f1 , f2 , 85 , 100);
        match.run();
    }
}
