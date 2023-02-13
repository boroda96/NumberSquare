import ru.netology.sqr.javaqamvn.services.SqrtService;

public class Main {

    public static void main(String[] args) {
        SqrtService service = new SqrtService();
        System.out.println(service.calcSqrt(1, 2000));
    }
}
