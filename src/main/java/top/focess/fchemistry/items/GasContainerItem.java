package top.focess.fchemistry.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import top.focess.fchemistry.SharedConstant;

public class GasContainerItem extends Item {

    public static final GasContainerItem GAS_CONTAINER_ITEM = new GasContainerItem();

    public static final ItemGroup GAS_ITEM_GROUP = FabricItemGroupBuilder
            .create(new Identifier(SharedConstant.NAMESPACE,"gas"))
            .icon(() -> new ItemStack(GAS_CONTAINER_ITEM))
            .appendItems(itemStacks -> itemStacks.add(new ItemStack(GAS_CONTAINER_ITEM)))
            .build();

    public GasContainerItem() {
        super(new Settings().group(GAS_ITEM_GROUP).maxCount(64).maxDamage(100));
    }
}
