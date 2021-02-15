package org.samo_lego.disguiselib.mixin.accessor;

import net.minecraft.entity.EntityType;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(EntitySpawnS2CPacket.class)
public interface EntitySpawnS2CPacketAccessor {
    @Accessor("entityTypeId")
    void setEntityType(EntityType<?> entityType);
    @Accessor("entityTypeId")
    EntityType<?> getEntityType();

    @Accessor("id")
    int getEntityId();
}
