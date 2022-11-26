package ml.theairblow.tektopia;

import net.tangotek.tektopia.Village;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Village.class)
public abstract class MixinVillage {
    public void debugOut(String text) {
        // Do nothing. This is the entire patch.
    }
}
