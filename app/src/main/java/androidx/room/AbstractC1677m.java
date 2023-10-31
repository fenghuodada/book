package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p004db.framework.C1707a;
import androidx.sqlite.p004db.framework.C1714e;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.m */
/* loaded from: classes.dex */
public abstract class AbstractC1677m {

    /* renamed from: a */
    public final AtomicBoolean f4088a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AbstractC1668i f4089b;

    /* renamed from: c */
    public volatile C1714e f4090c;

    public AbstractC1677m(AbstractC1668i abstractC1668i) {
        this.f4089b = abstractC1668i;
    }

    /* renamed from: a */
    public final C1714e m10062a() {
        this.f4089b.m10076a();
        if (this.f4088a.compareAndSet(false, true)) {
            if (this.f4090c == null) {
                String mo9786b = mo9786b();
                AbstractC1668i abstractC1668i = this.f4089b;
                abstractC1668i.m10076a();
                abstractC1668i.m10075b();
                this.f4090c = new C1714e(((C1707a) abstractC1668i.f4052c.mo10024r()).f4156a.compileStatement(mo9786b));
            }
            return this.f4090c;
        }
        String mo9786b2 = mo9786b();
        AbstractC1668i abstractC1668i2 = this.f4089b;
        abstractC1668i2.m10076a();
        abstractC1668i2.m10075b();
        return new C1714e(((C1707a) abstractC1668i2.f4052c.mo10024r()).f4156a.compileStatement(mo9786b2));
    }

    /* renamed from: b */
    public abstract String mo9786b();

    /* renamed from: c */
    public final void m10061c(C1714e c1714e) {
        if (c1714e == this.f4090c) {
            this.f4088a.set(false);
        }
    }
}
