package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.o */
/* loaded from: classes3.dex */
public final class C7844o {

    /* renamed from: e */
    public static C7844o f15388e;
    @NonNull

    /* renamed from: a */
    public final Object f15389a = new Object();
    @NonNull

    /* renamed from: b */
    public final Handler f15390b = new Handler(Looper.getMainLooper(), new C7845a());
    @Nullable

    /* renamed from: c */
    public C7847c f15391c;
    @Nullable

    /* renamed from: d */
    public C7847c f15392d;

    /* renamed from: com.google.android.material.snackbar.o$a */
    /* loaded from: classes3.dex */
    public class C7845a implements Handler.Callback {
        public C7845a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            C7844o c7844o = C7844o.this;
            C7847c c7847c = (C7847c) message.obj;
            synchronized (c7844o.f15389a) {
                if (c7844o.f15391c == c7847c || c7844o.f15392d == c7847c) {
                    c7844o.m4414a(c7847c, 2);
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.o$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7846b {
        /* renamed from: a */
        void mo4408a(int i);

        void show();
    }

    /* renamed from: com.google.android.material.snackbar.o$c */
    /* loaded from: classes3.dex */
    public static class C7847c {
        @NonNull

        /* renamed from: a */
        public final WeakReference<InterfaceC7846b> f15394a;

        /* renamed from: b */
        public int f15395b;

        /* renamed from: c */
        public boolean f15396c;

        public C7847c(int i, BaseTransientBottomBar.C7826c c7826c) {
            this.f15394a = new WeakReference<>(c7826c);
            this.f15395b = i;
        }
    }

    /* renamed from: b */
    public static C7844o m4413b() {
        if (f15388e == null) {
            f15388e = new C7844o();
        }
        return f15388e;
    }

    /* renamed from: a */
    public final boolean m4414a(@NonNull C7847c c7847c, int i) {
        InterfaceC7846b interfaceC7846b = c7847c.f15394a.get();
        if (interfaceC7846b != null) {
            this.f15390b.removeCallbacksAndMessages(c7847c);
            interfaceC7846b.mo4408a(i);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m4412c(BaseTransientBottomBar.C7826c c7826c) {
        boolean z;
        C7847c c7847c = this.f15391c;
        if (c7847c == null) {
            return false;
        }
        if (c7826c != null && c7847c.f15394a.get() == c7826c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void m4411d(BaseTransientBottomBar.C7826c c7826c) {
        synchronized (this.f15389a) {
            if (m4412c(c7826c)) {
                C7847c c7847c = this.f15391c;
                if (!c7847c.f15396c) {
                    c7847c.f15396c = true;
                    this.f15390b.removeCallbacksAndMessages(c7847c);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m4410e(BaseTransientBottomBar.C7826c c7826c) {
        synchronized (this.f15389a) {
            if (m4412c(c7826c)) {
                C7847c c7847c = this.f15391c;
                if (c7847c.f15396c) {
                    c7847c.f15396c = false;
                    m4409f(c7847c);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m4409f(@NonNull C7847c c7847c) {
        int i = c7847c.f15395b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        Handler handler = this.f15390b;
        handler.removeCallbacksAndMessages(c7847c);
        handler.sendMessageDelayed(Message.obtain(handler, 0, c7847c), i);
    }
}
