package orb.ital.item.custom;


import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.level.Level;
import orb.ital.item.ModItem;

public class CustomItem extends Item {


    public CustomItem(Properties properties) {





        super(properties);

    }


    public InteractionResult use(Level level, Player player, InteractionHand hand) {


        ItemStack Itemvruke2 = player.getItemInHand(hand);


            Itemvruke2.shrink(1);











        return InteractionResult.SUCCESS;



    }

    @Override
    public ItemUseAnimation getUseAnimation(ItemStack itemStack) {
        return super.getUseAnimation(itemStack);
    }

    @Override
    public int getUseDuration(ItemStack itemStack, LivingEntity user) {
        return super.getUseDuration(itemStack, user);
    }
}
