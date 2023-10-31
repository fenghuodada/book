package com.adcolony.sdk;

import android.net.Uri;
import android.widget.FrameLayout;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.iab.omid.library.adcolony.adsession.EnumC8717g;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.adcolony.sdk.a1 */
/* loaded from: classes.dex */
public final class C2039a1 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2135i1 f4918a;

    public C2039a1(C2135i1 c2135i1) {
        this.f4918a = c2135i1;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        C2135i1 c2135i1 = this.f4918a;
        if (c2135i1.m9617b(c2100e2)) {
            int m9441r = c2100e2.f5098b.m9441r(FacebookAdapter.KEY_ID);
            C2066c0 c2066c0 = new C2066c0(c2135i1.f5216y, c2100e2, m9441r, c2135i1);
            C2367y1 c2367y1 = c2066c0.f5027k.f5098b;
            c2066c0.f5026j = c2367y1.m9436w("ad_session_id");
            c2066c0.f5018b = c2367y1.m9441r("x");
            c2066c0.f5019c = c2367y1.m9441r("y");
            c2066c0.f5020d = c2367y1.m9441r("width");
            c2066c0.f5021e = c2367y1.m9441r("height");
            c2066c0.f5025i = c2367y1.m9436w("filepath");
            c2066c0.f5022f = c2367y1.m9444o("dpi");
            c2066c0.f5023g = c2367y1.m9444o("invert_y");
            c2066c0.f5024h = c2367y1.m9444o("wrap_content");
            c2066c0.setImageURI(Uri.fromFile(new File(c2066c0.f5025i)));
            if (c2066c0.f5022f) {
                C2201m0.m9588d().m9691l().getClass();
                float m9524g = (c2066c0.f5021e * C2247p4.m9524g()) / c2066c0.getDrawable().getIntrinsicHeight();
                c2066c0.f5021e = (int) (c2066c0.getDrawable().getIntrinsicHeight() * m9524g);
                int intrinsicWidth = (int) (c2066c0.getDrawable().getIntrinsicWidth() * m9524g);
                c2066c0.f5020d = intrinsicWidth;
                c2066c0.f5018b -= intrinsicWidth;
                if (c2066c0.f5023g) {
                    i = c2066c0.f5019c + c2066c0.f5021e;
                } else {
                    i = c2066c0.f5019c - c2066c0.f5021e;
                }
                c2066c0.f5019c = i;
            }
            c2066c0.setVisibility(4);
            if (c2066c0.f5024h) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            } else {
                layoutParams = new FrameLayout.LayoutParams(c2066c0.f5020d, c2066c0.f5021e);
            }
            layoutParams.setMargins(c2066c0.f5018b, c2066c0.f5019c, 0, 0);
            layoutParams.gravity = 0;
            C2135i1 c2135i12 = c2066c0.f5028l;
            c2135i12.addView(c2066c0, layoutParams);
            ArrayList<InterfaceC2203m2> arrayList = c2135i12.f5210s;
            C2374z c2374z = new C2374z(c2066c0);
            C2201m0.m9589c("ImageView.set_visible", c2374z);
            arrayList.add(c2374z);
            ArrayList<InterfaceC2203m2> arrayList2 = c2135i12.f5210s;
            C2038a0 c2038a0 = new C2038a0(c2066c0);
            C2201m0.m9589c("ImageView.set_bounds", c2038a0);
            arrayList2.add(c2038a0);
            ArrayList<InterfaceC2203m2> arrayList3 = c2135i12.f5210s;
            C2055b0 c2055b0 = new C2055b0(c2066c0);
            C2201m0.m9589c("ImageView.set_image", c2055b0);
            arrayList3.add(c2055b0);
            c2135i12.f5211t.add("ImageView.set_visible");
            c2135i12.f5211t.add("ImageView.set_bounds");
            c2135i12.f5211t.add("ImageView.set_image");
            c2135i1.f5196e.put(Integer.valueOf(m9441r), c2066c0);
            c2135i1.f5198g.put(Integer.valueOf(m9441r), c2066c0);
            c2135i1.m9618a(c2066c0, EnumC8717g.OTHER);
        }
    }
}
