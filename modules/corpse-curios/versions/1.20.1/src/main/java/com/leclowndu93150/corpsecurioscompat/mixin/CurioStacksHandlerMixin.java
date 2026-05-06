package com.leclowndu93150.corpsecurioscompat.mixin;

import com.leclowndu93150.corpsecurioscompat.duck.ICuriosAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import top.theillusivec4.curios.compat.WrappedCurioStackHandler;

@Mixin(value = WrappedCurioStackHandler.class, remap = false)
public abstract class CurioStacksHandlerMixin implements ICuriosAccessor {

    
    @Shadow
    public abstract void update();

    @Override
    public void corpsecurioscompat$forceSlotRebuild() {
        this.update();
    }
}