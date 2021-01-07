package at.playify.testmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class TestItem extends Item{
	public TestItem(){
		super(new Properties().group(ItemGroup.MISC).maxStackSize(64));
		setRegistryName("test_item");
	}
}
