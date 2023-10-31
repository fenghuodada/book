package kotlin.text;

import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;

/* renamed from: kotlin.text.i */
/* loaded from: classes3.dex */
public final class C10920i extends AbstractC10844k implements InterfaceC10820l<String, String> {

    /* renamed from: a */
    public static final C10920i f21471a = new C10920i();

    public C10920i() {
        super(1);
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final String invoke(String str) {
        String line = str;
        C10843j.m430f(line, "line");
        return line;
    }
}
