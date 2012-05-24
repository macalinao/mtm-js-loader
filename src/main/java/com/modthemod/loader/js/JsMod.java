package com.modthemod.loader.js;

import java.util.logging.Logger;

import com.modthemod.api.mod.Mod;
import com.modthemod.api.mod.ModDescription;
import com.modthemod.api.mod.ModLoader;

public final class JsMod implements Mod {
	private final ModDescription desc;

	private final ModLoader<?> loader;

	public JsMod(ModDescription desc, ModLoader<?> loader) {
		this.desc = desc;
		this.loader = loader;
	}

	@Override
	public String getName() {
		return desc.getName();
	}

	@Override
	public ModDescription getDescription() {
		return desc;
	}

	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub

	}

	@Override
	public ModLoader<?> getModLoader() {
		return loader;
	}

}
