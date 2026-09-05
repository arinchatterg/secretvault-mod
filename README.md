# Secret Vault (Fabric mod)

Craft a chest surrounded by 8 birch logs → get a "Vault Chest". Place it, open it,
and it's pre-filled with maxed diamond armor/tools, a Mace with Breach IV, 2 stacks
of cobwebs, and 64 wind charges - generated the same way vanilla dungeon/stronghold
loot chests work (via the `minecraft:container_loot` item component).

Disguise this as a server mod to gain advantages early game in anarchy servers. 

<img width="372" height="182" alt="image (3)" src="https://github.com/user-attachments/assets/622b1f77-0e35-4b75-b8e0-6baf37fe902f" />

## How to build

You need a JDK 25 install for this. From this project's root folder:

```
./gradlew build
```

(On Windows, use `gradlew.bat build` instead.)

The compiled mod will appear at `build/libs/secretvault-1.0.0.jar`.

## How to install on your server

1. Make sure the server is running **Fabric Loader 0.19.3+** for Minecraft 26.2.
2. Download **Fabric API** for 26.2 and drop the jar in `mods/`.
3. Drop `secretvault-1.0.0.jar` into the server's `mods/` folder alongside it.
4. Restart the server.

## If the build fails

Minecraft's mod toolchain changed significantly with the 26.1/26.2 releases (no more
obfuscation/remapping, renamed Loom plugin, new component-based data storage). I built
this against the versions documented as current for 26.2 at the time of writing, but if
`fabric-loom`, the Fabric API coordinate, or the loader version have moved since, Gradle
will tell you exactly what's missing. Two easy fixes:

- Check https://fabricmc.net/develop/ for the current recommended Loom/Fabric API/loader
  versions for your exact Minecraft version, and update the numbers in `gradle.properties`
  and the loom plugin version in `build.gradle` to match.
- Or, generate a fresh empty template from https://fabricmc.net/develop/template/, then
  copy the `src/main/resources/data/secretvault/` folder and `fabric.mod.json`'s
  `entrypoints` block from this project into it - the actual gameplay logic here is 100%
  data files, so it drops straight into any correctly-configured template.
- If the issue still persists, email me at arinchatterg@gmail.com 
