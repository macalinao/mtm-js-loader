package com.modthemod.loader.js;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;

import com.modthemod.api.Game;
import com.modthemod.api.mod.InvalidModException;
import com.modthemod.api.mod.ModDescription;
import com.modthemod.api.mod.ModLoader;

public class JsModLoader implements ModLoader<JsMod> {
	public static final List<Pattern> filters = Arrays.asList(Pattern
			.compile("\\.js\\.zip"));

	private final Game game;

	public JsModLoader(Game game) {
		this.game = game;
	}

	@Override
	public String getLanguage() {
		return "javascript";
	}

	@Override
	public JsMod loadMod(File file) throws InvalidModException {
		// TODO Auto-generated method stub
		return null;
	}

	public JsMod loadModFromFolder(File directory) throws InvalidModException {
		File modJson = new File(directory, "mod.json");
		ModDescription desc = null;

		try {
			desc = ModDescription.load(modJson);
		} catch (IOException e) {
			throw new InvalidModException("Mod.json not found!", e);
		}

		
		JsMod mod = new JsMod(desc, this);
		
		
		return null;
	}

	@Override
	public List<Pattern> getFileFilters() {
		return filters;
	}

	@Override
	public void enableMod(JsMod mod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void disableMod(JsMod mod) {
		// TODO Auto-generated method stub

	}

}
