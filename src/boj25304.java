public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total =  sc.nextInt();
        int count = sc.nextInt();

        for(int i = 0; i< count; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();

            total = total - (price * num);
        }

        if(total == 0) System.out.println("Yes");
        else System.out.println("No");


    }
}
https://velog.io/@seunghyun_/%EB%B0%B1%EC%A4%80JAVA-%EB%B0%98%EB%B3%B5%EB%AC%B8-25304%EB%B2%88-%EC%98%81%EC%88%98%EC%A6%9D