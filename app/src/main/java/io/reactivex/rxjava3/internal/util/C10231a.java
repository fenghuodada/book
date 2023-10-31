package io.reactivex.rxjava3.internal.util;

/* renamed from: io.reactivex.rxjava3.internal.util.a */
/* loaded from: classes3.dex */
public final class C10231a {

    /* renamed from: a */
    public static final /* synthetic */ int f20563a = 0;

    /* renamed from: io.reactivex.rxjava3.internal.util.a$a */
    /* loaded from: classes3.dex */
    public static final class C10232a extends Throwable {
        public C10232a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    static {
        new C10232a();
    }

    /* renamed from: a */
    public static RuntimeException m1191a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
