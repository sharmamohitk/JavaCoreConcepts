package com.practice.jmshelloworld;

public class JmsTest {

	public JmsTest() {
	}
	public static void main (String[] args) throws Exception {
        final MessageSender sender = new MessageSender();

        final MessageReceiver receiver = new MessageReceiver();
        receiver.startListener();

        for (int i = 1; i <= 5; i++) {
            String m = "Hello world! " + i;
            sender.sendMessage(m);
            Thread.sleep(300);
        }

        sender.destroy();
        receiver.destroy();
    }

}
