package com.massivecraft.massiveeditortesting;

import com.massivecraft.massivecore.MassivePlugin;
import com.massivecraft.massiveeditortesting.cmd.CmdEt;
import com.massivecraft.massiveeditortesting.entity.CollTestBackString;
import com.massivecraft.massiveeditortesting.entity.MConfColl;
import com.massivecraft.massiveeditortesting.entity.NestedListsColl;

public class MassiveEditorTesting extends MassivePlugin
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static MassiveEditorTesting i;
	public static MassiveEditorTesting get() { return i; }
	public MassiveEditorTesting() { MassiveEditorTesting.i = this; }
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void onEnableInner()
	{
		MassiveEditorTesting.i = this;
		// Active
		this.activate(
			// Coll
			MConfColl.class,
			CollTestBackString.class,
			NestedListsColl.class,
			
			// Command
			CmdEt.class
		);
	}   
	
}