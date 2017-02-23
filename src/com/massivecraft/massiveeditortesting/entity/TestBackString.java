package com.massivecraft.massiveeditortesting.entity;

import com.massivecraft.massivecore.collections.BackstringEnumSet;
import com.massivecraft.massivecore.command.editor.annotation.EditorName;
import com.massivecraft.massivecore.store.Entity;
import org.bukkit.Material;

import java.util.LinkedHashSet;

@EditorName("backstring")
public class TestBackString extends Entity<TestBackString>
{
	// -------------------------------------------- //
	// META
	// -------------------------------------------- //
	
	protected static transient TestBackString i;
	public static TestBackString get() { return i; }
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	
	public BackstringEnumSet<Material> materials = new BackstringEnumSet<Material>(Material.class,
		"STONE",
		"BONE"
	);
	
}
