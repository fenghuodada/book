package kotlin.ranges;

import java.util.Iterator;
import kotlin.jvm.internal.markers.InterfaceC10847a;

/* renamed from: kotlin.ranges.d */
/* loaded from: classes3.dex */
public class C10879d implements Iterable<Long>, InterfaceC10847a {

    /* renamed from: a */
    public final long f21430a;

    /* renamed from: b */
    public final long f21431b;

    /* renamed from: c */
    public final long f21432c;

    public C10879d(long j, long j2) {
        this.f21430a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.f21431b = j2;
        this.f21432c = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new C10880e(this.f21430a, this.f21431b, this.f21432c);
    }
}
