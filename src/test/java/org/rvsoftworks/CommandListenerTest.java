package org.rvsoftworks;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommandListenerTest {

    @Test
    public void test() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            String ipAddress = localHost.getHostAddress();
            System.out.println("IP Local: " + ipAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}