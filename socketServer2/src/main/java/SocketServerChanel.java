import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * User: a.arzamastsev Date: 07.04.14 Time: 14:37
 */
public class SocketServerChanel {
    public static void main(String[] args) {


        try (ServerSocketChannel serverSocketChannel = ServerSocketChannel.open()) {
            serverSocketChannel.socket().bind(new InetSocketAddress(4444));
            serverSocketChannel.configureBlocking(false);
            System.out.println("Waiting for connections");

            while (true) {

                SocketChannel socketChannel = serverSocketChannel.accept();
                ByteBuffer buffer = ByteBuffer.wrap("Hi!".getBytes());
                if (socketChannel == null) {
                    Thread.sleep(2000);
                } else {
                    System.out.println("Incoming connection from: " + socketChannel.socket().getRemoteSocketAddress());

                    buffer.rewind();
                    socketChannel.write(buffer);
//                    socketChannel.close();
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }
}
