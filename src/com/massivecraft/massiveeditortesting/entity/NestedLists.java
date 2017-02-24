package com.massivecraft.massiveeditortesting.entity;

import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;

import java.util.List;

public class NestedLists extends Entity<NestedLists>
{
	// -------------------------------------------- //
	// INSTANCE
	// -------------------------------------------- //
	
	public static transient NestedLists i = new NestedLists();
	public static NestedLists get() { return i; }
	
	
	public List<String> basicListString = MUtil.list(
		"string 1",
		"string 2"
	);
	
	public List<List<String>> listOfListsOfStrings = MUtil.list(
		MUtil.list(
			"list 1 string 1",
			"list 1 string 2"
		),
		MUtil.list(
			"list 2 string 1",
			"list 2 string 2"
		)
	);
	
	public List<List<List<String>>> listOfListsOfListsOfStrings = MUtil.list(
		MUtil.list(
			MUtil.list(
				"list 1 list 1 string 1",
				"list 1 list 1 string 2"
			),
			MUtil.list(
				"list 1 list 2 string 1",
				"list 1 list 2 string 2"
			)
		),
		MUtil.list(
			MUtil.list(
				"list 2 list 1 string 1",
				"list 2 list 1 string 2"
			),
			MUtil.list(
				"list 2 list 2 string 1",
				"list 2 list 2 string 2"
			)
		)
	);
	
	public List<List<List<List<String>>>> listOfListsOfListsOfListsOfStrings = MUtil.list(
		MUtil.list(
			MUtil.list(
				MUtil.list(
					"list 1 list 1 list 1 string 1",
					"list 1 list 1 list 1 string 2"
				),
				MUtil.list(
					"list 1 list 1 list 2 string 1",
					"list 1 list 1 list 2 string 2"
				)
			),
			MUtil.list(
				MUtil.list(
					"list 1 list 2 list 1 string 1",
					"list 1 list 2 list 1 string 2"
				),
				MUtil.list(
					"list 1 list 2 list 2 string 1",
					"list 1 list 2 list 2 string 2"
				)
			)
		),
		MUtil.list(
			MUtil.list(
				MUtil.list(
					"list 2 list 1 list 1 string 1",
					"list 2 list 1 list 1 string 2"
				),
				MUtil.list(
					"list 2 list 1 list 2 string 1",
					"list 2 list 1 list 2 string 2"
				)
			),
			MUtil.list(
				MUtil.list(
					"list 2 list 2 list 1 string 1",
					"list 2 list 2 list 1 string 2"
				),
				MUtil.list(
					"list 2 list 2 list 2 string 1",
					"list 2 list 2 list 2 string 2"
				)
			)
		)
	);
	
}