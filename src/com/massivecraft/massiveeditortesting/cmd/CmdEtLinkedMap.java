package com.massivecraft.massiveeditortesting.cmd;

import com.massivecraft.massivecore.command.editor.CommandEditSingleton;
import com.massivecraft.massiveeditortesting.entity.MConf;
import com.massivecraft.massiveeditortesting.entity.TestBackString;

import java.util.List;

public class CmdEtLinkedMap extends CommandEditSingleton<TestBackString>
{
	
	public CmdEtLinkedMap()
	{
		super(TestBackString.get());
	}
	
	@Override
	public List<String> getAliases()
	{
		return MConf.get().aliasesEtBackString;
	}
}
