class maxTernary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a = sc.nextInt();
        System.out.println("Enter the second no");
        int b = sc.nextInt();
        System.out.println("Enter the third no");
        int c = sc.nextInt();
 int max,temp;
 
 temp = a>b?a:b;
 max = temp>b?temp:b;
        System.out.println("Maximum of the three numbers is "+max); 
   }
}