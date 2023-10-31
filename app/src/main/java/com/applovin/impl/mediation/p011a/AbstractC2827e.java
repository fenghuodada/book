package com.applovin.impl.mediation.p011a;

import androidx.annotation.Nullable;
import com.applovin.impl.mediation.C2980g;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.e */
/* loaded from: classes.dex */
public abstract class AbstractC2827e extends AbstractC2823a {
    public AbstractC2827e(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, @Nullable C2980g c2980g, C3214m c3214m) {
        super(map, jSONObject, jSONObject2, c2980g, c3214m);
    }

    /* renamed from: C */
    public int m8752C() {
        MaxAdFormat format = getFormat();
        C3109b<Integer> c3109b = format == MaxAdFormat.BANNER ? C3109b.f7858bJ : format == MaxAdFormat.MREC ? C3109b.f7860bL : format == MaxAdFormat.LEADER ? C3109b.f7862bN : format == MaxAdFormat.NATIVE ? C3109b.f7864bP : null;
        if (c3109b != null) {
            return m8718b("viewability_min_width", ((Integer) this.f6791b.m7456a(c3109b)).intValue());
        }
        return 0;
    }

    /* renamed from: D */
    public int m8751D() {
        MaxAdFormat format = getFormat();
        C3109b<Integer> c3109b = format == MaxAdFormat.BANNER ? C3109b.f7859bK : format == MaxAdFormat.MREC ? C3109b.f7861bM : format == MaxAdFormat.LEADER ? C3109b.f7863bO : format == MaxAdFormat.NATIVE ? C3109b.f7865bQ : null;
        if (c3109b != null) {
            return m8718b("viewability_min_height", ((Integer) this.f6791b.m7456a(c3109b)).intValue());
        }
        return 0;
    }

    /* renamed from: E */
    public float m8750E() {
        return m8727a("viewability_min_alpha", ((Float) this.f6791b.m7456a(C3109b.f7866bR)).floatValue() / 100.0f);
    }

    /* renamed from: F */
    public int m8749F() {
        return m8718b("viewability_min_pixels", -1);
    }

    /* renamed from: G */
    public boolean m8748G() {
        return m8749F() >= 0;
    }

    /* renamed from: H */
    public long m8747H() {
        return m8717b("viewability_timer_min_visible_ms", ((Long) this.f6791b.m7456a(C3109b.f7867bS)).longValue());
    }
}
