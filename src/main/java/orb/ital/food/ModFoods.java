package orb.ital.food;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;

public class ModFoods {
    public static final FoodProperties NUKE = new FoodProperties.Builder().nutrition(0).alwaysEdible().build();

    public static final Consumable NUKE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(0).sound(net.minecraft.sounds.SoundEvents.ITEM_BREAK).soundAfterConsume(SoundEvents.ITEM_BREAK).
            build();
}
