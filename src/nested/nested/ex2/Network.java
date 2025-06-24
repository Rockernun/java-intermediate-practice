package nested.nested.ex2;

public class Network {

    // sendMessage만 사용하면 되겠다.
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // NetworkMessage는 private이니 안에서만 쓰겠네? 내부 중첩이구나...
    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
