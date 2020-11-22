package de.igamblenull.healthyhuman.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class HeartContainerTier3 extends ItemBase implements IBauble {
    public HeartContainerTier3(String name) {
        super(name);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(16);
    }

    protected static final UUID MAX_HEALTH_UUID = UUID.fromString("86430eff-344f-4949-90f4-cbac4a218312");

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.BODY;
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(new AttributeModifier(MAX_HEALTH_UUID, "MAX_HEALTH_X3", 10, 2));
    }

    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
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
