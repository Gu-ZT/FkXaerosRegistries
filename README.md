<div align="center">

<img src="docs/icon.png" width="256" height="256" alt="Fk Xaero's Registries icon">

# Fk Xaero's Registries

**A Fabric mod that stops Xaero's Minimap and Xaero's World Map from registering status effects.**

English | [简体中文](README.zh_CN.md)

**This branch targets Minecraft 1.21.7 on Fabric.**

</div>

## Overview

Xaero's Minimap and Xaero's World Map each add entries to Minecraft's status effect registry. Fk Xaero's Registries cancels that registration before it happens, for modpacks and servers where the extra entries are unwanted.

The mod is a single mixin that targets Xaero's registration methods by class name, so it carries no compile-time dependency on either mod.

## Requirements

- Minecraft 1.21.7
- Fabric Loader 0.19.3 or later
- Fabric API 0.129.0+1.21.7
- Xaero's Minimap 25.2.10 or later
- Xaero's World Map 1.39.12 or later
- Java 21

Install this mod alongside both Xaero mods. It takes effect on the client, where Xaero's Minimap and World Map load.

## Supported versions

Each Minecraft version and mod loader has its own `releases/<minecraft>-<loader>` branch — there is no shared development branch. Pick the branch that matches your target.

| Minecraft | Fabric | NeoForge |
| --- | --- | --- |
| `1.21.1` | [`releases/1.21.1-fabric`](../../tree/releases/1.21.1-fabric) | [`releases/1.21.1-neoforge`](../../tree/releases/1.21.1-neoforge) |
| `1.21.2` | [`releases/1.21.2-fabric`](../../tree/releases/1.21.2-fabric) ² | [`releases/1.21.2-neoforge`](../../tree/releases/1.21.2-neoforge) ¹² |
| `1.21.3` | [`releases/1.21.3-fabric`](../../tree/releases/1.21.3-fabric) | [`releases/1.21.3-neoforge`](../../tree/releases/1.21.3-neoforge) |
| `1.21.4` | [`releases/1.21.4-fabric`](../../tree/releases/1.21.4-fabric) | [`releases/1.21.4-neoforge`](../../tree/releases/1.21.4-neoforge) |
| `1.21.5` | [`releases/1.21.5-fabric`](../../tree/releases/1.21.5-fabric) | [`releases/1.21.5-neoforge`](../../tree/releases/1.21.5-neoforge) |
| `1.21.6` | [`releases/1.21.6-fabric`](../../tree/releases/1.21.6-fabric) | [`releases/1.21.6-neoforge`](../../tree/releases/1.21.6-neoforge) ¹ |
| `1.21.7` | **[`releases/1.21.7-fabric`](../../tree/releases/1.21.7-fabric)** | [`releases/1.21.7-neoforge`](../../tree/releases/1.21.7-neoforge) ¹ |
| `1.21.8` | [`releases/1.21.8-fabric`](../../tree/releases/1.21.8-fabric) | [`releases/1.21.8-neoforge`](../../tree/releases/1.21.8-neoforge) |
| `1.21.9` | [`releases/1.21.9-fabric`](../../tree/releases/1.21.9-fabric) | [`releases/1.21.9-neoforge`](../../tree/releases/1.21.9-neoforge) ¹ |
| `1.21.10` | [`releases/1.21.10-fabric`](../../tree/releases/1.21.10-fabric) | [`releases/1.21.10-neoforge`](../../tree/releases/1.21.10-neoforge) |
| `1.21.11` | [`releases/1.21.11-fabric`](../../tree/releases/1.21.11-fabric) | [`releases/1.21.11-neoforge`](../../tree/releases/1.21.11-neoforge) |
| `26.1.2` | [`releases/26.1.2-fabric`](../../tree/releases/26.1.2-fabric) | [`releases/26.1.2-neoforge`](../../tree/releases/26.1.2-neoforge) |
| `26.2` | [`releases/26.2-fabric`](../../tree/releases/26.2-fabric) | [`releases/26.2-neoforge`](../../tree/releases/26.2-neoforge) |

¹ NeoForge only ever published beta builds for this Minecraft version.

² Xaero's Minimap and World Map have no build for this Minecraft version.

## Build

```shell
./gradlew build
```

Artifacts land in `build/libs/`. Jars are versioned `<mod version>+<minecraft>-<loader>` so that every branch can publish to the same Modrinth and CurseForge project.

## License

LGPL-3.0. See [LICENSE.txt](LICENSE.txt).
