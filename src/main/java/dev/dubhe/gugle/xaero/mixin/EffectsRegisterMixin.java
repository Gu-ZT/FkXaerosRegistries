package dev.dubhe.gugle.xaero.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * 阻止 Xaero 的小地图和世界地图向原版状态效果注册表写入条目。
 */
@Mixin(targets = {
    "xaero.common.effect.EffectsRegister",
    "xaero.map.effects.EffectsRegister"
})
public class EffectsRegisterMixin {

    @Inject(method = "registerEffects", at = @At("HEAD"), cancellable = true)
    private void fkXaerosRegistries$preventEffectRegistration(CallbackInfo callbackInfo) {
        callbackInfo.cancel();
    }
}
