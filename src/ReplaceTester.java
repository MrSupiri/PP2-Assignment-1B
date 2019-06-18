class ReplaceTester {
    public static void main(String[] args) {
        String msh = "Mississippi";
        String encodedMsg = msh.replace('s', '$').replace('i', '!');
        System.out.println("Message : "+ msh);
        System.out.println("Encoded Message : "+ encodedMsg);
        System.out.println("Expected Message : "+ "M!$$!$$!pp!");
    }
}
