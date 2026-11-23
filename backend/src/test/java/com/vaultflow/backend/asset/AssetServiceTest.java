package com.vaultflow.backend.asset;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AssetServiceTest {

    private final AssetService service = new AssetService();

    @Test
    void shouldReturnDemoAssets() {
        var assets = service.getAssets();

        assertEquals(2, assets.size());
        assertEquals("USDT", assets.get(0).assetCode());
        assertEquals(new BigDecimal("1000.00"), assets.get(0).availableBalance());
    }
}
