package com.massivecraft.massiveeditortesting.cmd;

import com.massivecraft.massivecore.command.editor.CommandEditSingleton;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massiveeditortesting.Perm;
import com.massivecraft.massiveeditortesting.entity.MConf;
import com.massivecraft.massiveeditortesting.entity.NestedLists;

import java.util.List;

public class CmdEtNestedLists extends CommandEditSingleton<NestedLists>
{
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public CmdEtNestedLists()
	{
		super(NestedLists.get());
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public List<String> getAliases()
	{
		return MConf.get().aliasesEtNestedLists;
	}
	
}
