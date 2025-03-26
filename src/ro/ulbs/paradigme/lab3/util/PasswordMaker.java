package ro.ulbs.paradigme.lab3.util;


import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = new Random().nextInt(6) + 5;
    private final String magicString;
    private final String name;
    private final String password;

    private static PasswordMaker instance;
    private static int instanceCount = 0;

    private PasswordMaker(String name) {
        this.name = name;
        this.magicString = StringRandomizer.generateRandomString(20);
        this.password = generatePassword();
    }

    static {
        instance = new PasswordMaker("DefaultUser");
    }

    public static PasswordMaker getInstance() {
        instanceCount++;
        return instance;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    private String generatePassword() {
        Random random = new Random();
        String part1 = StringRandomizer.generateRandomString(MAGIC_NUMBER);
        StringBuilder part2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(magicString.length());
            part2.append(magicString.charAt(index));
        }
        String part3 = String.valueOf(name.length());
        int part4 = random.nextInt(51);

        return part1 + part2 + part3 + part4;
    }

    public String getPassword() {
        return password;
    }
}
