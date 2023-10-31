package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
final class zzyk {
    private static Constructor zza;
    private static Method zzb;
    private static Method zzc;
    private static Constructor zzd;
    private static Method zze;

    public static zzae zza(float f) throws Exception {
        zzc();
        Object newInstance = zza.newInstance(new Object[0]);
        zzb.invoke(newInstance, Float.valueOf(f));
        Object invoke = zzc.invoke(newInstance, new Object[0]);
        invoke.getClass();
        return (zzae) invoke;
    }

    public static zzdk zzb() throws Exception {
        zzc();
        Object invoke = zze.invoke(zzd.newInstance(new Object[0]), new Object[0]);
        invoke.getClass();
        return (zzdk) invoke;
    }

    @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
    private static void zzc() throws Exception {
        if (zza == null || zzb == null || zzc == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            zza = cls.getConstructor(new Class[0]);
            zzb = cls.getMethod("setRotationDegrees", Float.TYPE);
            zzc = cls.getMethod("build", new Class[0]);
        }
        if (zzd == null || zze == null) {
            Class<?> cls2 = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            zzd = cls2.getConstructor(new Class[0]);
            zze = cls2.getMethod("build", new Class[0]);
        }
    }
}
