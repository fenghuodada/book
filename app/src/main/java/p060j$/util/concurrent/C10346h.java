package p060j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.h */
/* loaded from: classes2.dex */
public final class C10346h extends C10351m {

    /* renamed from: e */
    final C10351m[] f20795e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10346h(C10351m[] c10351mArr) {
        super(-1, null, null, null);
        this.f20795e = c10351mArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        if ((r0 instanceof p060j$.util.concurrent.C10346h) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
        r0 = ((p060j$.util.concurrent.C10346h) r0).f20795e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        return r0.mo957a(r5, r6);
     */
    @Override // p060j$.util.concurrent.C10351m
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p060j$.util.concurrent.C10351m mo957a(java.lang.Object r5, int r6) {
        /*
            r4 = this;
            j$.util.concurrent.m[] r0 = r4.f20795e
        L2:
            r1 = 0
            if (r5 == 0) goto L39
            if (r0 == 0) goto L39
            int r2 = r0.length
            if (r2 == 0) goto L39
            int r2 = r2 + (-1)
            r2 = r2 & r6
            j$.util.concurrent.m r0 = p060j$.util.concurrent.ConcurrentHashMap.m983m(r0, r2)
            if (r0 != 0) goto L14
            goto L39
        L14:
            int r2 = r0.f20802a
            if (r2 != r6) goto L25
            java.lang.Object r3 = r0.f20803b
            if (r3 == r5) goto L24
            if (r3 == 0) goto L25
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L25
        L24:
            return r0
        L25:
            if (r2 >= 0) goto L35
            boolean r1 = r0 instanceof p060j$.util.concurrent.C10346h
            if (r1 == 0) goto L30
            j$.util.concurrent.h r0 = (p060j$.util.concurrent.C10346h) r0
            j$.util.concurrent.m[] r0 = r0.f20795e
            goto L2
        L30:
            j$.util.concurrent.m r5 = r0.mo957a(r5, r6)
            return r5
        L35:
            j$.util.concurrent.m r0 = r0.f20805d
            if (r0 != 0) goto L14
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.concurrent.C10346h.mo957a(java.lang.Object, int):j$.util.concurrent.m");
    }
}
