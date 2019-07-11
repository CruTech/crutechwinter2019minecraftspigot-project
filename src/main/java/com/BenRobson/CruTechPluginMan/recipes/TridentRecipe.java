package com.BenRobson.CruTechPluginMan.recipes;

import com.BenRobson.CruTechPluginMan.CruTechPluginManMain;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class TridentRecipe implements Listener {
    CruTechPluginManMain plugin;
    public TridentRecipe(CruTechPluginManMain instance) {
        plugin = instance;
    }

    public void TridentRecipe() {
        ItemStack item = new ItemStack(Material.TRIDENT, 1);
        NamespacedKey key = new NamespacedKey(plugin, "Trident");
        ShapedRecipe tr = new ShapedRecipe(key, item);

        tr.shape("$$$", "@%@", "@%@");
        tr.setIngredient('$', Material.DIAMOND_BLOCK);
        tr.setIngredient('@', Material.AIR);
        tr.setIngredient('$', Material.CONDUIT);
        plugin.getServer().addRecipe(tr);
    }
}
