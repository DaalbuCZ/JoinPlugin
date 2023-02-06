package mc.daalbu.joinplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinPlugin extends JavaPlugin {

    private static JoinPlugin instance;
    @Override
    public void onEnable() {
        instance = this;
        this.getCommand("heal").setExecutor(new HealCommand());

    }

    @Override
    public void onDisable() {

    }

    public static JoinPlugin getInstance() {
        return instance;
    }
}
