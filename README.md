<div align="center">

<img src="docs/icon.png" width="256" height="256" alt="Fk Xaero's Registries icon">

# Fk Xaero's Registries

**A Fabric compatibility mod that prevents Xaero's Minimap and World Map from registering status effects.**

English | [简体中文](README.zh_CN.md)

</div>

## Overview

Fk Xaero's Registries cancels Xaero's Minimap and Xaero's World Map status-effect registration before either mod writes entries to Minecraft's vanilla status-effect registry. It is intended for modpacks or server environments where those registrations conflict with other content.

## Requirements

- Minecraft 26.2
- Fabric Loader 0.19.3 or later
- Fabric API 0.158.0+26.2
- Xaero's Minimap 26.4.2 or later
- Xaero's World Map 1.44.2 or later
- Java 25

Install this mod alongside both Xaero dependencies. It applies on the client, where Xaero's Minimap and World Map load.

## Build

```shell
./gradlew build
```

Build artifacts are written to `build/libs/`.

## License

The code is licensed under LGPL-3.0. See [LICENSE.txt](LICENSE.txt) for details.
