package so.dang.cool.fiddle;

import so.dang.cool.z.Z;

class Greet {
    public static void main(String[] args) {
        String name = firstOr(args, "world");
       
        Z.with(name)
            .fuse(Greet::greetingFor)
            .fuseConsumer(System.out::println)
            .run();
    }

    public static String firstOr(String[] args, String otherwise) {
        if (args.length > 0) {
            return args[0];
        }
        return otherwise;
    }

    public static String greetingFor(String name) {
        return "Hello " + name + "!";
    }
}
