package androidx.work;

/* renamed from: androidx.work.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1828a {
    /* renamed from: a */
    public static final String m9909a(int i) {
        return m9908b(i).toLowerCase();
    }

    /* renamed from: b */
    public static /* synthetic */ String m9908b(int i) {
        if (i == 1) {
            return "PLACEMENT_ID";
        }
        if (i == 2) {
            return "TIMESTAMP";
        }
        if (i == 3) {
            return "SUCCESS";
        }
        if (i == 4) {
            return "EVENT_ID";
        }
        if (i == 5) {
            return "ORIENTATION";
        }
        if (i == 6) {
            return "VIDEO_CACHED";
        }
        if (i == 7) {
            return "USED";
        }
        if (i == 8) {
            return "URL";
        }
        if (i == 9) {
            return "MUTED";
        }
        if (i == 10) {
            return "ENABLED";
        }
        if (i == 11) {
            return "REASON";
        }
        throw null;
    }

    /* renamed from: c */
    public static /* synthetic */ String m9907c(int i) {
        return i == 1 ? "EXPONENTIAL" : i == 2 ? "LINEAR" : "null";
    }
}
