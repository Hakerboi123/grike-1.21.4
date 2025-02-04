package xyz.glowstonelabs.grike.worldgen.tree;


import xyz.glowstonelabs.grike.Grike;
import xyz.glowstonelabs.grike.mixin.TreeDecoratorTypeMixin;
import xyz.glowstonelabs.grike.worldgen.tree.decorators.*;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import xyz.glowstonelabs.grike.worldgen.tree.decorators.BirchBranchDecorator;

public class ModTreeDecorator {

    public static final TreeDecoratorType<?> BIRCH_BRANCH =
            TreeDecoratorTypeMixin.callRegister("birch_branch", BirchBranchDecorator.CODEC);

    public static final TreeDecoratorType<?> OAK_BRANCH =
            TreeDecoratorTypeMixin.callRegister("oak_branch", OakBranchDecorator.CODEC);

    public static void register() {
        Grike.LOGGER.info("Registering the Tree Decorator for " + Grike.MOD_ID);
    }

}
