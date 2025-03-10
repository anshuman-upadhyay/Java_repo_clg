class lab2 {

    public static void main(String[] args) {
        String ip = "AMAN";
        StringBuilder sc = new StringBuilder();

        for (int i = 0; i < ip.length()/2; i++) {
           int first_val = (int)(ip.charAt(i)-65) ;
           int last_val = (int)(ip.charAt(ip.length()-1-i)-65) ;

           System.out.println(first_val+" "+last_val);
           int mod = Math.abs(first_val-last_val);
           System.out.println(mod);

           sc.append(mod);
        }
        if (ip.length()%2 != 0) {
           int num = (int)(ip.charAt(ip.length()/2)-65) ;
           int mod = Math.abs( num - ip.length());
            sc.append(mod);
        }
        System.out.println(sc);
    }
}