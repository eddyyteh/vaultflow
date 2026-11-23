package com.vaultflow.backend.asset;

import java.math.BigDecimal;

//below defines our data structure for the asset balance, which is a record in Java that holds the asset code and available balance.
public record AssetBalance(
    String assetCode,
    BigDecimal availableBalance
) {

}
