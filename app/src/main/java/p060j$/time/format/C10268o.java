package p060j$.time.format;

import p060j$.time.AbstractC10282l;
import p060j$.time.temporal.InterfaceC10299n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.o */
/* loaded from: classes2.dex */
public final class C10268o implements InterfaceC10260g {

    /* renamed from: a */
    private final InterfaceC10299n f20639a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10268o(C10254a c10254a) {
        this.f20639a = c10254a;
    }

    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        AbstractC10282l abstractC10282l = (AbstractC10282l) c10271r.m1107f(this.f20639a);
        if (abstractC10282l == null) {
            return false;
        }
        sb.append(abstractC10282l.mo1094f());
        return true;
    }

    public final String toString() {
        return "ZoneRegionId()";
    }
}
