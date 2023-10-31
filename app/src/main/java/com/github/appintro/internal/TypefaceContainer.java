package com.github.appintro.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.annotation.FontRes;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.core.content.res.C0676f;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m508d2 = {"Lcom/github/appintro/internal/TypefaceContainer;", "", "Landroid/widget/TextView;", "textView", "Lkotlin/p;", "applyTo", "", "component1", "", "component2", "typeFaceUrl", "typeFaceResource", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTypeFaceUrl", "()Ljava/lang/String;", "setTypeFaceUrl", "(Ljava/lang/String;)V", "I", "getTypeFaceResource", "()I", "setTypeFaceResource", "(I)V", "<init>", "(Ljava/lang/String;I)V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class TypefaceContainer {
    private int typeFaceResource;
    @Nullable
    private String typeFaceUrl;

    public TypefaceContainer() {
        this(null, 0, 3, null);
    }

    public TypefaceContainer(@Nullable String str, @FontRes int i) {
        this.typeFaceUrl = str;
        this.typeFaceResource = i;
    }

    public /* synthetic */ TypefaceContainer(String str, int i, int i2, C10839f c10839f) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ TypefaceContainer copy$default(TypefaceContainer typefaceContainer, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = typefaceContainer.typeFaceUrl;
        }
        if ((i2 & 2) != 0) {
            i = typefaceContainer.typeFaceResource;
        }
        return typefaceContainer.copy(str, i);
    }

    public final void applyTo(@Nullable final TextView textView) {
        if (textView == null || textView.getContext() == null) {
            return;
        }
        if (this.typeFaceUrl == null && this.typeFaceResource == 0) {
            return;
        }
        C0676f.AbstractC0681e abstractC0681e = new C0676f.AbstractC0681e() { // from class: com.github.appintro.internal.TypefaceContainer$applyTo$callback$1
            @Override // androidx.core.content.res.C0676f.AbstractC0681e
            public void onFontRetrievalFailed(int i) {
            }

            @Override // androidx.core.content.res.C0676f.AbstractC0681e
            public void onFontRetrieved(@NotNull Typeface typeface) {
                C10843j.m430f(typeface, "typeface");
                textView.setTypeface(typeface);
            }
        };
        if (this.typeFaceResource != 0) {
            C0676f.m11988c(textView.getContext(), this.typeFaceResource, abstractC0681e);
            return;
        }
        CustomFontCache customFontCache = CustomFontCache.INSTANCE;
        Context context = textView.getContext();
        C10843j.m431e(context, "textView.context");
        customFontCache.getFont(context, this.typeFaceUrl, abstractC0681e);
    }

    @Nullable
    public final String component1() {
        return this.typeFaceUrl;
    }

    public final int component2() {
        return this.typeFaceResource;
    }

    @NotNull
    public final TypefaceContainer copy(@Nullable String str, @FontRes int i) {
        return new TypefaceContainer(str, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof TypefaceContainer) {
                TypefaceContainer typefaceContainer = (TypefaceContainer) obj;
                return C10843j.m435a(this.typeFaceUrl, typefaceContainer.typeFaceUrl) && this.typeFaceResource == typefaceContainer.typeFaceResource;
            }
            return false;
        }
        return true;
    }

    public final int getTypeFaceResource() {
        return this.typeFaceResource;
    }

    @Nullable
    public final String getTypeFaceUrl() {
        return this.typeFaceUrl;
    }

    public int hashCode() {
        String str = this.typeFaceUrl;
        return ((str != null ? str.hashCode() : 0) * 31) + this.typeFaceResource;
    }

    public final void setTypeFaceResource(int i) {
        this.typeFaceResource = i;
    }

    public final void setTypeFaceUrl(@Nullable String str) {
        this.typeFaceUrl = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TypefaceContainer(typeFaceUrl=");
        sb.append(this.typeFaceUrl);
        sb.append(", typeFaceResource=");
        return C0539e.m12264b(sb, this.typeFaceResource, ")");
    }
}
