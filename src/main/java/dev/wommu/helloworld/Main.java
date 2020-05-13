package dev.wommu.helloworld;

public final class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Construction disabled.
     * @throws UnsupportedOperationException Always thrown.
     */
    private Main() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
