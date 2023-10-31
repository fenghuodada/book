package com.google.firebase.crashlytics.internal.breadcrumbs;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;

/* loaded from: classes3.dex */
public class DisabledBreadcrumbSource implements BreadcrumbSource {
    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(@Nullable BreadcrumbHandler breadcrumbHandler) {
        Logger.getLogger().m3348d("Could not register handler for breadcrumbs events.");
    }
}
