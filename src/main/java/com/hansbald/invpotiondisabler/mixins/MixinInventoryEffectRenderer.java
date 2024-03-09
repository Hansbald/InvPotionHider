package com.hansbald.invpotiondisabler.mixins;

import net.minecraft.client.renderer.InventoryEffectRenderer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InventoryEffectRenderer.class)
public abstract class MixinInventoryEffectRenderer {

    @Inject(method = "func_147044_g", at = @At("HEAD"), cancellable = true)
    private void injected(CallbackInfo ci) {
        ci.cancel();
    }

}
