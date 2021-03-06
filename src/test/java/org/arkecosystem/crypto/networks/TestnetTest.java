package org.arkecosystem.crypto.networks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestnetTest {

    @Test
    void version() {
        assertEquals(0x17, new Testnet().version());
    }

    @Test
    void wif() {
        assertEquals(186, new Testnet().wif());
    }

    @Test
    void epoch() {
        assertEquals("2017-03-21 13:00:00", new Testnet().epoch());
    }
}
