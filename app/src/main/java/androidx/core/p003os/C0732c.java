package androidx.core.p003os;

import androidx.annotation.Nullable;

/* renamed from: androidx.core.os.c */
/* loaded from: classes.dex */
public final class C0732c {

    /* renamed from: a */
    public boolean f2421a;

    /* renamed from: b */
    public InterfaceC0733a f2422b;

    /* renamed from: c */
    public boolean f2423c;

    /* renamed from: androidx.core.os.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0733a {
        void onCancel();
    }

    /* renamed from: a */
    public final void m11862a(@Nullable InterfaceC0733a interfaceC0733a) {
        synchronized (this) {
            while (this.f2423c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f2422b == interfaceC0733a) {
                return;
            }
            this.f2422b = interfaceC0733a;
            if (this.f2421a) {
                interfaceC0733a.onCancel();
            }
        }
    }
}
