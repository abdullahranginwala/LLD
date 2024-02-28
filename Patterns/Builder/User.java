package Builder;
public class User {

    private String name;
    private String email;
    private String phone;

    //optional
    private int age;
    private int height;
    private int weight;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static class UserBuilder {
        private String name;
        private String email;
        private String phone;

        //optional
        private int age;
        private int height;
        private int weight;

        public UserBuilder(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public UserBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}