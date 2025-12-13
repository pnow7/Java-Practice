package ct.ct3.p_interface.pay;

public class PaymentTest {

    public static void main(String[] args) {
        Payment creditCard = new CreditCard();
        Payment kakaoPay = new KakaoPay();

        System.out.println(creditCard.pay(1000));
        System.out.println(kakaoPay.pay(1000));
    }
    
}
