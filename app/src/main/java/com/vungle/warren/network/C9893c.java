package com.vungle.warren.network;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* renamed from: com.vungle.warren.network.c */
/* loaded from: classes3.dex */
public final class C9893c implements Callback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9892b f19871a;

    /* renamed from: b */
    public final /* synthetic */ C9897d f19872b;

    public C9893c(C9897d c9897d, InterfaceC9892b interfaceC9892b) {
        this.f19872b = c9897d;
        this.f19871a = interfaceC9892b;
    }

    @Override // okhttp3.Callback
    public final void onFailure(@NonNull Call call, @NonNull IOException iOException) {
        try {
            this.f19871a.mo1434b(iOException);
        } catch (Throwable th) {
            int i = C9897d.f19874c;
            Log.w("d", "Error on executing callback", th);
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(@NonNull Call call, @NonNull Response response) {
        InterfaceC9892b interfaceC9892b = this.f19871a;
        try {
            try {
                interfaceC9892b.mo1435a(C9897d.m1431b(response, this.f19872b.f19875a));
            } catch (Throwable th) {
                int i = C9897d.f19874c;
                Log.w("d", "Error on excuting callback", th);
            }
        } catch (Throwable th2) {
            try {
                interfaceC9892b.mo1434b(th2);
            } catch (Throwable th3) {
                int i2 = C9897d.f19874c;
                Log.w("d", "Error on executing callback", th3);
            }
        }
    }
}
