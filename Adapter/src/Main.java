public class Main {
    public static void main(String[] args) {
        //기존
        TicketA a = new TicketAImpl();
        a.selectTicket("a-1");
        a.buyTicket();
        a.printTicket();

        System.out.println("================================");

        TicketG g = new TicketGImpl();
        g.selectTicket("g-1");
        g.buyOnline();
        g.buyOffline();
        g.printTicket();
        System.out.println(g.getFoodList());


        System.out.println("================================");


        //Adapter Pattern 적용
        TicketG ag = new TicketAdapter(new TicketAImpl());
        ag.selectTicket("ag-1");
        ag.printTicket();
        ag.buyOffline();
        ag.buyOnline();
        System.out.println(ag.getFoodList());
    }
}
