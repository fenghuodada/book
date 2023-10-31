package com.permissionx.guolindev.request;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import androidx.activity.result.AbstractC0057c;
import androidx.activity.result.C0054a;
import androidx.activity.result.InterfaceC0056b;
import androidx.activity.result.contract.C0060b;
import androidx.activity.result.contract.C0061c;
import androidx.activity.result.contract.C0062d;
import androidx.fragment.app.Fragment;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6558q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6562u;
import com.google.android.exoplayer2.C7309u;
import com.google.android.exoplayer2.C7499x;
import com.google.android.exoplayer2.analytics.C6662w;
import com.google.android.exoplayer2.analytics.C6663x;
import com.google.android.exoplayer2.extractor.flac.C6822a;
import java.util.ArrayList;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m508d2 = {"Lcom/permissionx/guolindev/request/u;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "permissionx_release"}, m507k = 1, m506mv = {1, 7, 1})
/* renamed from: com.permissionx.guolindev.request.u */
/* loaded from: classes3.dex */
public final class C8991u extends Fragment {

    /* renamed from: l */
    public static final /* synthetic */ int f17160l = 0;
    @NotNull

    /* renamed from: a */
    public final Handler f17161a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public C8992v f17162b;

    /* renamed from: c */
    public InterfaceC8971c f17163c;
    @NotNull

    /* renamed from: d */
    public final AbstractC0057c<String[]> f17164d;
    @NotNull

    /* renamed from: e */
    public final AbstractC0057c<String> f17165e;
    @NotNull

    /* renamed from: f */
    public final AbstractC0057c<Intent> f17166f;
    @NotNull

    /* renamed from: g */
    public final AbstractC0057c<Intent> f17167g;
    @NotNull

    /* renamed from: h */
    public final AbstractC0057c<Intent> f17168h;
    @NotNull

    /* renamed from: i */
    public final AbstractC0057c<Intent> f17169i;
    @NotNull

    /* renamed from: j */
    public final AbstractC0057c<Intent> f17170j;
    @NotNull

    /* renamed from: k */
    public final AbstractC0057c<String> f17171k;

    public C8991u() {
        AbstractC0057c<String[]> registerForActivityResult = registerForActivityResult(new C0060b(), new C7309u(this));
        C10843j.m431e(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f17164d = registerForActivityResult;
        AbstractC0057c<String> registerForActivityResult2 = registerForActivityResult(new C0061c(), new C6558q(this));
        C10843j.m431e(registerForActivityResult2, "registerForActivityResul…)\n            }\n        }");
        this.f17165e = registerForActivityResult2;
        AbstractC0057c<Intent> registerForActivityResult3 = registerForActivityResult(new C0062d(), new C6822a(this));
        C10843j.m431e(registerForActivityResult3, "registerForActivityResul…)\n            }\n        }");
        this.f17166f = registerForActivityResult3;
        AbstractC0057c<Intent> registerForActivityResult4 = registerForActivityResult(new C0062d(), new C6662w(this));
        C10843j.m431e(registerForActivityResult4, "registerForActivityResul…)\n            }\n        }");
        this.f17167g = registerForActivityResult4;
        AbstractC0057c<Intent> registerForActivityResult5 = registerForActivityResult(new C0062d(), new C7499x(this, 2));
        C10843j.m431e(registerForActivityResult5, "registerForActivityResul…)\n            }\n        }");
        this.f17168h = registerForActivityResult5;
        AbstractC0057c<Intent> registerForActivityResult6 = registerForActivityResult(new C0062d(), new C6562u(this));
        C10843j.m431e(registerForActivityResult6, "registerForActivityResul…)\n            }\n        }");
        this.f17169i = registerForActivityResult6;
        AbstractC0057c<Intent> registerForActivityResult7 = registerForActivityResult(new C0062d(), new C6663x(this));
        C10843j.m431e(registerForActivityResult7, "registerForActivityResul…)\n            }\n        }");
        this.f17170j = registerForActivityResult7;
        AbstractC0057c<String> registerForActivityResult8 = registerForActivityResult(new C0061c(), new InterfaceC0056b() { // from class: com.permissionx.guolindev.request.d
            @Override // androidx.activity.result.InterfaceC0056b
            public final void onActivityResult(Object obj) {
                int i = C8991u.f17160l;
                C8991u this$0 = C8991u.this;
                C10843j.m430f(this$0, "this$0");
                this$0.m2825j(new C8984n(this$0, (Boolean) obj));
            }
        });
        C10843j.m431e(registerForActivityResult8, "registerForActivityResul…)\n            }\n        }");
        this.f17171k = registerForActivityResult8;
        C10843j.m431e(registerForActivityResult(new C0062d(), new InterfaceC0056b() { // from class: com.permissionx.guolindev.request.e
            @Override // androidx.activity.result.InterfaceC0056b
            public final void onActivityResult(Object obj) {
                C0054a c0054a = (C0054a) obj;
                int i = C8991u.f17160l;
                C8991u this$0 = C8991u.this;
                C10843j.m430f(this$0, "this$0");
                if (this$0.m2827h()) {
                    InterfaceC8971c interfaceC8971c = this$0.f17163c;
                    if (interfaceC8971c != null) {
                        C8992v c8992v = this$0.f17162b;
                        if (c8992v != null) {
                            interfaceC8971c.mo2819a(new ArrayList(c8992v.f17181j));
                            return;
                        } else {
                            C10843j.m424l("pb");
                            throw null;
                        }
                    }
                    C10843j.m424l("task");
                    throw null;
                }
            }
        }), "registerForActivityResul…)\n            }\n        }");
    }

    /* renamed from: h */
    public final boolean m2827h() {
        if (this.f17162b == null || this.f17163c == null) {
            Log.w("PermissionX", "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case.");
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void m2826i() {
        if (m2827h()) {
            if (Settings.canDrawOverlays(requireContext())) {
                InterfaceC8971c interfaceC8971c = this.f17163c;
                if (interfaceC8971c != null) {
                    interfaceC8971c.mo2828b();
                } else {
                    C10843j.m424l("task");
                    throw null;
                }
            } else if (this.f17162b == null) {
                C10843j.m424l("pb");
                throw null;
            } else if (this.f17162b != null) {
            } else {
                C10843j.m424l("pb");
                throw null;
            }
        }
    }

    /* renamed from: j */
    public final void m2825j(final InterfaceC10809a<C10868p> interfaceC10809a) {
        this.f17161a.post(new Runnable() { // from class: com.permissionx.guolindev.request.f
            @Override // java.lang.Runnable
            public final void run() {
                int i = C8991u.f17160l;
                InterfaceC10809a callback = InterfaceC10809a.this;
                C10843j.m430f(callback, "$callback");
                callback.invoke();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (m2827h() && this.f17162b == null) {
            C10843j.m424l("pb");
            throw null;
        }
    }
}
