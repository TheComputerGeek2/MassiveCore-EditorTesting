package com.massivecraft.massiveeditortesting.cmd;

import com.massivecraft.massivecore.command.editor.CommandEditSingleton;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massiveeditortesting.Perm;
import com.massivecraft.massiveeditortesting.entity.MConf;

import java.util.List;

public class CmdEtConfig extends CommandEditSingleton<MConf>
{
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public CmdEtConfig()
	{
		super(MConf.get());
		
		// Requirements
		this.addRequirements(RequirementHasPerm.get(Perm.CONFIG));
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public List<String> getAliases()
	{
		return MConf.get().aliasesEtConfig;
	}
	
}
