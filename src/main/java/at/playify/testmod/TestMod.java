package at.playify.testmod;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("testmod")
public class TestMod{
	private Item testItem=new TestItem();

	public TestMod(){
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(testItem);
	}
}
