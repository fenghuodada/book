package com.unity3d.services.core.api;

import com.unity3d.services.core.request.C9588l;
import com.unity3d.services.core.request.EnumC9581f;
import com.unity3d.services.core.request.EnumC9582g;
import com.unity3d.services.core.request.InterfaceC9577b;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class Resolve {

    /* renamed from: com.unity3d.services.core.api.Resolve$a */
    /* loaded from: classes3.dex */
    public static class C9461a implements InterfaceC9577b {

        /* renamed from: a */
        final /* synthetic */ String f18583a;

        public C9461a(String str) {
            this.f18583a = str;
        }

        @Override // com.unity3d.services.core.request.InterfaceC9577b
        /* renamed from: a */
        public void mo1908a(String str, EnumC9581f enumC9581f, String str2) {
            if (C9620a.m1774c() != null) {
                C9620a.m1774c().m1784a(EnumC9627b.RESOLVE, EnumC9582g.FAILED, this.f18583a, str, enumC9581f.name(), str2);
            }
        }

        @Override // com.unity3d.services.core.request.InterfaceC9577b
        /* renamed from: a */
        public void mo1907a(String str, String str2) {
            if (C9620a.m1774c() != null) {
                C9620a.m1774c().m1784a(EnumC9627b.RESOLVE, EnumC9582g.COMPLETE, this.f18583a, str, str2);
            }
        }
    }

    @WebViewExposed
    public static void resolve(String str, String str2, C9644l c9644l) {
        if (C9588l.m1876a(str2, new C9461a(str))) {
            c9644l.m1736a(str);
        } else {
            c9644l.m1737a(EnumC9581f.INVALID_HOST, str);
        }
    }
}
