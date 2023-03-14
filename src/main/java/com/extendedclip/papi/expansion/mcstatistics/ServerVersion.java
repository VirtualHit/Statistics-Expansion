package com.extendedclip.papi.expansion.mcstatistics;

import com.google.common.primitives.Ints;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.EntityType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for detecting server version for legacy support :(
 * @author Matt
 */
public final class ServerVersion {

    private static final int CURRENT_VERSION = getCurrentVersion();
    private static final int LATEST_VERSION = 1_19_3;

    public static final String AS_STRING = Bukkit.getBukkitVersion().split("-")[0];

    public static final boolean IS_LEGACY = CURRENT_VERSION < 1_13_0;
    /**
     * {@link org.bukkit.OfflinePlayer#getStatistic(Statistic)} was added in 1.15
     * @see org.bukkit.OfflinePlayer#getStatistic(Statistic, Material)
     * @see org.bukkit.OfflinePlayer#getStatistic(Statistic, EntityType)
     */
    public static final boolean SUPPORT_OFFLINE_PLAYERS = CURRENT_VERSION >= 1_15_0;
    public static final boolean IS_LATEST = CURRENT_VERSION >= LATEST_VERSION;

    private static int getCurrentVersion() {
        int version = 1_19_3;

        return version;
    }

}
