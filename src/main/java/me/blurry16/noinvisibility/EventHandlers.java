package me.blurry16.noinvisibility;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.potion.PotionEffectType;

public class EventHandlers implements Listener {
    @EventHandler
    public void onPotion(EntityPotionEffectEvent event) {
        // Checking if the effect was added by neither command nor plugin
        if (event.getCause() != EntityPotionEffectEvent.Cause.PLUGIN && event.getCause() != EntityPotionEffectEvent.Cause.COMMAND) {

            // Checking if the effect is invisibility and it was added
            if (event.getModifiedType() == PotionEffectType.INVISIBILITY && event.getAction() == EntityPotionEffectEvent.Action.ADDED) {

                // Canceling event if modified entity is a player. Maybe some nubs want to have their pets invisible.
                event.setCancelled(event.getEntity().getType() == EntityType.PLAYER);
            }
        }
    }
}
