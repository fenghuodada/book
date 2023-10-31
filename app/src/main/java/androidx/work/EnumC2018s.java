package androidx.work;

/* renamed from: androidx.work.s */
/* loaded from: classes.dex */
public enum EnumC2018s {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* renamed from: a */
    public final boolean m9727a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
