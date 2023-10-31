package p060j$.time.format;

import p060j$.time.AbstractC10282l;
import p060j$.time.C10253f;
import p060j$.time.chrono.InterfaceC10244b;
import p060j$.time.chrono.InterfaceC10249g;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;

/* renamed from: j$.time.format.q */
/* loaded from: classes2.dex */
final class C10270q implements InterfaceC10296k {

    /* renamed from: a */
    final /* synthetic */ InterfaceC10244b f20647a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC10296k f20648b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10249g f20649c;

    /* renamed from: d */
    final /* synthetic */ AbstractC10282l f20650d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10270q(C10253f c10253f, InterfaceC10296k interfaceC10296k, InterfaceC10249g interfaceC10249g, AbstractC10282l abstractC10282l) {
        this.f20647a = c10253f;
        this.f20648b = interfaceC10296k;
        this.f20649c = interfaceC10249g;
        this.f20650d = abstractC10282l;
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        InterfaceC10244b interfaceC10244b = this.f20647a;
        return (interfaceC10244b == null || !interfaceC10297l.isDateBased()) ? this.f20648b.mo1068a(interfaceC10297l) : ((C10253f) interfaceC10244b).mo1068a(interfaceC10297l);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: b */
    public final boolean mo1067b(InterfaceC10297l interfaceC10297l) {
        InterfaceC10244b interfaceC10244b = this.f20647a;
        return (interfaceC10244b == null || !interfaceC10297l.isDateBased()) ? this.f20648b.mo1067b(interfaceC10297l) : ((C10253f) interfaceC10244b).mo1067b(interfaceC10297l);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: c */
    public final long mo1066c(InterfaceC10297l interfaceC10297l) {
        InterfaceC10244b interfaceC10244b = this.f20647a;
        return (interfaceC10244b == null || !interfaceC10297l.isDateBased()) ? this.f20648b.mo1066c(interfaceC10297l) : ((C10253f) interfaceC10244b).mo1066c(interfaceC10297l);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: d */
    public final Object mo1065d(InterfaceC10299n interfaceC10299n) {
        return interfaceC10299n == AbstractC10295j.m1075d() ? this.f20649c : interfaceC10299n == AbstractC10295j.m1069j() ? this.f20650d : interfaceC10299n == AbstractC10295j.m1071h() ? this.f20648b.mo1065d(interfaceC10299n) : interfaceC10299n.mo1059a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final /* synthetic */ int mo1064e(EnumC10286a enumC10286a) {
        return AbstractC10295j.m1078a(this, enumC10286a);
    }
}
