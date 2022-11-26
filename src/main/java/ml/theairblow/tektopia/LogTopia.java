package ml.theairblow.tektopia;

import net.minecraftforge.fml.common.Mod;
import zone.rong.mixinbooter.ILateMixinLoader;
import java.util.Arrays;
import java.util.List;

@Mod(
        modid = LogTopia.MOD_ID,
        name = LogTopia.MOD_NAME,
        version = LogTopia.VERSION
)
public class LogTopia implements ILateMixinLoader {
    public static final String MOD_ID = "logtopia";
    public static final String MOD_NAME = "LogTopia";
    public static final String VERSION = "1.0.0";

    @Override
    public List<String> getMixinConfigs() {
        return Arrays.asList("mixins.json");
    }
}
