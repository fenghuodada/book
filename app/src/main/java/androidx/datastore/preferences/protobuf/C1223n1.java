package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n1 */
/* loaded from: classes.dex */
public class C1223n1 extends RuntimeException {
    public /* synthetic */ C1223n1() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C1223n1(retrofit2.C11245e0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "response == null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            okhttp3.Response r3 = r3.f21996a
            int r1 = r3.code()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r3.message()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r3.code()
            r3.message()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1223n1.<init>(retrofit2.e0):void");
    }
}
