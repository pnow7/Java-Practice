package ct.Ct3.p_interface.pay;

public class CreditCard implements Payment {
    @Override
    public String pay(int amount) {
        return "신용카드로 " + amount + "원을 결제합니다.";
    }
}
