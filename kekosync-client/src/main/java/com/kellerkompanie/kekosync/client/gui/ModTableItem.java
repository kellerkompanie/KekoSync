package com.kellerkompanie.kekosync.client.gui;

import com.kellerkompanie.kekosync.client.settings.Settings;
import com.kellerkompanie.kekosync.core.entities.Mod;
import com.kellerkompanie.kekosync.core.helper.FileLocationHelper;

import java.nio.file.Path;

public class ModTableItem extends CustomTableItem {

    private Mod mod;
    private Path modLocation;

    public ModTableItem(Mod mod) {
        super(CheckedState.UNCHECKED, Type.MOD_GROUP);
        this.mod = mod;
    }

    @Override
    public Status getStatus() {
        return Status.INCOMPLETE;
    }

    @Override
    public String getName() {
        return mod.getName();
    }

    @Override
    public String getLocation() {
        if(modLocation == null)
            modLocation = FileLocationHelper.getModLocalRootpath(mod, Settings.getInstance().getSearchDirectories());

        if(modLocation != null)
            return modLocation.toString();
        else
            return null;
    }

    @Override
    public void setLocation(Path searchDirectory) {
        this.modLocation = searchDirectory;
    }

}
