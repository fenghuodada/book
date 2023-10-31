package p060j$.time.format;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.f */
/* loaded from: classes2.dex */
public final class C10259f implements InterfaceC10260g {

    /* renamed from: a */
    private final InterfaceC10260g[] f20617a;

    /* renamed from: b */
    private final boolean f20618b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10259f(ArrayList arrayList, boolean z) {
        this((InterfaceC10260g[]) arrayList.toArray(new InterfaceC10260g[arrayList.size()]), z);
    }

    C10259f(InterfaceC10260g[] interfaceC10260gArr, boolean z) {
        this.f20617a = interfaceC10260gArr;
        this.f20618b = z;
    }

    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.f20618b;
        if (z) {
            c10271r.m1106g();
        }
        try {
            for (InterfaceC10260g interfaceC10260g : this.f20617a) {
                if (!interfaceC10260g.mo1132a(c10271r, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                c10271r.m1112a();
            }
            return true;
        } finally {
            if (z) {
                c10271r.m1112a();
            }
        }
    }

    /* renamed from: b */
    public final C10259f m1136b() {
        return !this.f20618b ? this : new C10259f(this.f20617a, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC10260g[] interfaceC10260gArr = this.f20617a;
        if (interfaceC10260gArr != null) {
            boolean z = this.f20618b;
            sb.append(z ? "[" : "(");
            for (InterfaceC10260g interfaceC10260g : interfaceC10260gArr) {
                sb.append(interfaceC10260g);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
