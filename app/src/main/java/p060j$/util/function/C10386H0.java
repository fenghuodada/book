package p060j$.util.function;

import p060j$.time.AbstractC10240a;

/* renamed from: j$.util.function.H0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10386H0 implements InterfaceC10394L0 {

    /* renamed from: a */
    public final /* synthetic */ int f20868a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10394L0 f20869b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10394L0 f20870c;

    public /* synthetic */ C10386H0(InterfaceC10394L0 interfaceC10394L0, InterfaceC10394L0 interfaceC10394L02, int i) {
        this.f20868a = i;
        this.f20869b = interfaceC10394L0;
        this.f20870c = interfaceC10394L02;
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    /* renamed from: a */
    public final InterfaceC10394L0 mo772a(InterfaceC10394L0 interfaceC10394L0) {
        switch (this.f20868a) {
            case 0:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 0);
            default:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 0);
        }
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    /* renamed from: b */
    public final InterfaceC10394L0 mo771b(InterfaceC10394L0 interfaceC10394L0) {
        switch (this.f20868a) {
            case 0:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 1);
            default:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 1);
        }
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    public final InterfaceC10394L0 negate() {
        switch (this.f20868a) {
            case 0:
                return new C10388I0(this);
            default:
                return new C10388I0(this);
        }
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    public final boolean test(Object obj) {
        int i = this.f20868a;
        InterfaceC10394L0 interfaceC10394L0 = this.f20870c;
        InterfaceC10394L0 interfaceC10394L02 = this.f20869b;
        switch (i) {
            case 0:
                return AbstractC10240a.m1165b(interfaceC10394L02, interfaceC10394L0, obj);
            default:
                return interfaceC10394L02.test(obj) || interfaceC10394L0.test(obj);
        }
    }
}
