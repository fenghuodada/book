package p060j$.util.concurrent;

/* renamed from: j$.util.concurrent.y */
/* loaded from: classes2.dex */
final class C10363y extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new ThreadLocalRandom();
    }
}
