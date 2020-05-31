package de.igamblenull.healthyhuman.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class HeartContainerTier2 extends ItemBase implements IBauble {
    public HeartContainerTier2(String name) {
        super(name);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(16);
    }

    protected static final UUID MAX_HEALTH_UUID = UUID.fromString("c18cddbb-913a-4873-8b57-cabf9c0a7b5c");

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.BODY;
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        //player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(player.getMaxHealth() + 20);
        player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(new AttributeModifier(MAX_HEALTH_UUID, "MAX_HEALTH_X2", 5, 2));
    }

    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        //player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(player.getMaxHealth() - 20);
        player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).removeModifier(MAX_HEALTH_UUID);
        if(player.getHealth() > player.getMaxHealth())
            player.setHealth(player.getMaxHealth());
    }

    @Override
    public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    @Override
    public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }
}
