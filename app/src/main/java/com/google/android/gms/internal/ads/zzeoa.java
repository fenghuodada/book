package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Debug;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeoa implements zzeqq {
    private final zzfwc zza;

    public zzeoa(zzfwc zzfwcVar) {
        this.zza = zzfwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzK)).booleanValue()) {
                    Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                    Debug.getMemoryInfo(memoryInfo);
                    bundle.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzt.zzo().zza());
                return new zzeob(bundle);
            }
        });
    }
}
