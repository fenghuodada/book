package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.exceptions.C10164a;
import io.reactivex.rxjava3.exceptions.C10169b;
import io.reactivex.rxjava3.internal.util.C10231a;
import io.reactivex.rxjava3.internal.util.C10233b;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: io.reactivex.rxjava3.disposables.a */
/* loaded from: classes3.dex */
public final class C10160a implements InterfaceC10161b, InterfaceC10162c {

    /* renamed from: a */
    public C10233b<InterfaceC10161b> f20424a;

    /* renamed from: b */
    public volatile boolean f20425b;

    /* renamed from: f */
    public static void m1217f(@Nullable C10233b c10233b) {
        Object[] objArr;
        if (c10233b == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c10233b.f20567d) {
            if (obj instanceof InterfaceC10161b) {
                try {
                    ((InterfaceC10161b) obj).mo49b();
                } catch (Throwable th) {
                    C10169b.m1213a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw C10231a.m1191a((Throwable) arrayList.get(0));
            }
            throw new C10164a(arrayList);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10162c
    /* renamed from: a */
    public final boolean mo1210a(@NonNull InterfaceC10161b interfaceC10161b) {
        if (mo1208e(interfaceC10161b)) {
            interfaceC10161b.mo49b();
            return true;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
        if (this.f20425b) {
            return;
        }
        synchronized (this) {
            if (this.f20425b) {
                return;
            }
            this.f20425b = true;
            C10233b<InterfaceC10161b> c10233b = this.f20424a;
            this.f20424a = null;
            m1217f(c10233b);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10162c
    /* renamed from: c */
    public final boolean mo1209c(@NonNull InterfaceC10161b interfaceC10161b) {
        Objects.requireNonNull(interfaceC10161b, "disposable is null");
        if (!this.f20425b) {
            synchronized (this) {
                if (!this.f20425b) {
                    C10233b<InterfaceC10161b> c10233b = this.f20424a;
                    if (c10233b == null) {
                        c10233b = new C10233b<>();
                        this.f20424a = c10233b;
                    }
                    c10233b.m1190a(interfaceC10161b);
                    return true;
                }
            }
        }
        interfaceC10161b.mo49b();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[Catch: all -> 0x004c, DONT_GENERATE, TryCatch #0 {, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0012, B:12:0x0016, B:26:0x0048, B:15:0x002c, B:23:0x0041, B:18:0x0033, B:21:0x003b, B:28:0x004a), top: B:33:0x000c }] */
    @Override // io.reactivex.rxjava3.disposables.InterfaceC10162c
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1208e(@io.reactivex.rxjava3.annotations.NonNull io.reactivex.rxjava3.disposables.InterfaceC10161b r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposable is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.f20425b
            r1 = 0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            monitor-enter(r7)
            boolean r0 = r7.f20425b     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L12
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4c
            return r1
        L12:
            io.reactivex.rxjava3.internal.util.b<io.reactivex.rxjava3.disposables.b> r0 = r7.f20424a     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            T[] r2 = r0.f20567d     // Catch: java.lang.Throwable -> L4c
            int r3 = r0.f20564a     // Catch: java.lang.Throwable -> L4c
            int r4 = r8.hashCode()     // Catch: java.lang.Throwable -> L4c
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4c
            r6 = 1
            if (r5 != 0) goto L2c
            goto L39
        L2c:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L33
            goto L41
        L33:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L3b
        L39:
            r8 = r1
            goto L45
        L3b:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L33
        L41:
            r0.m1189b(r4, r3, r2)     // Catch: java.lang.Throwable -> L4c
            r8 = r6
        L45:
            if (r8 != 0) goto L48
            goto L4a
        L48:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4c
            return r6
        L4a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4c
            return r1
        L4c:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.disposables.C10160a.mo1208e(io.reactivex.rxjava3.disposables.b):boolean");
    }
}
