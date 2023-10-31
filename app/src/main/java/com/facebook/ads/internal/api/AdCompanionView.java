package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: classes.dex */
public class AdCompanionView extends AdComponentFrameLayout {

    /* renamed from: a */
    public AdCompanionViewApi f9982a;

    public AdCompanionView(Context context) {
        super(context);
        initializeSelf(context);
    }

    public AdCompanionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public AdCompanionView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initializeSelf(context);
    }

    public AdCompanionViewApi getAdCompanionViewApi() {
        return this.f9982a;
    }

    public final void initializeSelf(Context context) {
        AdCompanionViewApi createAdCompanionViewApi = DynamicLoaderFactory.makeLoader(context).createAdCompanionViewApi();
        this.f9982a = createAdCompanionViewApi;
        attachAdComponentViewApi(createAdCompanionViewApi);
        this.f9982a.initialize(this);
    }
}
