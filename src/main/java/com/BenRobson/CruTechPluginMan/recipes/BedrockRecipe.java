package com.BenRobson.CruTechPluginMan.recipes;

import com.BenRobson.CruTechPluginMan.CruTechPluginManMain;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class BedrockRecipe implements Listener {
    CruTechPluginManMain plugin;
    public BedrockRecipe(CruTechPluginManMain instance) {
        plugin = instance;
    }

    public void BedrockRecipe() {
        ItemStack item = new ItemStack(Material.BEDROCK, 1);
        NamespacedKey key = new NamespacedKey(plugin, "Bedrock");
        ShapedRecipe br = new ShapedRecipe(key, item);

        br.shape("$$$", "$@$", "$$$");
        br.setIngredient('$', Material.OBSIDIAN);
        br.setIngredient('@', Material.NETHER_STAR);
        plugin.getServer().addRecipe(br);
    }
}
