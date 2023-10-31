package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfit {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfit(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfit zza(@NonNull final Context context, @NonNull Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(z ? new Runnable() { // from class: com.google.android.gms.internal.ads.zzfip
            @Override // java.lang.Runnable
            public final void run() {
                taskCompletionSource.setResult(zzfkv.zzb(context, "GLAS", null));
            }
        } : new Runnable() { // from class: com.google.android.gms.internal.ads.zzfiq
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.setResult(zzfkv.zzc());
            }
        });
        return new zzfit(context, executor, taskCompletionSource.getTask(), z);
    }

    public static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (this.zze) {
            final zzana zza2 = zzane.zza();
            zza2.zza(this.zzb.getPackageName());
            zza2.zze(j);
            zza2.zzg(zzf);
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            if (str2 != null) {
                zza2.zzb(str2);
            }
            if (str != null) {
                zza2.zzc(str);
            }
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfis
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    zzana zzanaVar = zzana.this;
                    int i2 = i;
                    int i3 = zzfit.zza;
                    if (task.isSuccessful()) {
                        zzfku zza3 = ((zzfkv) task.getResult()).zza(((zzane) zzanaVar.zzal()).zzax());
                        zza3.zza(i2);
                        zza3.zzc();
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
            });
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfir
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return Boolean.valueOf(task.isSuccessful());
            }
        });
    }

    public final Task zzb(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public final Task zze(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }
}
