import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

            Server server = new Server(64);
           server.accept(9999);

    }
}
