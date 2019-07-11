package com.BenRobson.CruTechPluginMan;

import com.BenRobson.CruTechPluginMan.commands.testcommand;
import com.BenRobson.CruTechPluginMan.events.PlayerOnJoin;
import com.BenRobson.CruTechPluginMan.recipes.BedrockRecipe;
import com.BenRobson.CruTechPluginMan.recipes.TridentRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class CruTechPluginManMain extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("Testing 1 2 3 I am online and good to go!!");

        // Events Registry
        getServer().getPluginManager().registerEvents(new PlayerOnJoin(), this);

        // Commands Registry
        this.getCommand("testcommand").setExecutor(new testcommand());

        // Recipe Registry
        // Trident Recipe
        TridentRecipe tr = new TridentRecipe(this);
        tr.TridentRecipe();

        // Bedrock Recipe
        BedrockRecipe br = new BedrockRecipe(this);
        br.BedrockRecipe();
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("I am now shutting down, goodnight!");
    }
}
