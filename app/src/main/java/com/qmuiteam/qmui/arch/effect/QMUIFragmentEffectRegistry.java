package com.qmuiteam.qmui.arch.effect;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC1460f0;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1479k;
import androidx.lifecycle.InterfaceC1483m;
import com.qmuiteam.qmui.arch.AbstractC9008b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class QMUIFragmentEffectRegistry extends AbstractC1460f0 {

    /* renamed from: a */
    public final AtomicInteger f17237a = new AtomicInteger(0);

    /* renamed from: b */
    public final transient HashMap f17238b = new HashMap();

    /* loaded from: classes3.dex */
    public static class EffectHandlerWrapper<T> implements InterfaceC1479k {

        /* renamed from: a */
        public final AbstractC1464h f17241a;

        public EffectHandlerWrapper(AbstractC9008b.C9011c c9011c, AbstractC1464h abstractC1464h) {
            this.f17241a = abstractC1464h;
            abstractC1464h.mo10539a(this);
            Class<AbstractC9008b.C9011c> cls = AbstractC9008b.C9011c.class;
            while (cls != null) {
                try {
                    if (cls.getSuperclass() == AbstractC9021a.class) {
                        break;
                    }
                    cls = cls.getSuperclass();
                } catch (Throwable unused) {
                    return;
                }
            }
            if (cls != null) {
                Type genericSuperclass = cls.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    if (actualTypeArguments.length > 0) {
                        Class cls2 = (Class) actualTypeArguments[0];
                    }
                }
            }
        }

        @Override // androidx.lifecycle.InterfaceC1479k
        public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
            if (enumC1465a != AbstractC1464h.EnumC1465a.ON_START && enumC1465a == AbstractC1464h.EnumC1465a.ON_DESTROY) {
                this.f17241a.mo10537c(this);
            }
        }
    }

    public QMUIFragmentEffectRegistry() {
        new HashMap();
    }

    /* renamed from: a */
    public final C9022b m2800a(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC9008b.C9011c c9011c) {
        final int andIncrement = this.f17237a.getAndIncrement();
        AbstractC1464h lifecycle = interfaceC1483m.getLifecycle();
        this.f17238b.put(Integer.valueOf(andIncrement), new EffectHandlerWrapper(c9011c, lifecycle));
        lifecycle.mo10539a(new InterfaceC1479k() { // from class: com.qmuiteam.qmui.arch.effect.QMUIFragmentEffectRegistry.1
            @Override // androidx.lifecycle.InterfaceC1479k
            public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m2, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
                EffectHandlerWrapper effectHandlerWrapper;
                if (AbstractC1464h.EnumC1465a.ON_DESTROY.equals(enumC1465a) && (effectHandlerWrapper = (EffectHandlerWrapper) QMUIFragmentEffectRegistry.this.f17238b.remove(Integer.valueOf(andIncrement))) != null) {
                    effectHandlerWrapper.f17241a.mo10537c(effectHandlerWrapper);
                }
            }
        });
        return new C9022b();
    }

    @Override // androidx.lifecycle.AbstractC1460f0
    public final void onCleared() {
        super.onCleared();
        HashMap hashMap = this.f17238b;
        for (Integer num : hashMap.keySet()) {
            EffectHandlerWrapper effectHandlerWrapper = (EffectHandlerWrapper) hashMap.get(num);
            if (effectHandlerWrapper != null) {
                effectHandlerWrapper.f17241a.mo10537c(effectHandlerWrapper);
            }
        }
        hashMap.clear();
    }
}
