package androidx.appcompat.resources;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RequiresApi(21)
/* renamed from: androidx.appcompat.resources.b */
/* loaded from: classes.dex */
public final class C0175b {
    @NonNull
    @DoNotInline
    /* renamed from: a */
    public static Drawable m12900a(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    @DoNotInline
    /* renamed from: b */
    public static int m12899b(@NonNull TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    @DoNotInline
    /* renamed from: c */
    public static void m12898c(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
