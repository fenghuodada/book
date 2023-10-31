package p060j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.l */
/* loaded from: classes2.dex */
public enum EnumC10265l implements InterfaceC10260g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "ParseStrict(false)";
                    }
                    throw new IllegalStateException("Unreachable");
                }
                return "ParseStrict(true)";
            }
            return "ParseCaseSensitive(false)";
        }
        return "ParseCaseSensitive(true)";
    }
}
