package p060j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.s */
/* loaded from: classes2.dex */
public final class C10357s extends C10351m {

    /* renamed from: e */
    C10357s f20823e;

    /* renamed from: f */
    C10357s f20824f;

    /* renamed from: g */
    C10357s f20825g;

    /* renamed from: h */
    C10357s f20826h;

    /* renamed from: i */
    boolean f20827i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10357s(int i, Object obj, Object obj2, C10357s c10357s, C10357s c10357s2) {
        super(i, obj, obj2, c10357s);
        this.f20823e = c10357s2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.concurrent.C10351m
    /* renamed from: a */
    public final C10351m mo957a(Object obj, int i) {
        return m956b(i, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C10357s m956b(int i, Object obj, Class cls) {
        int m992d;
        if (obj != null) {
            C10357s c10357s = this;
            do {
                C10357s c10357s2 = c10357s.f20824f;
                C10357s c10357s3 = c10357s.f20825g;
                int i2 = c10357s.f20802a;
                if (i2 <= i) {
                    if (i2 >= i) {
                        Object obj2 = c10357s.f20803b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return c10357s;
                        }
                        if (c10357s2 != null) {
                            if (c10357s3 != null) {
                                if ((cls == null && (cls = ConcurrentHashMap.m993c(obj)) == null) || (m992d = ConcurrentHashMap.m992d(cls, obj, obj2)) == 0) {
                                    C10357s m956b = c10357s3.m956b(i, obj, cls);
                                    if (m956b != null) {
                                        return m956b;
                                    }
                                } else if (m992d >= 0) {
                                    c10357s2 = c10357s3;
                                }
                            }
                        }
                    }
                    c10357s = c10357s3;
                    continue;
                }
                c10357s = c10357s2;
                continue;
            } while (c10357s != null);
            return null;
        }
        return null;
    }
}
