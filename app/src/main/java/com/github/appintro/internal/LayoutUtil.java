package com.github.appintro.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m508d2 = {"Lcom/github/appintro/internal/LayoutUtil;", "", "()V", "isRtl", "", "ctx", "Landroid/content/Context;", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class LayoutUtil {
    @NotNull
    public static final LayoutUtil INSTANCE = new LayoutUtil();

    private LayoutUtil() {
    }

    @JvmStatic
    public static final boolean isRtl(@NotNull Context ctx) {
        C10843j.m430f(ctx, "ctx");
        Resources resources = ctx.getResources();
        C10843j.m431e(resources, "ctx.resources");
        Configuration configuration = resources.getConfiguration();
        C10843j.m431e(configuration, "ctx.resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }
}
