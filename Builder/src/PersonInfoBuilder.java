public class PersonInfoBuilder {
    private PersonInfo personInfo;

    private PersonInfoBuilder() {
        personInfo = new PersonInfo("default", 0, "default", "default", 0);
    }

    public static PersonInfoBuilder builder() {
        return new PersonInfoBuilder();
    }

    public PersonInfoBuilder setName(String name) {
       personInfo.setName(name);
       return this;
    }

    public PersonInfoBuilder setAge(Integer age) {
        personInfo.setAge(age);
        return this;
    }

    public PersonInfoBuilder setColor(String color) {
        personInfo.setFavoriteColor(color);
        return this;
    }

    public PersonInfoBuilder setAnimal(String animal) {
        personInfo.setFavoriteAnimal(animal);
        return this;
    }

    public PersonInfoBuilder setNumber(Integer number) {
        personInfo.setFavoriteNumber(number);
        return this;
    }

    public PersonInfo build(){
        return this.personInfo;
    }




}
