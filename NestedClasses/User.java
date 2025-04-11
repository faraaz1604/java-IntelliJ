package NestedClasses;

public class User {

    private String name;
    private String email;
    private Long phone;

    private User(){}

    public static class Builder{
        private String name;
        private String email;
        private Long phone;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(Long phone) {
            this.phone = phone;
            return this;
        }

        public User build(){
            User user  = new User();
            user.name = this.name;
            user.email = this.email;
            user.phone = this.phone;
            return user;

        }

    }

    public void display(){
        System.out.println("Name: " + name + " Email: "+ email+ " Phone Number: "+ phone);
    }
}
