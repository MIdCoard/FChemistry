package top.focess.fchemistry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.focess.fchemistry.items.GasContainerItem;


public class FChemistry implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("Load FChemistry Successfully!");

        Registry.register(Registry.ITEM,new Identifier(SharedConstant.NAMESPACE,"gas_container"), GasContainerItem.GAS_CONTAINER_ITEM);
    }
}
