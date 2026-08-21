<div align="center">

<img src="docs/icon.png" width="256" height="256" alt="Fk Xaero's Registries 图标">

# Fk Xaero's Registries

**一个阻止 Xaero 的小地图和世界地图注册状态效果的 Fabric 模组。**

[English](README.md) | 简体中文

**本分支面向 Fabric 平台的 Minecraft 1.21.6。**

</div>

## 概述

Xaero 的小地图和 Xaero 的世界地图都会向 Minecraft 的状态效果注册表中添加条目。Fk Xaero's Registries 会在注册发生前将其取消，适用于不需要这些额外条目的整合包与服务器。

本模组只有一个 mixin，通过类名定位 Xaero 的注册方法，因此不依赖这两个模组进行编译。

## 环境要求

- Minecraft 1.21.6
- Fabric Loader 0.19.3 或更高版本
- Fabric API 0.128.2+1.21.6
- Xaero's Minimap 25.2.7 或更高版本
- Xaero's World Map 1.39.10 或更高版本
- Java 21

请将本模组与两个 Xaero 模组一同安装。它在 Xaero 的小地图和世界地图加载所在的客户端生效。

## 支持的版本

每个 Minecraft 版本与模组加载器都有各自的 `releases/<游戏版本>-<加载器>` 分支，本仓库没有统一的开发分支。请选择与目标环境匹配的分支。

| Minecraft | Fabric | NeoForge |
| --- | --- | --- |
| `1.21.1` | [`releases/1.21.1-fabric`](../../tree/releases/1.21.1-fabric) | [`releases/1.21.1-neoforge`](../../tree/releases/1.21.1-neoforge) |
| `1.21.2` | [`releases/1.21.2-fabric`](../../tree/releases/1.21.2-fabric) ² | [`releases/1.21.2-neoforge`](../../tree/releases/1.21.2-neoforge) ¹² |
| `1.21.3` | [`releases/1.21.3-fabric`](../../tree/releases/1.21.3-fabric) | [`releases/1.21.3-neoforge`](../../tree/releases/1.21.3-neoforge) |
| `1.21.4` | [`releases/1.21.4-fabric`](../../tree/releases/1.21.4-fabric) | [`releases/1.21.4-neoforge`](../../tree/releases/1.21.4-neoforge) |
| `1.21.5` | [`releases/1.21.5-fabric`](../../tree/releases/1.21.5-fabric) | [`releases/1.21.5-neoforge`](../../tree/releases/1.21.5-neoforge) |
| `1.21.6` | **[`releases/1.21.6-fabric`](../../tree/releases/1.21.6-fabric)** | [`releases/1.21.6-neoforge`](../../tree/releases/1.21.6-neoforge) ¹ |
| `1.21.7` | [`releases/1.21.7-fabric`](../../tree/releases/1.21.7-fabric) | [`releases/1.21.7-neoforge`](../../tree/releases/1.21.7-neoforge) ¹ |
| `1.21.8` | [`releases/1.21.8-fabric`](../../tree/releases/1.21.8-fabric) | [`releases/1.21.8-neoforge`](../../tree/releases/1.21.8-neoforge) |
| `1.21.9` | [`releases/1.21.9-fabric`](../../tree/releases/1.21.9-fabric) | [`releases/1.21.9-neoforge`](../../tree/releases/1.21.9-neoforge) ¹ |
| `1.21.10` | [`releases/1.21.10-fabric`](../../tree/releases/1.21.10-fabric) | [`releases/1.21.10-neoforge`](../../tree/releases/1.21.10-neoforge) |
| `1.21.11` | [`releases/1.21.11-fabric`](../../tree/releases/1.21.11-fabric) | [`releases/1.21.11-neoforge`](../../tree/releases/1.21.11-neoforge) |
| `26.1.2` | [`releases/26.1.2-fabric`](../../tree/releases/26.1.2-fabric) | [`releases/26.1.2-neoforge`](../../tree/releases/26.1.2-neoforge) |
| `26.2` | [`releases/26.2-fabric`](../../tree/releases/26.2-fabric) | [`releases/26.2-neoforge`](../../tree/releases/26.2-neoforge) |

¹ NeoForge 对该 Minecraft 版本仅发布过 beta 版本。

² Xaero 的小地图与世界地图没有该 Minecraft 版本的构建。

## 构建

```shell
./gradlew build
```

构建产物位于 `build/libs/`。产物版本号形如 `<模组版本>+<游戏版本>-<加载器>`，以便所有分支都能发布到同一个 Modrinth 与 CurseForge 项目。

## 许可证

LGPL-3.0，详见 [LICENSE.txt](LICENSE.txt)。
