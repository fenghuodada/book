package p060j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.h */
/* loaded from: classes2.dex */
public final class C10250h extends AbstractC10243a implements Serializable {

    /* renamed from: a */
    public static final C10250h f20596a = new C10250h();

    private C10250h() {
    }

    /* renamed from: a */
    public static boolean m1157a(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
