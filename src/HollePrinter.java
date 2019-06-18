class HollePrinter {
    public static void main(String[] args) {
        String msg = "Hello World";
        StringBuilder stringBuilder = new StringBuilder();
        for (char l : msg.toCharArray()) {
            if (l == 'e') {
                stringBuilder.append('o');
            } else if (l == 'o') {
                stringBuilder.append('e');
            } else {
                stringBuilder.append(l);
            }
        }
        System.out.printf("Message : %s", msg);
        System.out.printf("\nEncoded Message : %s", stringBuilder.toString());
    }
}
