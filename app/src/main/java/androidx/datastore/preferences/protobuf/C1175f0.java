package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f0 */
/* loaded from: classes.dex */
public class C1175f0 {

    /* renamed from: a */
    public volatile InterfaceC1240s0 f2972a;

    /* renamed from: b */
    public volatile AbstractC1183i f2973b;

    static {
        C1233r.m10842a();
    }

    /* renamed from: a */
    public final InterfaceC1240s0 m11125a(InterfaceC1240s0 interfaceC1240s0) {
        if (this.f2972a == null) {
            synchronized (this) {
                if (this.f2972a == null) {
                    try {
                        this.f2972a = interfaceC1240s0;
                        this.f2973b = AbstractC1183i.f2982b;
                    } catch (C1163c0 unused) {
                        this.f2972a = interfaceC1240s0;
                        this.f2973b = AbstractC1183i.f2982b;
                    }
                }
            }
        }
        return this.f2972a;
    }

    /* renamed from: b */
    public final AbstractC1183i m11124b() {
        if (this.f2973b != null) {
            return this.f2973b;
        }
        synchronized (this) {
            if (this.f2973b != null) {
                return this.f2973b;
            }
            this.f2973b = this.f2972a == null ? AbstractC1183i.f2982b : this.f2972a.mo10837b();
            return this.f2973b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1175f0) {
            C1175f0 c1175f0 = (C1175f0) obj;
            InterfaceC1240s0 interfaceC1240s0 = this.f2972a;
            InterfaceC1240s0 interfaceC1240s02 = c1175f0.f2972a;
            return (interfaceC1240s0 == null && interfaceC1240s02 == null) ? m11124b().equals(c1175f0.m11124b()) : (interfaceC1240s0 == null || interfaceC1240s02 == null) ? interfaceC1240s0 != null ? interfaceC1240s0.equals(c1175f0.m11125a(interfaceC1240s0.mo10701a())) : m11125a(interfaceC1240s02.mo10701a()).equals(interfaceC1240s02) : interfaceC1240s0.equals(interfaceC1240s02);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
