public class Main {
    public static void main(String[] args) {
        //new PersonInfo("amy", 20, "black", "dog", 30
        PersonInfo personInfo = PersonInfoBuilder.builder()
                .setName("amy")
                .setAge(20)
                .setColor("black")
                .setAnimal("dog")
                .setNumber(30)
                .build();

        System.out.println(personInfo.getPersonInfo());
    }
}
