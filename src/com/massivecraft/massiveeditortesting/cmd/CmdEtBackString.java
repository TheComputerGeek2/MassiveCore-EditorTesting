package com.massivecraft.massiveeditortesting.cmd;

import com.massivecraft.massivecore.command.editor.CommandEditSingleton;
import com.massivecraft.massiveeditortesting.entity.TestBackString;

public class CmdEtBackString extends CommandEditSingleton<TestBackString>
{
	
	public CmdEtBackString()
	{
		super(TestBackString.get());
	}
}
