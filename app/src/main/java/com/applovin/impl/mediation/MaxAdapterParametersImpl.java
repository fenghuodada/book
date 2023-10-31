package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p011a.C2828f;
import com.applovin.impl.mediation.p011a.C2831h;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* renamed from: a */
    private String f6725a;

    /* renamed from: b */
    private Map<String, Object> f6726b;

    /* renamed from: c */
    private Bundle f6727c;

    /* renamed from: d */
    private Bundle f6728d;

    /* renamed from: e */
    private Boolean f6729e;

    /* renamed from: f */
    private Boolean f6730f;

    /* renamed from: g */
    private Boolean f6731g;

    /* renamed from: h */
    private String f6732h;

    /* renamed from: i */
    private boolean f6733i;

    /* renamed from: j */
    private String f6734j;

    /* renamed from: k */
    private String f6735k;

    /* renamed from: l */
    private long f6736l;

    /* renamed from: m */
    private MaxAdFormat f6737m;

    private MaxAdapterParametersImpl() {
    }

    /* renamed from: a */
    public static MaxAdapterParametersImpl m8841a(AbstractC2823a abstractC2823a) {
        MaxAdapterParametersImpl m8840a = m8840a((C2828f) abstractC2823a);
        m8840a.f6734j = abstractC2823a.m8792l();
        m8840a.f6735k = abstractC2823a.m8795i();
        m8840a.f6736l = abstractC2823a.m8794j();
        return m8840a;
    }

    /* renamed from: a */
    public static MaxAdapterParametersImpl m8840a(C2828f c2828f) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f6725a = c2828f.getAdUnitId();
        maxAdapterParametersImpl.f6729e = c2828f.m8740O();
        maxAdapterParametersImpl.f6730f = c2828f.m8739P();
        maxAdapterParametersImpl.f6731g = c2828f.m8738Q();
        maxAdapterParametersImpl.f6732h = c2828f.m8737R();
        maxAdapterParametersImpl.f6726b = c2828f.m8735T();
        maxAdapterParametersImpl.f6727c = c2828f.m8734U();
        maxAdapterParametersImpl.f6728d = c2828f.m8733V();
        maxAdapterParametersImpl.f6733i = c2828f.m8741N();
        return maxAdapterParametersImpl;
    }

    /* renamed from: a */
    public static MaxAdapterParametersImpl m8839a(C2831h c2831h, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl m8840a = m8840a(c2831h);
        m8840a.f6737m = maxAdFormat;
        return m8840a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f6737m;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f6725a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f6736l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f6735k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f6732h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f6728d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f6726b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f6727c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f6734j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f6729e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.f6730f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f6731g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f6733i;
    }
}
