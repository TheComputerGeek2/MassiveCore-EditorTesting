package com.massivecraft.massiveeditortesting.entity;

import com.massivecraft.massivecore.collections.BackstringEnumSet;
import com.massivecraft.massivecore.collections.ExceptionSetEnum;
import com.massivecraft.massivecore.command.editor.annotation.EditorName;
import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;

import org.bukkit.Material;

import java.util.LinkedHashSet;
import java.util.List;

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
	
	public List<BackstringEnumSet<Material>> listOfBackStringEnumSets = MUtil.list(
		new BackstringEnumSet<Material>(Material.class),
		new BackstringEnumSet<Material>(Material.class)
	);
	
	public ExceptionSetEnum<Material> materialExceptionSetEnum = new ExceptionSetEnum<Material>(Material.class, false);
	
}
