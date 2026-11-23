package com.vaultflow.backend.asset;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

//since we do not have a database yet, we will hardcode the asset balances for now. In the future, we will implement a database to store and retrieve asset balances.
@Service
public class AssetService {

    public List<AssetBalance> getAssets() {
        return List.of(
            new AssetBalance(
                "USDT", new BigDecimal("1000.00")
             ),
             new AssetBalance("BTC", new BigDecimal("0.025")
            )
        );

    }
}

//frontend cannot call this service directly, so we will create a controller to expose the asset balances via a REST API. The controller will be implemented in the next step.
//http request (GET /api/v1/assests) -> controller (receives request and calls service) -> service (retrieves asset balances) -> controller (returns asset balances to frontend) -> frontend (displays asset balances to user)