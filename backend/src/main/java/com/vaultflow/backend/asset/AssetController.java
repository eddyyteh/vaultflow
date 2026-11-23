package com.vaultflow.backend.asset;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/assets")
public class AssetController {

    //Dependency Injection means: instead of creating the objects you need (new AssetService()), you let Spring Boot create and provide them for you, making your code cleaner, easier to maintain, and easier to test.
    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping
    public List<AssetBalance> getAssets() {
        return assetService.getAssets();
    }
}
