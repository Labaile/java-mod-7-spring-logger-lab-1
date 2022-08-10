package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Tests the API to see if we get response
 */
class BitcoinServiceIntegrationTest {
    @Test
    void shouldReturnBitcoinPrice() {
        BitcoinService bitcoinService = new BitcoinService();
        String bitcoinPrice = bitcoinService.getBitcoinPrice();
        assertThat(bitcoinPrice).isNotNull();
//        String bitcoinPrice2 = coinCapService.getBitcoinPrice();
//        assertThat(bitcoinPrice2).isNotNull();
//        assertThat(bitcoinPrice).isNotEqualTo(bitcoinPrice2);
    }
}