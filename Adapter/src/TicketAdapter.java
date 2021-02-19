public class TicketAdapter implements TicketG {
    private TicketA ticketA;

    TicketAdapter(TicketA ticketA) {
        this.ticketA = ticketA;
    }

    @Override
    public void selectTicket(String token) {
        ticketA.selectTicket(token);
    }

    @Override
    public void printTicket() {
        ticketA.printTicket();
    }

    @Override
    public void buyOffline() {
        ticketA.buyTicket();
    }

    @Override
    public void buyOnline() {
        System.out.println("지원하지 않는 기능입니다.-buy online");
    }

    @Override
    public String getFoodList() {
        return "지원하지 않는 기능입니다.-get food list";
    }
}
