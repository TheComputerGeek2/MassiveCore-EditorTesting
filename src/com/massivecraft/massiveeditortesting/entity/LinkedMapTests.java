package com.massivecraft.massiveeditortesting.entity;

import com.massivecraft.massivecore.MassiveCore;
import com.massivecraft.massivecore.command.editor.annotation.EditorName;
import com.massivecraft.massivecore.store.Coll;
import com.massivecraft.massivecore.store.Entity;


import java.util.LinkedHashMap;

public class LinkedMapTests
{
	
	@EditorName("linkedmap")
	public static class EntityLinkedMap extends Entity<EntityLinkedMap>
	{
		protected static EntityLinkedMap i = new EntityLinkedMap();
		public static EntityLinkedMap get() { return i; }
		
		public LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
	}
	
	public static class LinkedMapColl extends Coll<EntityLinkedMap>
	{
		// -------------------------------------------- //
		// INSTANCE & CONSTRUCT
		// -------------------------------------------- //
		
		private static LinkedMapColl i = new LinkedMapColl();
		public static LinkedMapColl get() { return i; }
		
		// -------------------------------------------- //
		// STACK TRACEABILITY
		// -------------------------------------------- //
		
		@Override
		public void onTick()
		{
			super.onTick();
		}
		
		// -------------------------------------------- //
		// OVERRIDE
		// -------------------------------------------- //
		
		@Override
		public void setActive(boolean active)
		{
			super.setActive(active);
			if ( ! active) return;
			LinkedMapTests.EntityLinkedMap.i = this.get(MassiveCore.INSTANCE, true);
		}
		
	}
	
}
