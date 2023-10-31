package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.C0770o;
import java.io.IOException;
import java.io.InputStream;

@RequiresApi(29)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.core.graphics.l */
/* loaded from: classes.dex */
public final class C0719l extends C0721n {
    /* renamed from: g */
    public static Font m11888g(@NonNull FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m11887h = m11887h(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int m11887h2 = m11887h(fontStyle, font2.getStyle());
            if (m11887h2 < m11887h) {
                font = font2;
                m11887h = m11887h2;
            }
        }
        return font;
    }

    /* renamed from: h */
    public static int m11887h(@NonNull FontStyle fontStyle, @NonNull FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        return abs + (slant == slant2 ? 0 : 2);
    }

    @Override // androidx.core.graphics.C0721n
    @Nullable
    /* renamed from: a */
    public final Typeface mo11886a(Context context, FontResourcesParserCompat.C0668c c0668c, Resources resources, int i) {
        FontResourcesParserCompat.C0669d[] c0669dArr;
        int i2;
        try {
            FontFamily.Builder builder = null;
            for (FontResourcesParserCompat.C0669d c0669d : c0668c.f2329a) {
                try {
                    Font.Builder weight = new Font.Builder(resources, c0669d.f2335f).setWeight(c0669d.f2331b);
                    if (c0669d.f2332c) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Font build = weight.setSlant(i2).setTtcIndex(c0669d.f2334e).setFontVariationSettings(c0669d.f2333d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m11888g(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0721n
    @Nullable
    /* renamed from: b */
    public final Typeface mo11885b(Context context, @NonNull C0770o[] c0770oArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0770o c0770o : c0770oArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0770o.f2462a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(c0770o.f2464c);
                        if (c0770o.f2465d) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Font build = weight.setSlant(i2).setTtcIndex(c0770o.f2463b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m11888g(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0721n
    /* renamed from: c */
    public final Typeface mo11884c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.C0721n
    @Nullable
    /* renamed from: d */
    public final Typeface mo11883d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0721n
    /* renamed from: f */
    public final C0770o mo11881f(int i, C0770o[] c0770oArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
