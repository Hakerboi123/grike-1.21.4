package xyz.glowstonelabs.grike;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.glowstonelabs.grike.worldgen.tree.ModTreeDecorator;

public class Grike implements ModInitializer {
	public static final String MOD_ID = "grike";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModTreeDecorator.register();
	}
}