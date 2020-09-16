package xyz.jpuf.katanalib.config;


import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "katanalib")
public class KatanaLibConfig implements ConfigData {
    @Comment(value = "Whether or not the library is enabled")
    public boolean enabled = false;

    @Comment(value = "If enabled Mod works")
    public boolean notbroken = true;
}
