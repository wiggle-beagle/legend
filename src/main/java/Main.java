import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws IOException {
        ExecutorService threadPool = Executors.newFixedThreadPool(64);
        while (true) {
            Server server = new Server();
            server.accept();
            threadPool.submit(server);
        }

    }
}
