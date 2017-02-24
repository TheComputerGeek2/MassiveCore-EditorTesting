package com.massivecraft.massiveeditortesting.entity;


import com.massivecraft.massivecore.command.editor.annotation.EditorName;
import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;

import java.util.List;
import java.util.Map;

@EditorName("config")
public class MConf extends Entity<MConf>
{
	// -------------------------------------------- //
	// META
	// -------------------------------------------- //
	
	protected static transient MConf i;
	public static MConf get() { return i; }
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	// Aliases
	public List<String> aliasesEt = MUtil.list("et", "massiveeditortest");
	public List<String> aliasesEtConfig = MUtil.list("config");
	public List<String> aliasesEtBackString = MUtil.list("backstring");
	public List<String> aliasesEtNestedLists = MUtil.list("nestedlists");
	
	// Test Maps
	public Map<String, String> mapStringToString = MUtil.map(
		"key", "value"
	);
	
	public Map<String, List<String>> mapStringToListString = MUtil.map(
		"key1", MUtil.list(
			"value1-1"
		)
	);
	
	public Map<String, Map<String, String>> mapToMapOfStringToString = MUtil.map(
		"key1", MUtil.map(
			"innerkey1", "innervalue1"
		),
		"key2", MUtil.map(
			"innerkey2", "innervalue2"
		),
		"key3", MUtil.map(
			"innerkey3", "innervalue3"
		)
	);
	
	// Test lists
	public List<String> list = MUtil.list(
		"list item"
	);
	
	public List<List<String>> listNested = MUtil.list(
		MUtil.list(
			"list item"
		)
	);
	
	public List<List<List<List<List<String>>>>> listNested2 = MUtil.list(
		MUtil.list(
			MUtil.list(
				MUtil.list(
					MUtil.list(
						"list item", "list item"
					),
					MUtil.list(
						"list item", "list item"
					)
				),
				MUtil.list(
					MUtil.list(
						"list item", "list item"
					),
					MUtil.list(
						"list item", "list item"
					)
				)
			),
			MUtil.list(
				MUtil.list(
					MUtil.list(
						"list item", "list item"
					),
					MUtil.list(
						"list item", "list item"
					)
				),
				MUtil.list(
					MUtil.list(
						"list item", "list item"
					),
					MUtil.list(
						"list item", "list item"
					)
				)
			)
		)
	);
	
	
}
