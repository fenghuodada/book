package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f2391k = PorterDuff.Mode.SRC_IN;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})

    /* renamed from: a */
    public int f2392a;

    /* renamed from: b */
    public Object f2393b;
    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: c */
    public byte[] f2394c;
    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: d */
    public Parcelable f2395d;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: e */
    public int f2396e;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: f */
    public int f2397f;
    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: g */
    public ColorStateList f2398g;

    /* renamed from: h */
    public PorterDuff.Mode f2399h;
    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: i */
    public String f2400i;
    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: j */
    public String f2401j;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface IconType {
    }

    @RequiresApi(23)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* loaded from: classes.dex */
    public static class C0696a {
        @DrawableRes
        @IdRes
        /* renamed from: a */
        public static int m11952a(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0698c.m11944a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        @Nullable
        /* renamed from: b */
        public static String m11951b(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0698c.m11943b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        /* renamed from: c */
        public static int m11950c(@NonNull Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return C0698c.m11942c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e2) {
                e = e2;
                sb = new StringBuilder("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e3) {
                e = e3;
                sb = new StringBuilder("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        @Nullable
        @DoNotInline
        /* renamed from: d */
        public static Uri m11949d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0698c.m11941d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        @DoNotInline
        /* renamed from: e */
        public static Drawable m11948e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
            if (r0 >= 26) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
        @androidx.annotation.DoNotInline
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static android.graphics.drawable.Icon m11947f(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                Method dump skipped, instructions count: 332
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.C0696a.m11947f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    @RequiresApi(26)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* loaded from: classes.dex */
    public static class C0697b {
        @DoNotInline
        /* renamed from: a */
        public static Drawable m11946a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @DoNotInline
        /* renamed from: b */
        public static Icon m11945b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* loaded from: classes.dex */
    public static class C0698c {
        @DoNotInline
        /* renamed from: a */
        public static int m11944a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        @DoNotInline
        /* renamed from: b */
        public static String m11943b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        @DoNotInline
        /* renamed from: c */
        public static int m11942c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        @DoNotInline
        /* renamed from: d */
        public static Uri m11941d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    @RequiresApi(30)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* loaded from: classes.dex */
    public static class C0699d {
        @DoNotInline
        /* renamed from: a */
        public static Icon m11940a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public IconCompat() {
        this.f2392a = -1;
        this.f2394c = null;
        this.f2395d = null;
        this.f2396e = 0;
        this.f2397f = 0;
        this.f2398g = null;
        this.f2399h = f2391k;
        this.f2400i = null;
    }

    public IconCompat(int i) {
        this.f2394c = null;
        this.f2395d = null;
        this.f2396e = 0;
        this.f2397f = 0;
        this.f2398g = null;
        this.f2399h = f2391k;
        this.f2400i = null;
        this.f2392a = i;
    }

    @VisibleForTesting
    /* renamed from: a */
    public static Bitmap m11956a(Bitmap bitmap) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min * 0.5f;
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f, f, 0.9166667f * f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public static IconCompat m11955b(@NonNull String str, @DrawableRes int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2396e = i;
            iconCompat.f2393b = str;
            iconCompat.f2401j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    @DrawableRes
    /* renamed from: c */
    public final int m11954c() {
        int i = this.f2392a;
        if (i == -1) {
            return C0696a.m11952a(this.f2393b);
        }
        if (i == 2) {
            return this.f2396e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    /* renamed from: d */
    public final Uri m11953d() {
        int i = this.f2392a;
        if (i == -1) {
            return C0696a.m11949d(this.f2393b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2393b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @NonNull
    public final String toString() {
        String str;
        int height;
        if (this.f2392a == -1) {
            return String.valueOf(this.f2393b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2392a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2392a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2393b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f2393b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2401j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m11954c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2396e);
                if (this.f2397f != 0) {
                    sb.append(" off=");
                    height = this.f2397f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2393b);
                break;
        }
        if (this.f2398g != null) {
            sb.append(" tint=");
            sb.append(this.f2398g);
        }
        if (this.f2399h != f2391k) {
            sb.append(" mode=");
            sb.append(this.f2399h);
        }
        sb.append(")");
        return sb.toString();
    }
}
