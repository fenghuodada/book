package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.fragment.app.C1431t;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzh {
    private final Executor zza;

    public zzh(Executor executor) {
        this.zza = executor;
    }

    @AnyThread
    public final Executor zza() {
        return this.zza;
    }

    @AnyThread
    public final void zzb(@Nullable final String str, @Nullable final String str2, final zzg... zzgVarArr) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zze
            @Override // java.lang.Runnable
            public final void run() {
                String sb;
                final JSONObject jSONObject;
                String m10577a;
                Throwable e;
                String str3 = str;
                String str4 = str2;
                zzg[] zzgVarArr2 = zzgVarArr;
                if (TextUtils.isEmpty(str3)) {
                    sb = "Error on action: empty action name";
                } else {
                    final String lowerCase = str3.toLowerCase();
                    if (TextUtils.isEmpty(str4)) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(str4);
                        } catch (JSONException unused) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str4).length());
                            sb2.append("Action[");
                            sb2.append(lowerCase);
                            sb2.append("]: failed to parse args: ");
                            sb2.append(str4);
                            sb = sb2.toString();
                        }
                    }
                    String valueOf = String.valueOf(jSONObject);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + 10 + valueOf.length());
                    sb3.append("Action[");
                    sb3.append(lowerCase);
                    sb3.append("]: ");
                    sb3.append(valueOf);
                    Log.d("UserMessagingPlatform", sb3.toString());
                    for (final zzg zzgVar : zzgVarArr2) {
                        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(zzg.this.zzb(lowerCase, jSONObject));
                            }
                        });
                        zzgVar.zza().execute(futureTask);
                        try {
                        } catch (InterruptedException e2) {
                            e = e2;
                            m10577a = C1431t.m10577a(new StringBuilder(String.valueOf(lowerCase).length() + 33), "Thread interrupted for Action[", lowerCase, "]: ");
                            Log.d("UserMessagingPlatform", m10577a, e);
                        } catch (ExecutionException e3) {
                            m10577a = C1431t.m10577a(new StringBuilder(String.valueOf(lowerCase).length() + 24), "Failed to run Action[", lowerCase, "]: ");
                            e = e3.getCause();
                            Log.d("UserMessagingPlatform", m10577a, e);
                        }
                        if (((Boolean) futureTask.get()).booleanValue()) {
                            return;
                        }
                    }
                    return;
                }
                Log.d("UserMessagingPlatform", sb);
            }
        });
    }
}
