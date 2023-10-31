package com.github.appintro.internal;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.C0676f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10860y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m508d2 = {"Lcom/github/appintro/internal/CustomFontCache;", "", "Landroid/content/Context;", "ctx", "", "path", "Landroidx/core/content/res/f$e;", "fontCallback", "Lkotlin/p;", "getFont", "TAG", "Ljava/lang/String;", "Ljava/util/HashMap;", "Landroid/graphics/Typeface;", "Lkotlin/collections/HashMap;", "cache", "Ljava/util/HashMap;", "<init>", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class CustomFontCache {
    @NotNull
    public static final CustomFontCache INSTANCE = new CustomFontCache();
    private static final String TAG = LogHelper.INSTANCE.makeLogTag(C10860y.m422a(CustomFontCache.class));
    private static final HashMap<String, Typeface> cache = new HashMap<>();

    private CustomFontCache() {
    }

    public final void getFont(@NotNull Context ctx, @Nullable String str, @NotNull C0676f.AbstractC0681e fontCallback) {
        C10843j.m430f(ctx, "ctx");
        C10843j.m430f(fontCallback, "fontCallback");
        if (str == null || str.length() == 0) {
            LogHelper.w$default(TAG, "Empty typeface path provided!", null, 4, null);
            return;
        }
        HashMap<String, Typeface> hashMap = cache;
        Typeface typeface = hashMap.get(str);
        if (typeface != null) {
            fontCallback.lambda$callbackSuccessAsync$0(typeface);
            return;
        }
        Typeface newTypeface = Typeface.createFromAsset(ctx.getAssets(), str);
        C10843j.m431e(newTypeface, "newTypeface");
        hashMap.put(str, newTypeface);
        fontCallback.lambda$callbackSuccessAsync$0(newTypeface);
    }
}
