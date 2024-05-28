package me.blurry16.noinvisibility;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoInvisibility extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventHandlers(), this);
        System.out.println("NoInvisibility plugin has successfully started.");
    }
}
