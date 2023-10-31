package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.C9559e;
import com.unity3d.services.core.misc.C9560f;
import com.unity3d.services.core.misc.C9562h;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.misc.InterfaceC9557c;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.m */
/* loaded from: classes3.dex */
public class C9530m implements InterfaceC9533p {

    /* renamed from: a */
    private final InterfaceC9533p f18867a;

    /* renamed from: b */
    private final List<InterfaceC9557c> f18868b;

    /* renamed from: c */
    private final C9560f f18869c;

    public C9530m(InterfaceC9533p interfaceC9533p, C9560f c9560f, InterfaceC9557c... interfaceC9557cArr) {
        this.f18867a = interfaceC9533p;
        this.f18869c = c9560f;
        this.f18868b = Arrays.asList(interfaceC9557cArr);
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9533p
    /* renamed from: a */
    public Map<String, Object> mo2037a() {
        Map<String, Object> mo2037a = this.f18867a.mo2037a();
        return mo2037a != null ? C9564j.m1988a(mo2037a, new C9559e(new C9562h(this.f18868b).getData()).m2002a(".", this.f18869c)) : mo2037a;
    }
}
