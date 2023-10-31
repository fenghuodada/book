package androidx.room;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p004db.InterfaceC1701b;
import androidx.sqlite.p004db.InterfaceC1702c;
import java.io.File;
import java.io.IOException;

/* renamed from: androidx.room.l */
/* loaded from: classes.dex */
public final class C1676l implements InterfaceC1702c {
    @Nullable

    /* renamed from: a */
    public C1656a f4086a;

    /* renamed from: b */
    public boolean f4087b;

    /* renamed from: a */
    public final void m10064a(File file) throws IOException {
        throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
    }

    /* renamed from: c */
    public final void m10063c() {
        getDatabaseName();
        throw null;
    }

    @Override // androidx.sqlite.p004db.InterfaceC1702c, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // androidx.sqlite.p004db.InterfaceC1702c
    public final String getDatabaseName() {
        throw null;
    }

    @Override // androidx.sqlite.p004db.InterfaceC1702c
    /* renamed from: r */
    public final synchronized InterfaceC1701b mo10024r() {
        if (!this.f4087b) {
            m10063c();
            this.f4087b = true;
        }
        throw null;
    }

    @Override // androidx.sqlite.p004db.InterfaceC1702c
    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }
}
