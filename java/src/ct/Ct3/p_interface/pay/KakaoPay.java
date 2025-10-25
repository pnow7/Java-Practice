package ct.Ct3.p_interface.pay;

public class KakaoPay implements Payment {
    @Override
    public String pay(int amount) {
        return "카카오페이로 " + amount + "원을 결제 합니다.";
    }
    
}
