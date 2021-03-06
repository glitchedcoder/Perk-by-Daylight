package dev.glitchedcode.pbd.dbd.icon;

import dev.glitchedcode.pbd.dbd.Character;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Used to represent all the icons in the "Items" category.
 */
public enum Item implements Icon {

    PARTY_POPPER("partyPopper", "Party Popper", "Anniversary"),
    ANNIVERSARY_FLASHLIHGT("flashlight_anniversary2020", "Anniversary Flashlight", "Anniversary"),
    ANNIVERSARY_AID_KIT("medkit_anniversary2020", "Anniversary Aid Kit", "Anniversary"),
    FLASHLIGHT_HALLOWEEN("flashlightHalloween", "Flashlight Halloween", "Halloween"),
    MEDKIT_HALLOWEEN("medkitHalloween", "Medkit Halloween", "Halloween"),
    BROKEN_KEY("brokenKey", "Broken Key"),
    CHINESE_FIRECRACKER("chineseFirecracker", "Chinese Firecracker"),
    DULL_KEY("dullKey", "Dull Key"),
    FIRST_AID_KIT("firstAidKit", "First Aid Kit"),
    FLASHLIGHT("flashlight", "Flashlight"),
    FLASHLIGHT_SPORT("flashlightSport", "Flashlight Sport"),
    FLASHLIGHT_UTILITY("flashlightUtility", "Flashlight Utility"),
    KEY("key", "Key"),
    MAP("map", "Map"),
    MEDKIT("medkit", "Medkit"),
    RAINBOW_MAP("rainbowMap", "Rainbow Map"),
    RANGERS_AID_KIT("rangersAidKit", "Rangers Aid Kit"),
    RUNDOWN_AID_KIT("rundownAidKit", "Rundown Aid Kit"),
    TOOLBOX("toolbox", "Toolbox"),
    TOOLBOX_ALEXS("toolboxAlexs", "Toolbox Alexs"),
    TOOLBOX_COMMODIOUS("toolboxCommodious", "Toolbox Commodious"),
    TOOLBOX_ENGINEERS("toolboxEngineers", "Toolbox Engineers"),
    TOOLBOX_MECHANICS("toolboxMechanics", "Toolbox Mechanics"),
    TOOLBOX_WORN_OUT("toolboxWornOut", "Toolbox Worn Out"),
    WINTER_EVENT_FIRECRACKER("winterEventFirecracker", "Winter Event Firecracker", "WinterEvent");

    private final String name;
    private final String subFolder;
    private final String properName;

    @ParametersAreNonnullByDefault
    Item(String name, String properName) {
        this(name, properName, "");
    }

    @ParametersAreNonnullByDefault
    Item(String name, String properName, String subFolder) {
        this.name = name;
        this.properName = properName;
        this.subFolder = subFolder;
    }

    @Nonnull
    @Override
    public IconCategory getCategory() {
        return IconCategory.ITEM;
    }

    @Nonnull
    @Override
    public String getName() {
        return name;
    }

    @Nonnull
    @Override
    public String getFileAdditive() {
        return "iconItems_";
    }

    @Nonnull
    @Override
    public String getProperName() {
        return properName;
    }

    @Nonnull
    @Override
    public String getSubfolderName() {
        return "Items\\" + subFolder;
    }

    @Nullable
    @Override
    public Character getCharacter() {
        return null;
    }
}