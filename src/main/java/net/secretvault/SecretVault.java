package net.secretvault;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecretVault implements ModInitializer {

	public static final String MOD_ID = "secretvault";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// The recipe and loot table are bundled as data resources under
		// src/main/resources/data/secretvault/ and load automatically -
		// no registration code is needed for them.
		LOGGER.info("Secret Vault loaded - surround a chest with 8 birch logs to craft the Vault Chest.");
	}
}
