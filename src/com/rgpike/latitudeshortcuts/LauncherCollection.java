
package com.rgpike.latitudeshortcuts;

import android.content.Context;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class LauncherCollection {
    public final static String MAP_CHECKIN = "checkin";

    public final static String MAP_LIST = "list";

    public final static String MAP_PLACES = "places";

    public final static String MAP_HISTORY = "history";

    private Map<String, Launcher> mLauncherCollection = new HashMap<String, Launcher>();

    public LauncherCollection(Context context) {
        LoadLaunchers(context);
    }

    public Collection<Launcher> getLauncherValues() {
        return mLauncherCollection.values();
    }

    public Launcher getLauncher(String key) {
        Launcher launcher;

        if (mLauncherCollection.containsKey(key)) {
            launcher = mLauncherCollection.get(key);
        } else {
            launcher = null;
        }

        return launcher;
    }

    private void LoadLaunchers(Context context) {
        Launcher launcher;

        /* Check In */
        launcher = new Launcher(R.drawable.ic_checkin, context.getResources().getString(
                R.string.TitleCheckin), context.getResources().getString(
                R.string.LatitudeCheckinURI), context.getResources().getString(
                R.string.TitleCheckin), String.format(
                context.getResources().getString(R.string.InstalledAlertMessage), context
                        .getResources().getString(R.string.TitleCheckin)));
        mLauncherCollection.put(LauncherCollection.MAP_CHECKIN, launcher);

        /* Places */
        launcher = new Launcher(R.drawable.ic_places, context.getResources().getString(
                R.string.TitlePlaces),
                context.getResources().getString(R.string.LatitudePlacesURI), context
                        .getResources().getString(R.string.TitlePlaces), String.format(context
                        .getResources().getString(R.string.InstalledAlertMessage), context
                        .getResources().getString(R.string.TitlePlaces)));
        mLauncherCollection.put(LauncherCollection.MAP_PLACES, launcher);

        /* Friends List */
        launcher = new Launcher(R.drawable.ic_list, context.getResources().getString(
                R.string.TitleList), context.getResources().getString(R.string.LatitudeListURI),
                context.getResources().getString(R.string.TitleList), String.format(context
                        .getResources().getString(R.string.InstalledAlertMessage), context
                        .getResources().getString(R.string.TitleList)));
        mLauncherCollection.put(LauncherCollection.MAP_LIST, launcher);

        /* History */
        launcher = new Launcher(R.drawable.ic_history, context.getResources().getString(
                R.string.TitleHistory), context.getResources().getString(
                R.string.LatitudeHistoryURI), context.getResources().getString(
                R.string.TitleHistory), String.format(
                context.getResources().getString(R.string.InstalledAlertMessage), context
                        .getResources().getString(R.string.TitleHistory)));
        mLauncherCollection.put(LauncherCollection.MAP_HISTORY, launcher);
    }
}
