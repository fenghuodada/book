package p060j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.e */
/* loaded from: classes2.dex */
public final class C10258e implements InterfaceC10260g {

    /* renamed from: a */
    private final char f20616a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10258e(char c) {
        this.f20616a = c;
    }

    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        sb.append(this.f20616a);
        return true;
    }

    public final String toString() {
        char c = this.f20616a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
