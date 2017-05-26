package fr.mevato.SimpleAlertInfos;

import org.bukkit.plugin.java.JavaPlugin;

import fr.mevato.SimpleAlertInfos.commands.CommandBCA;
import fr.mevato.SimpleAlertInfos.commands.CommandBCI;

/**
 * Version 1.2 created by mevato on 18/05/2017.
 */

public class SimpleAlertInfos extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[SimpleAlertInfos] Enabled");
        System.out.println("[SimpleAlertInfos] Want a french version ? Go To The Spigot Page !");
        getCommand("bci").setExecutor(new CommandBCI());
        getCommand("bca").setExecutor(new CommandBCA());
    }

    @Override
    public void onDisable() {
        System.out.println("[SimpleAlertInfos] Disabled");
    }
}
