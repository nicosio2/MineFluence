package net.ocine.minefluence.blocks.containers;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.ocine.minefluence.blocks.tileentities.InventoryTileEntity;

public class ContainerOutput extends InventoryContainer {

	public ContainerOutput(InventoryPlayer inventoryPlayer, InventoryTileEntity tileEntity) {
		super(inventoryPlayer, tileEntity);
		addSlotToContainer(new OutputSlot(tileEntity, 0, 80, 32));
	}

	@Override
	public boolean canDragIntoSlot(Slot slot) {
		if (slot.getSlotIndex() == 2) {
			return false;
		}
		return true;
	}

}
