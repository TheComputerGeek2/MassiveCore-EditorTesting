package com.massivecraft.massiveeditortesting.cmd;

import java.util.List;

import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massiveeditortesting.Perm;
import com.massivecraft.massiveeditortesting.entity.MConf;

public class CmdEt extends MassiveCommand
{
	// -------------------------------------------- //
	// INSTANCE
	// -------------------------------------------- //
	
	private static CmdEt i = new CmdEt();
	public static CmdEt get() { return i; }
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	public CmdEtConfig cmdEtConfig = new CmdEtConfig();
	public CmdEtBackString cmdEtBackString = new CmdEtBackString();
	public CmdEtNestedLists cmdEtNestedLists = new CmdEtNestedLists();
	public CmdEtLinkedMap cmdEtLinkedMap = new CmdEtLinkedMap();
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public CmdEt()
	{
		// Children
		this.addChild(this.cmdEtConfig);
		this.addChild(this.cmdEtBackString);
		this.addChild(this.cmdEtNestedLists);
		this.addChild(this.cmdEtLinkedMap);
		
		// Requirements
		this.addRequirements(RequirementHasPerm.get(Perm.BASECOMMAND));
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public List<String> getAliases()
	{
		return MConf.get().aliasesEt;
	}

}
