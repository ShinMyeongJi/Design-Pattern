public class TicketAImpl implements TicketA {
    @Override
    public void selectTicket(String token) {
        System.out.println("ticket's token : " + token);
    }

    @Override
    public void printTicket() {
        System.out.println("ticket 출력 완료");
    }

    @Override
    public void buyTicket() {
        System.out.println("ticket 구매 완료");
    }
}
