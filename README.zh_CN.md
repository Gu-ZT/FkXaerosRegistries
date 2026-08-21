<div align="center">

<img src="docs/icon.png" width="256" height="256" alt="Fk Xaero's Registries 图标">

# Fk Xaero's Registries

**一个 Fabric 兼容性模组，用于阻止 Xaero 的小地图和世界地图注册状态效果。**

[English](README.md) | 简体中文

</div>

## 概述

Fk Xaero's Registries 会在 Xaero 的小地图和 Xaero 的世界地图向 Minecraft 原版状态效果注册表写入条目前，取消其状态效果注册操作。它适用于这些注册与其他内容发生冲突的整合包或服务器环境。

## 环境要求

- Minecraft 26.2
- Fabric Loader 0.19.3 或更高版本
- Fabric API 0.158.0+26.2
- Xaero's Minimap 26.4.2 或更高版本
- Xaero's World Map 1.44.2 或更高版本
- Java 25

请将本模组与两个 Xaero 依赖一同安装。该模组在 Xaero 的小地图和世界地图加载所在的客户端生效。

## 构建

```shell
./gradlew build
```

构建产物位于 `build/libs/`。

## 许可证

代码以 LGPL-3.0 许可证发布，详见 [LICENSE.txt](LICENSE.txt)。
