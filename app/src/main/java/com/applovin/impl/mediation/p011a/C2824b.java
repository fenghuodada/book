package com.applovin.impl.mediation.p011a;

import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.C2980g;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.b */
/* loaded from: classes.dex */
public class C2824b extends AbstractC2827e {
    private C2824b(C2824b c2824b, C2980g c2980g) {
        super(c2824b.m8735T(), c2824b.m8745J(), c2824b.m8746I(), c2980g, c2824b.f6791b);
    }

    public C2824b(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C3214m c3214m) {
        super(map, jSONObject, jSONObject2, null, c3214m);
    }

    /* renamed from: A */
    public boolean m8782A() {
        return m8716b("proe", (Boolean) this.f6791b.m7456a(C3108a.f7752J)).booleanValue();
    }

    /* renamed from: B */
    public long m8781B() {
        return Utils.parseColor(m8715b(AppIntroBaseFragmentKt.ARG_BG_COLOR, (String) null));
    }

    @Override // com.applovin.impl.mediation.p011a.AbstractC2823a
    /* renamed from: a */
    public AbstractC2823a mo8759a(C2980g c2980g) {
        return new C2824b(this, c2980g);
    }

    /* renamed from: u */
    public int m8780u() {
        int m8718b = m8718b("ad_view_width", -2);
        if (m8718b == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getWidth();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return m8718b;
    }

    /* renamed from: v */
    public int m8779v() {
        int m8718b = m8718b("ad_view_height", -2);
        if (m8718b == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getHeight();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return m8718b;
    }

    @Nullable
    /* renamed from: w */
    public View m8778w() {
        C2980g c2980g;
        if (!m8799e() || (c2980g = ((AbstractC2823a) this).f6781a) == null) {
            return null;
        }
        return c2980g.m8171a();
    }

    /* renamed from: x */
    public long m8777x() {
        return m8717b("viewability_imp_delay_ms", ((Long) this.f6791b.m7456a(C3109b.f7857bI)).longValue());
    }

    /* renamed from: y */
    public boolean m8776y() {
        return m8775z() >= 0;
    }

    /* renamed from: z */
    public long m8775z() {
        long m8717b = m8717b("ad_refresh_ms", -1L);
        return m8717b >= 0 ? m8717b : m8725a("ad_refresh_ms", ((Long) this.f6791b.m7456a(C3108a.f7777m)).longValue());
    }
}
