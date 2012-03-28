package org.bukkit.event.painting;

import java.util.List;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Painting;
import org.bukkit.inventory.ItemStack;

/**
 * Triggered when a painting is removed by an entity
 */
public class PaintingBreakByEntityEvent extends PaintingBreakEvent {
    private final Entity remover;

    public PaintingBreakByEntityEvent(final Painting painting, final Entity remover, List<ItemStack> drops) {
        super(painting, RemoveCause.ENTITY, drops);
        this.remover = remover;
    }
    
    //CraftBukkitPlusPlus start
    public PaintingBreakByEntityEvent(final Painting painting, final Entity remover) {
        super(painting, RemoveCause.ENTITY);
        this.remover = remover;
    }
    //CraftBukkitPlusPlus end

    /**
     * Gets the entity that removed the painting
     *
     * @return the entity that removed the painting.
     */
    public Entity getRemover() {
        return remover;
    }
}
