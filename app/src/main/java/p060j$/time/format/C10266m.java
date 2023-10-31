package p060j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.m */
/* loaded from: classes2.dex */
public final class C10266m implements InterfaceC10260g {

    /* renamed from: a */
    private final String f20634a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10266m(String str) {
        this.f20634a = str;
    }

    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        sb.append(this.f20634a);
        return true;
    }

    public final String toString() {
        String replace = this.f20634a.replace("'", "''");
        return "'" + replace + "'";
    }
}
