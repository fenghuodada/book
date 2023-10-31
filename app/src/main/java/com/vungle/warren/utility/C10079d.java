package com.vungle.warren.utility;

import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: com.vungle.warren.utility.d */
/* loaded from: classes3.dex */
public final class C10079d {

    /* renamed from: a */
    public static volatile C10111y f20304a;

    /* renamed from: com.vungle.warren.utility.d$a */
    /* loaded from: classes3.dex */
    public static class C10080a {

        /* renamed from: a */
        public final AsyncTaskC10082c f20305a;

        public C10080a(@NonNull AsyncTaskC10082c asyncTaskC10082c) {
            this.f20305a = asyncTaskC10082c;
        }
    }

    /* renamed from: com.vungle.warren.utility.d$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10081b {
        /* renamed from: a */
        void mo1276a(boolean z);
    }

    /* renamed from: com.vungle.warren.utility.d$c */
    /* loaded from: classes3.dex */
    public static class AsyncTaskC10082c extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: c */
        public static final /* synthetic */ int f20306c = 0;

        /* renamed from: a */
        public final File f20307a;

        /* renamed from: b */
        public InterfaceC10081b f20308b;

        public AsyncTaskC10082c(@Nullable File file, @NonNull InterfaceC10081b interfaceC10081b) {
            this.f20307a = file;
            this.f20308b = interfaceC10081b;
        }

        @Override // android.os.AsyncTask
        public final Boolean doInBackground(Void[] voidArr) {
            boolean z;
            File file = this.f20307a;
            if (file != null && file.exists()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            super.onPostExecute(bool2);
            synchronized (this) {
                InterfaceC10081b interfaceC10081b = this.f20308b;
                if (interfaceC10081b != null) {
                    interfaceC10081b.mo1276a(bool2.booleanValue());
                }
            }
        }
    }

    static {
        new C10103s();
        f20304a = C10103s.f20347g;
    }
}
