public class TicketGImpl implements TicketG {
    @Override
    public void selectTicket(String token) {
        System.out.println("ticket's token : " + token);
    }

    @Override
    public void printTicket() {
        System.out.println("ticket 출력 완료");
    }

    @Override
    public void buyOffline() {
        System.out.println("ticket 오프라인 구매 완료");
    }

    @Override
    public void buyOnline() {
        System.out.println("ticket 온라인 구매 완료");
    }

    @Override
    public String getFoodList() {
        return "DB에서 음식 List를 가져왔습니다.";
    }
}
