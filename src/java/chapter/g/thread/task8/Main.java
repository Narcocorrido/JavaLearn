package chapter.g.thread.task8;

public class Main {
    /**
     * Program, który za pomocą metod wait() i notify() symuluje tykanie zegara,
     * wyświetlając na ekranie słowa "Tik" i "Tak"
     */
    public static void main(String[] args) {
        Clock clock = new Clock();
        new MyThread("Tik", clock);
        new MyThread("Tak", clock);
    }
}
