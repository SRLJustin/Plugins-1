package net.runelite.client.plugins.oneclickzmi;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("oneclickzmi")
public interface oneClickZMIConfig extends Config{

    @ConfigItem(
            position = 0,
            keyName = "foodID",
            name = "Food ID",
            description = "Input id for your desired food. Default is Karambwan"
    )
    default int foodID()
    {
        return 3144;
    }

    @ConfigItem(
            position = 1,
            keyName = "eatAt",
            name = "Eat at",
            description = "Input the HP you want to reach before eating"
    )
    default int eatAt()
    {
        return 70;
    }

    @ConfigItem(
            position = 2,
            keyName = "essenceType",
            name = "Essence",
            description = "Choose Daeyalt or Pure Essence"
    )
    default EssenceType essenceType() {
        return EssenceType.Daeyalt;
    }

    @ConfigItem(
            position = 3,
            keyName = "drinkStamina",
            name = "Drink Stamina?",
            description = "Withdraws and drinks staminas if run energy below 80 or stamina not currently active"
    )
    default boolean drinkStamina() {
        return true;
    }
}
