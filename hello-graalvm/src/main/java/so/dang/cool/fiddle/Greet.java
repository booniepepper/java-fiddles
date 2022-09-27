package so.dang.cool.fiddle;

class Greet {
    public static void main(String[] args) {
        String name = "world";
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("Hello " + name + "!");
    }
}
