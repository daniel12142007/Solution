public interface Div {
    default void hello(User user) {
        System.out.println("name->" + user.getName());
        System.out.println("age->" + user.getAge());
        final double PI = user.getAge() * Math.PI;
        System.out.println("PI age->" + PI);
    }
}
